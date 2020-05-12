package spark;

public class csvExtraction {


    String name;
    double pay;
    int year;
    String category;
    

    public csvExtraction(String name, String pay, String year, String category) {
        this.name = name;
        this.pay = Double.parseDouble(pay);
        this.year = Integer.parseInt(year);
        this.category = category;
    }

    
}