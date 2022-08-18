package work02;

import java.util.Scanner;

public class BodyMassIndex {


    public static void main(String[] Strings) {

            Scanner input = new Scanner(System.in);

            System.out.print("Input weight in kg: ");
            double weight = input.nextDouble();

            System.out.print("Input height in mt: ");
            double height = input.nextDouble();

            double BMI = weight / (height* height );
            System.out.print("Body Mass Index is " + BMI);


        if(BMI<=18.5){
            System.out.println("you are weak");
            if(BMI>18.5 && BMI<25){
                System.out.println("your weight is ideal" );
                if(BMI>25 && BMI<30){
                    System.out.println("you re fat");
                    if(BMI>=30){
                        System.out.println(" obese");
                    }
                }
            }
        }
    }
    }

