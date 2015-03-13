package Week7.Singleton;

public class Singleton {

	private Singleton instance;
	public String name;
        public int instanceCounter;

	private Singleton() {
		instanceCounter++;
                // TODO - implement Singleton.Singleton
		
	}

	public Singleton getInstance() 
        {
		return this.instance;
	}
        
        
       
}
