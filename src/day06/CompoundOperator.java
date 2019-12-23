package day06;

public class CompoundOperator {
    public static void main(String[] args) {
        int studentOnline=263;
        studentOnline = studentOnline + 5;
        System.out.println("After 5 peeps joined the class: " + studentOnline);

        studentOnline = studentOnline -3;
        System.out.println("after 3 peeps left the class: " +studentOnline);

        studentOnline = studentOnline *2;
        System.out.println(studentOnline + " Student count doubled.");

        studentOnline = studentOnline /3;
        System.out.println(studentOnline + " count dropped by 1/3");
    }
}
