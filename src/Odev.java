import java.util.Scanner;
public class Odev {
    public static void main(String[] args) {
        float kilo;
       float boy;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kilonuzu giriniz:");
        kilo = inp.nextFloat();

        System.out.print("Boyunuzu giriniz:");
        boy = inp.nextFloat();

        float sonuc = kilo / (boy * boy);
        System.out.print("Vücut kitle endeksiniz"+ sonuc);


    }


}
