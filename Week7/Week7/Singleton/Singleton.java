package Week7.Singleton;

public class Singleton {

	private Singleton instance = null;
	public String name;
        public int instanceCounter;

	private Singleton()
        {
		
           instanceCounter++;
        
        }

	public Singleton getInstance() 
        {
            if (instance = null)
            {
                   return this.instance; 
	    }
       }
        
}
