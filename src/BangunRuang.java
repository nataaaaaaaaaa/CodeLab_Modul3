public class BangunRuang {
    private String name;

    BangunRuang(String name){
        this.name = name;
    }
    public void inputNilai(){
        System.out.println("Input Nilai");
    }
    public void luasPermukaan(){
        System.out.println("Menghitung Luas Permukaan Bangun " + name);
    }
    public void volume(){
        System.out.println("Menghitung Volume Bangun " + name);
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
