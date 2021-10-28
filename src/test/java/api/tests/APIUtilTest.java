package api.tests;

import Utilities.APIUtillities;
import api.API_models.Fields;
import api.API_models.Record;
import api.API_models.RequestBody;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class APIUtilTest {
    static String recordID;

    @Test
    public void getRecord() {
        String resource = ""; // this string is empty cause out airtable endpoint has no additional resource
        APIUtillities.hitGET(resource);
        System.out.println(APIUtillities.getResponseBody().getRecords().get(1).getFields().getFirstname());
    }
    @Test
    public void getRecordForPhone() {
        String resource = "";
        APIUtillities.hitGET(resource);

        for (Record elements : APIUtillities.getResponseBody().getRecords()) {
            if(elements.getFields().getPhone().endsWith("7777")) {
                System.out.println(elements.getFields().getFirstname());
            }
        }
    }


    @Test
    public void postRecord() {
        String resource = "";

        Fields fields = new Fields();
        fields.setFirstname("James");
        fields.setLastname("LeBron");
        fields.setPhone("777-999-7777");
        fields.setAddress("999 Test this API");

        Record record = new Record();
        record.setFields(fields);
        List<Record> records = new ArrayList<>();
        records.add(record);

        RequestBody requestBody = new RequestBody();
        requestBody.setRecords(records);

        APIUtillities.hitPOST(resource,requestBody );

    }

    @Test (priority = 1)
    public void postRecordAndGetName() {
        String resource = "";
        Faker faker = new Faker();

        Fields fields = new Fields();
        fields.setFirstname(faker.name().firstName());
        fields.setLastname(faker.name().lastName());
        fields.setPhone(faker.phoneNumber().cellPhone());
        fields.setAddress(faker.address().streetAddress());

        Record record = new Record();
        record.setFields(fields);
        List<Record> records = new ArrayList<>();
        records.add(record);

        RequestBody requestBody = new RequestBody();
        requestBody.setRecords(records);

        APIUtillities.hitPOST(resource,requestBody );
        System.out.println(APIUtillities.getResponseBody().getRecords().get(0).getFields().getFirstname());

        recordID = APIUtillities.getResponseBody().getRecords().get(0).getId();

        System.out.println(APIUtillities.getResponseBody().getRecords().get(0).getId());



    }

    @Test (priority = 2)
    public void updateRecord() {
        String resource = "";
        System.out.println(recordID);

        Fields fields = new Fields();
        fields.setFirstname("James");
        fields.setLastname("LeBron");
        fields.setPhone("777-999-7777");
        fields.setAddress("999 Test this API");

        Record record = new Record();
        record.setFields(fields);
        record.setId(recordID);
        List<Record> records = new ArrayList<>();
        records.add(record);

        RequestBody requestBody = new RequestBody();
        requestBody.setRecords(records);

        APIUtillities.hitPATCH(resource,requestBody);
    }

    @Test
    public void deleteRecord() {
        String resource = "";
        APIUtillities.hitDELETE(resource, "rec0xqYu5ng0HaGmw");
    }






}
