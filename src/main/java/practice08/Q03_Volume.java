package practice08;
//Create a method to calculate volume of cube,
// square prism and rectangular prism.
public class Q03_Volume {
public double calculateVolume(double a){

    return a * a * a;
}
    public double calculateVolume(double a, double b){

        return a * a * b;
    }
    public double calculateVolume(double a, double b, double c){

        return a * b * c;
    }
}
