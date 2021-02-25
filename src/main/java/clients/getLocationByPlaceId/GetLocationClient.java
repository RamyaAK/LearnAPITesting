package clients.getLocationByPlaceId;

import clients.getLocationByPlaceId.response.GetLocationResponse;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import properties.SampleApiProperties;


 /*CreateEmployeeDetailsResponse createEmployeeDetailsResponse = response.as(CreateEmployeeDetailsResponse.class);
        createEmployeeDetailsResponse.setHttpStatusCode(response.getStatusCode());
        return createEmployeeDetailsResponse;*/


import static io.restassured.RestAssured.given;

public class GetLocationClient {

    String url = String.format("%s/maps/api/place/get/json", SampleApiProperties.baseUrl);

    public GetLocationResponse getLocationDetails(String placeId) {

        Response response = given()
                .queryParams("key","qaclick123")
                .queryParams("place_id",placeId)
                .contentType(ContentType.JSON)
                .when()
                .get(url);
        GetLocationResponse getLocationResponse = response.as(GetLocationResponse.class);
        getLocationResponse.setHttpStatusCode(response.getStatusCode());
        return getLocationResponse;
    }
}
