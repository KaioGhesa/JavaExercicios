package app;
import java.util.Scanner;
public class K {
    public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
double a1, a2, media;

System.out.print("A1= ");
a1 = sc.nextDouble();

System.out.print("A2= ");
a2 = sc.nextDouble();


media = ((a1*2) + (a2*3))/5;

System.out.println("Sua media é " + media);
    }
    
}
