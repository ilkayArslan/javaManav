import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00,toplam;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Kilo Armut aldınız?");
        armut*=input.nextInt();
        System.out.print("Kaç Kilo Elma aldınız?");
        elma*=input.nextInt();
        System.out.print("Kaç Kilo Domates aldınız?");
        domates*=input.nextInt();
        System.out.print("Kaç Kilo Muz aldınız?");
        muz*=input.nextInt();
        System.out.print("Kaç Kilo Patlıcan aldınız?");
        patlican*=input.nextInt();
        toplam = armut+elma+domates+muz+patlican;
        System.out.println("Toplam Tutarınız : "+toplam + "TL");


    }
}