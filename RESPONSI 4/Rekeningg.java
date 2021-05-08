public class Rekeningg {
    // Daftar transaksi yang telah dilakukan pada rekening ini
    private Transaksi[] daftarTransaksi;
    // Jumlah transaksi yang telah dilakukan pada rekening ini
    private int jumlahTransaksi;
    // Jumlah transaksi maksimum yang dapat disimpan
    private int maxTransaksi;

    // Konstruktor, dengan nilai maxTransaksi awal
    public Rekening(int maxTrans) {
        maxTransaksi = maxTrans;
        daftarTransaksi = new Transaksi[maxTrans]
    }

    // Getter
    public int getJumlahTransaksi() {
        return jumlahTransaksi;
    }
    public int getMaxTransaksi() {
        return maxTransaksi;
    }

    // Mengembalikan array baru yang berisi `count` transaksi terakhir yang dilakukan
    public Transaksi[] getLastTransaksi(int count) {

        Transaksi[] temp = new Transaksi[maxTransaksi];

    }

    // Mengembalikan saldo pada rekening, yaitu hasil penjumlahan perubahan semua transaksi yang telah dilakukan
    public double getSaldo() {
        double saldo;
        for (int i =0; i <jumlahTransaksi ; i++){
            saldo += daftarTransaksi][i].getPerubahan();
        }
        return saldo;
    }

    // Membuat transaksi baru yang menambahkan `amount` uang pada rekening.
    // `amount` harus positif dan harus ada sisa tempat di rekening.
    // Mengembalikan status berhasil/gagal penyimpanan uang. (Jika berhasil, mengembalikan true)
    public boolean simpanUang(double amount) {
        if(amount > 0 && jumlahTransaksi< maxTransaksi){
            Transaksi[] newtrans = new Transaksi(this, amount);
            daftarTransaksi[maxTransaksi] = newtrans;
            jumlahTransaksi++;
            return true;
        }
        else {
            return false;
        }
    }

    // Membuat transaksi baru yang mengurangi `amount` uang pada rekening.
    // `amount` harus positif dan lebih kecil dari saldo, dan harus ada sisa tempat di rekening.
    // Harus ada sisa tempat di rekening.
    // Mengembalikan status berhasil/gagal penarikan uang. (Jika berhasil, mengembalikan true)
    public boolean tarikUang(double amount) {
        if(amount > 0 && amount < getSaldo() && jumlahTransaksi<maxTransaksi){
            Transaksi[] newtrans = new Transaksi(this, -amount);
            daftarTransaksi[maxTransaksi] = newtrans;
            jumlahTransaksi++;
            return true;
        }
        else{
            return false;
        }
    }
}
