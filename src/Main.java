import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }



        byte labaiMazasSkaicius = 12;
        short didesnisSkaicius = 500;
        int dazniausiaiNaudojamas = 3000000;
        long didysisSkaicius = 39001011234L;
        float skaiciusSuKableliu = 100.100f;
        double didelisSkaiciusSuKableliu = 1000000000.1000000000D;
        char simbolis = 'Ą';

        float x = 500.8f;
        float rezultatas = x / 7;


        int a = 10;
        int b = 37;

        a++;
        b--;
        float rez = a * b;

        System.out.println(rez);
        System.out.println(rezultatas);



        String vardas = "Mano vardas Lina";

        char raide = vardas.charAt(7);
        System.out.println(raide);

        System.out.println(vardas.length());

        System.out.println(vardas.substring(12));
        System.out.println(vardas.substring(0,4));

        String pirmaEilute = "vienas";
        String antraEilute = "du";

        pirmaEilute = pirmaEilute + " "  + antraEilute;
        System.out.println(pirmaEilute);

        // char [] raides = ('L', 'i', 'n', 'a');

       // System.out.println(raides);

        // Date data = new Date();

        String kodas = "CodeAcademy";
        String kodas2 = "CodeAcademy";
        String kodas3 = "CodeAcademy3";
        String kodas4 = "CODEAcademy3";

        char charToFind = 'e';

        System.out.println(charToFind);

        int pirmasEIndeksas = kodas.indexOf(charToFind);
        int antrasEIndeksas = kodas.indexOf(charToFind, pirmasEIndeksas +1);
        System.out.println("Pirmas: " + pirmasEIndeksas);
        System.out.println("Antras: " + antrasEIndeksas);


        System.out.println(kodas.indexOf('e', 4));

        if (kodas.equals(kodas2)) {
            System.out.println("Strings are equal ");
        } else System.out.println("Strings are not equal ");

        System.out.println(kodas2.equals(kodas3));

        //funkcija, kuri ignoruoja didziasias ir mazasias raides: equalsIgnoreCase
        System.out.println(kodas3.equalsIgnoreCase(kodas4));

        String atsakymas = kodas.concat(" ").concat(kodas3);
        System.out.println(atsakymas);

        System.out.println(kodas.toUpperCase());

        int thousands = 3;
        int hundreds = 8;
        int tenths = 2;
        int ones = 4;

        String number = Integer.toString(thousands) + Integer.toString(hundreds) + Integer.toString(tenths) + String.valueOf(ones);

        System.out.println(number);


    }
}
