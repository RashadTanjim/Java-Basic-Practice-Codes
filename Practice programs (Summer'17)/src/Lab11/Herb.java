package Lab11;
public class Herb extends Plant {
    
    private boolean isMedicinal;
    private String season;

    public Herb() {

    }

    public Herb(String name, String color, boolean isMedicinal, String season) {
        super(name, color);
        this.isMedicinal = isMedicinal;
        this.season = season;

    }

    public boolean getIsMedicinal() {
        return isMedicinal;
    }

    public String getSeason() {
        return season;
    }

    public void setHasSmall(boolean isMedicinal) {
        this.isMedicinal = isMedicinal;
    }

    public void setHasThorn(String season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMedicinal: " + getIsMedicinal() + "\nSeason: " + getSeason();
    }

}

