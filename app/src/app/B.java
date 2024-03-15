package app;
import java.util.Scanner;
public class B {
    public static void main(String[] args) {
Scanner sc = new Scanner (System.in);

float a1, a2, a3, media;

System.out.print("A1= ");
a1 = sc.nextFloat();

System.out.print("A2= ");
a2 = sc.nextFloat();

System.out.print("A3= ");
a3 = sc.nextFloat();

media = ((a1*3) + (a2*3) + (a3*4))/10;

System.out.println("Sua media é" + media);
}
    
    
}
