package spring20;

/**
 * Question: 5
 * @Name: Md Rashad Tanjim
 * ID: 1620952042
 */
public class Question5 {

    public static void main(String[] args) {

      
        for(int i = 1; i<= 5; i++)
        {
            for(int j = 1; j<= ((i*2)-1); j++)
            {
                if(i%2 == 0)
                    System.out.print("+");
                else
                    System.out.print("*");
                
                
            }
            System.out.println("");
        
        }

    }

}

