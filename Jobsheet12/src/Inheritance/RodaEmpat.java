package Inheritance;

class RodaEmpat extends Kendaraan {
    double NaikHargaKe = 8; // 1 kali

    void hargaAkhir() {
        hargaDasar = hargaDasar + (hargaDasar * NaikHargaKe);
        System.out.println("Setelah di modifikasi, harga mobil menjadi Rp. " + hargaDasar);
    }
}