package com.CAXA.Stat.BasicEntity;

/**
 * Created by HuangBoyuan on 2015/7/31.
 */
public enum DeviceStatus {
    /**
     * 描述设备的现实状态
     * 分为开机和关机两大类。
     * 开机分为加工，待机两类
     * 在开机时，随时可能出现报警
     * 故按照二进制，八位，头一位以0,1区分开关机
     * 开机为0B 1000 000X;
     *      加工 0B 1000 0001 --129
     *      待机 0B 1000 0010 --130
     *      报警 0B 1001 0000 --144
     * 关机为OB 0000 000X;
     *      关机 OB 0000 0001 --1
     */
    Running,
    StandyBy,
    Warning,
    Shutdown

}
