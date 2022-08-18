package day13;

public class Day13Arrays04 {
    public static void main(String[] args) {
        //Create an integer array and print all the elements less than 5
        //[12, 3, -3, 5, 23] ==> 3, -3
        //1st way:use regualar loops(for-while-do while)
        int [] arr={12, 3, -3, 5, 23, -7, 2, 4};
        int i=0;
        while (i< arr.length){
            if(arr[i]<5){
                System.out.print(arr[i]+" ");

            }
            i++;

        }
        System.out.println("\n==========");
        //2nd way: use for-each loop(enhanced loop)
        for(int w:arr){
            if(w<23){
                System.out.println(w);
            }
        }

    }
}
