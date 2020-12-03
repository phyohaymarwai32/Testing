import java.util.Scanner;

public class BankSimulator1 {
    public static void main(String[] args) {
        //Display variables
        int balance_amount = 300;
        char ch = 0;
        int withdraw, deposit;
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to do with the account?");
        System.out.println("Enter one of the following choices:");
        System.out.println("-Enter B to check your balance");
        System.out.println("-Enter W to make a withdrawal");
        System.out.println("-Enter D to make a deposit");
        System.out.println("-Enter Q to quit the program");
       

        while (ch!='Y'){
            System.out.println("Enter your choice: ");
            ch = input.next().charAt(0);

            switch (ch) {
                case 'B':
                    System.out.println("Your balance is " + balance_amount);
                    System.out.println();
                    break;
                case 'W':

                        //withdraw amount must be greater than or equal 30
                        do {
                            System.out.println("Enter the amount to withdraw: ");
                            withdraw = input.nextInt();

                            if(withdraw >= 30)
                                balance_amount = balance_amount - withdraw;
                            else
                                System.out.println("Transaction failed due to below withdraw amount $30.");

                        } while (withdraw < 30);

                        System.out.println("Your new balance is "+ balance_amount);
                        System.out.println();
                        break;


                case 'D':
                    //deposit amount must be greater than 0
                    do {
                        System.out.println("Enter the amount to deposit:");
                        deposit = input.nextInt();
                        if(deposit <= 0)
                            System.out.println("Please enter the amount greater than zero.");

                    } while (deposit <= 0);
                    balance_amount = balance_amount + deposit;
                    System.out.println("Your new balance is "+ balance_amount);
                    System.out.println();
                    break;

                case 'Q':
                    //Exit
                    System.out.println("Exit the program.");
                    System.out.println();
                    System.out.println("Do you want to exit the program Y/N?");
                    ch = input.next().charAt(0);
                    break;

                default:
                    System.out.println("Invalid option!!!");
                    break;
            }
            if(ch == 'Y')
                break;
            else {
                System.out.println("What would you like to do with the account?");
                System.out.println("Enter one of the following choices:");
                System.out.println("-B to check your balance");
                System.out.println("-W to make a withdrawal");
                System.out.println("-D to make a deposit");
                System.out.println("-Q to quit the program");

            }
        }
    }

}
