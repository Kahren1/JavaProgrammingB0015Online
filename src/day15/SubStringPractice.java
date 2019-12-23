package day15;

public class SubStringPractice {
    public static void main(String[] args) {
        //getting the part of the String out of another String

        String movie = "Lord Of The Ring";

        //I want to get the word "Of" from this movie

        String wordOf = movie.substring(5,7);
        System.out.println(wordOf);

        //reverse Lord of the ring INTO Ring of the Lord

       String movieReversed = movie.substring(12) + movie.substring(4,12)+movie.substring(0,4);
        System.out.println(movie);
    }
}
