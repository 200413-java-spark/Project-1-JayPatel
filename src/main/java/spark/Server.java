package spark;

import java.io.File;
import java.util.List;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.Wrapper;
import org.apache.catalina.startup.Tomcat;
import org.apache.spark.SparkConf;
import org.apache.spark.SparkContext;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.rdd.RDD;

public class Server {

    public static void main(String[] args) throws LifecycleException {
        server();
        System.out.println();       
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();


         spark();

         System.out.println("Hello");


       System.out.println();       
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();



    }

    public static void spark()  {
        SparkConf conf = new SparkConf().setAppName("project-1").setMaster("local");
        JavaSparkContext context = new JavaSparkContext(conf);  

        JavaRDD <String> rawRDD = context.textFile(new File("src/main/resources/forbes_celebrity_100.csv").getAbsolutePath());
        
       String mkl =  (String) rawRDD.first();
        JavaRDD<String> rdd = rawRDD.filter(row -> !row.equals(mkl));
    
    
        JavaRDD <csvExtraction> newrdd = rdd.map( (n) -> {
		    String[] colname =	n.split(",");
			return new csvExtraction(colname[0],colname[1],colname[2], colname[3]);
        });
        
        



 
    

    RDDManipulation rddManipulation = new RDDManipulation(newrdd);
     System.out.println(RDDManipulation.count().collect());





    
    }

    public static void server() throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        tomcat.getConnector();
        tomcat.addWebapp("/spark", new File("src/main/resources/").getAbsolutePath());
        Wrapper helloServlet =  tomcat.addServlet("/spark", "HelloServlet", new HelloServlet());
        helloServlet.addMapping("/hello");

        tomcat.start();
    }
    
}