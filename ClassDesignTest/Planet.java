public class Planet
    {
        private String name, relat;
        private double radi, smapop, smpsd;
        private int pp, sm, sd;
        private double namenum;
        
        String relate[] = {"hostile", "friendly", "ally"}; 
        //String relate[] = {"Delta", "Gamma", "Alpha"};
        String relation;  
        
        public Planet()
            {
                namenum = Math.random();
                name = "Beta ";
                //relat = "friendly";
                
                for ( int index = 0; index < relate.length; index++ )
                    {
                        relation = relate[index];
                    }
                
                radi = 1.00;
                pp =1;
                sm = 1;
                sd = 1;
                smapop = sm / pp;
                smpsd = sm / sd;
            }
            
        public Planet( int pp, int sm, int sd )
            {
                namenum = Math.random();
                name = "Beta ";
                relat = "friendly";
                radi = Math.random();
                this.pp = pp;
                this.sm = sm;
                this.sd = sd;
                smapop = sm / pp;
                smpsd = sm / sd;
            }
            
        public String toString()
            {
                String output = String.format("Name: %s %.2f \n" + 
                                              "Relationship: %s\n" +
                                              "Radius: %.2f\n" +
                                              "Population: %d\n" +
                                              "Space Marines as percent of Pop.: %.2f\n" +
                                              "Space Marines: %d\n" +
                                              "Star Destroyers: %d\n" +
                                              "Space Marines per star destroyer: %.2f", name, namenum, relation, radi, pp, smapop, sm, sd, smpsd );
                return output;
            }
    }//end class Planet