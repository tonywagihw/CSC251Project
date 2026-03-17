import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project_tony_kryakos
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("PolicyInformation.txt");
        Scanner input = new Scanner(file);
        ArrayList<Policy> policies = new ArrayList<>();
        
        while (input.hasNext())
        {
            int policyNumber = input.nextInt();
            input.nextLine();
   
            String providerName = input.nextLine();
            String firstName = input.nextLine();
            String lastName = input.nextLine();

            int age = input.nextInt();
            input.nextLine();

            String smokingStatus = input.nextLine();

            double height = input.nextDouble();
            double weight = input.nextDouble();

            if (input.hasNext()) input.nextLine();

            Policy policy = new Policy(policyNumber, providerName, firstName,
                                       lastName, age, smokingStatus,
                                       height, weight);

            policies.add(policy);
        }
        
        int smokers = 0;
        int nonSmokers = 0;
        
        for (Policy policy : policies)
        {
            System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
            System.out.println("Provider Name: " + policy.getProviderName());
            System.out.println("Policyholder's First Name: " + policy.getFirstName());
            System.out.println("Policyholder's Last Name: " + policy.getLastName());
            System.out.println("Policyholder's Age: " + policy.getAge());
            System.out.println("Policyholdr's Smoking Status(smoker\non-smoker: " + policy.getSmokingStatus());
            System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
            System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");

            System.out.printf("Policyholder's BMI: %.2f\n", policy.calculateBMI());
            System.out.printf("Policy Price: $%.2f\n", policy.calculatePrice());

            // count smokers
            if (policy.getSmokingStatus().equalsIgnoreCase("smoker"))
                   smokers++;
            else
                  nonSmokers++;
        }
        
        
        System.out.println("\nThe number of policies with a smoker is: " + smokers);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokers);
   }
}