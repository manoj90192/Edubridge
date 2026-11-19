class Student {
    String USN;
    String Name;
    String Branch;
    String Phone;

    void getDetails(Scanner sc) {
        System.out.print("Enter USN: ");
        USN = sc.nextLine();

        System.out.print("Enter Name: ");
        Name = sc.nextLine();

        System.out.print("Enter Branch: ");
        Branch = sc.nextLine();

        System.out.print("Enter Phone: ");
        Phone = sc.nextLine();
    }
    void displayDetails() {
        System.out.printf("%-15s %-20s %-15s %-15s%n",
                USN, Name, Branch, Phone);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] s = new Student[n];

        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));
            s[i] = new Student();
            s[i].getDetails(sc);
        }
        System.out.println("\n--------- STUDENT DETAILS ---------");
        System.out.printf("%-15s %-20s %-15s %-15s%n",
                "USN", "NAME", "BRANCH", "PHONE");

        for (int i = 0; i < n; i++) {
            s[i].displayDetails();
        }

        sc.close();
    }
}
