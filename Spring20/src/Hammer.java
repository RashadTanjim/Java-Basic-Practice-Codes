//8.c
public class Hammer extends Tool{
    
    private double power;
    
    public Hammer(double power, int length)
    {
        super(length);
        this.power = power;
    }
    
    @Override
    public void display()
    {
        System.out.println("Hammer's power: " + power + " Length: " + toString());
    }
}
