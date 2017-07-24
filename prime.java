import java.util.*;
import java.io.*;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i,m=0,flag=0;
m=n/2;
for(int i=2;i<=m;i++)
{
if(n%i==0)
{
System.out.println("Not a prime");
flag=1;
break;
}
}
if(flag==0)
{
System.out.println("prime number");
}
}
}
