package test;

// import src.Cash;
import src.Check;
import src.Client;
import src.service.ClientInterface;

public class Main {
  public static void main(String[] args) throws Exception {
    ClientInterface myClient = new Client();
    
    System.out.println("Current amount:");
    System.out.println( myClient.getAmountAccount());
    
    Check newCashDeposit = new Check(100.00);
    System.out.println(myClient.makeDeposit(newCashDeposit, newCashDeposit.getAmountDouble()));
    
    System.out.println("New amount:");
    System.out.println(myClient.getAmountAccount());
    
    
    System.out.println(myClient.withdraw(1200.00));
    
    System.out.println("New amount:");
    System.out.println(myClient.getAmountAccount());
  }
}
