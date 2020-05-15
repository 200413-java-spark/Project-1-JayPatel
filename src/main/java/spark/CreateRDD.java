







package spark;

import java.io.File;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class CreateRDD {



    


    public JavaRDD<csvExtraction> rawRDDCreation(JavaSparkContext context) {

        JavaRDD <String> rdd = context.textFile(new File("src/main/resources/data.csv").getAbsolutePath());
        
        String s =  (String) rdd.first();
        JavaRDD<String> temp = rdd.filter(f -> !f.equals(s));
     
     
         JavaRDD <csvExtraction> rawRDD  = temp.map( (f) -> {
             String[] colname =	f.split(",");
             return new csvExtraction(colname[0],colname[1],colname[2], colname[3], colname[4],colname[5],colname[6],
             colname[7],colname[8], colname[9], colname[10],colname[11],colname[12],colname[13],colname[14], colname[15],
              colname[16],colname[17],colname[18],colname[19],colname[20], colname[21], colname[22],colname[23],colname[24],
              colname[25],colname[26], colname[27], colname[28],colname[29],colname[30],colname[31]);
         });


        return rawRDD;
        

    }



    
}