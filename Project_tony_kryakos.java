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

            // ✅ NEW: create PolicyHolder
            PolicyHolder holder = new PolicyHolder(firstName, lastName, age,
                                                   smokingStatus, height, weight);

            // ✅ NEW: pass holder into Policy
            Policy policy = new Policy(policyNumber, providerName, holder);

            policies.add(policy);
        }

        int smokers = 0;
        int nonSmokers = 0;

        for (Policy policy : policies)
        {
            // ✅ NEW: calls toString automatically
            System.out.println(policy);

            // ✅ UPDATED: access through PolicyHolder
            if (policy.getPolicyHolder().getSmokingStatus().equalsIgnoreCase("smoker"))
                smokers++;
            else
                nonSmokers++;
        }

        // ✅ NEW: total policies count
        System.out.println("\nThere were " + Policy.getPolicyCount() + " Policy objects created.");

        System.out.println("The number of policies with a smoker is: " + smokers);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokers);

        input.close();
    }
}