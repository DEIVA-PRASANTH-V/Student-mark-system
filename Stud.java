import java.io.*;
import java.lang.*;
import java.util.*;
class Student
{
int rollno,mark1,mark2,mark3,mark4;
float percentage,total;
char grade;
String name;
int personal_details()
{

Scanner n = new Scanner(System.in);
System.out.println("enter your name:");
name = n.nextLine();

Scanner r = new Scanner(System.in);
System.out.println("enter roll no:");
rollno = r.nextInt();

Scanner m1 = new Scanner(System.in);
System.out.println("enter mark 1:");
mark1 = m1.nextInt();

Scanner m2 = new Scanner(System.in);
System.out.println("enter mark 2:");
mark2 = m2.nextInt();

Scanner m3 = new Scanner(System.in);
System.out.println("enter mark 3:");
mark3 = m3.nextInt();

Scanner m4 = new Scanner(System.in);
System.out.println("enter mark 4:");
mark4 = m4.nextInt();

total = mark1 + mark2 + mark3 + mark4;

percentage = total/4;

}

float percent()
{
if(percentage >= 90)
{
System.out.println("First class");
}
else if(percentage <90 && percentage>=70)
{
System.out.println("Second class");
}
else if(percentage <70 && percentage>=50)
{
System.out.println("Third class");
}
else
{
System.out.println("fail\n try again\n BEST OF LUCK");
}

System.out.println("Your Percentage: "+percentage);
}
}

public class Stud
{
public static void main(String args[])
{
int i = 1;
while(i==1)
{
System.out.println("\tStudents Mark Result");
System.out.println("\t====================\n");

Stud obj = new Stud();
obj.personal_details();
obj.percent();


System.out.println("Name: \n"+name);
System.out.println("RollNO: \n"+rollno);
System.out.println("Mark 1: \n"+mark1);
System.out.println("Mark 2: \n"+mark2);
System.out.println("Mark 3: \n"+mark3);
System.out.println("Mark 4: \n"+mark4);
System.out.println("Total Marks: \n"+total);
}
}
}









