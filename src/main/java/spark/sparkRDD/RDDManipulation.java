package spark.sparkRDD;

import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;

import scala.Tuple2;
import spark.IO.csvExtraction;

public class RDDManipulation {
    
     static JavaRDD<csvExtraction> rawRDD;

    public RDDManipulation(JavaRDD<csvExtraction> rawRDD) {
        this.rawRDD = rawRDD;
    }

    public JavaPairRDD<String, Integer> diagnosisCount() {
        return rawRDD.mapToPair((f) -> new Tuple2<>(f.diagnosis, 1)).reduceByKey((x, y) -> ((int) x + (int) y));
    }

    private  JavaRDD<csvExtraction> getM() {
        JavaRDD<csvExtraction> filterM =  rawRDD.filter((f) -> f.diagnosis.contains("M"));
        return filterM;
        
    }

    private JavaRDD<csvExtraction> getB() {
        JavaRDD<csvExtraction> filterB =  rawRDD.filter((f) -> f.diagnosis.contains("B"));
        return filterB;

    }


    public static JavaPairRDD<String, Double> avgRadius_Mean() {
		return rawRDD.mapToPair(f -> new Tuple2<>(f.diagnosis, (double)f.radius_mean)).mapValues(f -> new Tuple2<>(f,1))
				 .reduceByKey((x,y) -> new Tuple2<>(x._1 + y._1, x._2 + y._2)).mapValues(f -> f._1/f._2);
        }
        

    public static JavaPairRDD<String, Double> avgTexture_Mean() {
		return rawRDD.mapToPair(f -> new Tuple2<>(f.diagnosis, (double)f.texture_mean)).mapValues(f -> new Tuple2<>(f,1))
				 .reduceByKey((x,y) -> new Tuple2<>(x._1 + y._1, x._2 + y._2)).mapValues(f -> f._1/f._2);
		}


    public static JavaPairRDD<String, Double> avgPerimeter_Mean() {
		return rawRDD.mapToPair(f -> new Tuple2<>(f.diagnosis, (double)f.perimeter_mean)).mapValues(f -> new Tuple2<>(f,1))
				 .reduceByKey((x,y) -> new Tuple2<>(x._1 + y._1, x._2 + y._2)).mapValues(f -> f._1/f._2);
		}


    public static JavaPairRDD<String, Double> avgArea_Mean() {
		return rawRDD.mapToPair(f -> new Tuple2<>(f.diagnosis, (double)f.area_mean)).mapValues(f -> new Tuple2<>(f,1))
				 .reduceByKey((x,y) -> new Tuple2<>(x._1 + y._1, x._2 + y._2)).mapValues(f -> f._1/f._2);
        }
        
    public static JavaPairRDD<String, Double> avgSmoothness_Mean() {
		return rawRDD.mapToPair(f -> new Tuple2<>(f.diagnosis, (double)f.smoothness_mean)).mapValues(f -> new Tuple2<>(f,1))
				 .reduceByKey((x,y) -> new Tuple2<>(x._1 + y._1, x._2 + y._2)).mapValues(f -> f._1/f._2);
		}


    public static JavaPairRDD<String, Double> avgCompactness_Mean() {
		return rawRDD.mapToPair(f -> new Tuple2<>(f.diagnosis, (double)f.compactness_mean)).mapValues(f -> new Tuple2<>(f,1))
				 .reduceByKey((x,y) -> new Tuple2<>(x._1 + y._1, x._2 + y._2)).mapValues(f -> f._1/f._2);
        }

    public static JavaPairRDD<String, Double> avgConcavity_Mean() {
        return rawRDD.mapToPair(f -> new Tuple2<>(f.diagnosis, (double)f.concavity_mean)).mapValues(f -> new Tuple2<>(f,1))
                    .reduceByKey((x,y) -> new Tuple2<>(x._1 + y._1, x._2 + y._2)).mapValues(f -> f._1/f._2);
        }


    public static JavaPairRDD<String, Double> avgConcave_Points_Mean() {
		return rawRDD.mapToPair(f -> new Tuple2<>(f.diagnosis, (double)f.concave_points_mean)).mapValues(f -> new Tuple2<>(f,1))
				 .reduceByKey((x,y) -> new Tuple2<>(x._1 + y._1, x._2 + y._2)).mapValues(f -> f._1/f._2);
		}


