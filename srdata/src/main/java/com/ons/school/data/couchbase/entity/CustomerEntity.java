package com.ons.school.data.couchbase.entity;

import com.couchbase.client.java.repository.annotation.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

@Document
public class CustomerEntity {

    @Id
    private String customerDocumentId;

    @Field
    private String customerId;

    @Field
    private String customerName;

    @Field
    private String customerAddress;

    @Field
    private long customerAvgRevenuePerAnnum;

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

    public String getCustomerDocumentId() {
        return customerDocumentId;
    }

    public void setCustomerDocumentId(String customerDocumentId) {
        this.customerDocumentId = customerDocumentId;
    }
}
