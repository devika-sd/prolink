package promain;
import java.util.*;
class projectpackmain
{
public static void main(String args[])
{
int c,n;
String y;
double gpa1,gpa2,gpa3,gpa4,gpa5,gpa6,gpa7,gpa8,gpa9;
scanner s=new Scanner(System.in);
System.out.println("enter the department");
System.out.println(""+"\n");
c=s.nextInt();
switch(c)
{
case 1:
	System.out.println("enter the semester");
	n=s.nextInt();
	switch(n)
	{
	case 1:
		gpa1=sem1();
		break;
		System.out.println("if you want to calculate cgpa");
		y=s.next();
		if(y.equals("yes"))
		{
			cgpa(gpa1);
		}
	case 2:
		gpa2=sem2();
		break;
		System.out.println("if you want to calculate cgpa");
		y=s.next();
		if(y.equals("yes"))
		{
			cgpa(gpa2);
		}
	case 3:
		gpa3=sem3();
		break;
		System.out.println("if you want to calculate cgpa");
		y=s.next();
		if(y.equals("yes"))
		{
			cgpa(gpa3);
		}
	case 4:
		gpa4=sem4();
		break;
		System.out.println("if you want to calculate cgpa");
		y=s.next();
		if(y.equals("yes"))
		{
			cgpa(gpa4);
		}
	case 5:
		gpa5=sem5();
		break;
		System.out.println("if you want to calculate cgpa");
		y=s.next();
		if(y.equals("yes"))
		{
			cgpa(gpa5);
		}
	case 6:
		gpa6=sem6();
		break;
		System.out.println("if you want to calculate cgpa");
		y=s.next();
		if(y.equals("yes"))
		{
			cgpa(gpa6);
		}
	case 7:
		gpa7=sem7();
		break;
		System.out.println("if you want to calculate cgpa");
		y=s.next();
		if(y.equals("yes"))
		{
			cgpa(gpa7);
		}
	case 8:
		gpa8=sem8();
		break;
		System.out.println("if you want to calculate cgpa");
		y=s.next();
		if(y.equals("yes"))
		{
			cgpa(gpa8);
		}
	}
	break;
}
public static void cgpa(double gpa)
{
Scanner sc=new Scanner(System.in);
double ini,frst,secd1,secd2,trid1,trid2,fin1,fin2,cgpa,prev,t;
String no;
ini=gpa1;
frst2=(gpa1+gpa2)/2;
secd1=(frst+gpa3)/2;
secd2=(secd1+gpa4)/2;
trid1=(secd2+gpa5)/2;
trid2=(trid1+gpa6)/2;
fin1=(trid2+gpa7)/2;
fin2=(fin1+gpa8)/2;
System.out.println("do you know the previous cgpa");
no=sc.next();
System.out.println("enter the previous cgpa");
prev=sc.nextDouble();
if(no.equals("yes"))
{
	cgpa=(gpa+prev)/2;
}
else
{
System.out.println("1.1st sem cgpa"+"\n"+"2.2nd sem cgpa"+"\n"+"3.3rd sem cgpa"+"\n"+"4.4th sem cgpa"+"\n"+"5.5st sem cgpa"+"\n"+"6.6th sem cgpa"+"\n"+"7.7th sem cgpa"+"\n"+"8.8th sem cgpa"+"\n");
t=s.nextInt();
	switch(t)
	{
	case 1:
		System.out.println(ini);
	case 2:
		System.out.println(frst2);
	case 3:
		System.out.println(secd1);
	case 4:
		System.out.println(secd2);
	case 5:
		System.out.println(trid1);
	case 6:
		System.out.println(trid2);
	case 7:
		System.out.println(fin1);
	case 8:
		System.out.println(fin2);
	}
}
}
}	