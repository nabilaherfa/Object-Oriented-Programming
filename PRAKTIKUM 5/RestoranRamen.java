/*
    Nama    : Nabilah Erfariani
    NIM     : 13519181
    Kelas   : K04
    Praktikum Minggu 12
*/

import java.util.*;

public class RestoranRamen {
    private Map<Integer, Integer> daftarMeja;

    // constructor: membuat restoran dengan daftar meja kosong
    public RestoranRamen() {
        this.daftarMeja = new HashMap<Integer, Integer>();
    }

    /*menambahkan jumlah order yang dipesan oleh meja n, dengan harga p
    jika meja sudah diisi maka akan menambah total yang telah dipesan
    */
    public void tambahOrder(int n, int p) {
        int skrg = this.daftarMeja.getOrDefault(n, 0);
        this.daftarMeja.put(n, skrg + p);
    }

    /* mengembalikan total harga pesanan pada meja n
     menghapus entri untuk meja tersebut
    */
    public int tutupOrder(int n) {
        return this.daftarMeja.remove(n);
    }

    // mengembalikan total harga pesanan pada meja n
    public int cekTotal(int n) {
        return this.daftarMeja.get(n);
    }

    /*mengembalikan jumlah meja yang terisi saat itu
     restoran mungkin kosong
    */
    public int totalMeja() {
        return this.daftarMeja.keySet().size();
    }

    // menjetak semua meja yang terisi pada restoran diakhiri dengan new line
    // contoh:
    /*
     * Meja 1 = 5000 Meja 2 = 3000 Meja 3 = 10000
     */
    // jika restoran kosong akan mencetak "Restoran kosong" diakhiri new line
    public void cetakMeja() {
        if (totalMeja() == 0) {
            System.out.println("Restoran kosong");
        }
        for (Map.Entry<Integer, Integer> entry : this.daftarMeja.entrySet()) {
            System.out.printf("Meja %d = %d\n", entry.getKey(), entry.getValue());
        }
    }
}