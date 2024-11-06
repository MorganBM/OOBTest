package ie.atu.week7test;

import java.util.ArrayList;
import java.util.Scanner;
public class CustomerManagementAPP {
    public static void main(String[] args) {
        try (Scanner myscan = new Scanner(System.in)) {
            //prompt for details
            String[] details1 = getDetails();
            Customer firstCustomer = new Customer(details1[0], details1[1], details1[2], details1[3]);
            ArrayList<String> customerDetails = new ArrayList<>();

            // customerlist.add("")
            System.out.println("" + details1);
        } catch(CannotResolveConstructor crc){
            System.out.println("Error");
        }
    }
    public static String[]getDetails(){
        //prompt for details
        String[]details= new String[4];
        Scanner sc = new Scanner(System.in);
        //MAYBE DONT HAVE THEM ENTER CUSTOMER ID
        System.out.println("Enter your customer ID");
        details[0]= sc.nextLine();
        System.out.println("Enter name");
        details[1]=sc.nextLine();
        System.out.println("Enter email");
        details[2]=sc.nextLine();
        System.out.println("Enter phone number");
        details[3]=sc.nextLine();
        return details;
    }
}
