import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoCharacters {

    static int twoCharacters(String s) {
        char[] sc = s.toCharArray(); 
        int t = 0;
        if(sc.length == 1) return t;
        for (int i = 0; i < 26; i++) {
            
            for (int j = i + 1; j < 26; j++) {
                char a = (char)((int)'a' + i);
                char b = (char)((int)'a' + j);
                char c = '0';
                int l = 0;
                
                for(int k = 0; k < sc.length; k++) {
                    
                    if(sc[k] == a || sc[k] == b) {
                        
                        if(sc[k] == c) {
                            k = sc.length;
                            l = 0;
                        } 
                        else {
                            l++;
                            c = sc[k];
                        }
                    }
                }
                if (l > t) t = l;
            }
        }
        return t;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        String s = in.next();
        int result = twoCharacters(s);
        System.out.println(result);
        in.close();
        
    }
}
