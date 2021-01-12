package ru.sastsy.teethproject;
import java.io.File;

import java.util.List;

public class Tooth {

    private String id;
    private String name;
    private String status;
    private List images;
    private List historyOfManipulations;

    public Tooth() {

    }

    public Tooth(String id, String name, String status, List images, List historyOfManipulations) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.images = images;
        this.historyOfManipulations = historyOfManipulations;
    }

    public Manipulation createManipulation(String id, String place, String date, String doctor) {
        return null;

    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setImages(List images) {
        this.images = images;
    }

    public void setHistoryOfManipulations(List historyOfManipulations) {
        this.historyOfManipulations = historyOfManipulations;
    }

    public String getId(String id) {
        return this.id;
    }

    public String getName(String name) {
        return this.name;
    }

    public String getStatus(String status) {
        return this.status;
    }

    public List getImages(List images) {
        return this.images;
    }

    public List getHistoryOfManipulations(List historyOfManipulations) {
        return this.historyOfManipulations;
    }

}
