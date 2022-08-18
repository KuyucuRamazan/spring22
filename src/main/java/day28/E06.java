package day28;

public class E06 {
    public static void main(String[] args) {

    }
    public static void convertObjectToString(Object obj){

        try {
            String s = (String) obj;
            System.out.println(s);
        }catch (ClassCastException e){
            System.out.println("Object Class can not be converted to String Class.");
        }finally{
            System.out.println("This is finally block");
        }



    }



}
