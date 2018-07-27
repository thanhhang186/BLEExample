package android.fiot.android_ble.interfaces;

import com.bluetooth.le.FioTBluetoothCharacteristic;
import com.bluetooth.le.FioTManager;

import java.util.List;

public interface DeviceInterface {
    byte[] getData(FioTManager fioTManager, FioTBluetoothCharacteristic bluetoothCharacteristic);
    void setData(FioTManager fioTManager, FioTBluetoothCharacteristic bluetoothCharacteristic, byte[] data);
    List<FioTBluetoothCharacteristic> getAllCharacteristicDevice();
}
