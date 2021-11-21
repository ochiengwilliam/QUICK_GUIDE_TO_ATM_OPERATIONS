import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        int balance = 10000,withdraw = 0 ,deposit;
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Automated Teller Machine");
            System.out.println("choose 1 for withdraw");
            System.out.println("choose 2 for deposit");
            System.out.println("choose 3 for check balance");
            System.out.println("choose 4 for exit");
            System.out.println("choose the operation that you want: ");

            int n = sc.nextInt();

            switch (n){
                case 1:

                    System.out.print("Enter the amount to withdraw: ");
                    Scanner scanner = new Scanner(System.in);
                    int amount = sc.nextInt();
                    if (balance >= withdraw){

                        balance = balance- withdraw;
                        System.out.println("Please collect your cash ");

                }
                    else {
                        System.out.println("insufficient funds ");

                    }
                    System.out.println("");
                    break;

                case 2:

                    System.out.print("Enter money to be deposited: ");
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("your amount is successfully deposited!");
                    System.out.println("");
                    break;

                case 3:

                    System.out.println("Balance " + balance);
                    System.out.println("");
                    break;

                case 4:

                    System.exit(0);


            }
        }
    }
}
