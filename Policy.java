public class Policy
{
    private int policyNumber;
    private String providerName;
    
    // static field to count objects
    private static int policyCount = 0;

    // No-arg constructor
    public Policy()
    {
        policyNumber = 0;
        providerName = "";
        policyHolder = null;
        policyCount++;
    }

    /**
     * Constructor that initializes policy fields.
     * @param pNumber policy number
     * @param pProvider provider name
     * @param holder the policyholder object
     */
    public Policy(int pNumber, String pProvider, PolicyHolder holder)
    {
        policyNumber = pNumber;
        providerName = pProvider;
        policyHolder = holder;
        policyCount++;
    }

    // Getters
    public int getPolicyNumber() { return policyNumber; }
    public String getProviderName() { return providerName; }
    public PolicyHolder getPolicyHolder() { return policyHolder; }

    /**
     * Calculates the insurance price.
     * @return total policy price
     */
    public double calculatePrice()
    {
        double price = 600.0;

        if (policyHolder.getAge() > 50)
            price += 75.0;

        if (policyHolder.getSmokingStatus().equalsIgnoreCase("smoker"))
            price += 100.0;

        double bmi = policyHolder.calculateBMI();

        if (bmi > 35)
            price += (bmi - 35) * 20;

        return price;
    }

    // static method
    public static int getPolicyCount()
    {
        return policyCount;
    }

    // toString method
    @Override
    public String toString()
    {
        return "Policy Number: " + policyNumber + "\n" +
               "Provider Name: " + providerName + "\n" +
               policyHolder.toString() +
               String.format("Policy Price: $%.2f\n", calculatePrice());
    }
}