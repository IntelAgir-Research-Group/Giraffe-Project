package fr.mines_nantes.atlanmod.monitoring.frameworks;

/**
 * @author albonico
 *
 */

/*
 * JPDA Classes
 */

import org.apache.hadoop.hdfs.server.namenode.NameNode;
import org.apache.hadoop.hdfs.server.datanode.DataNode;
import org.apache.hadoop.conf.Configuration;



import fr.mines_nantes.atlanmod.monitoring.monitor.MonitorRunner;

/*
 * Java Classes
 */
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.Properties;

public class HDFS {

    // PeerUnit vars
    protected static Logger log = Logger.getLogger(HDFS.class.getName());
    protected static FileHandler fh;

    protected static NameNode NNode;
    protected static NameNode nn;
    protected static DataNode dn;

    /*
     * Reading Hadoop Properties (hadoop.properties)
     *
     */
    synchronized private static Configuration readPropertiesHadoop() throws IOException, InterruptedException {
        log.info("Reading Hadoop properties!");
        
        Configuration cfg = new Configuration();
                
        Properties properties = new Properties();
        File file = new File("hadoop.properties");
        FileInputStream fis = new FileInputStream(file);
        properties.load(fis);
        
        String h = properties.getProperty("hadoop.namenode");
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
		        System.out.println("Name: "+conf.get("hadoop.namenode"));
				NNode = new NameNode(conf);
			} catch (IOException e) {
				// TODO Auto-generated catch block
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
	  	}
        };
        
        tNN.start();  
        
        try {
			tNN.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
        
        MonitorRunner.printLog("[HDFS MANAGER] STARTED");
    }
    
    // DataNode
	public static void startDataNode() {
		
        Thread tDN = new Thread() {
        	public void run() {
	            try {
	                Configuration cfg = readPropertiesHadoop();
	                String[] args = {"-rollback"};
	                dn = DataNode.createDataNode(args, cfg);
	                Thread.currentThread().join();
	            } catch (IOException ioe) {
	            } catch (InterruptedException ie) {
	            }
        	}
        };
        
        tDN.start();
        
        try {
			tDN.join();
		} catch (InterruptedException e) {
		}
    }
	
	static String test() {
		return "Testing...";
	}
}
