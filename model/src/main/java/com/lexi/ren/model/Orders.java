package com.lexi.ren.model;

import com.lexi.ren.utils.DateUtils;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

public class Orders {
    private int id;
    private String orderNum;
    private Date orderTime;
    private String orderTimeStr;
    private int peopleCount;
    private String orderDesc;
    private int orderStatus;
    private String orderStatusStr;
    private int payType;
    private Product product;
    private List<Traveller> travellers;
    private Member member;
    private String payTypeStr;





    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }


    public String getPayTypeStr() {
        //支付方式(0 支付宝 1 微信 2其它)
        if(payType==0){
            payTypeStr="支付宝";
        }else if(payType==1){
            payTypeStr="微信";
        }else if(payType==2){
            payTypeStr="其它";
        }
        return payTypeStr;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    public int getPayType() {
        return payType;
    }

    public void setPayType(int payType) {
        this.payType = payType;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getOrderTimeStr() {
        return DateUtils.date2String(orderTime,"yyyy-MM-dd HH:mm:ss");
    }
    public String getOrderStatusStr() {
        //订单状态(0 未支付 1 已支付)
        if(orderStatus==0){
            orderStatusStr="未支付";
        }else if(orderStatus==1){
            orderStatusStr="已支付";
        }
        return orderStatusStr;
    }

    public List<Traveller> getTravellers() {
        return travellers;
    }

    public void setTravellers(List<Traveller> travellers) {
        this.travellers = travellers;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
