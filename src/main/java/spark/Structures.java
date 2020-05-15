package spark;

import static spark.RDDManipulation.avgFractal_Dimension__Mean;

import java.util.HashMap;

import org.apache.spark.api.java.JavaRDD;

public class Structures {

    public HashMap<String, String> getStructure(JavaRDD<csvExtraction> rawRDD) {
        HashMap<String, String> sqlStructure = new HashMap();

        sqlStructure.put("Average radius_mean", RDDManipulation.avgRadius_Mean().collect().toString());
        sqlStructure.put("Average texture_mean", RDDManipulation.avgTexture_Mean().collect().toString());
        sqlStructure.put("Average perimeter_mean", RDDManipulation.avgPerimeter_Mean().collect().toString());
        sqlStructure.put("Average area_mean", RDDManipulation.avgArea_Mean().collect().toString());
        sqlStructure.put("Average smoothness_mean", RDDManipulation.avgSmoothness_Mean().collect().toString());
        sqlStructure.put("Average compactness_mean", RDDManipulation.avgCompactness_Mean().collect().toString());
        sqlStructure.put("Average concavity_mean", RDDManipulation.avgConcavity_Mean().collect().toString());
        sqlStructure.put("Average concave_points_mean", RDDManipulation.avgConcave_Points_Mean().collect().toString());
        sqlStructure.put("Average symmetry_mean", RDDManipulation.avgSymmetry_Mean().collect().toString());
        sqlStructure.put("Average fractal_dimension_mean", avgFractal_Dimension__Mean().collect().toString());
        sqlStructure.put("Average radius_se", RDDManipulation.avgRadius_se().collect().toString());
        sqlStructure.put("Average texture_se", RDDManipulation.avgTexture_se().collect().toString());
        sqlStructure.put("Average perimeter_se", RDDManipulation.avgPerimeter_se().collect().toString());
        sqlStructure.put("Average area_se", RDDManipulation.avgArea_se().collect().toString());
        sqlStructure.put("Average smoothness_se", RDDManipulation.avgSmoothness_se().collect().toString());
        sqlStructure.put("Average compactness_se", RDDManipulation.avgCompactness_se().collect().toString());
        sqlStructure.put("Average concavity_se", RDDManipulation.avgConcavity_se().collect().toString());
        sqlStructure.put("Average concave_points_se", RDDManipulation.avgConcave_Points_se().collect().toString());
        sqlStructure.put("Average symmetry_se", RDDManipulation.avgSymmetry_se().collect().toString());
        sqlStructure.put("Average fractal_dimension_se", RDDManipulation.avgFractal_Dimension_se().collect().toString());
        sqlStructure.put("Average radius_worst", RDDManipulation.avgRadius_worst().collect().toString());
        sqlStructure.put("Average texture_worst", RDDManipulation.avgTexture_worst().collect().toString());
        sqlStructure.put("Average perimeter_worst", RDDManipulation.avgPerimeter_worst().collect().toString());
        sqlStructure.put("Average area_worst", RDDManipulation.avgArea_worst().collect().toString());
        sqlStructure.put("Average smoothness_worst", RDDManipulation.avgSmoothness_worst().collect().toString());
        sqlStructure.put("Average compactness_worst", RDDManipulation.avgCompactness_worst().collect().toString());
        sqlStructure.put("Average concavity_worst", RDDManipulation.avgConcavity_worst().collect().toString());
        sqlStructure.put("Average concave_points_worst", RDDManipulation.avgConcave_Points_worst().collect().toString());
        sqlStructure.put("Average symmetry_worst", RDDManipulation.avgSymmetry_worst().collect().toString());
        sqlStructure.put("Average fractal_dimension_worst", RDDManipulation.avgFractal_Dimension__worst().collect().toString());













        return sqlStructure;
    }
    
}