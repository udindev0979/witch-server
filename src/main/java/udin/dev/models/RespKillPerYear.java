package udin.dev.models;

import java.util.List;
import java.util.Set;

public class RespKillPerYear {
    public int status;
    public String message;
    public Set<NumberOfVillagers> numberOfVillagers;

    
    
    public RespKillPerYear() {
    }

    public RespKillPerYear(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Set<NumberOfVillagers> getNumberOfVillagers() {
        return numberOfVillagers;
    }

    public void setNumberOfVillagers(Set<NumberOfVillagers> numberOfVillagers) {
        this.numberOfVillagers = numberOfVillagers;
    }

   
    

    
}
