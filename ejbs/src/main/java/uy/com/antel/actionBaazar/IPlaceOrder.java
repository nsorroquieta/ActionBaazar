package uy.com.antel.actionBaazar;

import javax.ejb.Local;

@Local
public interface IPlaceOrder {

    void addItem(String item);
    void setShippingInfo(String shippingAddress);
    void setBillingInfo(String billingInfo);
    long confirmOrder();

}
