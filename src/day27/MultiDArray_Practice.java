package day27;

public class MultiDArray_Practice {
    public static void main(String[] args) {
        String[] devTeam = {"Vladislav", "H", "Tolkun", "Abide"};
        String[] testerTeam = {"Zhibekchach", "Mohammed Sohrabi", "Nursultan"};
        String[] bizAnalystTeam = {"Lisa", "Ershad", "Naila"};

        String[][] scrumTeam = {devTeam, testerTeam, bizAnalystTeam};
        String maxLengthNamePerson = scrumTeam[0][0];
        int maxLengthNameCount = scrumTeam[0][0].length();
        for (String[] subTeam : scrumTeam) {
            for (String person : subTeam) {
                if (maxLengthNameCount < person.length()) {
                    maxLengthNameCount = person.length();
                    maxLengthNamePerson = person;

                }
            }
        }
        System.out.println("maxLengthName = " + maxLengthNameCount);
        System.out.println("maxLengthNamePerson = " + maxLengthNamePerson);

        int shortestNameLength = scrumTeam[0][0].length();
        String shortestName = scrumTeam[0][0];

        for (int i = 0; i < scrumTeam.length; i++) {
            for (int j = 0; j < scrumTeam[i].length ; j++) {
                if(shortestNameLength>scrumTeam[i][j].length()){
                    shortestNameLength=scrumTeam[i][j].length();
                    shortestName=scrumTeam[i][j];
                }
            }
        }
        System.out.println("shortestName = " + shortestName);
        System.out.println("shortestNameLength = " + shortestNameLength);


        ;


    }
}
