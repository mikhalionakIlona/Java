package com.example.photostudio.model;

import java.time.LocalDateTime;

public class PhotoSession {
    private Long id;
    private String clientLastName;
    private String clientName;
    private String clientPhone;
    private LocalDateTime photoSessionDate;
    private double price;
    private String photographer;
    private String status;

    public PhotoSession() {
        this.status = "Заплонирована";
    }

    public PhotoSession(Builder builder) {
        this.id = builder.id;
        this.clientName = builder.clientName;
        this.clientLastName = builder.clientLastName;
        this.clientPhone = builder.clientPhone;
        this.photoSessionDate = builder.photoSessionDate;
        this.price = builder.price;
        this.photographer = builder.photographer;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long id;
        private String clientLastName;
        private String clientName;
        private String clientPhone;
        private LocalDateTime photoSessionDate;
        private double price;
        private String photographer;
        private String status;

        private Builder() {
        }

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder clientLastName(String clientLastName) {
            this.clientLastName = clientLastName;
            return this;
        }

        public Builder clientName(String clientName) {
            this.clientName = clientName;
            return this;
        }

        public Builder clientPhone(String clientPhone) {
            this.clientPhone = clientPhone;
            return this;
        }

        public Builder photoSessionDate(LocalDateTime photoSessionDate) {
            this.photoSessionDate = photoSessionDate;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Builder photographer(String photographer) {
            this.photographer = photographer;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public PhotoSession build() {
            return new PhotoSession(this);
        }
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