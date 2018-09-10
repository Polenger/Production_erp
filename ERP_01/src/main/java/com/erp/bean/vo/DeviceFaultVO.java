package com.erp.bean.vo;

import com.erp.bean.DeviceFault;

public class DeviceFaultVO extends DeviceFault {

    private String deviceName;

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public String toString() {
        return "DeviceFaultVO{" +
                "deviceName='" + deviceName + '\'' +
                '}';
    }
}
