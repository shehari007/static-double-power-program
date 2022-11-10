package double_power;

public class Double_Power {

    public static double power(double a, double b) {
        return Math.exp(b * Math.log(a));
    }

    public static void main(String[] args) {

        System.out.println(power(2.12, 4.3)); //Odev fonksyonu.
        System.out.println(Math.pow(2.12, 4.3)); //Math.pow Kutuphaneden test edildi sonuc ayni cikti
    }
}
