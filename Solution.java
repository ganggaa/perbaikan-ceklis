/**
 * Nama = Firman Aulia Insani
 * Checklist = Abstraction dan Polymorphism
 */
public class Solution {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil("Toyota");
        Kendaraan motor = new Motor("Yamaha");
        mobil.tampilkanBiayaSewa("mobil", 3);
        motor.tampilkanBiayaSewa("motor", 3);


    }
}

abstract class Kendaraan {
    abstract int hitungBiayaSewa(int hari);
    void tampilkanBiayaSewa(String merk, int hari){
        System.out.println("tampilkan biaya sewa" + merk + hari);
    }
}

class Mobil extends Kendaraan {
    private String merk;
    int harga = 500000;
    private int totalBiaya = 0;
    int totalBiayaSewa;
    public Mobil(String merk) {
        this.merk = merk;
    }
    
    @Override
    int hitungBiayaSewa(int hari){
        totalBiaya = harga * hari;
        return totalBiaya;
    }
    @Override
    void tampilkanBiayaSewa(String jenisKendaraan, int hari){
        
        if (jenisKendaraan == "mobil") {
            totalBiayaSewa = hitungBiayaSewa(hari);
        } 
        System.out.println(totalBiayaSewa);
    }
}

class Motor extends Kendaraan {
    private String merk;
    int harga = 100000;
    private int totalBiaya = 0;
    int totalBiayaSewa;
    public Motor(String merk) {
        this.merk = merk;
    }
    @Override
    int hitungBiayaSewa(int hari){
        totalBiaya = harga * hari;
        return totalBiaya;
    }
    @Override
    void tampilkanBiayaSewa(String jenisKendaraan, int hari){
        
        if (jenisKendaraan == "motor") {
            totalBiayaSewa = hitungBiayaSewa(hari);
        } 
        System.out.println(totalBiayaSewa);
    }
}

