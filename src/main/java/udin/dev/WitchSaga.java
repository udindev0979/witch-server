package udin.dev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import udin.dev.models.AverageKilled;
import udin.dev.models.NumberOfVillagers;
import udin.dev.models.RespKillPerYear;
import udin.dev.models.VillagePerson;

@Path("/witch")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class WitchSaga {

    private Set<NumberOfVillagers> villagers = Collections
            .newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    ArrayList<Integer> villager;
    AverageKilled averageKilled;
    RespKillPerYear respKillPerYear;
    Float totalPeopleKilled;
    int ifnegative, ifgreater, invalid;

    public WitchSaga() {
        this.villager = new ArrayList<Integer>();
        this.averageKilled = new AverageKilled();
        this.respKillPerYear = new RespKillPerYear();
    }

    private void Ruletokill(int year) {

        villager.clear();
        this.villager.add(1);
        this.villager.add(2);

        for (int i = 3; i <= year; i++) {
            this.villager.add((this.villager.get((i - 1) - 2) + this.villager.get((i - 1) - 1)) + 1);
        }

    }

    @POST
    @Path("kills/average")
    public AverageKilled AverageKill(List<VillagePerson> villagepersons) {
        // System.out.println(villagepersons.size());
        ifnegative = 0;
        ifgreater = 0;

        totalPeopleKilled = 0.0f;
        villagepersons.forEach((data) -> {

            if (data.getAgeOfDeath() <= 0) {
                invalid = -1;
            }

            if (data.getYearOfdeath() <= 0) {
                invalid = -1;
            }

            if (data.getAgeOfDeath() > data.getYearOfdeath()) {
                invalid = -1;
            }

            if (invalid != -1) {

                int bornOnYear = data.getYearOfdeath() - data.getAgeOfDeath();
                Ruletokill(bornOnYear);
                int peopleKilled = this.villager.get(bornOnYear - 1);
                totalPeopleKilled = totalPeopleKilled + peopleKilled;
                data.setBornOnYear(bornOnYear);
                data.setPeopleKilled(peopleKilled);

            }

        });

        if (invalid == -1) {

            averageKilled.setVillagePerson(villagepersons);
            averageKilled.setAverage(0.0f);
            averageKilled.setStatus(invalid);
            invalid = 0;

        } else {

            averageKilled.setVillagePerson(villagepersons);
            averageKilled.setAverage(totalPeopleKilled / villagepersons.size());
            averageKilled.setStatus(0);
            invalid = 0;
        }

        return averageKilled;
    }

    @POST
    @Path("kills/{year}")
    public RespKillPerYear VillagerByYear(@PathParam("year") int year) {


        if (year <= 0) {
            this.respKillPerYear.setMessage("Invalid Value");
            this.respKillPerYear.setStatus(-1);
            this.respKillPerYear.setNumberOfVillagers(null);
        } else {
            villagers.clear();
            Ruletokill(year);
            villagers.add(new NumberOfVillagers(this.villager.get(year - 1), year));
            this.respKillPerYear.setMessage("OK");
            this.respKillPerYear.setStatus(0);
            this.respKillPerYear.setNumberOfVillagers(villagers);

        }

        return this.respKillPerYear;
    }

}
