public enum Plane {
    BOING747(50, 1000 ),
    AIRCRAFT(30, 500),
    JET(20, 250);

    private final int capacity;
    private final int totalWeight;

    Plane(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
