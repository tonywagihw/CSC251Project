public class PolicyHolder
{
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    public PolicyHolder(String fName, String lName, int age,
                        String smoking, double height, double weight)
    {
        this.firstName = fName;
        this.lastName = lName;
        this.age = age;
        this.smokingStatus = smoking;
        this.height = height;
        this.weight = weight;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getSmokingStatus() { return smokingStatus; }
    public double getHeight() { return height; }
    public double getWeight() { return weight; }

    public double calculateBMI()
    {
        return (weight * 703) / (height * height);
    }
}