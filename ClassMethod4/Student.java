public class Student
    {
        private String fname;
        private String lname;
        private double gpa;
        private double english;
        private double math;
        private double science;
        private double finearts;
        private double socialscience;
        private double[] grades = new double[5];
        
        public Student()
            {
                fname = new String ("Bob");
                lname = new String ("James");
                for (int i = 0; i<grades.length; i++)
                    {
                        grades[i] = 0.0;
                    }
            }
        
        public Student( String fname, String lname, double english, double math, double science, double finearts, double socialscience )
            {
                this.fname = fname;
                this.lname = lname;
                grades[0] = english;
                grades[1] = math;
                grades[2] = science;
                grades[3] = finearts;
                grades[4] = socialscience;
            }
            
        public void setGPA( double english, double math, double science, double finearts, double socialscience )
            {
                grades[0] = english;
                grades[1] = math;
                grades[2] = science;
                grades[3] = finearts;
                grades[4] = socialscience;
            }
        
        public double calcGPA()
            {
                gpa = 0;
                for (int i = 0; i < grades.length; i++)
                    {
                        gpa += grades[i];
                    }
                gpa /= grades.length;
                return gpa;
            }
            
        public String toString() 
            {
                String output = new String();
                output = "First name: " + fname + "\n" +
                         "Last name: " + lname + "\n" +
                         "GPA: " + calcGPA();
                return output;    
            }
    }// end class