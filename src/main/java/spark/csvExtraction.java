package spark;

public class csvExtraction {

    int id; String diagnosis; double radius_mean; double texture_mean; double perimeter_mean; double area_mean; double smoothness_mean; double compactness_mean; double concavity_mean;
    double concave_points_mean; double symmetry_mean; double fractal_dimension_mean; double radius_se; double texture_se; double perimeter_se; double area_se; double smoothness_se; double compactness_se;
     double concavity_se; double concave_points_se; double symmetry_se; double fractal_dimension_se; double radius_worst; double texture_worst; double perimeter_worst; double area_worst; double smoothness_worst; 
     double compactness_worst; double concavity_worst; double concave_points_worst; double symmetry_worst; double fractal_dimension_worst;

    

     public csvExtraction(String id, String diagnosis, String radius_mean, String texture_mean, String perimeter_mean, String area_mean, String smoothness_mean, String compactness_mean, String concavity_mean,
     String concave_points_mean, String symmetry_mean, String fractal_dimension_mean, String radius_se, String texture_se, String perimeter_se, String area_se, String smoothness_se, String compactness_se,
      String concavity_se, String concave_points_se, String symmetry_se, String fractal_dimension_se, String radius_worst, String texture_worst, String perimeter_worst, String area_worst, String smoothness_worst, 
      String compactness_worst, String concavity_worst, String concave_points_worst, String symmetry_worst, String fractal_dimension_worst) {




        this.id = Integer.parseInt(id); this.diagnosis = diagnosis;
         this.radius_mean = Double.parseDouble(radius_mean); this.texture_mean = Double.parseDouble(texture_mean); this.perimeter_mean = Double.parseDouble(perimeter_mean);
         this.area_mean = Double.parseDouble(area_mean); this.smoothness_mean = Double.parseDouble(smoothness_mean); this.compactness_mean = Double.parseDouble(compactness_mean); this.concavity_mean = Double.parseDouble(concavity_mean);
        this.concave_points_mean = Double.parseDouble(concave_points_mean); this.symmetry_mean = Double.parseDouble(symmetry_mean); this.fractal_dimension_mean = Double.parseDouble(fractal_dimension_mean); this.radius_se = Double.parseDouble(radius_se); this.texture_se = Double.parseDouble(texture_se);
         this.perimeter_se = Double.parseDouble(perimeter_mean); this.area_se = Double.parseDouble(area_se); this.smoothness_se = Double.parseDouble(smoothness_se); this.compactness_se = Double.parseDouble(compactness_se);
            this.concavity_se = Double.parseDouble(concavity_se); this.concave_points_se = Double.parseDouble(concave_points_se) ; this.symmetry_se = Double.parseDouble(symmetry_se); this.fractal_dimension_se = Double.parseDouble(fractal_dimension_se); this.radius_worst = Double.parseDouble(radius_worst);
             this.texture_worst = Double.parseDouble(texture_worst); this.perimeter_worst = Double.parseDouble(perimeter_worst); this.area_worst = Double.parseDouble(area_worst); this.smoothness_worst = Double.parseDouble(smoothness_worst); 
            this.compactness_worst = Double.parseDouble(compactness_worst); this.concavity_worst = Double.parseDouble(concavity_worst); this.concave_points_worst = Double.parseDouble(concave_points_worst); this.symmetry_worst = Double.parseDouble(symmetry_worst);
             this.fractal_dimension_worst = Double.parseDouble(fractal_dimension_worst);
    }

    
}