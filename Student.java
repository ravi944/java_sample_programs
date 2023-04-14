class Student
{
String name;
int age;
String gender;
String Qualif;
Student(String name,int age,String gender,String Qualif)
{
this.name=name;
this.age=age;
this.gender=gender;
this.Qualif=Qualif;
}
public static void main(String[] args)
{
Student s1 = new Student("ravi",23,"MALE","B.tech");
System.out.println(s1.name+" "+s1.age+" "+s1.gender+" "+s1.Qualif);
Student s2 = new Student("kanth",23,"MALE","M.tech");
System.out.println(s2.name+" "+s2.age+" "+s2.gender+" "+s2.Qualif);
}
}
