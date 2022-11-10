package org.example.entity;

import org.springframework.stereotype.Component;

@Component
public class Address {
   private  String area;
   private String pincode;
   private String country;
   private long mobileNo;
   private String state;

    public Address() {
    }

    public Address(String area, String pincode, String country, long mobileNo, String state) {
        area = area;
        this.pincode = pincode;
        this.country = country;
        this.mobileNo = mobileNo;
        this.state = state;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Area :"+area+"\n"+"Pincode :"+pincode+"\n"+"Country :"+country+"\n"+"Mobile No :"+mobileNo+"\n"+"State :"+state;
    }
}
