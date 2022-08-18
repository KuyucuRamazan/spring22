package day14;

import java.util.Arrays;
import java.util.Scanner;

public class Day14ForEachLoop03 {
    public static void main(String[] args) {
        //Check if the array elements are in the natural order.
        // "A", "B", "C" ==> true  -  "A", "C", "B" ==> false
        String arr[]={"A", "B", "C"};

        //How to create a copy of the given array
        //1st Way: By using loops
        /*String copyOfArr[]=new String[arr.length];//[ null, null, null]
        int idx = 0;
        for(String w : arr){

            copyOfArr[idx] = w;

            idx++;
        }
        System.out.println(Arrays.toString(copyOfArr));//[A,C,B]*/
//2nd Way: By using existing method
        String copyOfArr[] = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copyOfArr);

        System.out.println(Arrays.toString(copyOfArr));//[A,B,C]

        if(Arrays.equals(arr, copyOfArr)){
            System.out.println("Array elements are in alphabeticel order");
        }else {
            System.out.println("Array elements are not in alphabeticel order");
        }
        //binarySearch() method in Arrays Class: It is used to check existense of an element in an array
        int brr[]={12, 13, 5, 11, -2};
        //It si mandatory be able to get meaningful response from binarySearch()
        Arrays.sort(brr);

        int response= Arrays.binarySearch(brr, -10);//binarySearch()returns the index, if the element exists
                                                        //So zero or positive integer the element exists in the array

        System.out.println(response);
        int response2= Arrays.binarySearch(brr, -1);
        System.out.println(response2);
        //Check if a specific element exists in an array
        //If the element exists return the element
        //If the element doesn't exist return a message
        int crr[]={13,41,2,543};

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the element to check if it is exists or not");
        int i = scan.nextInt();
Arrays.sort(crr);
        int response3 = Arrays.binarySearch(crr , i);

        if(response3<0){
            System.out.println(i + " doesn't exist " );
        }else{
            System.out.println("index of element is " + response3);
        }


    }
}
