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
        JavaRDD<String> headerlessRows = rawRDD.filter(row -> !row.equals(mkl));
    
    
        JavaRDD <csvExtraction> filteredHeaderlessRow = headerlessRows.map( (n) -> {
		    String[] fields =	n.split(",");
			return new csvExtraction(fields[0],fields[1],fields[2], fields[3]);
        });
        
        
		// //sysout print check
		// filteredHeaderlessRow.foreach(f -> {
		// 	System.out.println(f.name + " "+ f.pay + " "+ f.year + " " + f.category + " " );
		// });
		




    //   // return filteredHeaderlessRow;
    

    RDDManipulation rddManipulation = new RDDManipulation(filteredHeaderlessRow);
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