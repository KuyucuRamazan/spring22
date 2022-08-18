package practice10;

import java.util.Scanner;

public class Q03_03_Runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight");
        double weight=input.nextDouble();
        System.out.println("Enter height");
        double height=input.nextDouble();


        Q03_03_BMI person = new Q03_03_BMI(weight, height);
        person.setWeight(40);
        System.out.println( person.getHeight());
        System.out.println(person.getWeight());

        person.calculateBMI();

    }
}