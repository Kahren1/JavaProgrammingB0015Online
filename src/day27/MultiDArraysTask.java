package day27;

public class MultiDArraysTask {
    public static void main(String[] args) {
        int[][] numbers = {{ 12,11,10,19}, {19,20,15}, {100,90,89, 7888}};
        int max = numbers [0][0]; //to start with

        for (int i = 0; i < numbers.length; i++) {//iterates through each single dimensional array
            for (int j = 0; j < numbers[i].length; j++) {//goes through each element in the singleD array
                if(max< numbers[i][j]){
                    max = numbers[i][j];
                }
            }
        }
        System.out.println("max = " + max);;

        //solution2 w foreach loop
        for(int[] each1DArr:numbers){
            for(int elem: each1DArr){
                if (max < elem) {
                    max = elem;
                }

            }
        }
        System.out.println("+++++++++++++++++++");

        String [] devTeam = {"Vladislav", "Hasan", "Tolkun", "Abide"};
        String [] testerTeam ={"Zhibekchach", "Mohammed Sohrabi", "Nursultan"};
        String [] bizAnalystTeam ={"Lisa", "Ershad", "Naila"};

        String[][] scrumTeam = {devTeam, testerTeam, bizAnalystTeam};
    }
}
