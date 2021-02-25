package builders;

import clients.createLocation.request.CreateLocationRequest;
import clients.createLocation.request.Location;

import java.util.Arrays;

public class CreateLocationRequestBuilder {
    public CreateLocationRequest createLocationRequest;
    public Location location;

    public CreateLocationRequestBuilder(){
        createLocationRequest = new CreateLocationRequest();
        location = new Location();
        // request.setOptions(Arrays.asList());
        createLocationRequest.setTypes(Arrays.asList("shoe park","shop"));
        createLocationRequest.setWebsite("http://google.com");
        createLocationRequest.setAddress("29, side layout, cohen 09");
        createLocationRequest.setName("Frontline house");
        createLocationRequest.setAccuracy("50");
        location.setLat("-38.383494");
        location.setLng("33.427362");
        createLocationRequest.setLocation(location);
        createLocationRequest.setPhone_number("(+91) 983 893 3937");
        createLocationRequest.setLanguage("French-IN");

        }
    public CreateLocationRequest build() {
        return createLocationRequest;
    }
}
