package domain;

import java.util.*;

public class Sale {
	private Vector lineItems = new Vector();
	private Date date = new Date();
	private boolean isComplete = false;
	private Payment payment;

	public float getBalance()
	{
		return payment.getAmount() - total();
	}

	public void becomeComplete()
	{
		isComplete = true;
	}

	public boolean isComplete() { return isComplete; }

	public void makeLineItem( ProductSpecification spec, int quantity )
	{
		lineItems.addElement( new SaleLineItem( spec, quantity ) );
	}

	public float total()
	{
		float total = 0;
		Enumeration	e = lineItems.elements();

		while( e.hasMoreElements() )
			{
			total += ( (SaleLineItem) e.nextElement() ).subtotal();
			}
		return total;
	}

	public void makePayment( float cashTendered )
	{
		payment = new Payment( cashTendered );
	}
}
