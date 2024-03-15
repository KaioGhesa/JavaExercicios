package app;
import java.util.Scanner;
public class C {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
double salario, aumento;

System.out.print("Digite seu salario= ");
salario = sc.nextDouble();

aumento = salario * 1.25;

System.out.println("Sua media é" + aumento);

}
}
