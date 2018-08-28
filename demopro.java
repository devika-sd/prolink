package prograde;
import java.util.*;
public class demopro
{

public static int[] grade(String g[])
{

String A="a+",B="b+",C="ra";
String O="o",a="a",b="b";
double gpa;
int i;
int t[]=new int[9];
Scanner s=new Scanner(System.in);

for(i=0;i<9;i++)
{
	if(g[i].equals(O))
	{
		t[i]=10;
	}
	if(g[i].equals(A))
	{
		t[i]=9;
	}
	if(g[i].equals(a))
	{
		t[i]=8;
	}
	if(g[i].equals(B))
	{
		t[i]=7;
	}
	if(g[i].equals(b))
	{
		t[i]=6;
	}
	if(g[i].equals(C))
	{
		t[i]=0;
	}
}

return t;
}
}