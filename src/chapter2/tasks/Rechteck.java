package chapter2.tasks;

import java.util.Objects;

public class Rechteck {
    private final Double a;
    private final Double b;

    public Rechteck(final double a, final double b) {
        this.a = a;
        this.b = b;
    }

    public double getA( ) {
        return a;
    }

    public double getB( ) {
        return b;
    }

    public Double umfang( ) {
        return 2 * (a + b);
    }

    public Double flaeche( ) {
        return a * b;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass( ) != o.getClass( ) ) return false;
        Rechteck rechteck = (Rechteck) o;
        return Objects.equals(a, rechteck.a) && Objects.equals(b, rechteck.b);
    }

    @Override
    public int hashCode( ) {
        return Objects.hash(a, b);
    }

    @Override
    public String toString( ) {
        return "Rechteck{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
