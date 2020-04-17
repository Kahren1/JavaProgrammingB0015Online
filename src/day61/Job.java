package day61;
//POJO - usually used to represent data
public class Job implements Comparable<Job> {
    //Comparable interface belongs to java.lang package.
    //in order to sort a type, it has to be Comparable
    //so the class of that type must implements Comparable<DataType>
    //to provide Comparable logic, this will be a natural order for sorting

    //notice - we will be comparing Job object fields!!!
private String location;
private double salary;
private String companyName;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Job(String location, double salary, String companyName){
        this.location=location;
        this.salary=salary;
        this.companyName=companyName;
    }

    @Override
    public String toString() {
        return "Job{" +
                "location='" + location + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Job other) {
        //return this.salary>other.salary? -1:0;
        if(this.salary>other.salary)
        return 1;
        else if(this.salary<other.salary)
            return -1;
        else
            return 0;
    }


}
