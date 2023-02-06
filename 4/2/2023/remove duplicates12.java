import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sample{   
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        String s=a.next();
        LinkedHashSet<Character> p=new LinkedHashSet<Character>();
        for(int i=0;i<s.length();i++)
        {
          char c=s.charAt(i);
            if(!p.contains(c)){
                p.add(c);
            }
        }
        for(Character c:p){
            System.out.print(c);
        }
     }
}
