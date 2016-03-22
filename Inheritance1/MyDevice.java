public class MyDevice
    {
        private int memory;
        private boolean condition;
        
        public MyDevice()
            {
                memory = 64;
                condition = true;
            }
            
        public MyDevice( int memory, boolean condition)
            {
                this.memory = memory;
                this.condition = condition;
            }
            
        public String toString()
            {
                String output = new String();
                output += "Memory for this Device is: " + memory + "\n" + 
                          "This Device is brand new: " + condition + "\n";
                return output;
            }
    }//end public class MyDevice