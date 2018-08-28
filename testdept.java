import java.util.*;
class testdept
{
demopro d=new demopro();
public static double sem1()
{
double gpa;
string G1,G2,G3,G4,G5,G6,G7,G8,G9;
int g1,g2,g3,g4,g5,g6,g7,g8,g9;
Scanner s=new Scanner(System.in);
System.out.println("");
G1=s.next();
g1=d.grade(G1);
System.out.println("");
G2=s.next();
g2=d.grade(G2);
System.out.println("");
G3=s.next();
g3=d.grade(G3);
System.out.println("");
G4=s.next();
g4=d.grade(G4);
System.out.println("");
G5=s.next();
g5=d.grade(G5);
System.out.println("");
G6=s.next();
g6=d.grade(G6);
System.out.println("");
G7=s.next();
g7=d.grade(G7);
System.out.println("");
G8=s.next();
g8=d.grade(G8);
System.out.println("");
G9=s.next();
g9=d.grade(G9);
gpa=(g1*+g2*+g3*+g4*+g5*+g6*+g7*+g8*+g9*)/
return gpa;
}