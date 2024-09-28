package domain;

class SaleLineItem {
  private int	quantity;
  private	ProductSpecification	productSpec;

   public SaleLineItem(ProductSpecification spec, int quantity )
	{
		this.productSpec = spec;
		this.quantity = quantity;
	}

	public float subtotal() { return quantity * productSpec.getPrice(); }

}
