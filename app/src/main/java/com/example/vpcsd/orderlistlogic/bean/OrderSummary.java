package com.example.vpcsd.orderlistlogic.bean;

/**
 * Created by admin on 2016/11/8.
 */

import java.util.List;

/**
 * resultList的每一项
 */
public class OrderSummary {

    private int id;
    private String orderCode;
    private double totalPrice;
    private String status;
    private String createTime;
    private String payTime;

    private List<OrderGoodsItem> orderDetailList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public List<OrderGoodsItem> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderGoodsItem> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }
}
