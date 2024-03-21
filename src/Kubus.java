import java.util.Scanner;

public class Kubus extends BangunRuang{
    Scanner scanner = new Scanner(System.in);
    private double tinggi;

    Kubus(String name) {
        super(name);
    }

    @Override
    public void inputNilai(){
        super.inputNilai();
        System.out.print("Input Tinggi (cm): ");
        tinggi = scanner.nextDouble();
    }

    @Override
    public void luasPermukaan(){
        double hasil = 6 * tinggi * tinggi;
        super.luasPermukaan();
        System.out.println("Hasil Luas Permukaan (cm^2): " + hasil);
    }

    @Override
    public void volume(){
        double hasil = Math.pow(tinggi, 3);
        super.volume();
        System.out.println("Hasil Volume (cm^3): " + hasil);
    }
}