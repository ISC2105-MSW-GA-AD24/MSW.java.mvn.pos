package domain;

class Payment {
  private float amount;

  public Payment(float cashTendered) {
    this.amount = cashTendered;
  }

  public float getAmount() {
    return amount;
  }

}
