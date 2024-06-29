
    import java.util.Scanner;

public class atminterface {
    public static void main(String[] args) {
        int balance = 100000;
        int withdraw;
        int deposit;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("*****************WELCOME TO ATM MACHINE****************");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose One of the following OPTION FOR THE operation you want to perform: ");

            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Enter money to be withdrawn: ");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        balance -= withdraw;
                        System.out.println("Please collect your withdrawl amount.");
                    } else {
                        System.out.println("Insufficient Balance.");
                    }
                    break;
                case 2:
                    System.out.print("Enter money to be deposited: ");
                    deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("Your money has been successfully deposited.");
                    break;
                case 3:
                    System.out.println(" your Balance is: " + balance);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}

    

