public class Main {
   static int reverse(int X) {
      int Y = 0;
      while (X > 0) {
      
         int digit = X % 10;
       
         Y = Y * 10 + digit;
        
         X = X / 10;
      }
      return Y;
   }
   public static void main(String[] args) {

      int X = 121;
      int dummy = X;
      int Y = reverse(X);
      if (dummy == Y) {
         System.out.println("Palindrome Number");
      } 
      else {
         System.out.println("Not Palindrome Number");
      }

   }
}  
