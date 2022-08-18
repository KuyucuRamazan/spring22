package practice08;
/*
    Create a basic calculator, create add, subtract, multiply, divide methods.
     */
public class Q05_Calculator {

    public void addition(double... a){
int sum=0;
for(double w:a){
    sum+=w;
}
        System.out.println("The sum is: "+sum);
    }
    public void substraction(double a, double b){
        System.out.println("The difference is: "+(a-b));
    }
    public void multiplication(double... a){
        double product=1;
        for(double w:a){
            product *=w;
        }
        System.out.println("The product is: "+product);

    }
    public void division(double a, double b){
        if(b==0){
            System.out.println("Do not use 0 for the second parameter");
        }else{
            System.out.println("Quetient is: "+(a/b));
        }
    }
}
