package com.example.vpcsd.orderlistlogic.bean;

/**
 * Created by admin on 2016/11/8.
 */

/**
 * orderDetailList字段中每一项的order字段
 */
public class GoodsOrderInfo {

    private String orderCode;
    private String shopName;
    private String status;

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
