import java.util.Scanner;

public class Kirja {
   private String nimi;
   private String isbn;
   private Double hinta;;
   private Kustantaja tiedot ;


   public Kirja(){
        hinta = 0.0;
        isbn = null;
        nimi = null;
        tiedot = null;

    }
    public Kirja(String nimi, Double hinta, String isbn) {
       this.hinta = hinta;
       this.isbn = isbn;
       this.nimi = nimi;
        this.tiedot = null;

    }


    public Kirja(String nimi, Double hinta, Kustantaja tiedot, String isbn) {
        this.hinta = hinta;
        this.isbn = isbn;
        this.nimi = nimi;
        this.tiedot = tiedot;

    }

    public Kustantaja getTiedot() {
        return tiedot;
    }

    public void setTiedot(Kustantaja tiedot) {
        this.tiedot = tiedot;
    }

    public String getNimi() {
        return nimi;
    }

    public Double getHinta() {
        return hinta;
    }


    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setHinta(Double hinta) {
        this.hinta = hinta;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Kirja{" +
                "nimi='" + nimi + '\'' +
                ", isbn='" + isbn + '\'' +
                ", hinta=" + hinta +
                ", tiedot=" + tiedot +
                '}';
    }
}
