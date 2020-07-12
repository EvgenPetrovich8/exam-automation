package automation.pet;

import automation.owner.Owner;
import automation.type.Type;

import automation.visit.Visit;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

@Data
@JsonInclude (JsonInclude.Include.NON_DEFAULT)
public class Pet {

    @JsonProperty("birthDate")
    private String birthDate;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("owner")
    private Owner owner;
    @JsonProperty("type")
    private Type type;
    @JsonProperty("visits")
    private List<Visit> visits = null;
}
