
import java.util.Objects;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arnob
 */
class helloworld {

    public static Logger getLOG() {
        return LOG;
    }
    private int max; 
    private String a;
    private boolean y;

    public helloworld(int max, String a, boolean y) {
        this.max = max;
        this.a = a;
        this.y = y;
    }
    private static final Logger LOG = Logger.getLogger(helloworld.class.getName());

    public int getMax() {
        return max;
    }

    public String getA() {
        return a;
    }

    public boolean isY() {
        return y;
    }


}
