package app;
import java.util.Scanner;
public class I {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

double distancia, km, litros;

System.out.print("Digite quantos litros de combustivel seu carro faz por KM: ");
litros = sc.nextDouble();

System.out.println("Sua distancia percorrida foi: ");
distancia=sc.nextDouble();

km = distancia * litros;


System.out.println("O carro gastou " + km );

System.out.println("Litros por distancia");
        
    }
    
}
