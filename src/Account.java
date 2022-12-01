package src;


public class Account {
  private Double m_amount = 1000.0;

  public Account() {};

  /**
   * @return the current amount on the account
   */
  public Double getAmount() {
    return m_amount;
  }

  /**
   * @param p_amount to add on the account
   * @return the new amount 
   */

  public Double addAmount(Double p_amount) {
     this.m_amount = this.m_amount + p_amount;
     return this.m_amount;
  }

  /**
   * @param p_amount will be subtracted to the account amount 
   * @return the new amount after the withdraw operation
   */
  public Double withDrawMoney(Double p_amount) {
    this.m_amount = this.m_amount - p_amount;
    return this.m_amount;
  }

}
