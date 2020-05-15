package spark;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.Wrapper;
import org.apache.catalina.startup.Tomcat;
import org.apache.spark.SparkConf;
import org.apache.spark.SparkContext;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.rdd.RDD;
import org.apache.zookeeper.Op.Create;

import spark.IO.CreateRDD;
import spark.IO.csvExtraction;
import spark.IO.sqlRepo;
import spark.Servlet.TheServlet;
import spark.sparkRDD.RDDManipulation;
import spark.sparkRDD.Structures;

public class Server {

   public static HashMap<String, String> sqlStucture;

   public static void main(String[] args) throws LifecycleException {
       server();
       sparkandsql();

   }

   public static void sparkandsql() {
       SparkConf conf = new SparkConf().setAppName("project-1").setMaster("local");
       JavaSparkContext context = new JavaSparkContext(conf);

       JavaRDD<csvExtraction> rawRDD = new CreateRDD().rawRDDCreation(context);

       RDDManipulation rddManipulation = new RDDManipulation(rawRDD);
       // System.out.println(RDDManipulation.avgRadius_Mean().collect());

       sqlStucture = new Structures().getStructure(rawRDD);
       
        // sqlStucture.entrySet().forEach(entry->{
        //     System.out.println(entry.getKey() + " " + entry.getValue());  
        //  });

        // sqlRepo entries = new sqlRepo(); 
        //     sqlStucture.entrySet().forEach(entry->{
        //     entries.insertAll(entry.getKey(), entry.getValue());
        //  });

        
        System.out.println("Server is up and running!!!!!");
    
    }

    public static void server() throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        tomcat.getConnector();
        tomcat.addWebapp("/spark", new File("src/main/resources/").getAbsolutePath());
        Wrapper helloServlet =  tomcat.addServlet("/spark", "TheServlet", new TheServlet());
        helloServlet.addMapping("/project1");
        tomcat.start();
    }
    
}