package clients.getLocationByPlaceId.response;

import clients.BaseResponse;

public class Location extends BaseResponse {

    private String latitude;

    private String longitude;

    public String getLatitude ()
    {
        return latitude;
    }

    public void setLatitude (String latitude)
    {
        this.latitude = latitude;
    }

    public String getLongitude ()
    {
        return longitude;
    }

    public void setLongitude (String longitude)
    {
        this.longitude = longitude;
    }
}
