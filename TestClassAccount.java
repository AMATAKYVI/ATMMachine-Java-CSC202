
public class TestClassAccount {

    public static void main(String[] args) {

        Account accOne = new Account(1122, 200000);
        accOne.set_annualInterestRate(4.5);
        accOne.withdraw(2500);
        accOne.deposit(3000);
        System.out.println("Here is your balance" + " " + accOne.get_balance());
        System.out.println("Here is your balance" + " " + accOne.getMonthlyInterestRate());
        System.out.println("Here is your balance" + " " + accOne.get_dateCreated());

    }
}
