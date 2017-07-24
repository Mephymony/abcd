import java.io.*;
import java.util.*;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int c=0,n,a,tmp;
for(int i=1;i<100;i++)
{
n=i;
while(i>0)
{
a=n%10;
n=n/10;
c=c+(a*a*a);
}
if(c==i)
{
System.out.println(i+" ");
}
c=0;
}
}
}
