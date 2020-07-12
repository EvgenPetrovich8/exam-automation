package automation.visit;

import automation.pet.Pet;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;


@Data
public class Visit {

    @JsonProperty("date")
    private String date;
    @JsonProperty("description")
    private String description;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("pet")
    private Pet pet;
}
