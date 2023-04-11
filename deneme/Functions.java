package deneme;

public class Functions {
    public static void main(String[] args) {
        int top1 = 7;
        int top2 = 6;
        int donenCevap = toplama(top1,top2);
        System.out.println(donenCevap);
        System.out.println(karsilama("Begüm"));
        System.out.println(yilBul(27));
        bye();

    }
    public static int toplama(int sayi1, int sayi2) {
        int cevap;
        cevap = sayi1 + sayi2;
        return cevap;
    }

    public static String karsilama(String isim){
        return "Merhaba " + isim;
    }
    public static String yilBul(int yas){
        int yil = 2023 - yas;
        yil--;
        return yil + " yılında doğdunuz.";
    }

    public static void bye(){
        System.out.println("Görüşürüz.");
    }
}