    public static JavaPairRDD<String, Double> avgSymmetry_Mean() {
		return rawRDD.mapToPair(f -> new Tuple2<>(f.diagnosis, (double)f.symmetry_mean)).mapValues(f -> new Tuple2<>(f,1))
				 .reduceByKey((x,y) -> new Tuple2<>(x._1 + y._1, x._2 + y._2)).mapValues(f -> f._1/f._2);
		}


    public static JavaPairRDD<String, Double> avgFractal_Dimension__Mean() {
		return rawRDD.mapToPair(f -> new Tuple2<>(f.diagnosis, (double)f.fractal_dimension_mean)).mapValues(f -> new Tuple2<>(f,1))
				 .reduceByKey((x,y) -> new Tuple2<>(x._1 + y._1, x._2 + y._2)).mapValues(f -> f._1/f._2);
        }
        
    public static JavaPairRDD<String, Double> avgRadius_se() {
		return rawRDD.mapToPair(f -> new Tuple2<>(f.diagnosis, (double)f.radius_se)).mapValues(f -> new Tuple2<>(f,1))
				 .reduceByKey((x,y) -> new Tuple2<>(x._1 + y._1, x._2 + y._2)).mapValues(f -> f._1/f._2);
        }
        

    public static JavaPairRDD<String, Double> avgTexture_se() {
		return rawRDD.mapToPair(f -> new Tuple2<>(f.diagnosis, (double)f.texture_se)).mapValues(f -> new Tuple2<>(f,1))
				 .reduceByKey((x,y) -> new Tuple2<>(x._1 + y._1, x._2 + y._2)).mapValues(f -> f._1/f._2);
		}


    public static JavaPairRDD<String, Double> avgPerimeter_se() {
		return rawRDD.mapToPair(f -> new Tuple2<>(f.diagnosis, (double)f.perimeter_se)).mapValues(f -> new Tuple2<>(f,1))
				 .reduceByKey((x,y) -> new Tuple2<>(x._1 + y._1, x._2 + y._2)).mapValues(f -> f._1/f._2);
		}


    public static JavaPairRDD<String, Double> avgArea_se() {
		return rawRDD.mapToPair(f -> new Tuple2<>(f.diagnosis, (double)f.area_se)).mapValues(f -> new Tuple2<>(f,1))
				 .reduceByKey((x,y) -> new Tuple2<>(x._1 + y._1, x._2 + y._2)).mapValues(f -> f._1/f._2);
        }
        
    public static JavaPairRDD<String, Double> avgSmoothness_se() {
		return rawRDD.mapToPair(f -> new Tuple2<>(f.diagnosis, (double)f.smoothness_se)).mapValues(f -> new Tuple2<>(f,1))
				 .reduceByKey((x,y) -> new Tuple2<>(x._1 + y._1, x._2 + y._2)).mapValues(f -> f._1/f._2);
		}


    public static JavaPairRDD<String, Double> avgCompactness_se() {
		return rawRDD.mapToPair(f -> new Tuple2<>(f.diagnosis, (double)f.compactness_se)).mapValues(f -> new Tuple2<>(f,1))
				 .reduceByKey((x,y) -> new Tuple2<>(x._1 + y._1, x._2 + y._2)).mapValues(f -> f._1/f._2);
        }

    public static JavaPairRDD<String, Double> avgConcavity_se() {
        return rawRDD.mapToPair(f -> new Tuple2<>(f.diagnosis, (double)f.concavity_se)).mapValues(f -> new Tuple2<>(f,1))
                    .reduceByKey((x,y) -> new Tuple2<>(x._1 + y._1, x._2 + y._2)).mapValues(f -> f._1/f._2);
        }


    public static JavaPairRDD<String, Double> avgConcave_Points_se() {
		return rawRDD.mapToPair(f -> new Tuple2<>(f.diagnosis, (double)f.concave_points_se)).mapValues(f -> new Tuple2<>(f,1))
				 .reduceByKey((x,y) -> new Tuple2<>(x._1 + y._1, x._2 + y._2)).mapValues(f -> f._1/f._2);
		}


    public static JavaPairRDD<String, Double> avgSymmetry_se() {
		return rawRDD.mapToPair(f -> new Tuple2<>(f.diagnosis, (double)f.symmetry_se)).mapValues(f -> new Tuple2<>(f,1))
				 .reduceByKey((x,y) -> new Tuple2<>(x._1 + y._1, x._2 + y._2)).mapValues(f -> f._1/f._2);
		}


