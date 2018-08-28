package csedept;
import prograde.*;
import java.util.*;
public class gpacse 
{
public static void main(String args[])
{
demopro l=new demopro();
gpacse p=new gpacse();
Scanner s=new Scanner(System.in);
int n;
System.out.println("enter the semester");
n=s.nextInt();
switch(n)
{
	case 1:
		p.sem1();
		break;
	/*case 2:
		sem2();
		break;
	case 3:
		sem3();
		break;
	case 4:
		sem4();
		break;
	case 5:
		sem5();
		break;
	case 6:
		sem6();
		break;
	case 7:
		sem7();
		break;
	case 8:
		sem8();
		break;*/

}
}
public void sem1()
{
int c[]={4,3,3,3,3,3,4,3,3};
String g[]=new String[9];
int G[]=new int[9];
Scanner s=new Scanner(System.in);
System.out.println("grade for discrete mathematics");
g[1]=s.next();
System.out.println("grade for analog digital communication");
g[2]=s.next();
System.out.println("grade for digital principle and sytem design");
g[3]=s.next();
System.out.println("grade for object oriented programming");
g[4]=s.next();
System.out.println("grade for data structure");
g[5]=s.next();
System.out.println("grade for english lab");
g[6]=s.next();
System.out.println("grade for oops lab");
g[7]=s.next();
System.out.println("grade for dpsd lab");
g[8]=s.next();
System.out.println("grade for ds lab");
g[9]=s.next();
G=demopro.grade(g);
gpa(G,c);
}
public void gpa(int g[],int c[])
{
double Gpa;
Gpa=(c[1]*g[1]+c[2]*g[2]+c[3]*g[3]+c[4]*g[4]+c[5]*g[5]+c[6]*g[6]+c[7]*g[7]+c[8]*g[8]+c[9]*g[9])/c[1]+c[2]+c[3]+c[4]+c[5]+c[6]+c[7]+c[8]+c[9];
System.out.println(Gpa);
}

}