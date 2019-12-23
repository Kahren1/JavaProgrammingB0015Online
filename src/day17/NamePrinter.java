package day17;

public class NamePrinter {
    public static void main(String[] args) {
        String name = "Alexander";
        //get each character, print out vertically
        int count = 0;
        while (count<name.length()){
            System.out.println(name.charAt(count));
            ++count;
        }
        System.out.println("Reverse order:  \n" );


        count = name.length()-1;
        while(count>=0){
            System.out.println(name.charAt(count));
            --count;
        }

    }
}
