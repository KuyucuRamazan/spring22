package work01;

import java.util.Scanner;

public class If03 {
    public static void main(String[] args) {

        /*Type code to print
        a) "Round up by last digit:" and print the rounded value if the last digit is greater than
        or equal to 5
        b) "Round down by last digit" and print the rounded value if the last digit is less than 5*/

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int nmb = input.nextInt();

        if(nmb%10>=5){
            System.out.println("Round up by last digit:"+(nmb/10+1)*10);

        }else{
            System.out.println("Round up by last digit:"+(nmb/10)*10);
        }
}

}
