public class Roster
    {
        private Students grades[]; 
        
        public Roster()
            {
                this.grades = new Students[3];
                grades[0] = new Students("Nathan", "Charles", 4.00);
                grades[1] = new Students("Kat", "Meow", 3.00);
                grades[2] = new Students("Shiny", "Shing", 2.70);
            }
            
        public Students findStudentWithMaxGPA()
            {
                int StudentIndex = 0;
                double HighestGPA = 0;
                
                for ( int i = 0; i < grades.length; i++)
                    {
                        if(grades[i].getGPA() > HighestGPA)
                            {
                                StudentIndex = i;
                                HighestGPA = grades[i].getGPA();
                            }
                    }
                
                return grades[StudentIndex];
            }
            
        public String toString()
            {
                String output = new String();
                output = "The Roster is:\n\n";
                for (int x = 0; x < grades.length; x++)
                    {
                        output += grades[x] + "\n\n";
                    }
                output += "Student with the highest GPA: \n\n" +findStudentWithMaxGPA();
                return output;
            }
    } //end class Roster