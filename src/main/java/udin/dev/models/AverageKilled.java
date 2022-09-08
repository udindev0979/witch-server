package udin.dev.models;

import java.util.List;

public class AverageKilled {
    public List<VillagePerson> villagePerson;
    public Float average;
    public int status;
    

    

    public AverageKilled(List<VillagePerson> villagePerson, Float average, int status) {
        this.villagePerson = villagePerson;
        this.average = average;
        this.status = status;
    }

    public AverageKilled() {
    }

    public AverageKilled(List<VillagePerson> villagePerson, Float average) {
        this.villagePerson = villagePerson;
        this.average = average;
    }

    public List<VillagePerson> getVillagePerson() {
        return villagePerson;
    }

    public void setVillagePerson(List<VillagePerson> villagePerson) {
        this.villagePerson = villagePerson;
    }

    public Float getAverage() {
        return average;
    }

    public void setAverage(Float average) {
        this.average = average;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    



    
    

    
}
