package android.fiot.android_ble;

import android.fiot.android_ble.interfaces.DeviceInterface;

import com.bluetooth.le.FioTBluetoothCharacteristic;
import com.bluetooth.le.FioTManager;
import com.bluetooth.le.FioTScanManager;
import com.bluetooth.le.exception.CharacteristicNotFound;

import java.util.List;

public class BluetoothController implements DeviceInterface {
    private FioTManager manager;
    private FioTScanManager scanManager;

    @Override
    public byte[] getData(FioTManager fioTManager, FioTBluetoothCharacteristic bluetoothCharacteristic) {
        fioTManager.read(bluetoothCharacteristic.getUuid());
        return new byte[0];
    }

    @Override
    public void setData(FioTManager fioTManager, FioTBluetoothCharacteristic  fioTBluetoothCharacteristic, byte[] data) {
        try {
            fioTManager.writeWithQueue(fioTBluetoothCharacteristic.getUuid(), data);
        } catch (CharacteristicNotFound characteristicNotFound) {
            characteristicNotFound.printStackTrace();
        }
    }

    @Override
    public List<FioTBluetoothCharacteristic> getAllCharacteristicDevice() {
        return null;
    }
}
