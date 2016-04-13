public class Money {
    private long dollars;
    private long cents;

    // Constructors

    /**
     * Empty constructor that sets dollars and cents to zero.
     */
     
     public Money()
     {
         setDollars(0);
         setCents(0);
     }

    /**
     * Constructor with parameter for dollars, cents
     */
    public Money (long dollar, long cent)
    {
        if (dollar >= 0 && cent >= 0)
        {
            setDollars(dollars);
            setCents(cents);
        }
        else
        {
            System.out.println("Not valid amount, please enter non-negative values");
        }
    }
    
    
    // Getters & Setters

    /**
     * Getters for private variables
     */
     
     public long getDollars()
     {
         return dollars;
     }
     
     public long getCents()
     {
         return cents;
     }

     public void setDollars(long amount)
     {
         dollars = amount;
     }
     
     public  void setCents(long amount)
     {
         cents = amount;
     }
    // Public Methods

    /**
     * toString() method returns a formatted string for printing
     */
    public String toString()
    {
       return("You have " + getDollars() + " dollars and " + getCents() + " cents");
    }
    
    /**
     * add(Money value) binary operator
     * returns sum of object plus value
     */
    public Money add(long cent, long dollar)
    {
        this.cents = this.cents + cent;
        this.dollars = this.dollars + dollar;
        
        while (this.cents > 99){
        this.cents = this.cents - 100;
        this.dollars = this.dollars + 1;
        }
        
        return this;
    }
    
    public Money subtract(long cent, long dollar)
    {
        while (cent >= 100)
        {
            cent = cent - 100;
            dollar = dollar + 1;
        }
        
        if (this.dollars - dollar < 0)
        {
            System.out.println("Error, not enough funds");
        }
        if (this.cents < 0)
        {
          System.out.println("Error, not enough funds");
        }
        
        this.cents = this.cents - cent;
        
        
        if (this.dollars >= dollar)
        {
        this.dollars = this.dollars - dollar;
        }
        else
        System.out.println("Error,not enough funds");
    
    return this;
}

}
