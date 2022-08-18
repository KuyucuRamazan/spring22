package practice11;

public class Q02 {
    /*
             Type code to print shape below:
                  1 2 3 4 5 6
                   2 3 4 5 6
                    3 4 5 6
                     4 5 6
                      5 6
                       6
         */
    public static void main(String[] args) {
for(int row = 1; row<=6; row++) {//row control
    for (int space = 1; space < row; space++) {
        System.out.print("*");
    }
    for (int digit = row; digit <= 6; digit++) {
        System.out.print(digit + " ");
    }
    System.out.println("==>");
}
    }
}
