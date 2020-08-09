public class Data
{
   /**
      Computes the average of the measures of the given objects.
      @param objects an array of Measurable objects
      @return the average of the measures
   */
   public static double average(Measurable[] objects)
   {
      double sum = 0;
      for (Measurable obj : objects)
      {
         sum = sum + obj.getMeasure();
      }
      if (objects.length > 0) { return sum / objects.length; }
      else { return 0; }
   }

   public static Measurable smallAge(Measurable[] objects){

      Measurable youngest = objects[0];

      double min = objects[0].getMeasure();

      for (int i = 0; i < objects.length - 1; i++){

         if (objects[i + 1].getMeasure() - min < 0 ){

            min = objects[i + 1].getMeasure();

            youngest = objects[i + 1];
         }
      }

      return youngest;
   }

   /**
   public static Measurable[] sortPeople(Measurable[] objects){

      Measurable[] sorted = new Measurable[3];

      for (int i = 0; i < sorted.length - 1; i++){

         if (objects[i + 1}.compareTo(objects[i])])
      }
   }
    */
}
