public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType){
        this.planeType = planeType;
    }

    public int getCapacity(){
        return planeType.getCapacity();
    }


    public int getWeight() {
        return planeType.getWeight();
    }


}
