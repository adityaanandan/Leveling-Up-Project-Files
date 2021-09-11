import java.util.Scanner; 
public class fact
{
    public static void main (String[] args){ // client method 
        Scanner in = new Scanner(System.in); 
        int num = in.nextInt(); 
        System.out.println(factorial(num)); 
        in.close(); 
  }
  
    public static int factorial (int a){ // back-end method 
        if (a == 0){
            return 1; 
        }
        else{
          for (int i = a-1; i >0; i--) {
              a *= i; 
        }
        return a; 
      }
    
  }
 
}
