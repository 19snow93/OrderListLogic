package com.example.vpcsd.orderlistlogic.bean;

/**
 * Created by admin on 2016/11/8.
 */

/**
 *  列表页中每一个大订单的金额信息View所用的数据实体
 */
public class OrderPayInfo {

    private double totalAmount;
    private String status;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
