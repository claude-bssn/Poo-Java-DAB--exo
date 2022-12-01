package src.service;


public interface ClientInterface {
  /**
   * @return the amount on client account
   */
  public Double getAmountAccount();
  /**
   * @param type is used to assign to the right transaction identification
   * @param value the value of the transaction
   * @return the confirmation string containing the amount the type and the confirmation 
   * @throws Exception if the type is not allowed
   */
  public String makeDeposit(Object type, Double value ) throws Exception;
  /**
   * @param value the value of the transaction
   * @return the confirmation string with the amount and the confirmation
   * @throws Exception if the withdraw amount is greater than the amount on the account
   */
  public String withdraw(Double value) throws Exception;
}
