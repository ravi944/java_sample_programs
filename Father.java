class Father{
int money=500000;
void learn()
{
System.out.println("java");
}
}
class Son extends Father{
String bike="Duke";
void Doexrs()
{
System.out.println("Gym");
}
public static void main(String[] args)
{
Son s=new Son();
System.out.println(s.money);
}
}
class Grandson extends Son
{
String cycle="Hero";
void play()
{
System.out.println("play");
}
public static void main(String[] args)
{
Grandson g=new Grandson();
System.out.println(g.cycle);
g.play();
System.out.println(g.bike);
g.Doexrs();
System.out.println(g.money);
g.learn();
}
}
