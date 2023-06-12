package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Size;
import org.springframework.core.SpringVersion;

@Entity
public class Skill extends AbstractEntity {

    @Size(max = 100)
    private String description;

    private String job;

    public Skill (){}

    public  String getDescription() {
        return description;
    }

    public void setDescription( String description) {
        this.description = description;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}

