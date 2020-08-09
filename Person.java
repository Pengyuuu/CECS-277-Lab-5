import java.lang.Comparable;

public class Person implements Measurable, Comparable{

    private String firstName;

    private String lastName;

    private int age;

    public Person(){

        firstName = "";

        lastName = "";

        age = 0;
    }

    public Person (String first, String last, int number){

        firstName = first;

        lastName = last;

        age = number;
    }

    public String getFirstName(){ return firstName;}

    public String getLastName(){ return lastName;}

    public int getAge(){ return age;}

    public double getMeasure(){

        return age;
    }

    public int compareTo(Object o){

        if (o instanceof Person){

            Person f = (Person) o;
            return this.getFirstName().compareTo(f.getFirstName());

        }

        return 0;
    }

    public String toString(){

        return firstName + ", " + lastName + ", " + age + "\n";
    }
}
