package com.CAXA.Stat.BasicEntity;

/**
 * Created by HuangBoyuan on 2015/7/31.
 */
public enum DeviceStatus {
    /**
     * �����豸����ʵ״̬
     * ��Ϊ�����͹ػ������ࡣ
     * ������Ϊ�ӹ�����������
     * �ڿ���ʱ����ʱ���ܳ��ֱ���
     * �ʰ��ն����ƣ���λ��ͷһλ��0,1���ֿ��ػ�
     * ����Ϊ0B 1000 000X;
     *      �ӹ� 0B 1000 0001 --129
     *      ���� 0B 1000 0010 --130
     *      ���� 0B 1001 0000 --144
     * �ػ�ΪOB 0000 000X;
     *      �ػ� OB 0000 0001 --1
     */
    Running,
    StandyBy,
    Warning,
    Shutdown

}
