import chapter2.tasks.Rechteck;

public class Main {
    public static void main(String[] args) {
        Rechteck rechteck = new Rechteck(1,2);
        System.out.println(rechteck.umfang() );
        System.out.println(rechteck.flaeche() );
    }
}