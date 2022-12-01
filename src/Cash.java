package src;

public class Cash {
  private Double amountDouble;

  /**
   * @param p_amount is set to the object at its creation
   * can't create a Check() without data
   */
  public Cash(Double p_amount) {
    setAmountDouble(p_amount);
  }

  /**
   * @return check amount 
   */
  public Double getAmountDouble() {
    return amountDouble;
  }

  /**
   * @param amounDouble assign to the amount object 
   */
  public void setAmountDouble(Double amountDouble) {
    this.amountDouble = amountDouble;
  }

}
