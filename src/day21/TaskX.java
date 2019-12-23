package day21;

public class TaskX {


    //practicing break;
    public static void main(String[] args) {
        String name = "Kahren";

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.substring(i,i+1) +" ");
            if(name.substring(i,i+1).equals("e")){
                break;
            }

        }
    }
}
