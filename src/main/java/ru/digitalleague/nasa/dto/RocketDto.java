package ru.digitalleague.nasa.dto;

public class RocketDto{
    private String status;
    private String model;

    public RocketDto(){
    }

    public RocketDto(String model, String status){
        this.model = model;
        this.status = status;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
