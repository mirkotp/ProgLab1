package Es7;

public class Frazione {
    private int numeratore;
    private int denominatore;

    public Frazione() {
        numeratore = 1;
        denominatore = 1;
    }

    public Frazione(int num, int den) {
        numeratore = num;
        denominatore = den;
    }

    public void add(Frazione f) {
        int tempNum = (f.getNumeratore() * denominatore) + (numeratore * f.getDenominatore());
        int tempDen = f.getDenominatore() * denominatore;

        int mcd = calcolaMcd(tempNum, tempDen);

        numeratore = tempNum / mcd;
        denominatore = tempDen / mcd;
    }

    public int getNumeratore() {
        return numeratore;
    }

    public int getDenominatore() {
        return denominatore;
    }

    public double getResultAsDouble() {
        return (double)numeratore / (double)denominatore;
    }

    private int calcolaMcd(int a, int b) {
        int smaller = Math.min(a, b);
        int bigger = Math.max(a, b);

        int mcd = 1;

        for(int i = 2; i <= smaller; i++) {
            if(smaller % i == 0 && bigger % i == 0) {
                mcd = i;
            }
        }

        return mcd;
    }
}