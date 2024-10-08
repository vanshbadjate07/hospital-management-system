import java.util.*;
class hospital {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int count = 0;
        String[] name = new String[100];
        String[] address = new String[100];
        String[] id = new String[100];

        System.out.println("\nWelcome to Vansh Hospital");
        while (true) {
            System.out.println("1. Add Details of Patient");
            System.out.println("2. Search Patient");
            System.out.println("3. View All Patients");
            System.out.println("4. Exit");

            int choice = s.nextInt();
            s.nextLine();  

            switch (choice) {
                case 1:
                    // Adding patient details
                    System.out.println("\nEnter Name of Patient:");
                    name[count] = s.nextLine();  

                    System.out.println("Enter Address of Patient:");
                    address[count] = s.nextLine();  

                    System.out.println("Enter Patient Id:");
                    id[count] = s.nextLine();  

                    System.out.println("Patient Admitted Successfully!!");
                    count++;
                    break;

                case 2:
                    // Searching for a patient
                    if (count >= 1) {
                        System.out.println("\nEnter Patient Id:");
                        int search = s.nextInt() - 1;  

                        if (search >= 0 && search < count) {
                            System.out.println("Name: " + name[search]);
                            System.out.println("Address: " + address[search]);
                            System.out.println("Id: " + id[search]);
                        } else {
                            System.out.println("Patient Not Found!!");
                        }
                    } else {
                        System.out.println("No Patients Available.");
                    }
                    break;

                case 3:
                    System.out.println("\nList of All Patients:");
                    for (int i = 0; i < count; i++) {
                        System.out.println("Patient " + (i + 1) + ":");
                        System.out.println("Name: " + name[i]);
                        System.out.println("Address: " + address[i]);
                        System.out.println("Id: " + id[i]);
                        System.out.println("_______________________________");
                    }
                    break;

                case 4:
                    System.out.println("\nBye Bye...");
                    return;

                default:
                    System.out.println("\nEnter Valid Option!!");
                    break;
            }
        }
    }
}
