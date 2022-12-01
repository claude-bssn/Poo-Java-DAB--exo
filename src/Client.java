package src;

import src.service.ClientInterface;

/**
 * Client 
 */
public class Client implements ClientInterface{
  private String m_name;
  private String transactionType;
  private Account myAccount;  

  /**
   * Initialize the account. Could use a client Id to get the right account
   */
  public Client() {
    this.myAccount = new Account();
  }

  /**
   * @return the client name
   */
  public String getName() {
    return m_name;
  }

  /**
   * @param p_name set the client name.  The method is not accessible using an ATM.
   */
  public void setName(String p_name) {
    this.m_name = p_name;
  }


  /* (non-Javadoc)
   * @see src.service.ClientInterface#withdraw(java.lang.Double)
   */
  @Override
  public String withdraw(Double value) throws Exception {
    if( myAccount.getAmount() < value) {
       throw new Exception("Vous n'avez pas assez de fond sur le compte");
    }
    myAccount.withDrawMoney(value);
    StringBuilder result = new StringBuilder();
      result.append(value);
      result.append(" has been withdraw from to your account.");
    return result.toString(); 
  }

  /* (non-Javadoc)
   * @see src.service.ClientInterface#getAmountAccount()
   */
  @Override
  public Double getAmountAccount() {
    return this.myAccount.getAmount();
  }

  /* (non-Javadoc)
   * @see src.service.ClientInterface#makeDeposit(java.lang.Object, java.lang.Double)
   */
  @Override
  public String makeDeposit(Object type, Double value ) throws Exception {
    // check transaction type in a condition to allow only certain type 
    // will trow an error if the type is not allowed 
    if (type instanceof Cash) {
     this.myAccount.addAmount(value);
      this.transactionType = " Cash";
     
    }
    if (type instanceof Check) {
      this.myAccount.addAmount(value);
      this.transactionType = " Check";
    }
    else {
      throw new Exception("Vous ne pouvez pas déposer ce type d'argent.");
    }
    // return the string value
    StringBuilder result = new StringBuilder();
      result.append(this.transactionType);
      result.append(" : ");
      result.append(value);
      result.append(" has been added to your account.");
    return result.toString(); 
  }

}
