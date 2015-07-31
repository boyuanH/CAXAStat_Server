package com.CAXA.Stat.BasicEntity;

import java.util.Date;

/**
 * Created by HuangBoyuan on 2015/7/30.
 * 用以描述写入数据库中的每条信息
 */
public class DeviceOperationData {
    private DeviceInfo _deviceInfo;
    private DeviceStatus _deviceStatus;
    private Date _startTime;
    private Date _endTime;
    private String _para1;
    private String _para2;
    private String _para3;

    public DeviceInfo get_deviceInfo() {
        return _deviceInfo;
    }

    public void set_deviceInfo(DeviceInfo _deviceInfo) {
        this._deviceInfo = _deviceInfo;
    }

    public DeviceStatus get_deviceStatus() {
        return _deviceStatus;
    }

    public void set_deviceStatus(DeviceStatus _deviceStatus) {
        this._deviceStatus = _deviceStatus;
    }

    public Date get_startTime() {
        return _startTime;
    }

    public void set_startTime(Date _startTime) {
        this._startTime = _startTime;
    }

    public Date get_endTime() {
        return _endTime;
    }

    public void set_endTime(Date _endTime) {
        this._endTime = _endTime;
    }

    public String get_para1() {
        return _para1;
    }

    public void set_para1(String _para1) {
        this._para1 = _para1;
    }

    public String get_para2() {
        return _para2;
    }

    public void set_para2(String _para2) {
        this._para2 = _para2;
    }

    public String get_para3() {
        return _para3;
    }

    public void set_para3(String _para3) {
        this._para3 = _para3;
    }

    public DeviceOperationData(){

    }

    public DeviceOperationData(DeviceInfo deviceInfo,DeviceStatus deviceStatus,Date startTime,Date endTime,String para1,String para2,String para3){
        this._deviceInfo    = deviceInfo;
        this._deviceStatus  = deviceStatus;
        this._startTime     = startTime;
        this._endTime       = endTime;
        this._para1         = para1;
        this._para2         = para2;
        this._para3         = para3;
    }
}
