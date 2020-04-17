package Lab11;

public class Test {

    public static void main(String[] args) {
        Plant[] plants = new Plant[10];
        Plant f1 = new Flower("Rose", "red", true, true);
        Plant h1 = new Herb("blabla1", "blue", true, "winter");

        add(plants, f1);
        add(plants, h1);
        display(plants);

        System.out.println(search(plants, "Rose"));

        remove(plants, "Rose");
        System.out.println("\nAfter removing flowers: ");
        display(plants);
    }

    static void add(Plant[] plants, Plant p) {
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] == null) {
                plants[i] = p;
                break;
            }
        }
    }

    static void remove(Plant[] plants, String n) {
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] != null && n.equals(plants[i].getName())) {
                plants[i] = null;
                break;
            }
        }
    }

    static Plant search(Plant[] plants, String n) {
        for (int i = 0; i < plants.length; i++) {
            if (n.equals(plants[i].getName())) {
                return plants[i];
            }
        }
        return null;
    }

    static void display(Plant[] plants) {
        for (Plant plant : plants) {
            if (plant != null) {
                System.out.println(plant + "\n");
            }
        }
    }

}
