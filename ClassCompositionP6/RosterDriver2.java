public class RosterDriver2
    {
    public static void main ( String[] args)
        {
        Roster apComputerScience = new Roster();
        
        Students s1 = new Students("Nathan", "LeSeure", 4.0);
        Students s2 = new Students("Cil", "Sam", 3.0);
        Students s3 = new Students("Peanut", "Butter", 2.7);
        
        apComputerScience.addStudent(s1);
        apComputerScience.addStudent(s2);
        apComputerScience.addStudent(s3);
        
        System.out.println(apComputerScience);
        
        apComputerScience.dropStudent("Butter");
        
        System.out.println(apComputerScience);
        }//end method Main
    }//end class