package android.fiot.android_ble.interfaces;

import com.bluetooth.le.FioTBluetoothDevice;

import java.util.List;

public interface ScanInterface {
    public List<FioTBluetoothDevice> startScan(String SERVICE_UUID);
    public void stopScan();
}
