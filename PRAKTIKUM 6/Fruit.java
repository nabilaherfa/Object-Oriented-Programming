
/*
Nama    : Nabilah Erfariani
NIM     : 13519181
Kelas   : K04
Praktikum Week 12
*/

public class Fruit {
    private FruitType type;
  
    public Fruit(FruitType type) {
      this.type = type;
    }
  
    private void announceFruitType() {
    // Mencetak nama buah dalam bahasa Indonesia sesuai dengan type dan diakhiri new line
    // tanpa tanda kutip
    // Contoh: "Apel"
    
    // Gunakan assert untuk mengetes asumsi bahwa kode tidak akan masuk ke bagian selain
    // FruitType yang telah didefinisikan
    // ...
        if (this.type == FruitType.APPLE) {
            System.out.println("Apel");
        } 
        else if (this.type == FruitType.ORANGE) {
            System.out.println("Jeruk");
        } 
        else if (this.type == FruitType.WATERMELON) {
            System.out.println("Semangka");
        } 
        else if (this.type == FruitType.BANANA) {
            System.out.println("Pisang");
        }  
        else {
            assert false;
        }
    }
  
    private void peel() {
    // Memastikan bahwa FruitType dari objek ini adalah ORANGE atau BANANA
    // ...

    // Mencetak "Peeling " tanpa tanda kutip diikuti dengan type dan new line
    // Contoh: "Peeling BANANA"
        assert this.type == FruitType.ORANGE || this.type == FruitType.BANANA;
    
        System.out.println("Peeling " + this.type.toString());
    }
  
    private void press() {
    // Memastikan bahwa FruitType dari objek ini adalah bukan BANANA
    // ...

    // Mencetak "Peeling " tanpa tanda kutip diikuti dengan type dan new line
    // Contoh: "Pressing WATERMELON"
        assert this.type != FruitType.BANANA;
  
        System.out.println("Pressing " + this.type.toString());
    }
  
    private void removeCore() {
    // Memastikan bahwa FruitType dari objek ini adalah APEL
    // ...

    // Mencetak "Removing core " tanpa tanda kutip diikuti dengan type dan new line
    // Contoh: "Removing core APPLE"
        assert this.type == FruitType.APPLE;

        System.out.println("Removing core " + this.type.toString());
    }
  
    // Suatu saat, bila ada programmer yang ingin menambahkan method public,
    // Ia sadar kalau tidak semua method dapat dipanggil, tergantung fruitType.
    // Method di atas private, sehingga boleh menggunakan assertion.
    // Bila public, sebaiknya menggunakan exception dibanding assertion.
  }