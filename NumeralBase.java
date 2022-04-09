public enum NumeralBase {
    BINARY(2),
    DECIMAL(10),
    HEX(16);

    private final int base;

    private NumeralBase(int base) {
        this.base = base;
    }

    public int getBase() {
        return base;
    }
}
