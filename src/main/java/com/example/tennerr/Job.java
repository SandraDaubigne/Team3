package com.example.tennerr;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String jobdescription;
    private String workgiver;
    private String titel;
    private boolean beauty;
    private boolean cleaning;
    private boolean vvs;
    private boolean health;
    private boolean painting;

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public boolean isBeauty() {
        return beauty;
    }

    public void setBeauty(boolean beauty) {
        this.beauty = beauty;
    }

    public boolean isCleaning() {
        return cleaning;
    }

    public void setCleaning(boolean cleaning) {
        this.cleaning = cleaning;
    }

    public boolean isVvs() {
        return vvs;
    }

    public void setVvs(boolean vvs) {
        this.vvs = vvs;
    }

    public boolean isHealth() {
        return health;
    }

    public void setHealth(boolean health) {
        this.health = health;
    }

    public boolean isPainting() {
        return painting;
    }

    public void setPainting(boolean painting) {
        this.painting = painting;
    }

    public Job() {
    }
    public String getWorkgiver() {
        return workgiver;
    }

    public void setWorkgiver(String workgiver) {
        this.workgiver = workgiver;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobdescription() {
        return jobdescription;
    }

    public void setJobdescription(String jobdescription) {
        this.jobdescription = jobdescription;
    }
}
