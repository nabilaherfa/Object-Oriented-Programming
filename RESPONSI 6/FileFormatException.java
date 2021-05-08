/*
    Nama    : Nabilah Erfariani
    NIM     : 13519181
    Kelas   : K04
    Responsi minggu 13
*/
public class FileFormatException extends Exception {

    private String errorMessage;

    public FileFormatException() {
        super();
        this.errorMessage = "Format salah";
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

}