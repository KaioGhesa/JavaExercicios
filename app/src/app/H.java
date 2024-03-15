package app;

import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pi = 3.1415;
        double raio;

        System.out.println("Sistema: Calcular a área de um círculo");
        System.out.print("Qual é o raio do círculo? ");
        raio = sc.nextDouble();

        double area = pi * raio * raio;

        System.out.println("Resultado:");
        System.out.println("A área do círculo é de " + area);
    }
}

