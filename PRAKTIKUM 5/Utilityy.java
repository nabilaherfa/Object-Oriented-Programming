/*
    Nama    : Nabilah Erfariani
    NIM     : 13519181
    Kelas   : K04
    Praktikum Minggu 12
*/
public class Utilityy {

    /*
    getMidpoint, digunakan untuk mengembalikan elemen tengah sebuah array. Untuk kasus jumlah elemen bernilai genap, 
    jika array memiliki tipe elemen yang merupakan Number, maka nilai yang dikembalikan berupa double yang merupakan nilai tengah dari dua buah bilangan yang menempati posisi tengah. Sedangkan jika elemen array bukan Number, cukup kembalikan elemen array dengan index tengah yang lebih tinggi.
    */
    public static <T extends Number> double getMidpoint(T[] arr) {
        int mid = (arr.length-1)/2;
        if(arr.length%2 = 1){
            return arr[mid].doubleValue();
        }
        else {
            return (arr[mid].doubleValue()+arr[mid+1].doubleValue())/2;
        }
    }

    public static <T> T getMidpoint(T[] arr) {
        return arr[(arr.length/2)]
    }

    /* 
    getMin, digunakan untuk mengembalikan nilai minimum seluruh elemen array dengan tipe double. 
    Method hanya bisa digunakan untuk array dengan tipe elemen berupa Number.
    */
    public static <T extends Number> double getMin(T[] arr) {
       double min = arr[0].doubleValue();
       for(T x : arr){
           if(x.doubleValue() < min){
               min = x.doubleValue();
           }
       }
       return min;
    }

    /*
    getMax, digunakan untuk mengembalikan nilai maximum seluruh elemen array dengan tipe double. 
    Method hanya bisa digunakan untuk array dengan tipe elemen berupa Number.
    */
    public static <T extends Number> double getMax(T[] arr) {
        double max = arr[0].doubleValue();
        for(T x : arr){
            if(x.doubleValue() > min){
                max = x.doubleValue();
            }
        }
        return max;
    }

    /*
    getFirst, digunakan untuk mengembalikan elemen pertama sebuah array.
    */
    public static <T> T getFirst(T[] arr) {
       return arr[0];
    }

    /*
    getLast, digunakan untuk mengembalikan elemen terakhir sebuah array.
    */
    public static <T> T getLast(T[] arr) {
        return arr[length-1];
    }

    /*
    getAverage, digunakan untuk mengembalikan nilai rata-rata seluruh elemen array dengan tipe double. 
    Method hanya bisa digunakan untuk array dengan tipe elemen berupa Number.
    */
    public static <T extends Number> double getAverage(T[] arr) {
        double result;
        for(T x: arr){
            result += x.doubeValue();
        }
        return result/arr.length;
    }


    /*
    getSize, digunakan untuk mengembalikan sebuah integer yang merupakan ukuran sebuah array.
    */
    public static <T> int getSize(T[] arr) {
        return arr.length;
    }
     
}