import java.util.*;
import java.io.*;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int sum=0,r,temp;
temp=num;
while(num>0)
{
r=num%10;
sum=(sum*10)+r;
r=n/10;
}
if(temp==num)
{
System.out.println("palindrome");
}
else
System.out.println("Not a palindrome");
}
}
