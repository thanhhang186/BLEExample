package android.fiot.android_ble.model;

import java.io.Serializable;

public class Light implements Serializable {
    private int color;
    private int whiteBright;
    private int RGBBright;
    private boolean isLightOn;

    public Light() {
    }

    public Light(int color, int whiteBright, int RGBBright, boolean isLightOn) {
        this.color = color;
        this.whiteBright = whiteBright;
        this.RGBBright = RGBBright;
        this.isLightOn = isLightOn;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getWhiteBright() {
        return whiteBright;
    }

    public void setWhiteBright(int whiteBright) {
        this.whiteBright = whiteBright;
    }

    public int getRGBBright() {
        return RGBBright;
    }

    public void setRBGBright(int RGBBright) {
        this.RGBBright = RGBBright;
    }

    public boolean isLightOn() {
        return isLightOn;
    }

    public void setLightOn(boolean lightOn) {
        isLightOn = lightOn;
    }
}
