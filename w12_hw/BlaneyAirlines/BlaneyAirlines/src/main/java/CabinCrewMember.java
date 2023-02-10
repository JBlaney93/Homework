public class CabinCrewMember {

    private String name;
    private Rank rank;

    public CabinCrewMember(String name, Rank rank){
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank.getRank();
    }

    public String makeAnnouncement() {
        return "Welcome to Blaney Airlines!";
    }
}
