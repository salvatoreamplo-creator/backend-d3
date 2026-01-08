public class Main {

    public static <Rettangolo> void stampaRettangolo(Rettangolo r) {
        System.out.println("Area: " + r.calcolaArea());
        System.out.println("Perimetro: " + r.calcolaPerimetro());
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Rettangolo 1:");
        stampaRettangolo(r1);

        System.out.println("\nRettangolo 2:");
        stampaRettangolo(r2);

        double sommaAre = r1.calcolaArea() + r2.calcolaArea();
        double sommaPerimeter = r1.calcolaPerimetro() + r2.calcolaPerimetro();

        System.out.println("\nSomma aree: " + sommaAre);
        System.out.println("Somma perimetri: " + sommaPerimeter);
    }

    public static void main(String[] args) {

        Rettangolo r1 = new Rettangolo(5, 3);
        Rettangolo r2 = new Rettangolo(4, 6);

        stampaRettangolo(r1);
        System.out.println();
        stampaDueRettangoli(r1, r2);
    }
}
