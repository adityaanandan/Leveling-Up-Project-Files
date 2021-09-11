import java.util.Scanner; 
public class fibonacci{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in); 
        int num = in.nextInt(); 
        System.out.print(fib(num)); 
        in.close(); 
    }
    public static int fib (int n){
        if (n == 1 || n == 2){
            return 1; 
        }
 
        else{
            return fib(n-1) + fib(n-2); 
        }
    }
 
}
 
