package com.generics.example;

class Student {
    String name;
    int roll_no;
}
public class StudentInfo {
    public static void main(String[] args)
    {
        Student st = new Student();
        st.name = "Faizan";
        st.roll_no =123455;
        System.out.println("Name is "+st.name+" and roll number is "+st.roll_no);
    }
}
