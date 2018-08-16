package com.ons.school.web.application.vo;

public class Customer {

    private String customerId;
    private String customerName;
    private String customerAddress;
    private long customerAvgRevenuePerAnnum;

    public Customer() {

    }

    public Customer(String customerId, String customerName,
                    String customerAddress, long customerAvgRevenuePerAnnum) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerAvgRevenuePerAnnum = customerAvgRevenuePerAnnum;

    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public long getCustomerAvgRevenuePerAnnum() {
        return customerAvgRevenuePerAnnum;
    }

    public void setCustomerAvgRevenuePerAnnum(long customerAvgRevenuePerAnnum) {
        this.customerAvgRevenuePerAnnum = customerAvgRevenuePerAnnum;
    }
}
