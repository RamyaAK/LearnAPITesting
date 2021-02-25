package clients.createLocation;

import clients.createLocation.request.CreateLocationRequest;
import clients.createLocation.response.CreateLocationResponse;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import properties.SampleApiProperties;

import static io.restassured.RestAssured.given;

public class CreateLocationClient{
    public CreateLocationResponse createLocation(CreateLocationRequest createLocationRequest) {


        String url = String.format("%s/maps/api/place/add/json", SampleApiProperties.baseUrl);

        Response response = given().queryParam("key","qaclick123")
                .when()
                .contentType(ContentType.JSON)
                .body(createLocationRequest)
                .post(url);

        CreateLocationResponse createLocationResponse = response.as(CreateLocationResponse.class);
        createLocationResponse.setHttpStatusCode(response.getStatusCode());
        return createLocationResponse;
    }
}
