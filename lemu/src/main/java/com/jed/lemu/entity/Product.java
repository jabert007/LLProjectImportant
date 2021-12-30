package com.jed.lemu.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.kafka.common.protocol.types.Field;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Entity
public class Product {

    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private  String id;

    private  String name;
    private  String category;
    private  String description;
    private  String subcategory;
    private  Double price;
    private  String currency;
    private  String quantity;
    private  String weight;
    private  String imagelink1;
    private  String imagelink2;
    private  String imagelink3;
    private  String imagelink4;
    private  String imagelink5;
    private  String videolink1;
    private  String videolink2;
    private  String countrycode;
    private  String mobilenumber1;
    private  String mobilenumber2;
    private  String emailid;
    private  String country;
    private  String state;
    private  String district;
    private  String address;
    private  String pincode;
    private  String availablity;
    // private  java.sql.Timestamp deliverydate;
    // private  java.sql.Timestamp deliverytime;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate deliverydate;
    @JsonFormat(pattern = "HH:mm:ss.SSS")
    private LocalTime deliverytime;
    private  String brand;
    private  String certification;
    private  String naturalornot;
    private  String usedchemicals;
    private  String purity;
    // private  java.sql.Timestamp manfacturedate;
    // private  java.sql.Timestamp expirydate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate manfacturedate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate expirydate;
    private  String bestbefore;
    private  String vegnonveg;
    private  String locationonmap;
    //private java.sql.Timestamp createdtime;
    // private java.sql.Timestamp updatedtime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdtime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    @UpdateTimestamp
    private LocalDateTime updatedtime;
    private  String location;



    protected Product(){

    }


