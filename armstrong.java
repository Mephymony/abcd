import java.io.*;
import java.util.*;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int c=0,a,tmp;
tmp=n;
while(n>0)
{
a=n%10;
n=n/10;
c=c+(a*a*a);
}
if(tmp==n)
{
System.out.println("Armstrong number");
}
else
System.out.println("Not a armstrong number");
}
}

