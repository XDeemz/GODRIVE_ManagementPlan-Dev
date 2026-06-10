public class Mobil extends Kendaraan{
    //atribut tambahan
    private int jumlahKursi;
    //konstruktor
    public Mobil(String kode, String nama, double harga, int jumlahKursi){
        super(kode, nama, harga);
        this.jumlahKursi = jumlahKursi;
    }
    //setter getter
    public int getJumlahKursi(){
        return jumlahKursi;
    }
    public void setJumlahKursi(int kursi){
        jumlahKursi = kursi;
    }
    //abstract mtd 
    @Override 
    public void tampilInfo(){
        System.out.printf("[MOBIL] Kode: %s | Nama: %-20s | Kursi: %d | Tarif: Rp%,.0f/hari | Status: %s\n", getKodeKendaraan(), getNamaKendaraan(), getJumlahKursi(),getHargaSewaPerHari(), (isTersedia()?"Tersedia":"Tidak tersedia"));
    }
    @Override
    public  double hitungBiayaDasar(int lamaSewa){
      return lamaSewa*getHargaSewaPerHari();
    }
}
