package android.fiot.android_ble.model;

import java.io.Serializable;

public class Time implements Serializable {
    private long timestamp;
    private int type;

    public Time() {
    }

    public Time(long timestamp, int type) {
        this.timestamp = timestamp;
        this.type = type;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
