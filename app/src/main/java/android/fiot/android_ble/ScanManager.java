package android.fiot.android_ble;

import android.fiot.android_ble.interfaces.ScanInterface;
import android.os.ParcelUuid;

import com.bluetooth.le.FioTBluetoothDevice;
import com.bluetooth.le.FioTScanManager;
import com.bluetooth.le.scanner.ScanFilter;
import com.bluetooth.le.scanner.ScanResult;

import java.util.ArrayList;
import java.util.List;

public class ScanManager implements ScanInterface{
    private FioTScanManager scanManager;


    @Override
    public List<FioTBluetoothDevice> startScan(String SERVICE_UUID) {
        scanManager = new FioTScanManager();
        List<ScanFilter> filters = new ArrayList<>();
        final List<FioTBluetoothDevice> devicesList = new ArrayList<>();
        filters.add(new ScanFilter.Builder().setServiceUuid(ParcelUuid.fromString(SERVICE_UUID)).build());
        try {
            scanManager.start(filters, null, new FioTScanManager.ScanManagerListener() {
                @Override
                public void onFoundDevice(final FioTBluetoothDevice device, ScanResult result) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            if (contains(devicesList, device.getBluetoothDevice().getAddress()) == false) {
                                devicesList.add(device);
                            }
                        }
                    });
                }

                @Override
                public void onScanFailed(int errorCode) {

                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void stopScan() {
        scanManager.stop();
    }
    boolean contains(List<FioTBluetoothDevice> list, String add) {
        for (FioTBluetoothDevice item : list) {
            if (item.getBluetoothDevice().getAddress().equals(add)) {
                return true;
            }
        }
        return false;
    }
}
