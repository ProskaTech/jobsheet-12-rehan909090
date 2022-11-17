package Encapstulation;

public class BuahUtama {
    public static void main(String[] args) {
        // menggunakan constructor untuk menginisialisasi
        EncapsulationBuah Apel = new EncapsulationBuah("Apel", "Rp.3000", "Merah");
        // menggunakan getter ke nilai
        System.out.println(
                "NamaBuah : " + Apel.getName() + "\nHarga : " + Apel.getPrice() + "\nWarna : " + Apel.getColor());
        // update harga dan warna menggunakan Setter
        Apel.setColor("Hijau");
        Apel.setPrice("Rp. 7000");
        System.out.println("\nInformasi terkait Apel setelah di Update");
        // Menggunakan getter untuk mendapatkan nilai
        System.out.println(
                "NamaBuah : " + Apel.getName() + "\nHarga : " + Apel.getPrice() + "\nWarna : " + Apel.getColor());
    }
}
