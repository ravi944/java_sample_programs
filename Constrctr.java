class Constrctr
{
String name;
int age;
Constrctr(String name,int age)
{
this.name=name;
this.age=age;
}
public static void main(String[] args)
{
Constrctr s1=new Constrctr("ravi",23);
System.out.println(s1.name);
System.out.println(s1.age);
Constrctr s2=new Constrctr("kanth",23);
System.out.println(s2.name);
System.out.println(s2.age);
}
}