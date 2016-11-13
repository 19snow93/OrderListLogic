package com.example.vpcsd.orderlistlogic.bean;

/**
 * Created by admin on 2016/11/8.
 */

/**
 * orderDetailList字段的每一项
 */
public class OrderGoodsItem {

    private String productName;
    private String productPic;
    private int count;
    private double totalPrice;
    private int orderid;

    private GoodsOrderInfo order;

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPic() {
        return productPic;
    }

    public void setProductPic(String productPic) {
        this.productPic = productPic;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public GoodsOrderInfo getOrder() {
        return order;
    }

    public void setOrder(GoodsOrderInfo order) {
        this.order = order;
    }
}
