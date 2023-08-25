import java.util.Scanner;

public class alan {
    public static void main(String[] args) {
        //değişkenlerimizi tanımlayalım
        double cevre, alan,a, b, c, u;
        //kullanıcıdan veri alalım
        Scanner data = new Scanner(System.in);
        //Kullanıcıdan isteğimizi belirtelim
        System.out.print("İlk kenarı giriniz: ");
        a = data.nextDouble();
        System.out.print("İkinci kenarı giriniz: ");
        b = data.nextDouble();
        System.out.print("Üçüncü kenarı giriniz: ");
        c = data.nextDouble();
        //formüllerimizi yazalım
        u = (a+b+c) / 2;
        cevre = 2 * u;
        System.out.println("Üçgeninizin Çevresi: " + cevre);

        alan  = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgeninizin Alanı: " + alan);
    }
}
