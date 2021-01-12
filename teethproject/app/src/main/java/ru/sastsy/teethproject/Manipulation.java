package ru.sastsy.teethproject;

public class Manipulation {

    private String id;
    private String date;
    private String place;
    private String doctor;
    private String typeOfManipulation;
    private String comment;

    public Manipulation() {

    }

    public Manipulation(String id, String date, String place, String doctor,
                        String typeOfManipulation, String comment) {

    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPLace(String place) {
        this.place = place;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public void setTypeOfManipulation(String typeOfManipulation) {
        this.typeOfManipulation = typeOfManipulation;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getId() {
        return this.id;
    }

    public String getDate() {
        return this.date;
    }

    public String getPLace() {
        return this.place;
    }

    public String getDoctor() {
        return this.doctor;
    }

    public String getTypeOfManipulation() {
        return this.typeOfManipulation;
    }

    public String getComment() {
        return this.comment;
    }
}
