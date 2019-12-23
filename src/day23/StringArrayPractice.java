package day23;

public class StringArrayPractice {
    public static void main(String[] args) {
        String[] shows = {"Orville", "Gifted",
                    "Game of Thrones",
                    "Flash", "Arrow", "Super girl"};
        int showsCount= shows.length;
        System.out.println("showsCount = " + showsCount);

        for (int x = 0; x < showsCount ; x++) {
            //System.out.println(shows[x]);
            System.out.println(shows[x]+" has character count " +shows[x].length());

        }
    }
}
