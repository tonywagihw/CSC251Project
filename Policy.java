public class Policy
{
    private int policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    // No-arg constructor
    
    public Policy()
    {
        policyNumber = 0;
        providerName = "";
        firstName = "";
        lastName = "";
        age = 0;
        smokingStatus = "";
        height = 0.0;
        weight = 0.0;
    }

    // Constructor WITHOUT using this
    
    /**
      * Constructor that initializes all policy fields.
      * @param pNumber policy number
      * @param pProvider provider name
      * @param pFirst first name
      * @param pLast last name
      * @param pAge age
      * @param pSmoking smoking status
      * @param pHeight height in inches
      * @param pWeight weight in pounds
    */
    public Policy(int pNumber, String pProvider, String pFirst,
                  String pLast, int pAge, String pSmoking,
                  double pHeight, double pWeight)
    {
        policyNumber = pNumber;
        providerName = pProvider;
        firstName = pFirst;
        lastName = pLast;
        age = pAge;
        smokingStatus = pSmoking;
        height = pHeight;
        weight = pWeight;
    }

    // Getters
    
    /**
      * Gets the policy number.
      * @return the policy number
    */
    public int getPolicyNumber() { return policyNumber; }
    
    /**
      * Gets the provider name.
      * @return the provider name
    */
    public String getProviderName() { return providerName; }
    
    /**
     * Gets the policyholder's first name.
     * @return the first name
   */
   public String getFirstName() { return firstName; }
    
   /**
      * Gets the policyholder's last name.
      * @return the last name
   */
    public String getLastName() { return lastName; }
    
    /**
      * Gets the policyholder's age.
      * @return the age
   */
    public int getAge() { return age; }
    
    /**
      * Gets the policyholder's smoking status.
      * @return the smoking status
    */
    public String getSmokingStatus() { return smokingStatus; }
    
    /**
      * Gets the policyholder's height in inches.
      * @return the height
    */
    public double getHeight() { return height; }
    
    /**
      * Gets the policyholder's weight in pounds.
      * @return the weight
    */
    public double getWeight() { return weight; }

    // BMI calculation
    
    /**
      * Calculates the BMI of the policyholder.
      * @return BMI value
    */
    public double calculateBMI()
    {
        return (weight * 703) / (height * height);
    }

    // Price calculation
    
    /**
      * Calculates the insurance price.
      * @return total policy price
    */
    public double calculatePrice()
    {
        double price = 600.0;

        if (age > 50)
            price += 75.0;

        if (smokingStatus.equalsIgnoreCase("smoker"))
            price += 100.0;

        double bmi = calculateBMI();

        if (bmi > 35)
            price += (bmi - 35) * 20;

        return price;
    }
}