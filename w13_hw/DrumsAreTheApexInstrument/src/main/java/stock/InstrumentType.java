package stock;

public enum InstrumentType {

    STRING("String"),
    PERCUSSION("Percussion");

    private final String type;

    InstrumentType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
