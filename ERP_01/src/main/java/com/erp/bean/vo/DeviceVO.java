package com.erp.bean.vo;

import com.erp.bean.Device;

/**
 * 前端需要的数据，单表没有的情况。
 * 构建一个VO,来进行查询
 */
public class DeviceVO extends Device {

    //
    private String deviceTypeName;

    private String deviceKeeper;

    public String getDeviceTypeName() {
        return deviceTypeName;
    }

    public void setDeviceTypeName(String deviceTypeName) {
        this.deviceTypeName = deviceTypeName;
    }

    public String getDeviceKeeper() {
        return deviceKeeper;
    }

    public void setDeviceKeeper(String deviceKeeper) {
        this.deviceKeeper = deviceKeeper;
    }

    @Override
    public String toString() {
        return "DeviceVO{" +
                "deviceTypeName='" + deviceTypeName + '\'' +
                ", deviceKeeper='" + deviceKeeper + '\'' +
                '}';
    }

}
