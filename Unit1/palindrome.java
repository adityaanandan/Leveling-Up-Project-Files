import java.util.Scanner; 
public class pali {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a phrase or word (in lowercase only please)"); 
        String a = in.nextLine(); 
        System.out.println(palindrome(a)); 
        in.close(); 
    }
    
    public static boolean palindrome (String p){
        String rand = ""; 
        for (int i = p.length() -1; i >=0; i--){
            rand += p.substring(i, i+1); 
        }
        return rand.equals(p); 
    }
 
}
