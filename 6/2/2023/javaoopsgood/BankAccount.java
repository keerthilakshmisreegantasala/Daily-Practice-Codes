import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class BankAccount{
    private String name;
    private int accountNo;
    private int balance;
    public BankAccount(String name,int accountNo){
        this.name=name;
        this.accountNo=accountNo;
    }
    public String getName(){
        return name;
    }
    public int getAccountNo(){
        return accountNo;
    }
    public int getBalance(){
         return balance;
    } 
    public void deposit(int money){
        balance=balance+money;
    }
    public void withdraw(int money){
        if(balance-money<0){
            System.out.println("Negative Balance Transaction Cancelled");
        }
        else{
            balance=balance-money;
        }
    }
    public void display(){
        System.out.print(accountNo+" ");
        System.out.print(name+" ");
        System.out.println(balance+" ");
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int AccountNo=Integer.parseInt(sc.nextLine());
        String name=sc.nextLine();
        BankAccount account = new BankAccount(name,AccountNo);
        int commands = Integer.parseInt(sc.nextLine());
        for(int i=0;i<commands;i++){
            String [] arr = sc.nextLine().split(" ");
            if(arr[0].toLowerCase().equals("deposit")){
                int k = Integer.parseInt(arr[1]);
                account.deposit(Integer.parseInt(arr[1]));
            }
            else if(arr[0].toLowerCase().equals("withdraw")){
                int k = Integer.parseInt(arr[1]);
                account.withdraw(Integer.parseInt(arr[1]));
            }
            else{
                account.display();
            }
        }
    }
}
