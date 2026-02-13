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
    public int getPolicyNumber() { return policyNumber; }
    public String getProviderName() { return providerName; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getSmokingStatus() { return smokingStatus; }
    public double getHeight() { return height; }
    public double getWeight() { return weight; }

    // BMI calculation
    public double calculateBMI()
    {
        return (weight * 703) / (height * height);
    }

    // Price calculation
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