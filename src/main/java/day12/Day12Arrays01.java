package day12;

import java.util.Arrays;

public class Day12Arrays01 {
    public static void main(String[] args) {


    //1) Arrays are used for storing multiple data
    //2) An array can have just a single data type.
    //3) Arrays can store just primitive data types or references
    //of non-primitives
    // 4) When you create an array you have to declare it's length(number of elements in array)
    //How to create an array

    int [] ages = new int[5];

    //How to print an array on the console
        System.out.println(Arrays.toString(ages));
        //How to assign values to Array elements
        ages[0]=12;
        ages[1]=11;
       ages[2]=14;
        ages[3]=17;
        ages[4]=15;
        System.out.println(Arrays.toString(ages));
        //How to print array elements one by one
        System.out.println(ages[4]);

        //Print the sum  of the ages array on the console
        //1st way:
        System.out.println(ages[0]+ages[1]+ages[2]+ages[3]+ages[4]);

        //2nd Way
        int sum=0;
        for(int i=0;i< ages.length;i++){
            sum=sum+ages[i];

        } System.out.println(sum);
        //How to create an array and assign values in short
        String[] names={"Tom", "Jim", "Alex", "Karl"};
        System.out.println(Arrays.toString(names));

        //Find the total number of characters in array elements
        int total=0;
        for(int i=0;i< names.length;i++){
            total=total+names[i].length();

        } System.out.print(" "+total);
}
}