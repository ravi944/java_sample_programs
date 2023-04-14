class Simple_inhrc
{
String name;
int price;
void startengine()
{
System.out.println("Start-engine");
}
void stopengine()
{
System.out.println("stop-engine");
}
}
class Bike extends Vehicle{
public static void main(String[] args)
{
Bike b1=new Bike();
b1.name="Duke";
b1.price=2400000;
System.out.println(b1.name);
System.out.println(b1.price);
b1.startengine();
b1.stopengine();
}
}
class Car extends Vehicle{
public static void main(String[] args)
{
Car c1=new Car();
c1.name="Skoda";
c1.price=2500000;
System.out.println(c1.name);
System.out.println(c1.price);
c1.startengine();
c1.stopengine();
}
}