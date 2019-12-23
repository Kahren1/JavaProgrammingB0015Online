package day19;

public class FindingTheCountOfSomething {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i < 100; i++) {

            if (i % 15 == 0) {
                counter++;
                System.out.println(i);
            }
        }
        System.out.println("counter = " + counter);

        String name = "Esra Fidan";
        int countofa = 0;
        for (int index = 0; index < name.length(); index++) {

            if (name.charAt(index) == 'a') {
                countofa++;
            }
        }
        System.out.println("Count of 'a' in a name: " + countofa);
    }
}
