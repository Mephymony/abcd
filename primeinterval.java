import java.util.*;
import java.io.*;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int flag=0;
for(int i=0;i<=10;i++)
{
for(int j=2;j<i;j++)
{
if(i%j==0)
{
flag=0;
break;
}
else
{
flag=1;
}
}
if(flag==1)
{
System.out.println(i);
}
}
}
}
