import java.util.Scanner;
class PrimeNumberChecker {
public static void main(String[] args) {
System.out.println("Enter a number to check Prime or Not");
Scanner scanner = new Scanner(System.in);
int number = scanner.nextInt();
int count = 0;
for (int i=2; i<=number; i++) {
if (number % i == 0) {
count++;
break;
}
}
if (count == 0) {
System.out.println(number + " is prime number");
} else {
System.out.println(number + " is not a prime number");
}
}
}