package deneme;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner kullanici = new Scanner(System.in);
        System.out.println("Hesaplamak istediğiniz iki sayıyı giriniz.");
        double sayiBir = Double.parseDouble(kullanici.nextLine().replace(',','.'));
       // System.out.println("sayi bir "+ sayiBir*25);

        DecimalFormat format = new DecimalFormat("#.##");

        System.out.println(format.format(sayiBir));;


        /*Scanner kullanici = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#.##");
        System.out.println("Hesap makinesine hoşgeldiniz!");
        System.out.println("Hesaplamak istediğiniz iki sayıyı giriniz.");
        double sayiBir = kullanici.nextDouble();
        System.out.println("Hesaplam istediğiniz ikinci sayıyı girin.");
        double sayiİki = kullanici.nextDouble();
        System.out.println("Hangi işlemi yapmak istersiniz?" + "+, *, / ve - işlemlerinden birini giriniz.");
        char islem = kullanici.next().charAt(0);
        double sonuc;

        switch (islem) {
            case '+':
                sonuc = sayiBir + sayiİki;
                System.out.println(sonuc);
                break;
            case '-':
                sonuc = sayiBir - sayiİki;
                System.out.println(sonuc);
                break;
            case '*':
                sonuc = sayiBir * sayiİki;
                System.out.println(sonuc);
                break;
            case '/':
                sonuc = sayiBir / sayiİki;
                System.out.println(sonuc);
                break;
            default:
                System.out.println("Lütfen tanımlanmış bir işlem seçiniz.");


        }*/
    }
}
