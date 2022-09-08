package udin.dev.models;

public class VillagePerson {
    public String personName;
    public int ageOfDeath;
    public int yearOfdeath;
    public int bornOnYear;
    public int peopleKilled;


    public VillagePerson(){}

    

    public VillagePerson(String personName, int ageOfDeath, int yearOfdeath, int bornOnYear, int peopleKilled) {
        this.personName = personName;
        this.ageOfDeath = ageOfDeath;
        this.yearOfdeath = yearOfdeath;
        this.bornOnYear = bornOnYear;
        this.peopleKilled = peopleKilled;
    }



    public VillagePerson(String personName, int ageOfDeath, int yearOfdeath) {
        this.personName = personName;
        this.ageOfDeath = ageOfDeath;
        this.yearOfdeath = yearOfdeath;
    }

    

    public int getBornOnYear() {
        return bornOnYear;
    }



    public void setBornOnYear(int bornOnYear) {
        this.bornOnYear = bornOnYear;
    }



    public int getPeopleKilled() {
        return peopleKilled;
    }



    public void setPeopleKilled(int peopleKilled) {
        this.peopleKilled = peopleKilled;
    }



    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getAgeOfDeath() {
        return ageOfDeath;
    }

    public void setAgeOfDeath(int ageOfDeath) {
        this.ageOfDeath = ageOfDeath;
    }

    public int getYearOfdeath() {
        return yearOfdeath;
    }

    public void setYearOfdeath(int yearOfdeath) {
        this.yearOfdeath = yearOfdeath;
    }

    
     
}
