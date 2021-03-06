package models;

public class Channels {

    Integer id;
    String channel_id;
    String channel_name;
    String channel_type;

    public Channels() {
    }

    public Channels(Integer id, String channel_id, String channel_name, String channel_type) {
        this.id = id;
        this.channel_id = channel_id;
        this.channel_name = channel_name;
        this.channel_type = channel_type;
    }

    public Integer getId() {
        return id;
    }

    public String getChannel_id() {
        return channel_id;
    }

    public String getChannel_name() {
        return channel_name;
    }

    public String getChannel_type() {
        return channel_type;
    }
}
