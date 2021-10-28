package step_definitions.airtable;

import Utilities.APIUtillities;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AIrtable_Steps {

    @When("I hit the GET API")
    public void i_hit_the_get_api() {
        APIUtillities.hitGET("");
    }

    @When("I check status code is {int}")
    public void i_check_status_code_is(int status_code) {
        APIUtillities.getResponse().statusCode();
        Assert.assertEquals(status_code,APIUtillities.getResponse().statusCode());
    }

    @When("I check status code is {string}")
    public void i_check_status_code_is(String status_code) {

        status_code = APIUtillities.getResponse().statusCode() +"";
        Assert.assertEquals("201",status_code);


    }

}
