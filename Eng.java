class Eng
{
void learn()
{
System.out.println("Eng");
}
}
class Seng extends Eng
{
void learn()
{
System.out.println("Seng");
}
}
class Meng extends Eng
{
void learn()
{
System.out.println("Meng");
}
public static void main(String[] args)
{
Seng s=new Seng();
s.learn();
Eng e=new Eng();
e.learn();
Meng m=new Meng();
m.learn();
}
}
