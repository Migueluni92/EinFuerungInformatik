package chapter2.tasks;

import java.util.Objects;

public class Linear {
    private final Double a;
    private final Double b;

    public Linear(final double a, final double b) {
        this.a = a;
        this.b = b;
    }

    public double getA( ) {
        return a;
    }

    public double getB( ) {
        return b;
    }

    public Double loesen( ) {
        return -b / a;
    }

    public void comment( ) {
        String comment = a.equals(b) ? "a und b sind gleich" : "a und b sind nicht gleich";
        System.out.println(comment);
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass( ) != o.getClass( ) ) return false;
        Linear linear = (Linear) o;
        return a.equals(linear.a) && b.equals(linear.b);
    }

    @Override
    public int hashCode( ) {
        return Objects.hash(a, b);
    }


}
