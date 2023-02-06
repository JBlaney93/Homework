public class WaterBottle {

    private int vol;

    public WaterBottle() {
        this.vol = 100;
    }

    public int getVol() {
        return this.vol;
    }

    public int drink() {
        int remainingVol = (vol - 10);
        return remainingVol;
    }

    public int empty() {
        return this.vol = 0;
    }

    public int fill() {
        return this.vol = 100;
    }

}
