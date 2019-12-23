package day26;

import java.util.Arrays;

public class ToCharArrayPracticeWithArrayClassMethod {
    public static void main(String[] args) {
        //2 additional String methods related to array
        //toCharArray(), another is split(by something)

        String survey = "Complete B15 Online 1 Month Survey";
        char[] surveyChars = survey.toCharArray();

//        for(char elem:surveyChars){
//            System.out.println(elem);
//        }

        //just for fun while loop
        int i = 0;
        while(i<surveyChars.length){
            System.out.println(surveyChars[i]);
            i++;
        }
        System.out.println();

        //just for fun do do-while loop
        int k=0;
        do{
            System.out.println("chars from do-while loop: "+ surveyChars[k]);
            k++;
        }while(k< surveyChars.length);

        //using Arrays methods like Arrays.sort(arr); Arrays.toString(arr);

        System.out.println("Before Arrays.sort(arr) method: " + "\n"+ Arrays.toString(surveyChars));
        Arrays.sort(surveyChars);
        System.out.println("Arrays so mutable! After Arrays.sort(arr) method: "+ "\n"+ Arrays.toString(surveyChars));





        String students = "Aboos, Zulyar,Zhibek,Hasan, Orhan";
        String[] namesArr= students.split(",");
        for (String nameEach: namesArr){
            if (nameEach.contains(" ")){
                nameEach = nameEach.replace(" ","");
            }
            for(int j=0;j<nameEach.length();j++){
                System.out.print(nameEach.charAt(j)+"-");
            }
            System.out.println();
        }
    }
}
