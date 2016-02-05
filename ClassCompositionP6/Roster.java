import java.util.ArrayList;
    
public class Roster
    {
        private ArrayList<Students> myStudents = new ArrayList<Students>();
            
        public String findStudentWithMaxGPA()
            {
                String stuname = "";
                double HighestGPA = 0;
                
                for ( Students x : myStudents )
                    {
                        if(x.getGPA() > HighestGPA)
                            {
                                HighestGPA = x.getGPA();
                                stuname = x.getFirstName();
                            }
                    }
                
                return stuname;
            }
            
        public void addStudent(Students newStudent)
            {
             myStudents.add(newStudent);
            }
            
        public void dropStudent(String lastname)
            {
             for (int i = 0; i < myStudents.size(); i ++)
                {
                 if(myStudents.get(i).getName() == lastname)
                    {
                        myStudents.remove(i);
                    }
                }
            }
            
        public String toString()
            { 
                String output = "The Roster is:\n\n";
                for (Students b: myStudents)
                    {
                    output += b + "\n\n";
                    }//end for each
                return output;
            }
    } //end class Roster