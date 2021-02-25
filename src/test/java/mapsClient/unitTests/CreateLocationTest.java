package mapsClient.unitTests;

import clients.createLocation.CreateLocationClient;
import clients.createLocation.request.CreateLocationRequest;
import builders.CreateLocationRequestBuilder;
import clients.createLocation.response.CreateLocationResponse;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Categories;

public class CreateLocationTest {
    @Test(groups = {Categories.SMOKE})
    public void shouldTestLocationCreation(){
      CreateLocationRequest createLocationRequest = new CreateLocationRequestBuilder().build();
      CreateLocationResponse createLocationResponse = new CreateLocationClient().createLocation(createLocationRequest);
        Assert.assertEquals(createLocationResponse.getHttpStatusCode(), 200);
        Assert.assertEquals(createLocationResponse.getStatus(), "OK");
    }
}
