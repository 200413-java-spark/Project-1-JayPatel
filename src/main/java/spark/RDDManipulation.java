package spark;

import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;

import scala.Tuple2;

public class RDDManipulation {
    
    static JavaRDD<csvExtraction> file;

    RDDManipulation(JavaRDD<csvExtraction> file) {
        this.file = file;
    }

    public static JavaPairRDD<String, Integer> count() {
       // return data.mapToPair((f) -> new Tuple2<>(f.name, 1)).reduceByKey((x, y) -> ((int) x + (int) y));
        return file.mapToPair((f) -> new Tuple2<>(f.name, 1)).reduceByKey((x, y) -> ((int) x + (int) y));
    }

}