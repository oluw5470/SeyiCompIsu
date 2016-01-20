
public class GameButtonSleep extends GameButtonParent{
    protected int healthval;//value of my current health     
    protected int moralval;//valuse of my current moral
    protected int smartsval;//value of my current smarts
    
    public GameButtonSleep(int h, int m, int s)
    {
        super(h,m,s );//inherite the value of from the super class
    }
    
    public void sethealth(){
        healthval+=10;
    }
    
    public int gethealth(){
        return healthval;
    }
}
