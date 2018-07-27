package android.fiot.android_ble.utils;

import android.fiot.android_ble.model.Light;
import android.fiot.android_ble.model.Sound;
import android.fiot.android_ble.model.Time;

import java.nio.ByteBuffer;

public class ParseObjectToBytes {

    public static byte[] parseTimeToBytes(Time time){
        return longToBytes(time.getTimestamp());
    }

    public static byte[] parseLightBytes(Light light){
        return new byte[]{(byte) light.getColor(), (byte) light.getWhiteBright(), (byte) light.getRGBBright(), (byte) light.getRGBBright(), (byte) ((light.isLightOn())?1:0)};
    }

    public static byte[] parseSoundBytes(Sound sound){
        return new byte[]{(byte) sound.getSound(), (byte) sound.getVolume(), (byte) ((sound.isSoundOn())?1:0)};
    }

    public static byte[] longToBytes(long x) {
        ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES);
        buffer.putLong(x);
        return buffer.array();
    }
}