    public static JavaPairRDD<String, Double> avgFractal_Dimension_se() {
		return rawRDD.mapToPair(f -> new Tuple2<>(f.diagnosis, (double)f.fractal_dimension_se)).mapValues(f -> new Tuple2<>(f,1))
				 .reduceByKey((x,y) -> new Tuple2<>(x._1 + y._1, x._2 + y._2)).mapValues(f -> f._1/f._2);
        }

        public static JavaPairRDD<String, Double> avgRadius_worst() {
            return rawRDD.mapToPair(f -> new Tuple2<>(f.diagnosis, (double)f.radius_worst)).mapValues(f -> new Tuple2<>(f,1))
                     .reduceByKey((x,y) -> new Tuple2<>(x._1 + y._1, x._2 + y._2)).mapValues(f -> f._1/f._2);
            }
            
    
        public static JavaPairRDD<String, Double> avgTexture_worst() {
            return rawRDD.mapToPair(f -> new Tuple2<>(f.diagnosis, (double)f.texture_worst)).mapValues(f -> new Tuple2<>(f,1))
                     .reduceByKey((x,y) -> new Tuple2<>(x._1 + y._1, x._2 + y._2)).mapValues(f -> f._1/f._2);
            }
    
    
        public static JavaPairRDD<String, Double> avgPerimeter_worst() {
            return rawRDD.mapToPair(f -> new Tuple2<>(f.diagnosis, (double)f.perimeter_worst)).mapValues(f -> new Tuple2<>(f,1))
                     .reduceByKey((x,y) -> new Tuple2<>(x._1 + y._1, x._2 + y._2)).mapValues(f -> f._1/f._2);
            }
    
    
        public static JavaPairRDD<String, Double> avgArea_worst() {
            return rawRDD.mapToPair(f -> new Tuple2<>(f.diagnosis, (double)f.area_worst)).mapValues(f -> new Tuple2<>(f,1))
                     .reduceByKey((x,y) -> new Tuple2<>(x._1 + y._1, x._2 + y._2)).mapValues(f -> f._1/f._2);
            }
            
        public static JavaPairRDD<String, Double> avgSmoothness_worst() {
            return rawRDD.mapToPair(f -> new Tuple2<>(f.diagnosis, (double)f.smoothness_worst)).mapValues(f -> new Tuple2<>(f,1))
                     .reduceByKey((x,y) -> new Tuple2<>(x._1 + y._1, x._2 + y._2)).mapValues(f -> f._1/f._2);
            }
    
    
        public static JavaPairRDD<String, Double> avgCompactness_worst() {
            return rawRDD.mapToPair(f -> new Tuple2<>(f.diagnosis, (double)f.compactness_worst)).mapValues(f -> new Tuple2<>(f,1))
                     .reduceByKey((x,y) -> new Tuple2<>(x._1 + y._1, x._2 + y._2)).mapValues(f -> f._1/f._2);
            }
    
        public static JavaPairRDD<String, Double> avgConcavity_worst() {
            return rawRDD.mapToPair(f -> new Tuple2<>(f.diagnosis, (double)f.concavity_worst)).mapValues(f -> new Tuple2<>(f,1))
                        .reduceByKey((x,y) -> new Tuple2<>(x._1 + y._1, x._2 + y._2)).mapValues(f -> f._1/f._2);
            }
    
    
        public static JavaPairRDD<String, Double> avgConcave_Points_worst() {
            return rawRDD.mapToPair(f -> new Tuple2<>(f.diagnosis, (double)f.concave_points_worst)).mapValues(f -> new Tuple2<>(f,1))
                     .reduceByKey((x,y) -> new Tuple2<>(x._1 + y._1, x._2 + y._2)).mapValues(f -> f._1/f._2);
            }
    
    
        public static JavaPairRDD<String, Double> avgSymmetry_worst() {
            return rawRDD.mapToPair(f -> new Tuple2<>(f.diagnosis, (double)f.symmetry_worst)).mapValues(f -> new Tuple2<>(f,1))
                     .reduceByKey((x,y) -> new Tuple2<>(x._1 + y._1, x._2 + y._2)).mapValues(f -> f._1/f._2);
            }
    
    
        public static JavaPairRDD<String, Double> avgFractal_Dimension__worst() {
            return rawRDD.mapToPair(f -> new Tuple2<>(f.diagnosis, (double)f.fractal_dimension_worst)).mapValues(f -> new Tuple2<>(f,1))
                     .reduceByKey((x,y) -> new Tuple2<>(x._1 + y._1, x._2 + y._2)).mapValues(f -> f._1/f._2);
            }
       















    }


   