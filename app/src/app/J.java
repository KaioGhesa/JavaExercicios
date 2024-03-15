package app;
import java.util.Scanner;
public class J {
    public static void main(String[] args) {
        
 Scanner sc = new Scanner (System.in);

double idade, atual, anoAtual=2024;

System.out.println("Digite sua idade ");
idade =sc.nextDouble();

atual = idade + 100;

System.out.println("Sua idade em " + (anoAtual + 100) + "sera de " + atual);
    }
}
