# Project-1-JayPatel

## Analysis on Breast Cancer Tumors Application

### Information on the Dataset

In this dataset the diagnosis of the tumors were given as well as the mean, standard error and "worst" or largest (mean of the three largest values) of the following features:

```
a) radius (mean of distances from center to points on the perimeter)

b) texture (standard deviation of gray-scale values)

c) perimeter

d) area

e) smoothness (local variation in radius lengths)

f) compactness (perimeter^2 / area - 1.0)

g) concavity (severity of concave portions of the contour)

h) concave points (number of concave portions of the contour)

i) symmetry

j) fractal dimension ("coastline approximation" - 1)
```

### Build
```
mvn clean install
```

### Usage
```
java -jar target/spark-0.0.1-SNAPSHOT.jar
```

## Design
### Architecture
- sparkRDD package handles all of the batch processing 
- IO package handles all the csv parsing and connection to database
- Servlets package handles all the http servlets classes/methods

### Algorithm
- The csv file is parsed and the data is formed into an RDD
- Transformations are done on the RDD to analyze the dataset
- The transformations are put into a data structure which is then sent to a database
- The database is retrieved and posted on the http servlet