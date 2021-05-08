/*
    Nama    : Nabilah Erfariani
    NIM     : 13519181
    Kelas   : K04
    Praktikum 10

*/

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        // Set seluruh atribut dengan nilai 0
        hour = 0;
        minute = 0;
        second = 0;
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(Time t) {
        // Set atribut dengan atribut milik t
        this.hour = t.hour;
        this.minute = t.minute;
        this.second = t.second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int convertToSecond() {
        return hour*3600+minute*60+second;
    }

    public Time add(Time t) {
        // Return penjumlahan dua objek jam, yaitu *this* dan t.
        // Apabila hasil penjumlahan melebihi 23:59:59, maka Anda harus mengonversinya seperti tampilan jam digital asli.
        // Contoh : 24:00:00 dituliskan 00:00:00, 25:00:00 dituliskan 01:00:00, dst.
        Time newtime = new Time();
        int result;
        result = (this.convertToSecond() + t.convertToSecond())%86400;
        newtime.hour = result/3600;
        result = result% 3600;
        newtime.minute = result/60;
        newtime.second = result%60;
        return newtime;
    }

    public Time minus(Time t) {
        // Return selisih antara dua objek jam, yaitu *this* dan t.
        // Perhitungan selisih hanya dapat dilakukan jika objek ruas kiri lebih akhir dari atau sama dengan objek ruas kanan.
        // Jika objek ruas kiri lebih awal, maka kembalikan nilai objek ruas kiri.
        // Contoh: 00:00:01 - 00:00:02 = 00:00:01
        Time newtime = new Time();
        int result;

        if(this.convertToSecond() >= t.convertToSecond()){
            result = this.convertToSecond()-t.convertToSecond();
        }else{
            return (new Time(this));
        }

        newtime.hour = result/3600;
        result = result % 3600;
        newtime.minute = result/60;
        newtime.second = result%60;
        return newtime;
    }

    public boolean lessThan(Time t) {
        // Returns true jika *this* < t menurut definisi waktu
        if(this.convertToSecond() < t.convertToSecond()){
            return true;
        }else{
            return false;
        }
    }

    public boolean greaterThan(Time t) {
        // Returns true jika *this* > t menurut definisi waktu
        if(this.convertToSecond() > t.convertToSecond()){
            return true;
        }else{
            return false;
        }
    }

    public void printTime() {
        // Menuliskan jam dalam format hh:mm:ss diakhiri dengan newline. Perhatikan bahwa setiap parameter harus dituliskan 2 digit.
        if(hour<10){
            System.out.print(0);
        }
        
        System.out.print(hour+":");
        if(minute<10){
            System.out.print(0);
        }
        
        System.out.print(minute+":");
        
        if(second<10){
            System.out.print(0);
        }
        
        System.out.println(second);
    }
}