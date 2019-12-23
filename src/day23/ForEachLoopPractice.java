package day23;

public class ForEachLoopPractice {
    public static void main(String[] args) {
/*
create a long array of 5 items called salaries
put salary amounts ok for offers
 */
double salaryMax = 0;
double[] salaries = {55.50, 45.25, 57, 44.80, 48.60};
        for(double salary:salaries){
            System.out.println("salary = " + salary);
            if(salary>55.50){
                System.out.println("salary = " + salary);
            }
            if (salary>salaryMax){
                salaryMax = salary;
            }
        }
        System.out.println("Max salary is: "+salaryMax);

    }
}
