package academy.everyonecodes.java.week8.livecoding.set2.exercise3;

public class Calculation {
    private double number1;
    private double number2;
    private String symbol;

    public Calculation(double number1, double number2, String symbol) {
        this.number1 = number1;
        this.number2 = number2;
        this.symbol = symbol;
    }

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Calculation that = (Calculation) o;

        if (Double.compare(that.number1, number1) != 0) return false;
        if (Double.compare(that.number2, number2) != 0) return false;
        return symbol != null ? symbol.equals(that.symbol) : that.symbol == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(number1);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(number2);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (symbol != null ? symbol.hashCode() : 0);
        return result;
    }
}
