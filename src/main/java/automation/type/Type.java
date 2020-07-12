package automation.type;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;


@Data
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Type {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
}
