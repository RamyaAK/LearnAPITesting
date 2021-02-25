package clients.deleteLocationByPlaceId.request;

public class DeleteLocationRequest {
    private String placeId;

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public DeleteLocationRequest(String placeId) {
        this.placeId = placeId;
    }
}
