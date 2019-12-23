package day22;

public class CanvasDayModuleLinkGenerator {
/*Here is the direct links to lead you to the correct day
http://learn.cybertekschool.coom/courses/278/modules#3317
this will lead to day 21


http://learn.cybertekschool.coom/courses/278/modules#3318
this will lead to day 22

http://learn.cybertekschool.coom/courses/278/modules#3319
this will lead to day 23
and so on

write a program to generate links to lead you to the right module from day 21 till day 56

 */
    public static void main(String[] args) {
        String baseURL= "http://learn.cybertekschool.coom/courses/278/modules#";
        String dayMsg = "this will lead you to day";

        for (int day = 1; day<=22; day++){
            System.out.println(dayMsg + day);
            System.out.println(baseURL+(3296+day)+"\n");
        }

    }
}
