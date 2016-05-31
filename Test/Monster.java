
public abstract class Monster
{
    private String name = "";
    
    public Monster(String name)
        {
            this.name = name;
        }
        
    public abstract String Talk();
    
    public String toString()
        {
            String output = new String("");
            output = name + " says..." + Talk();
            return output;
        }

}
