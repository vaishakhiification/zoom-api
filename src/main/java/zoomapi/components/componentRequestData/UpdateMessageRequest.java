package zoomapi.components.componentRequestData;

public class UpdateMessageRequest {
    String message;
    String to_contact;
    String to_channel;

    public UpdateMessageRequest() {
        message = null;
        to_channel = null;
        to_contact = null;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTo_contact(String to_contact) {
        this.to_contact = to_contact;
    }

    public void setTo_channel(String to_channel) {
        this.to_channel = to_channel;
    }
}
