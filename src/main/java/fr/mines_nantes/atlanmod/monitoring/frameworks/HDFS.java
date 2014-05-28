package fr.mines_nantes.atlanmod.monitoring.frameworks;

/**
 * @author albonico
 *
 */

/*
 * JPDA Classes
 */

import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hdfs.server.namenode.NameNode;
import org.apache.hadoop.hdfs.server.datanode.DataNode;
import org.apache.hadoop.conf.Configuration;














import fr.mines_nantes.atlanmod.monitoring.monitor.MonitorRunner;












import java.io.BufferedInputStream;
/*
 * Java Classes
 */
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.Properties;
import java.util.Random;

public class HDFS {

    // PeerUnit vars
    protected static Logger log = Logger.getLogger(HDFS.class.getName());
    protected static FileHandler fh;

    protected static NameNode nNode;
    protected static DataNode dNode;
    
    protected static Thread tStress;
    
    protected static boolean stopStress = false;
    protected static boolean pauseStress = false;

    /*
     * Reading Hadoop Properties (hadoop.properties)
     *
     */
    synchronized public static Configuration readPropertiesHadoop() throws IOException, InterruptedException {
        log.info("Reading Hadoop properties!");
        
        Configuration cfg = new Configuration();
                
        Properties properties = new Properties();
        File file = new File("hadoop.properties");
        FileInputStream fis = new FileInputStream(file);
        properties.load(fis);
        
        String masterIP = MonitorRunner.getMasterIP();
        log.info("[HDFS Manager] Reading master IP: "+masterIP);
        String h = masterIP;
        String p = properties.getProperty("hadoop.namenode.port");
        
        cfg.set("fs.default.name", "hdfs://"+h+":"+p);

        // cfg.set("hadoop.namenode", properties.getProperty("hadoop.namenode"));
        // cfg.set("hadoop.namenode.port", properties.getProperty("hadoop.namenode.port"));
        cfg.set("hadoop.dir.name", properties.getProperty("hadoop.dir.name"));
        cfg.set("hadoop.dir.data", properties.getProperty("hadoop.dir.data"));
        cfg.set("hadoop.dir.tmp", properties.getProperty("hadoop.dir.tmp"));
        cfg.set("dfs.name.dir", properties.getProperty("dfs.name.dir"));
        cfg.set("dfs.data.dir", properties.getProperty("dfs.data.dir"));
        cfg.set("hadoop.dir.secnn", properties.getProperty("hadoop.dir.secnn"));
        cfg.set("hadoop.dfs.replication", properties.getProperty("hadoop.dfs.replication"));
        cfg.set("hadoop.java.options", properties.getProperty("hadoop.java.options"));
        cfg.set("mapred.child.java.opts", properties.getProperty("mapred.child.java.opts"));
        cfg.set("hadoop.dir.log", properties.getProperty("hadoop.dir.log"));
        
        return cfg;
    }

/*    
    protected void putFileHDFS() {
        try {
            log.info("Putting file on HDFS!");
            String hadoopdir = (String) get(-14);
            String externalFile = (String) get(-41);
            String inputDir = (String) get(-42);

            String command = hadoopdir + "/bin/hadoop dfs -put " + externalFile + " " + inputDir + "teste";
            log.info("Command: " + command);
            Process putProcess = Runtime.getRuntime().exec(command);
            putProcess.waitFor();
        } catch (RemoteException re) {
            log.info(re.toString());
        } catch (IOException ioe) {
            log.info(ioe.toString());
        } catch (InterruptedException ie) {
            log.info(ie.toString());
        }
    }
*/
   
    // NameNode
    public static void startNameNode() {
    	
        MonitorRunner.printLog("[HDFS MANAGER] STARTING");
        Thread tNN = new Thread() {
	  	public void run() {
          	Configuration conf;
			try {
			 	conf = readPropertiesHadoop();
				NameNode.format(conf);
		        System.out.println("Name: "+MonitorRunner.getMasterIP());
				nNode = new NameNode(conf);
			} catch (IOException e) {
				// TODO Auto-generated catch block
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
	  	}
        };
        
        tNN.start();  
    
        /*
        try {
			tNN.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
		*/
        
        MonitorRunner.printLog("[HDFS MANAGER] STARTED");
    }
    
    // DataNode
	public static void startDataNode() {
		
        Thread tDN = new Thread() {
        	public void run() {
	            try {
	                Configuration cfg = readPropertiesHadoop();
	                String[] args = {"-rollback"};
	                dNode = DataNode.createDataNode(args, cfg);
	                Thread.currentThread().join();
	            } catch (IOException ioe) {
	            } catch (InterruptedException ie) {
	            }
        	}
        };
        
        tDN.start();
        /*
        try {
			tDN.join();
		} catch (InterruptedException e) {
		}
		*/
    }
	
	public static void startStress() {
		tStress = new Thread() {
        	public void run() {
        		MonitorRunner.printLog("[STRESS] Starting stress ");
        		HDFSClient hdfsClient = new HDFSClient();
        		MonitorRunner.printLog("[STRESS] Stop stress signal = "+stopStress);
        		while (!stopStress) {
        			
        			while (pauseStress) {
        				// Wait
        				try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
        			}
        			
	        		Random random = new Random();
	        		int rCode = random.nextInt();
	        		String source = "file-"+rCode+".txt";
	        		String destination = "/dest-"+rCode;
	        		MonitorRunner.printLog("[STRESS] Gerenating input file "+source);
	        		String command = "bash gen-input-file.sh "+source;
	        		Runtime run = Runtime.getRuntime();
	        		MonitorRunner.printLog("[STRESS] Test 1");
	        		try {
						Process p = run.exec(command);
						MonitorRunner.printLog("[STRESS] Test 2");
						p.waitFor(); // Working well
	        			MonitorRunner.printLog("[STRESS] Test 3");
	        			hdfsClient.addFile(source, destination);
	        			MonitorRunner.printLog("[STRESS] Test 4");
	        			Thread.sleep(5000);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						MonitorRunner.printLog("[STRESS] Error putting the file "+source+" in the HDFS: "+e.getMessage());
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						MonitorRunner.printLog("[STRESS] Error waiting for process: "+e.getMessage());
					}
        		}
        	}
        };
        tStress.start();
	}
	
	public static void stopStress() {
		stopStress = true;
	}
	
	public static void setPauseStress(boolean b) {
		pauseStress = b;
	}
	
	// Deploy methods
	public void deployMaster() {
		MonitorRunner.printLog("[HDFS] Creating NameNode!");
		try {
			HDFS.startNameNode();
		} catch (Exception e) {
			MonitorRunner.printLog("[HDFS] Error: "+e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MonitorRunner.printLog("[HDFS] NameNode created!");
	}
	
}
