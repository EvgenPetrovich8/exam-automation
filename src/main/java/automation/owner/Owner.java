package automation.owner;

import automation.pet.Pet;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;


@Data
@JsonInclude (JsonInclude.Include.NON_DEFAULT)
public class Owner {

    @JsonProperty("address")
    private String address;
    @JsonProperty("city")
    private String city;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("pets")
    private List<Pet> pets = null;
    @JsonProperty("telephone")
    private String telephone;

}


