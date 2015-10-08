public class Student
    {
        private String fname;
        private String lname;
        private int stuid;
        private double gpa;
        
        public Student()
            {
                fname = new String ("Bob");
                lname = new String ("James");
                stuid = 4354;
                gpa = 3.467;
            }
            
        public String toString() 
            {
                String output = new String();
                output = "First name: " + fname + "\n" +
                         "Last name: " + lname + "\n" +
                         "Student ID: " + stuid + "\n" +
                         "GPA: " + gpa;
                return output;    
            }
    }// end class