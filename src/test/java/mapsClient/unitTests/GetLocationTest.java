package mapsClient.unitTests;

import clients.createLocation.CreateLocationClient;
import clients.createLocation.request.CreateLocationRequest;
import builders.CreateLocationRequestBuilder;
import clients.createLocation.response.CreateLocationResponse;
import clients.getLocationByPlaceId.GetLocationClient;
import clients.getLocationByPlaceId.response.GetLocationResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetLocationTest {

    @Test
    public void shouldTestGetLocationByPlaceIdApi() {

        CreateLocationRequest createLocationRequest = new CreateLocationRequestBuilder().build();
        CreateLocationResponse createLocationResponse = new CreateLocationClient().createLocation(createLocationRequest);
        Assert.assertEquals(createLocationResponse.getHttpStatusCode(), 200);
        Assert.assertEquals(createLocationResponse.getStatus(), "OK");

        System.out.println(createLocationResponse.getPlace_id());

        GetLocationResponse getLocationResponse = new GetLocationClient().getLocationDetails(createLocationResponse.getPlace_id());

        Assert.assertEquals(getLocationResponse.getHttpStatusCode(), 200);
        Assert.assertEquals(getLocationResponse.getAccuracy(),"50");
        Assert.assertEquals(getLocationResponse.getLocation().getLatitude(), "-38.383494");
        Assert.assertEquals(getLocationResponse.getLocation().getLongitude(), "33.427362");
        Assert.assertEquals(getLocationResponse.getName(), "Frontline house");


    }
}
