import java.util.Scanner;

public class Balok extends BangunRuang{
    Scanner scanner = new Scanner(System.in);
    private double Panjang;
    private double Lebar;
    private double Tinggi;
    Balok(String name) {
        super(name);
    }

    @Override
    public void inputNilai(){
        super.inputNilai();
        System.out.print("Masukkan Panjang (cm): ");
        Panjang = scanner.nextDouble();
        System.out.print("Masukkan Lebar (cm): ");
        Lebar = scanner.nextDouble();
        System.out.print("Masukkan Tinggi (cm): ");
        Tinggi = scanner.nextDouble();

    }

    @Override
    public void luasPermukaan(){
        double hasil = 2 * ((Panjang*Lebar)+(Panjang*Tinggi)+(Lebar*Tinggi));
        super.luasPermukaan();
        System.out.println("Hasil Luas Permukaan (cm^2): " + hasil);
    }

    @Override
    public void volume(){
        double hasil = Panjang * Lebar * Tinggi;
        super.volume();
        System.out.println("Hasil Volume (cm^3): " + hasil);
    }
}