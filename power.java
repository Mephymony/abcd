import java.io.*;
import java.util.*;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int power=sc.nextint();
int result=1;
if(num>=0 && power==0)
{
result=1;
}
else if(num==0 && power>=1)
{
result=0;
}
else
{
for(int i=1;i<=power;i++)
{
result=result*num;
}
}
System.out.println(num+"^"+power+"="+result);
}
}

