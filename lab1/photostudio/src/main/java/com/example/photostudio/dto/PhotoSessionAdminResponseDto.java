package com.example.photostudio.dto;

import java.time.LocalDateTime;

public class PhotoSessionAdminResponseDto {
    private Long id;
    private String clientLastName;
    private String clientName;
    private String clientPhone;
    private LocalDateTime photoSessionDate;
    private double price;
    private String photographer;
    private String status;

    public PhotoSessionAdminResponseDto() {
    }

    public PhotoSessionAdminResponseDto(Long id, String clientName, String clientLastName, String clientPhone,
            LocalDateTime photoSessionDate, double price, String photographer, String status) {
        this.id = id;
        this.clientLastName = clientLastName;
        this.clientName = clientName;
        this.clientPhone = clientPhone;
        this.photoSessionDate = photoSessionDate;
        this.price = price;
        this.photographer = photographer;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getClientName() {
        return clientName;
    }

    public String getClientLastName() {
        return clientLastName;
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

    public void setId(Long id) {
        this.id = id;
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

    public void setPhotoSessionDate(LocalDateTime photoSessionDate) {
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
