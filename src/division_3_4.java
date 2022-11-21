import java.util.Scanner;

public class division_3_4 {
    public static void main(String[] args) {
        int sayi,i,toplam=0,ortalama=0,bayrak=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Sayı Girişi Yapınız: ");
        sayi = input.nextInt();

        if (sayi%12==0) {
            for (i = 12; i <= sayi; i += 12) {
                System.out.println(+i);
                toplam=toplam+i;
                bayrak++;
            }
            System.out.println("Girdiğiniz sayıya kadar 3 ve 4'e tam bölünen sayıların toplamı: " +toplam);
            ortalama=toplam/bayrak;
            System.out.println("Sayıların ortalaması: "+ortalama);
        }
        else {
            System.out.println("Sayı 3 ve 4'e tam bölünmez");
        }
    }
}