    public Product(String name, String category, String description, String subcategory, Double price, String currency, String quantity, String weight, String imagelink1, String imagelink2, String imagelink3, String imagelink4, String imagelink5, String videolink1, String videolink2, String countrycode, String mobilenumber1, String mobilenumber2, String emailid, String country, String state, String district, String address, String pincode, String availablity, LocalDate deliverydate, LocalTime deliverytime, String brand, String certification, String naturalornot, String usedchemicals, String purity, LocalDate manfacturedate, LocalDate expirydate, String bestbefore, String vegnonveg, String locationonmap, LocalDateTime createdtime, LocalDateTime updatedtime, String location) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.subcategory = subcategory;
        this.price = price;
        this.currency = currency;
        this.quantity = quantity;
        this.weight = weight;
        this.imagelink1 = imagelink1;
        this.imagelink2 = imagelink2;
        this.imagelink3 = imagelink3;
        this.imagelink4 = imagelink4;
        this.imagelink5 = imagelink5;
        this.videolink1 = videolink1;
        this.videolink2 = videolink2;
        this.countrycode = countrycode;
        this.mobilenumber1 = mobilenumber1;
        this.mobilenumber2 = mobilenumber2;
        this.emailid = emailid;
        this.country = country;
        this.state = state;
        this.district = district;
        this.address = address;
        this.pincode = pincode;
        this.availablity = availablity;
        this.deliverydate = deliverydate;
        this.deliverytime = deliverytime;
        this.brand = brand;
        this.certification = certification;
        this.naturalornot = naturalornot;
        this.usedchemicals = usedchemicals;
        this.purity = purity;
        this.manfacturedate = manfacturedate;
        this.expirydate = expirydate;
        this.bestbefore = bestbefore;
        this.vegnonveg = vegnonveg;
        this.locationonmap = locationonmap;
        this.createdtime = createdtime;
        this.updatedtime = updatedtime;
        this.location = location;
    }

    public String getLocationonmap() {
        return locationonmap;
    }

    public void setLocationonmap(String locationonmap) {
        this.locationonmap = locationonmap;
    }

    /*public java.sql.Timestamp getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(java.sql.Timestamp createdtime) {
        this.createdtime = createdtime;
    }*/

    public LocalDateTime getCreatedtime() {
        return createdtime;
    }

   /* public void setCreatedtime(LocalDateTime createdtime) {
        this.createdtime = createdtime;
    }*/

   /* public java.sql.Timestamp getUpdatedtime() {
        return updatedtime;
    }

    public void setUpdatedtime(java.sql.Timestamp updatedtime) {
        this.updatedtime = updatedtime;
    }*/

    public LocalDateTime getUpdatedtime() {
        return updatedtime;
    }

    /*public void setUpdatedtime(LocalDateTime updatedtime) {
        this.updatedtime = updatedtime;
    }*/

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getImagelink1() {
        return imagelink1;
    }

    public void setImagelink1(String imagelink1) {
        this.imagelink1 = imagelink1;
    }

    public String getImagelink2() {
        return imagelink2;
    }

    public void setImagelink2(String imagelink2) {
        this.imagelink2 = imagelink2;
    }

    public String getImagelink3() {
        return imagelink3;
    }

    public void setImagelink3(String imagelink3) {
        this.imagelink3 = imagelink3;
    }

    public String getImagelink4() {
        return imagelink4;
    }

    public void setImagelink4(String imagelink4) {
        this.imagelink4 = imagelink4;
    }

    public String getImagelink5() {
        return imagelink5;
    }

    public void setImagelink5(String imagelink5) {
        this.imagelink5 = imagelink5;
    }

    public String getVideolink1() {
        return videolink1;
    }

    public void setVideolink1(String videolink1) {
        this.videolink1 = videolink1;
    }

    public String getVideolink2() {
        return videolink2;
    }

    public void setVideolink2(String videolink2) {
        this.videolink2 = videolink2;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public String getMobilenumber1() {
        return mobilenumber1;
    }

    public void setMobilenumber1(String mobilenumber1) {
        this.mobilenumber1 = mobilenumber1;
    }

    public String getMobilenumber2() {
        return mobilenumber2;
    }

    public void setMobilenumber2(String mobilenumber2) {
        this.mobilenumber2 = mobilenumber2;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getAvailablity() {
        return availablity;
    }

    public void setAvailablity(String availablity) {
        this.availablity = availablity;
    }

    /*public java.sql.Timestamp getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(java.sql.Timestamp deliverydate) {
        this.deliverydate = deliverydate;
    }
     */

    public LocalDate getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(LocalDate deliverydate) {
        this.deliverydate = deliverydate;
    }

    /* public java.sql.Timestamp getDeliverytime() {
        return deliverytime;
    }

    public void setDeliverytime(java.sql.Timestamp deliverytime) {
        this.deliverytime = deliverytime;
    }*/

    public LocalTime getDeliverytime() {
        return deliverytime;
    }

    public void setDeliverytime(LocalTime deliverytime) {
        this.deliverytime = deliverytime;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }


    public String getUsedchemicals() {
        return usedchemicals;
    }

    public void setUsedchemicals(String usedchemicals) {
        this.usedchemicals = usedchemicals;
    }

    public String getPurity() {
        return purity;
    }

    public void setPurity(String purity) {
        this.purity = purity;
    }

    /*public java.sql.Timestamp getManfacturedate() {
        return manfacturedate;
    }

    public void setManfacturedate(java.sql.Timestamp manfacturedate) {
        this.manfacturedate = manfacturedate;
    }*/

    public LocalDate getManfacturedate() {
        return manfacturedate;
    }

    public void setManfacturedate(LocalDate manfacturedate) {
        this.manfacturedate = manfacturedate;
    }

     /* public java.sql.Timestamp getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(java.sql.Timestamp expirydate) {
        this.expirydate = expirydate;
    } */

    public LocalDate getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(LocalDate expirydate) {
        this.expirydate = expirydate;
    }

    public String getBestbefore() {
        return bestbefore;
    }

    public void setBestbefore(String bestbefore) {
        this.bestbefore = bestbefore;
    }

    public String getVegnonveg() {
        return vegnonveg;
    }

    public void setVegnonveg(String vegnonveg) {
        this.vegnonveg = vegnonveg;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNaturalornot() {
        return naturalornot;
    }

    public void setNaturalornot(String naturalornot) {
        this.naturalornot = naturalornot;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", subcategory='" + subcategory + '\'' +
                ", price=" + price +
                ", currency='" + currency + '\'' +
                ", quantity='" + quantity + '\'' +
                ", weight='" + weight + '\'' +
                ", imagelink1='" + imagelink1 + '\'' +
                ", imagelink2='" + imagelink2 + '\'' +
                ", imagelink3='" + imagelink3 + '\'' +
                ", imagelink4='" + imagelink4 + '\'' +
                ", imagelink5='" + imagelink5 + '\'' +
                ", videolink1='" + videolink1 + '\'' +
                ", videolink2='" + videolink2 + '\'' +
                ", countrycode='" + countrycode + '\'' +
                ", mobilenumber1='" + mobilenumber1 + '\'' +
                ", mobilenumber2='" + mobilenumber2 + '\'' +
                ", emailid='" + emailid + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", district='" + district + '\'' +
                ", address='" + address + '\'' +
                ", pincode='" + pincode + '\'' +
                ", availablity='" + availablity + '\'' +
                ", deliverydate=" + deliverydate +
                ", deliverytime=" + deliverytime +
                ", brand='" + brand + '\'' +
                ", certification='" + certification + '\'' +
                ", naturalornot='" + naturalornot + '\'' +
                ", usedchemicals='" + usedchemicals + '\'' +
                ", purity='" + purity + '\'' +
                ", manfacturedate=" + manfacturedate +
                ", expirydate=" + expirydate +
                ", bestbefore='" + bestbefore + '\'' +
                ", vegnonveg='" + vegnonveg + '\'' +
                ", locationonmap='" + locationonmap + '\'' +
                ", createdtime=" + createdtime +
                ", updatedtime=" + updatedtime +
                ", location='" + location + '\'' +
                '}';
    }
}
