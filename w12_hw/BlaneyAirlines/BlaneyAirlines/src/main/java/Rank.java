public enum Rank {
    CAPTAIN("Captain"),
    FIRST_OFFICER("First Officer"),
    FLIGHT_ATTENDANT("Flight Attendant");

    private final String rank;

    private Rank(String rank){
        this.rank = rank;
    }

    public String getRank() {
        return this.rank;
    }
}
