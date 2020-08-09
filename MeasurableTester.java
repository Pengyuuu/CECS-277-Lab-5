import java.util.Collections;
import java.util.Arrays;

/**
   This program demonstrates the measurable BankAccount and Country classes.
*/
public class MeasurableTester
{
   public static void main(String[] args)
   {
      /**
      Measurable[] accounts = new Measurable[3];
      accounts[0] = new BankAccount(0);
      accounts[1] = new BankAccount(10000);
      accounts[2] = new BankAccount(2000);


      double averageBalance = Data.average(accounts);
      System.out.println("Average balance: " + averageBalance);
      System.out.println("Expected: 4000");

      Measurable[] countries = new Measurable[3];
      countries[0] = new Country("Uruguay", 176220);
      countries[1] = new Country("Thailand", 513120);
      countries[2] = new Country("Belgium", 30510);

      double averageArea = Data.average(countries);
      System.out.println("Average area: " + averageArea);
      System.out.println("Expected: 239950");
       */

      Measurable[] objects = new Measurable[4];

      objects[0] = new Person("Krisna", "King", 5);
      objects[1] = new Person("Erina", "Lara", 18);
      objects[2] = new Person("Michael", "Lamera", 1);
      objects[3] = new Person("Eric", "Truong", 35);

      System.out.println(Data.smallAge(objects));

      Arrays.sort(objects);

      for(Measurable i : objects){

         System.out.println(i);
      }
   }
}
