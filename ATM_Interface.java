import java.util.Scanner;
public class ATM_Interface {
    /**
     * @param args
     */
    public static void main(String[] args){
      try (Scanner scan = new Scanner(System.in)) {
        double balance=10000;
        int pin=1234;
        int attempt=3;
        System.out.println("Insert your card");
          System.out.println("Card is successfully scanned.");
        while(attempt>0){
          
          System.out.println("Enter the PIN");
          int enter_pin=scan.nextInt();
          if(enter_pin==pin){
              System.out.println("Authorised User!!!!!\n");
              break;
          }
          else{
              attempt--;
              System.out.println("Incorrect PIN ..... \n"+attempt+" attemps remain");

          }
        }
        if(attempt==0){
          System.out.println("ERROR!!! Attempts are over...");
          return;
        }
        while(true)
        {
          System.out.println("Choose the operation");
          System.out.println("1.Balance Inquiry");
          System.out.println("2.Cash Withdraw");
          System.out.println("3.Deposit");
          System.out.println("4.Mini Statement");
          System.out.println("5.Transfer");
          System.out.println("6.Exit");

          int choice = scan.nextInt();

          switch(choice)
          {
            case 1:
                  System.out.println("Your Balance is : "+balance+"Rs.\n");
                  
                  break;

            case 2:
                  System.out.println("Enter the amount");
                  double amount=scan.nextDouble();
                  System.out.print("\n");
                  if(amount>balance)
                  {
                    System.out.println("Insufficient Balance");
                  }
                  else
                  {
                    balance -= amount;
                    System.out.println("Withdrawal Successfully");
                    System.out.println("Collect your cash");
                    System.out.println("Remaining Balance is "+balance+"Rs.\n");
                    
                  }
                  break;

            case 3:
                 System.out.println("Enter the amount to deposit");
                 double deposit=scan.nextDouble();
                 System.out.print("\n");
                 balance +=deposit;
                 System.out.println("Deposit Successful");
                 System.out.println("Total Balance is "+balance+"Rs.\n");
                  break;

            case 4:
                 System.out.println("Collect your mini statement please\n");
                 break;
               
            case 5:
                  System.out.println("Enter the transfer details...");
                 System.out.println("Enter the Bank Account Number");
                 long acc=scan.nextLong();
                 
                 System.out.println("Enter the amount to transfer");
                 double transfer=scan.nextInt();
                 System.out.print("\n");

                 System.out.println("Transfer is successful to Account "+acc);
                 balance -= transfer;
                  System.out.println("Remaining Balance is "+balance+"Rs.\n");
                  break;

            case 6:
            System.out.println("THANK YOU!!!");
            return;

            default:
            System.out.println("Invalid opttion. Please Try Again!! \n");
               
                 
          }
        
      }
      }
    }
  }

