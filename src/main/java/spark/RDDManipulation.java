package spark;

import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;

import scala.Tuple2;

public class RDDManipulation {
    
    static JavaRDD<csvExtraction> data;

    RDDManipulation(JavaRDD<csvExtraction> data) {
        this.data = data;
    }

    public static JavaPairRDD<String, Integer> count() {
       // return data.mapToPair((f) -> new Tuple2<>(f.name, 1)).reduceByKey((x, y) -> ((int) x + (int) y));
        return data.mapToPair((f) -> new Tuple2<>(f.name, 1)).reduceByKey((x, y) -> ((int) x + (int) y));
    }

}