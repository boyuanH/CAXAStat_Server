package com.CAXA.Stat.BasicEntity;

/**
 * Created by HuangBoyuan on 2015/7/30.
 */
public class DeviceInfo {
    public String get_deviceID() {
        return _deviceID;
    }

    private String _deviceID;

    public String get_deviceName() {
        return _deviceName;
    }

    private String _deviceName;

    private DeviceType _deviceType;

    public DeviceType get_deviceType() {
        return _deviceType;
    }

    public String get_ipAddr() {
        return _ipAddr;
    }

    public void set_ipAddr(String _ipAddr) {
        this._ipAddr = _ipAddr;
    }

    private String _ipAddr;


    public DeviceInfo(){

    }

    public DeviceInfo(String deviceID,String deviceName){
        _deviceID = deviceID;
        _deviceName = deviceName;
    }

    public DeviceInfo(String deviceID,String deviceName,DeviceType devicetype){
        _deviceID = deviceID;
        _deviceName = deviceName;
        _deviceType = devicetype;
    }

    public DeviceInfo(String deviceID,String deviceName,DeviceType devicetype,String ipAddr){
        _deviceID = deviceID;
        _deviceName = deviceName;
        _deviceType = devicetype;
        _ipAddr = ipAddr;
    }
}
