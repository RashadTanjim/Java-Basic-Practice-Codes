//8.b
public class Tool {
    private int length;
    
    public Tool(int length){
        this.length = length;
    }
    
    public void display()
    {
        System.out.println(" ");
    }
   
    @Override
    public String toString()
    {
        return length + "inch";
    }
    
}
