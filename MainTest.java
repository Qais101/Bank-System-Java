import java.util.*;
public class MainTest {
public static void main(String []args)
{
    Scanner in=new Scanner(System.in);


    
    System.out.println("Enter holder name : ");
    String name=in.nextLine();
    
    System.out.println("Enter account number : ");
    String number=in.nextLine();
    
    System.out.println("Enter initial balance : ");
    double balance=in.nextDouble();
  
    BankAccount account=new BankAccount(number,balance,name);
    
    
//      Random rand=new Random();
//   String cPIN=String.format("%04d",rand.nextInt(10000));
//    System.out.println("Generated PIN for your account : "+cPIN);
    String cPIN;
    while(true)
    {
        System.out.println("Set a 4-digit PIN for your account : ");
        cPIN=in.next();
        if(cPIN.matches("\\d{4}")){
        break;
        }
        else{
            System.out.println("Invalid PIN. Please enter exactly 4 digits.");
        }
                
    }
    int ePIN;
    int attempts=3;
    boolean accessGranted = false;
    while(attempts>0)
    {
        System.out.println("Enter 4-Digits PIN : ");
          ePIN=in.nextInt();
        if(ePIN==Integer.parseInt(cPIN))
        {
            System.out.println("Access granted, Welcome "+account.getHolderName()+"!");
         accessGranted = true;
         break;
        }
        else
        {
        attempts--;
            System.out.println("Incorrect PIN, Attempts left : "+attempts);
         
        }
  
    } 
    if(!accessGranted){
         System.out.println("Access denied. You have used all attempts.");
    }
    
    else{
    int choice;

    do{
        System.out.println("\n---menu---");
        System.out.println("1.Deposit");
        System.out.println("2.Withdraw");
        System.out.println("3.Show Balance");
        System.out.println("4.Show Account Info");
        System.out.println("5.Exit");
        System.out.println("Enter Your Choice :");
        
        
        
        choice =in.nextInt();
        
     
        switch(choice)
        {
            case 1:
                System.out.println("Enter amount to deposit : ");
                double depositAmount=in.nextDouble();
                account.deposit(depositAmount);
//                System.out.println(depositAmount+" has been credited to "+account.getNumber()+".");
//                System.out.println("Deposit Successful, Balance : "+account.getBalance());
           break;
           
            case 2:
                System.out.println("Enter amount to withdraw : ");
                double withdrawAmount=in.nextDouble();
                account.withdraw(withdrawAmount);
//                System.out.println(withdrawAmount+" has been debited from "+account.getNumber()+".");
//                System.out.println("Withdrawal successful, Balance : "+account.getBalance());
           break;
           
            case 3:
                System.out.println("Current balance : "+account.getBalance());
              break;
              
            case 4:
                account.displayAccountInfo();
                break;
                
            case 5:
                System.out.println("Exiting , Thank you!");
                break;
                
            default:
                System.out.println("Invalid choice. Try again.");
        }
    
    
    }
        while(choice!=5);
    }
    in.close();
}          
}  