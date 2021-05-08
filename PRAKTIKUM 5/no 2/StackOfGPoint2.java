/*
    Nama    : Nabilah Erfariani
    NIM     : 13519181
    Kelas   : K04
    Praktikum Minggu 12
*/

import java.util.ArrayList;

public class StackOfGPoint2 {
    private final int defaultStackSize = 10; // ukuran default stack
    private int size; // ukuran stack
    private int topStack; // indeks top (data teratas) dari stack
    private ArrayList<GPoint<Float>> data; // penyimpanan elemen stack
    private static int nStack = 0; // jumlah stack yang pernah dibuat

    public StackOfGPoint2() {
        //Inisiasi stack berukuran default
        this.size = defaultStackSize;
        this.topStack = -1;
        this.data = new ArrayList<GPoint<Float>>();
        nStack++;
    }

    public StackOfGPoint2(int size) {
        //Inisiasi stack berukuran size
        this.size = size;
        this.topStack = -1;
        this.data = new ArrayList<GPoint<Float>>(size);
        nStack++;
    }

    public void Push(GPoint<Float> p) {
        //Menambahkan elemen baru ke stack
        if (this.data.size() < this.size) {
            this.data.add(0, p);
        }
    }

    public GPoint<Float> Pop() {
        //Mengeluarkan elemen top stack
        if (this.topStack + 1 >= this.size) {
            return null;
        }
        if (this.topStack + 1 >= this.data.size()) {
            return null;
        }
        this.topStack++;
        return this.data.get(this.topStack);
    }

    public int IsEmpty() {
        //Memeriksa apakah stack kosong
        int x = 0;
        if (topStack >= 0) {
            x += topStack + 1;
        }
        return (this.data.size() - x == 0) ? 1 : 0;
    }

    public int IsFull() {
        //Memeriksa apakah stack penuh
        return (this.data.size() == this.size) ? 1 : 0;
    }

    public static int NumStackObj() {
        //Mengembalikan jumlah stack yang pernah dibuat
        return nStack;
    }
}