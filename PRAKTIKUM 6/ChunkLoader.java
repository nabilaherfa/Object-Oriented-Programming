/*
Nama    : Nabilah Erfariani
NIM     : 13519181
Kelas   : K04
Praktikum Week 12
*/

import java.util.*;

public class ChunkLoader implements Runnable {
    // ... Anda boleh menambahkan atribut
    private Chunk chunk;
    private String chunkDataFilename;

    public ChunkLoader(Chunk chunk, String chunkDataFilename) {
        // ... Isilah constructor sesuai kebutuhan
        this.chunk = chunk;
        this.chunkDataFilename = chunkDataFilename;
    }

    @Override
    public void run() {
        // Membaca file dengan nama chunkDataFilename
        // Gunakan class CSVReader.
        // Contoh file chunkDataFilename:
        // x,y
        // 1,18
        // 10,8
        // 6,12
        try {
          CSVReader csvreader = new CSVReader(this.chunkDataFilename, ",");
          csvreader.setSkipHeader(true);
          List<String[]> rows = csvreader.read();
          // Untuk setiap x dan y, tambahkan tree ke Chunk
          // Jika ada IOException pada saat membaca reader, catch Exception
          // tidak ada tree yang ditambahkan pada Chunk (tidak dithrow lagi)
          for (String[] a : rows) {
            this.chunk.addTree(new Position(Integer.valueOf(a[0]), Integer.valueOf(a[1])));
          }
        } catch(Exception e) {
          // pass
        }
    }
}