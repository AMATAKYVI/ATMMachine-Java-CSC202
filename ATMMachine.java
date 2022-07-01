import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {
        Account[] acc = new Account[10];
        try (Scanner keyboard = new Scanner(System.in)) {
            boolean exitAcc = true;
            // boolean ATMMainMenu = true;

            for (int i = 0; i < 10; i++) {
                acc[i] = new Account(i, 100);
            }
            do {
                System.out.println("Welcome Back !");
                int logInID = keyboard.nextInt();
                if (logInID > 10) {
                    return;
                }
                exitAcc = true;
                for (int i = 0; i < acc.length; i++) {
                    if (acc[i].get_id() == logInID) {
                        while (exitAcc) {
                            System.out.println("Input Correct");
                            System.out.println("You are now log in");
                            System.out.println(
                                    "Press 1 for view current balance || Press 2 for withdrawing money || Press 3 for depositing money || Press 4 for exiting the main menu");
                            int viewAccountInformation = keyboard.nextInt();
                            if (viewAccountInformation == 1) {
                                System.out.println("Current Balance In Account");
                                System.out.println("Total : " + acc[logInID].get_balance());
                                System.out.println("-------------------------");
                                System.out.println("What can I do for you next?");
                            } else if (viewAccountInformation == 2) {
                                System.out.println("-------------------------");
                                System.out.println("Enter Withdrawing Amount");
                                int withdrawingAmount = keyboard.nextInt();
                                if (withdrawingAmount > acc[logInID].get_balance()) {
                                    System.out.println("Not having enough amount to withdraw");
                                    System.out.println("-------------------------");
                                    System.out.println("What can I do for you next?");
                                } else {
                                    acc[logInID].withdraw(withdrawingAmount);
                                    System.out.println(
                                            "Withdraw the total amount of : " + withdrawingAmount);
                                    System.out.println("-------------------------");
                                    System.out.println("What can I do for you next?");
                                }
                            } else if (viewAccountInformation == 3) {
                                System.out.println("Enter Depositing Amount");
                                int depositingAmount = keyboard.nextInt();
                                acc[logInID].deposit(depositingAmount);
                                System.out.println("Depositing Amount : " + depositingAmount);
                                System.out.println("-------------------------");
                                System.out.println("What can I do for you next?");
                            } else if (viewAccountInformation == 4) {
                                System.out.println("See you next time!");
                                System.out.println("-------------------------");
                                exitAcc = false;
                            } else {
                                System.out.println("Wrong Input");
                                return;
                            }
                        }
                    }
                }
            } while (true);
        }


    }
}
