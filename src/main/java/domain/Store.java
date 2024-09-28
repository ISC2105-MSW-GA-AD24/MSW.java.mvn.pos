package domain;

import workflow.*;

public class Store {
	private ProductCatalog productCatalog = new ProductCatalog();
	private POS pos = new POS( productCatalog );

	public POS getPOS() { return pos; }
}
