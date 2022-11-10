package org.example.entity;

public class Address {
   private  String Area;
   private String pincode;
   private String country;
   private long mobileNo;
   private String state;

    public Address() {
    }

    public Address(String area, String pincode, String country, long mobileNo, String state) {
        Area = area;
        this.pincode = pincode;
        this.country = country;
        this.mobileNo = mobileNo;
        this.state = state;
    }

    public void setArea(String area) {
        Area = area;
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
        return "Address{" +
                "Area='" + Area + '\'' +
                ", pincode='" + pincode + '\'' +
                ", country='" + country + '\'' +
                ", mobileNo=" + mobileNo +
                ", state='" + state + '\'' +
                '}';
    }
}
