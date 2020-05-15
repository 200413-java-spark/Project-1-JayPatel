package spark.sparkRDD;



import java.util.HashMap;

import org.apache.spark.api.java.JavaRDD;

import spark.IO.csvExtraction;

public class Structures {

    public HashMap<String, String> getStructure(JavaRDD<csvExtraction> rawRDD) {
        HashMap<String, String> sqlStructure = new HashMap();

        sqlStructure.put("radius_mean", RDDManipulation.avgRadius_Mean().collect().toString());
        sqlStructure.put("texture_mean", RDDManipulation.avgTexture_Mean().collect().toString());
        sqlStructure.put("perimeter_mean", RDDManipulation.avgPerimeter_Mean().collect().toString());
        sqlStructure.put("area_mean", RDDManipulation.avgArea_Mean().collect().toString());
        sqlStructure.put("smoothness_mean", RDDManipulation.avgSmoothness_Mean().collect().toString());
        sqlStructure.put("compactness_mean", RDDManipulation.avgCompactness_Mean().collect().toString());
        sqlStructure.put("concavity_mean", RDDManipulation.avgConcavity_Mean().collect().toString());
        sqlStructure.put("concave_points_mean", RDDManipulation.avgConcave_Points_Mean().collect().toString());
        sqlStructure.put("symmetry_mean", RDDManipulation.avgSymmetry_Mean().collect().toString());
        sqlStructure.put("fractal_dimension_mean", RDDManipulation.avgFractal_Dimension__Mean().collect().toString());
        sqlStructure.put("radius_se", RDDManipulation.avgRadius_se().collect().toString());
        sqlStructure.put("texture_se", RDDManipulation.avgTexture_se().collect().toString());
        sqlStructure.put("perimeter_se", RDDManipulation.avgPerimeter_se().collect().toString());
        sqlStructure.put("area_se", RDDManipulation.avgArea_se().collect().toString());
        sqlStructure.put("smoothness_se", RDDManipulation.avgSmoothness_se().collect().toString());
        sqlStructure.put("compactness_se", RDDManipulation.avgCompactness_se().collect().toString());
        sqlStructure.put("concavity_se", RDDManipulation.avgConcavity_se().collect().toString());
        sqlStructure.put("concave_points_se", RDDManipulation.avgConcave_Points_se().collect().toString());
        sqlStructure.put("symmetry_se", RDDManipulation.avgSymmetry_se().collect().toString());
        sqlStructure.put("fractal_dimension_se", RDDManipulation.avgFractal_Dimension_se().collect().toString());
        sqlStructure.put("radius_worst", RDDManipulation.avgRadius_worst().collect().toString());
        sqlStructure.put("texture_worst", RDDManipulation.avgTexture_worst().collect().toString());
        sqlStructure.put("perimeter_worst", RDDManipulation.avgPerimeter_worst().collect().toString());
        sqlStructure.put("area_worst", RDDManipulation.avgArea_worst().collect().toString());
        sqlStructure.put("smoothness_worst", RDDManipulation.avgSmoothness_worst().collect().toString());
        sqlStructure.put("compactness_worst", RDDManipulation.avgCompactness_worst().collect().toString());
        sqlStructure.put("concavity_worst", RDDManipulation.avgConcavity_worst().collect().toString());
        sqlStructure.put("concave_points_worst", RDDManipulation.avgConcave_Points_worst().collect().toString());
        sqlStructure.put("symmetry_worst", RDDManipulation.avgSymmetry_worst().collect().toString());
        sqlStructure.put("fractal_dimension_worst", RDDManipulation.avgFractal_Dimension__worst().collect().toString());













        return sqlStructure;
    }
    
}