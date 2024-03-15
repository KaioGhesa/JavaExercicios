package app;
import java.util.Scanner;

public class E {
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);

    double atual, ano;

    System.out.print("Digite seu ano de nascimento: ");
    ano = sc.nextDouble();


    System.out.print("Digite o ano atual: ");
    atual = sc.nextDouble();

    System.out.println("Voce tem " + (atual - ano));   
    }
}
