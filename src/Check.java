package src;

public class Check {
  private Double amountDouble;

  /**
   * @param p_amount is set to the object at its creation
   * can't create a Check() without data
   */
  public Check(Double p_amount) {
    setAmountDouble(p_amount);
  }

  /**
   * @return check amount 
   */
  public Double getAmountDouble() {
    return amountDouble;
  }

  /**
   * @param p_amount assign to the amount object 
   */
  protected void setAmountDouble(Double p_amount) {
    this.amountDouble = p_amount;
  }

}
