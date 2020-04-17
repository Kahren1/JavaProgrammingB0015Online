package replPractice;

public class repl239 {
    public static void main(String[] args) {
        //TEST YOUR CODE HERE
        //String name, int age, String breed
        Dog dog1= new Dog("Johnie", 10, "pit bull");
        Dog dog2 = new Dog("Johnie", 10, "pit bull");
        Dog dog3 = new Dog("Spike", 15, "shepherd");
        System.out.println("My dogs:");
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println(dog3.toString());
        System.out.println(dog1.equals(dog2));
        System.out.println(dog1.equals(dog3));
    }
}
abstract class Animal{
    private String name;
    private int age;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }

    public abstract int getAgeInHumanYears();


    public Animal(String name, int age){
        this.name=name;
        this.age=age;
    }

}
class Dog extends Animal {
    String breed;
    int humanYears;

    public Dog(String name, int age, String breed){
        super(name,age);
        this.breed=breed;
    }

    public String toString(){
        return "Name: "+getName()+
                        "\nBreed: "+breed+
                        "\nAge in calendar years: "+getAge()+
                        "\nAge in human years: "+humanYears;
    }
    public int getAgeInHumanYears(){
        if(getAge()<=2)
            humanYears=getAge()*11;
        else
            humanYears=22+((getAge()-2)*5);
        return humanYears;
    }

    public boolean equals(Dog dog){
        if(this.getName().equals(dog.getName())&& this.getAge()==dog.getAge()&&this.breed.equals(dog.breed))
            return true;
        return false;
    }
}


