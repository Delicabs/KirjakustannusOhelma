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

public class Kustantaja {
    private String nimi;
    private String osoite;
    private String puhelin;

    public Kustantaja(){
        nimi = null;
        osoite = null;
        puhelin = null;

    }

    public Kustantaja(String nimi, String osoite, String puhelin) {
        this.nimi = nimi;
        this.osoite = osoite;
        this.puhelin = puhelin;


    }

    public String getNimi() {
        return nimi;
    }

    public String getOsoite() {
        return osoite;
    }

    public String getPuhelin() {
        return puhelin;
    }

    public void setNimii(String nimi) {
        this.nimi = nimi;
    }

    public void setOsoite(String osoite) {
        this.osoite = osoite;
    }

    public void setPuhelin(String puhelin) {
        this.puhelin = puhelin;
    }

    @Override
    public String toString() {
        return "Kustantaja{" +
                "nimi='" + nimi + '\'' +
                ", osoite='" + osoite + '\'' +
                ", puhelin='" + puhelin + '\'' +
                '}';
    }
}



class KirjaKustantajaOhjelma {


    static Kirja kirja = new Kirja();

    public static void main(String[] args) {
        kysyKirja();


    }

    public static void kysyKirja() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kirjan nimi: ");
        String nimi = input.nextLine();
        System.out.print("Kirjan isbn: ");
        String isbn = input.nextLine();
        System.out.print("Kirjan hinta: ");
        double hinta = input.nextDouble();

        kirja.setNimi(nimi);
        kirja.setHinta(hinta);
        kirja.setIsbn(isbn);

        kysyKustan();
    }

    public static void kysyKustan() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kustantajan nimi: ");
        String knimi = input.nextLine();

        System.out.print("Kustantajan osoite: ");
        String kosoite = input.nextLine();

        System.out.print("Kustantajan puhelin: ");
        String kpuhelin = input.nextLine();
        Kustantaja kustantaja = new Kustantaja(knimi, kosoite, kpuhelin);
        kirja.setTiedot(kustantaja);


        System.out.println("Kirjan " + kirja.getNimi() + " Kustantaja on " + kirja.getTiedot().getNimi());

    }
}
