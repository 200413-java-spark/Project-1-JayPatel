package spark;

import java.io.File;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class FileCleanUp {

    private String csvFile;

    public FileCleanUp(String csvFile) {
        this.csvFile = csvFile;
    }


    public JavaRDD rawRDDProcessing(JavaSparkContext context) {


        JavaRDD rawRDD = context.textFile(new File(csvFile).getAbsolutePath());
        return rawRDD;
        

    }
    
}