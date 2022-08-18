package day11;

public class Dy11DoWhileLoop01 {
    public static void main(String[] args) {
        int i = 1;
        while (i < 1) {
            System.out.println("While Loop");
            i++;
        }
        int k = 1;
        do {
            System.out.println("Do While Loop");
            k++;
        } while (k < 1);
        //Zero execution s possible n while loop.But itis inpossible in do while loop
        //Do-while-loop bodyis executed at least once.
    }
}
