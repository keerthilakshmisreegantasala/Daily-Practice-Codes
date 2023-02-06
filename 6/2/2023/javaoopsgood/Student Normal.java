import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Student{
    private String Name;
    private int RollNo;
    private int Year;
    private String Branch;
    private List<Integer>Marks;
    private static int numberOfStuds;
    public Student(String Name,int RollNo,String Branch,int Year){
        this.Name=Name;
        this.RollNo=RollNo;
        this.Year=Year;
        this.Branch=Branch;
        Marks=new ArrayList<Integer>();
        //keeps track of how many students in the class.
        numberOfStuds++;
    }
    public String getName(){
        return Name;
    }
    public int getRollno(){
        return RollNo;
    }
    public int getYear(){
        return Year;
    } 
    public String getBranch(){
        return Branch;
    }
    public List<Integer>getMarks(){
        return Marks;
    }
    public static void displayNoStuds() {
        System.out.println("NoOfStudents="+numberOfStuds);
    }
    public void display(){ 
        System.out.println(RollNo+" "+Name+" "+Branch+" "+Year);
    }
    public double computePercentage()
    {
        double sum=0;
        for(int i:Marks){
            sum=sum+i;
        }
        if(Marks.size()==0){
            return 0;
        }
        return sum/Marks.size();
    }
    public void setMarks(int obtmarks){
        Marks.add(obtmarks);
    }
}

public class Solution {

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = Integer.parseInt(sc.nextLine());
          List<Student> students = new ArrayList<>();
          for(int i=0;i<n;i++){
            String[] line = sc.nextLine().split(" ");
            Student s = new Student(line[0],Integer.parseInt(line[1]),line[2],Integer.parseInt(line[3]));
            students.add(s);
            String[] nums=sc.nextLine().split(" ");
            for(int j=0;j<nums.length;j++){
                students.get(i).setMarks(Integer.parseInt(nums[j]));
            }
        }
        for(int i=0;i<n;i++){
            students.get(i).display();
            System.out.print(students.get(i). getRollno()+" ");
            System.out.printf("%.2f",students.get(i).computePercentage());
            System.out.println();
        }
        Student.displayNoStuds();
    }
}
