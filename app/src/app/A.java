package app;
import java.util.Scanner;
public class A {
 public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
int num1, num2 , num3, result;

System.out.println("Digite um número");
num1 = sc.nextInt();

System.out.println("Digite um número");
num2 = sc.nextInt();

System.out.println("Digite um número");
num3 = sc.nextInt();

result = num1 + num2 + num3;
System.out.println("Seu resultado é " + result);
}
    
}
