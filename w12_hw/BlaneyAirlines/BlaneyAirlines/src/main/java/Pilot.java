public class Pilot {

    private String name;
    private Rank rank;
    private String licenceNum;

    public Pilot(String name, Rank rank, String licenceNum){
        this.name = name;
        this.rank = rank;
        this.licenceNum = licenceNum;
    }

    public String getName() {
        return name;
    }

    public String getLicenceNum() {
        return licenceNum;
    }

    public String getRank() {
        return rank.getRank();
    }
}
