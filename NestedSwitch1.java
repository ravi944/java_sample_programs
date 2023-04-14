import java.util.Scanner;
class NestedSwitch1
{    
public static void main(String args[])  
{  
Scanner sc=new Scanner(System.in);
System.out.println("enter the name");
int branch = sc.nextInt();                
int collegeYear = 4;  
switch( collegeYear )  
{  
case 1:  
System.out.println("English, Maths, Science");  
break;  
case 2:  
switch( branch )   
{  
case 11:  
System.out.println("Operating System, Java, Data Structure");  
break;  
case 22:  
System.out.println("Micro processors, Logic switching theory");  
break;  
case 33:  
System.out.println("Drawing, Manufacturing Machines");  
break;                                             
}  
break;  
case 3:  
switch( branch )   
{  
case 44:  
System.out.println("Computer Organization, MultiMedia");  
break;  
case 55:  
System.out.println("Fundamentals of Logic Design, Microelectronics");  
break;  
case 66:  
System.out.println("Internal Combustion Engines, Mechanical Vibration");  
break;                      
}  
break;  
case 4:  
switch( branch )   
{  
case 77:  
System.out.println("Data Communication and Networks, MultiMedia");  
break;  
case 88:  
System.out.println("Embedded System, Image Processing");  
break;  
case 99:  
System.out.println("Production Technology, Thermal Engineering");  
break;  
}  
break;  
}  
}  
}  