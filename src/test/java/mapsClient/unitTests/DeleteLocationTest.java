package mapsClient.unitTests;

import builders.CreateLocationRequestBuilder;
import clients.createLocation.CreateLocationClient;
import clients.createLocation.request.CreateLocationRequest;
import clients.createLocation.response.CreateLocationResponse;
import clients.deleteLocationByPlaceId.DeleteLocationClient;
import clients.deleteLocationByPlaceId.request.DeleteLocationRequest;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Categories;

public class DeleteLocationTest {
    @Test(groups = {Categories.SMOKE})
    public void shouldCreateAndDeleteLocationTest(){
        CreateLocationRequest createLocationRequest = new CreateLocationRequestBuilder().build();
        CreateLocationResponse createLocationResponse = new CreateLocationClient().createLocation(createLocationRequest);
        Assert.assertEquals(createLocationResponse.getHttpStatusCode(), 200);
        Assert.assertEquals(createLocationResponse.getStatus(), "OK");
    }
}
