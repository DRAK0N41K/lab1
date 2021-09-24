package lab1.task8;
public class CustomDouble {
    private int IntegerPart;
    private double fraction;

    public int getIntegerPart() {
        return IntegerPart;
    }

    public double getfraction() {
        return fraction;
    }

    public void setIntegerPart(int IntegerPart) {
        this.IntegerPart = IntegerPart;
    }


    public void setFraction(final double fraction) {
        this.fraction = fraction;
    }

    public CustomDouble(double res) {
        this.IntegerPart = (int) res;
        this.fraction = res - IntegerPart;
    }

    public CustomDouble(final int IntegerPart, final double fraction) {
        setIntegerPart(IntegerPart);
        setFraction(fraction);
    }


    public CustomDouble sum(CustomDouble d) {
        double res = this.toDouble() + d.toDouble();

        return new CustomDouble(res);
    }

    public CustomDouble dif(CustomDouble d) {
        double res = this.toDouble() - d.toDouble();

        return new CustomDouble(res);
    }


    public CustomDouble div(CustomDouble d) {
        double res = this.toDouble() / d.toDouble();

        return new CustomDouble(res);
    }

    public CustomDouble mul(CustomDouble d) {
        double res = this.toDouble() * d.toDouble();

        return new CustomDouble(res);
    }

    public void comparison(CustomDouble d) {
        double res;
        res = this.toDouble() - d.toDouble();

        if (res > 0) {
            System.out.println("First is bigger than second");
        } else if (res < 0) {
            System.out.println("Second is bigger than first");
        } else {
            System.out.println("Numbers are equal");
        }
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        final CustomDouble c = (CustomDouble) obj;
        return this.IntegerPart == c.IntegerPart && this.fraction == c.fraction;
    }

    @Override
    public int hashCode() {
        return 31 * this.getIntegerPart() +
                31 * Double.hashCode(this.fraction);
    }

    public double toDouble() {
        return (double) this.IntegerPart + this.fraction;

    }


    @Override
    public String toString() {
        return this.toDouble() + " ";
    }


}
