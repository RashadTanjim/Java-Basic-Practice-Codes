package Lab11;
public class Flower extends Plant {

    private boolean hasSmell;
    private boolean hasThorn;

    public Flower() {

    }

    public Flower(String name, String color, boolean hasSmell, boolean hasThorn) {
        super(name, color);
        this.hasSmell = hasSmell;
        this.hasThorn = hasThorn;

    }

    public boolean getHasSmell() {
        return hasSmell;
    }

    public boolean getHasThorn() {
        return hasThorn;
    }

    public void setHasSmell(boolean hasSmell) {
        this.hasSmell = hasSmell;
    }

    public void setHasThorn(boolean hasThorn) {
        this.hasThorn = hasThorn;
    }

    public String toString() {
        return super.toString() + "\nSmell: " + hasSmell + "\nThorn: " + hasThorn;
    }

    
}
