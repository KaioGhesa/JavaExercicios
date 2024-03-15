package app;
import java.util.Scanner;
public class F {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner (System.in);

double area, altura, base;

System.out.print("Digite a base ");
base = sc.nextDouble();

System.out.print("Digite a altura ");
altura = sc.nextDouble();

area = altura * base;

System.out.println("Sua area e " + area);
        
    }
}
