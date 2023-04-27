import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armutFiyat, elmaFiyat, domatesFiyat, muzFiyat, patlicanFiyat,
                armutTutar, elmaTutar, domatesTutar, muzTutar, patlicanTutar,
                toplamTutar;

        armutFiyat = 2.14;
        elmaFiyat = 3.67;
        domatesFiyat = 1.11;
        muzFiyat = 0.95;
        patlicanFiyat = 5;

        Scanner input = new Scanner(System.in);
        System.out.println("Armut Kaç Kg?: " );
        armutTutar = input.nextDouble();

        System.out.println("Elma Kaç Kg?: ");
        elmaTutar = input.nextDouble();

        System.out.println("Domates Kaç Kg?: ");
        domatesTutar = input.nextDouble();

        System.out.println("Muz Kaç Kg?: ");
        muzTutar = input.nextDouble();

        System.out.println("Patlican Kaç Kg?: ");
        patlicanTutar = input.nextDouble();

        toplamTutar = armutFiyat*armutTutar + elmaFiyat*elmaTutar + domatesFiyat*domatesTutar + muzFiyat*muzTutar + patlicanFiyat*patlicanTutar;
        System.out.println("Toplam Tutar: " + toplamTutar + " TL");

    }
}