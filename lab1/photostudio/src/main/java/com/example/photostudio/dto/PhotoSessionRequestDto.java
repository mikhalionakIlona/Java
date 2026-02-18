package com.example.photostudio.dto;

import java.time.LocalDateTime;

public class PhotoSessionRequestDto {
    private String clientLastName;
    private String clientName;
    private String clientPhone;
    private LocalDateTime photoSessionDate;
    private double price;
    private String photographer;
    private String status;

    public PhotoSessionRequestDto() {
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public String getClientName() {
        return clientName;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public LocalDateTime getPhotoSessionDate() {
        return photoSessionDate;
    }

    public double getPrice() {
        return price;
    }

    public String getPhotographer() {
        return photographer;
    }

    public String getStatus() {
        return status;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public void setSessionDate(LocalDateTime photoSessionDate) {
        this.photoSessionDate = photoSessionDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPhotographer(String photographer) {
        this.photographer = photographer;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
