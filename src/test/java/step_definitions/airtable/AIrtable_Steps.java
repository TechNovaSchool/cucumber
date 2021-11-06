package step_definitions.airtable;

import Utilities.APIUtillities;
import api.API_models.Fields;
import api.API_models.Record;
import api.API_models.RequestBody;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class AIrtable_Steps {
    Fields fields = new Fields();
    Faker faker = new Faker();
    Record record = new Record();
    List<Record> records = new ArrayList<>();
    RequestBody requestBody = new RequestBody();

    static String recordID;

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
        Assert.assertEquals("200",status_code);
    }

    @When("I verify the first name is {string}")
    public void i_verify_the_first_name_is(String string) {
        Assert.assertEquals(string,APIUtillities.getResponseBody().getRecords().get(0).getFields().getFirstname());

        System.out.println(APIUtillities.getResponseBody().getRecords().get(0).getFields().getFirstname());

    }

    @When("I create a record")
    public void i_create_a_record() {
        fields.setFirstname(faker.name().firstName());
        fields.setLastname(faker.name().lastName());
        fields.setPhone(faker.phoneNumber().cellPhone());
        fields.setAddress(faker.address().streetAddress());
        fields.setEmail(faker.internet().emailAddress());

        record.setFields(fields);
        records.add(record);
        requestBody.setRecords(records);
        APIUtillities.hitPOST("",requestBody);
//        System.out.println(APIUtillities.getResponseBody().getRecords().get(0).getId());

    }
    @Then("I am able to get recordID")
    public void i_am_able_to_get_record_id() {
      recordID = APIUtillities.getResponseBody().getRecords().get(0).getId();
    }

    @Then("I update the record email to first and last name")
    public void i_update_the_record_email_to_first_and_last_name() {
        record.setId(recordID);
        fields.setEmail(fields.getFirstname()+"." +fields.getLastname() + "@gmail.com");
        record.setFields(fields);
        System.out.println(requestBody.toString());
        APIUtillities.hitPATCH("",requestBody);
    }

    @Then("I delete the record")
    public void i_delete_the_record() {
        APIUtillities.hitDELETE("",recordID);
    }




}
