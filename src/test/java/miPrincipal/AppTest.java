package miPrincipal;

import domain.*;
import workflow.*;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    @Test 
    public void testPOS() {

        Store tienda = new Store();
	    POS pos = tienda.getPOS();

        System.out.println("Capturo 1 articulo (COD=1) de a 100 pesos");
		pos.EnterItem(1,1);

		System.out.println("Capturo 2 articulos (COD=2) de a 200 pesos");
		pos.EnterItem(2,2);

		System.out.println("Capturo 1 articulo (COD=1) de a 100 pesos");
		pos.EnterItem(1,1);

		System.out.println("Finalizo la venta...");
		pos.endSale();

		System.out.println("Total de la venta..."+pos.getSale().total());

		System.out.println("Pago con 650 pesos...");
		pos.makePayment(650);

		System.out.println("La feria es: ..."+ pos.getSale().getBalance());
        assertTrue(pos.getSale().getBalance() == 50.0);
	}
}	
