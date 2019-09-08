package arrays;
import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         String A = br.readLine();
         String B = br.readLine();
         String C = br.readLine();

         String out_ = Solution(A, C, B);
         System.out.println(out_);

         wr.close();
         br.close();
    }
    static String Solution(String A, String C, String B){
        // Write your code here
        
        Map<Character, Character> myMap = new HashMap<Character, Character>();
        
        
        for(int i = 0; i < A.length(); i++) {
            char a = A.charAt(i);
            char b = B.charAt(i);
            if(a > b) {
                putToMap(myMap,a,b);
            }
            else  {
                putToMap(myMap,b,a);
            }
            
        }
        
        for(int i = 0; i < C.length(); i++) {
            char current = C.charAt(i);
            if(myMap.containsKey(current) && myMap.get(current) != null) {
                C  += myMap.get(current);
            }
        }
    return C;
    }
    
    public static void putToMap( Map<Character, Character> myMap, char small,char big) {
        if(myMap.containsKey(small) && myMap.get(small) != null) {
                    myMap.put(big, myMap.get(small));
                }
                else myMap.put(big,small);
    }

}