public class Main{
   
   public static boolean dateIsBefore(int month1,int day1, int month2, int day2){
   boolean before = false;
      if (month1<month2){
         before = true;
      }
      else if (month1 == month2){
         if (day1<day2){
         before = true;
         }
      }
      
      return before;
   }
   public static void main(String[]args){ 
      System.out.println(dateIsBefore(6,3,9,20)); 
      System.out.println(dateIsBefore(10,1,2,25)); 
      System.out.println(dateIsBefore(8,15,8,15)); 
      System.out.println(dateIsBefore(8,15,8,16)); 
      System.out.print(dateIsBefore(2,2,2,2));
   }
}