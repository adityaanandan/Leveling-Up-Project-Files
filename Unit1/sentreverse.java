import java.util.ArrayList; 
import java.util.Scanner;
public class sentence_reverser {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in); 
        System.out.println("Pls enter a sentence"); 
        String sentence = in.nextLine(); 
        reverser(sentence); 
        in.close(); 
        
    }
    
    public static void reverser(String a){
        String reverse = ""; 
        ArrayList<String> obj = new ArrayList<String>(); 
        int place = 0; 
        for (int i = 0; i < a.length(); i++){ 
            if (a.charAt(i) == ' ' || i == a.length() -1){
                obj.add(0, a.substring(place, i+1)); 
                place = i+1; 
            }
        }
        for (int i = 0; i < obj.size(); i ++){
            if (i == 0){
                reverse = reverse + obj.get(i) + " "; 
           
            }
            else{
                reverse = reverse + obj.get(i); 
            }
        }
        
        System.out.println(reverse); 
    }
}
