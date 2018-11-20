import java.util.Scanner;

public class KirjaHallintaa {


    static Kirja kirja = new Kirja();
    static Kustantaja kusta = new Kustantaja();

    public static void main(String[] args) {
        KirjaHallintaa sovellus = new KirjaHallintaa();
        luoKus();
        int valinta = -1;
        Scanner input = new Scanner(System.in);
        sovellus.lisääKysymykset();


        do {
            System.out.println("1 = Luo/muuta kustantaja");
            System.out.println("2 = Luo/muuta kirja");
            System.out.println("3 = Lisää kirjalle kustantaja");
            System.out.println("4 = Näytä kirjan tiedot");
            System.out.println("0. lopetus");

            System.out.print("Anna valintasi: ");
            valinta = input.nextInt();

            switch (valinta) {
                case 1:
                    sovellus.luoKus();
                    break;


                case 2:
                    sovellus.luoKirj();
                    break;
                case 3:
                    sovellus.lisaKus();
                case 4:
                    sovellus.näytäTiedot();
                case 0:
                    break;

                default:
                    System.out.println("Virheellinen valinta");
            }


        } while (valinta != 0) ;




    }
    public void lisääKysymykset(){

        return;
    }


    public static void luoKus() {
        Scanner input = new Scanner(System.in);
        System.out.print("Anna kustantajan nimi: ");
        String Kusnimi = input.nextLine();
        System.out.print("Anna kustantajan osoite: ");
        String oso = input.nextLine();
        System.out.print("Anna kustantajan puhelin: ");
        String puh = input.nextLine();





    }

    public void näytäTiedot() {
        if (kirja != null) {

            System.out.println(kirja.toString());
        } else System.out.println("Henkilöä ei ole");

    }
    public static void luoKirj() {
        Scanner input = new Scanner(System.in);
        System.out.print("Anna kirjan nimi: ");
        String Kirnimi = input.nextLine();
        System.out.print("Anna kirjan isbn: ");
        String isbn = input.nextLine();
        System.out.print("Anna kirjan hinta: ");
        double hinta = input.nextDouble();

        kirja.setNimi(Kirnimi);
        kirja.setIsbn(isbn);
        kirja.setHinta(hinta);
    }

    public static void lisaKus() {



    }

   /* public static void kysyKustan() {
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

    }*/
}
