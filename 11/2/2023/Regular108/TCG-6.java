import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=0;
        int j=1,temp;
        int t=n/2;
        if(n%2!=0){
            System.out.println(n);
        }
        else{
            if(n==2)
               System.out.println(i); 
            else
                for(int k=2;k<=t;k++){
                    temp=i+j;
                    i=j;
                    j=temp;
                }
            System.out.println(j);
            
        }
    }
}
