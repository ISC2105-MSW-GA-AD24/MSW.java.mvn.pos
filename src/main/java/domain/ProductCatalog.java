package domain;

import java.util.*;

public class ProductCatalog {
  private Hashtable productSpecifications = new Hashtable();

  public ProductCatalog() {
    ProductSpecification ps =
        new ProductSpecification(1, 100, "product 1");
    productSpecifications.put(new Integer(1), ps);
    ps = new ProductSpecification(2, 200, "product 2");
    productSpecifications.put(new Integer(2), ps);

    ps = new ProductSpecification(3, 300, "product 3");
    productSpecifications.put(new Integer(3), ps);
    ps = new ProductSpecification(4, 400, "product 4");
    productSpecifications.put(new Integer(4), ps);

  }

  public ProductSpecification specification(int upc) {
    return (ProductSpecification) productSpecifications.get(new Integer(upc));
  }
}
