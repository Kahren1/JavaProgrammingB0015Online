package day07;

public class CastingTheCharacter {
    public static void main(String[] args) {

        char grade = 'B';
        //System.out.println(grade);
        int letterInNumber = 'B';
        //'b' is represented by 66 in ASCII table
        //System.out.println(letterInNumber);
        grade = (char)letterInNumber;
        //System.out.println(grade);
        int letterInNumber2 = 'Г';
        //System.out.println(letterInNumber2);
        //System.out.println((int)('Г'));

        System.out.println((int)('K'));
        System.out.println((int)('A'));
        System.out.println((int)('P'));
        System.out.println((int)('E'));
        System.out.println((int)('Н'));
    }
}
