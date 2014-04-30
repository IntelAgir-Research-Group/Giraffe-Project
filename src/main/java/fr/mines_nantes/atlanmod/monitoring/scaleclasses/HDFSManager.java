package fr.mines_nantes.atlanmod.monitoring.scaleclasses;

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


import fr.mines_nantes.atlanmod.monitoring.MonitorRunner;

/*
 * Java Classes
 */
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.rmi.RemoteException;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.Map;
import java.util.Properties;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.logging.Level;

public class HDFSManager {

    // PeerUnit vars
    protected static Logger log = Logger.getLogger(HDFSManager.class.getName());
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
        FileInputStream fis = null;
        fis = new FileInputStream(file);
        properties.load(fis);

        /**
         * JobTracker and NameNode Properties
         */
         properties.getProperty("hadoop.namenode");
        cfg.set("hadoop.namenode", properties.getProperty("hadoop.namenode"));
        cfg.set("hadoop.namenode.port", properties.getProperty("hadoop.namenode.port"));
        cfg.set("hadoop.dir.name", properties.getProperty("hadoop.dir.name"));
        cfg.set("hadoop.dir.data", properties.getProperty("hadoop.dir.data"));
        cfg.set("hadoop.dir.tmp", properties.getProperty("hadoop.dir.tmp"));
        cfg.set("hadoop.dir.secnn", properties.getProperty("hadoop.dir.secnn"));
        cfg.set("hadoop.dfs.replication", properties.getProperty("hadoop.dfs.replication"));
        cfg.set("hadoop.java.options", properties.getProperty("hadoop.java.options"));
        cfg.set("mapred.child.java.opts", properties.getProperty("mapred.child.java.opts"));
    
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
        //Thread tNN = new Thread() {
	    //	public void run() {
	          try {
	              readPropertiesHadoop();
	              Configuration conf = readPropertiesHadoop();
	              NameNode.format(conf);
	              NNode = new NameNode(conf);
	             //   Thread.sleep(5000);
	          } catch (Exception e) {
	          	MonitorRunner.printLog("[HDFS MANAGER]  Error: "+e.getMessage());
	          }
	      //  }
        //};
        //tNN.start();
    }
    
    // DataNode
	static Thread startDataNode() {
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
        return tDN;
    }
	
	static String test() {
		return "Testing...";
	}
}
