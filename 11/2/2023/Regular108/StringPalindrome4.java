import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String reverse="";
        int l=str.length();
        str=str.toLowerCase();
        for(int i=l-1;i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println("Palindrome");
            }
        else{
            System.out.println("Not Palindrome");
                
            }
            
        
    }
}
