import java.util.Scanner; 
public class factorial
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
                else {
                return a * factorial(a-1); 
                }
      }

    }
