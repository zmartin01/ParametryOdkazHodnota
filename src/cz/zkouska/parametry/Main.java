package cz.zkouska.parametry;

public class Main {

    public static void main (String args[]){

        int x = 1;
        System.out.println("Promenna x pred provolanim prictiJednicku(x): " + x);
        prictiJednicku(x);
        System.out.println("Promenna x po provolani prictiJednicku(x): " + x);

        System.out.println("=====================");

        Trida trida = new Trida(1);
        System.out.println("Field trida.cislo pred provolanim prictiJednickuKFieldu: " + trida.getCislo());
        prictiJednickuKFieldu(trida);
        System.out.println("Field trida.cislo po provolani prictiJednickuKFieldu: " + trida.getCislo());

    }


    // primitivni datovy typ - pri volani se HODNOTA zkopiruje do parametru metody int a
    public static void prictiJednicku(int a){
        System.out.println("Metoda prictiJednicku, predano bylo: " + a);
        a += 1;
        System.out.println("Metoda prictiJednicku, vysledek po pricteni: " + a);
    }

    // preda se ODKAZ na objekt
    public static void prictiJednickuKFieldu(Trida a){
        System.out.println("Metoda prictiJednickuKFieldu, pred operaci pricteni: " + a.getCislo());
        a.setCislo(a.getCislo() + 1);
        System.out.println("Metoda prictiJednickuKFieldu, vysledek po pricteni: " + a.getCislo());
    }
}