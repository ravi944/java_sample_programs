class Methodemp
{
String name;
int sal;
String company;
Methodemp(String n,int s,String c)
{
this.name=n;
this.sal=s;
this.company=c;
}
void Empdetails()
{
System.out.println("name="+this.name);
System.out.println("sal="+this.sal);
System.out.println("name of company="+this.company);
}
public static void main(String[] args)
{
Methodemp e1=new Methodemp("ravi",20000,"xyz");
Methodemp e2=new Methodemp("kanth",21000,"abc");
Methodemp e3=new Methodemp("Suri",22000,"abc");

e1.Empdetails();
e2.Empdetails();
e3.Empdetails();
}
}