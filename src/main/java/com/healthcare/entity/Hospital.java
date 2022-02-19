package com.healthcare.entity;

import javax.persistence.*;

@Entity
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hospital_id")
    private Integer hospitalId;
    @Column(name = "hospital_name", nullable = false, unique = true)
    private String hospitalName;
    @Column(nullable = false, name = "state")
    private String state;
    @Column(nullable = false, name = "district")
    private String district;
    @Column(nullable = false, name = "city")
    private String city;
    @Column(nullable = false, name = "pincode")
    private Integer pincode;

    @ManyToOne
    @JoinColumn(name="level", nullable = false)
    private Level level;

    public Hospital() {
    }

    public Hospital(Integer hospitalId, String hospitalName, String state, String district, String city, Integer pincode, Level level) {
        this.hospitalId = hospitalId;
        this.hospitalName = hospitalName;
        this.state = state;
        this.district = district;
        this.city = city;
        this.pincode = pincode;
        this.level = level;
    }

    public Integer getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalId=" + hospitalId +
                ", hospitalName='" + hospitalName + '\'' +
                ", state='" + state + '\'' +
                ", district='" + district + '\'' +
                ", city='" + city + '\'' +
                ", pincode=" + pincode +
                ", level=" + level +
                '}';
    }
}