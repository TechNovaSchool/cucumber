package step_definitions.airtable;

import Utilities.APIUtillities;
import io.cucumber.java.en.When;

public class AIrtable_Steps {

    @When("I hit the GET API")
    public void i_hit_the_get_api() {
        APIUtillities.hitGET("");


    }
    @When("I check status code is {int}")
    public void i_check_status_code_is(int status_code) {



    }

}
