public abstract class Kendaraan {
    //atribut
    private String kodeKendaraan;
    private String namaKendaraan;
    private double hargaSewaPerHari;
    private boolean isTersedia = true;
    //konstruktor
    public Kendaraan(String kode, String nama, double harga){
        kodeKendaraan = kode;
        namaKendaraan = nama;
        hargaSewaPerHari = harga;
    }
    //setter getter
    public String getKodeKendaraan(){
        return kodeKendaraan;
    }
    public void setKodeKendaraan(String kode){
        kodeKendaraan = kode;
    }
    public String getNamaKendaraan(){
        return namaKendaraan;
    }
    public void setNamaKendaraan(String nama){
        namaKendaraan = nama;
    }
    public double getHargaSewaPerHari(){
        return hargaSewaPerHari;
    }
    public void setHargaSewaPerHari(double harga){
        hargaSewaPerHari = harga;
    }
    public boolean isTersedia(){
        return isTersedia;
    }
    public void setTersedia(boolean status){
        isTersedia = status;
    }
    //method fungsional
    public abstract double hitungBiayaDasar(int lamaSewa);
    public abstract void tampilInfo();
}