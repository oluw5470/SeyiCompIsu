import AppPackage.AnimationClass;
abstract public class GameButtonParent {
    protected int healthval;//value of my current health     
    protected int moralval;//valuse of my current moral
    protected int smartsval;//value of my current smarts
    
    public GameButtonParent(int h, int m, int s)
    {
         healthval=h;//seting all values to center whitcb is 50 from 0-100
         moralval=m;
         smartsval=s;
    }
    
    public void sethval(int h)
    {
        healthval=h;//changing a health val according to the button pressed
          
    }
    
    public void setmval(int m)
    {
        moralval=m;//changing a health val according to the button pressed
          
    }
    
    public void setsval(int s)
    {
        smartsval=s;//changing a health val according to the button pressed
           
    }
    
    public int gethval()
    {
        return healthval;//returns the health value
    }
    
    public int getmval(){
        return moralval;//returns the moral value
    }
        
    public int getsmartval(){
        return smartsval;// returns the smarts value
    }
}
