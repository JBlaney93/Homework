public enum PlaneType {
    BLANEY747(10, 400);

    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight){
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getType(){
        return "BLANEY747";
    }
}
