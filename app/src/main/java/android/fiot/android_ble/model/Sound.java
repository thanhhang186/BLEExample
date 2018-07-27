package android.fiot.android_ble.model;

import java.io.Serializable;
import java.lang.ref.PhantomReference;

public class Sound implements Serializable {
    private int sound;
    private int volume;
    private boolean isSoundOn;

    public Sound() {
    }

    public Sound(int sound, int volume, boolean isSoundOn) {
        this.sound = sound;
        this.volume = volume;
        this.isSoundOn = isSoundOn;
    }

    public int getSound() {
        return sound;
    }

    public void setSound(int sound) {
        this.sound = sound;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isSoundOn() {
        return isSoundOn;
    }

    public void setSoundOn(boolean soundOn) {
        isSoundOn = soundOn;
    }
}
