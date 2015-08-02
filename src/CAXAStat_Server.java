/**
 * Created by HuangBoyuan on 2015/7/31.
 */
public class CAXAStat_Server {
    public static void main(String[] args){
        System.out.println("HelloWorld");
        /**
         * 1. Init a queue,called fifo queue ,to store the query result from memory database every second
         *    Init a list ,called DeviceStateList,to store the real time state of devices.
         *    Init a list ,called DeviceOperationList. to store the effective operation of devices.
         *  1.1 Init a monitor which monitor this fifo queue to optimize and manage this queue;
         *  1.2 Init a monitor which monitor this DeviceStateList to optimize and manage this list;
         *  1.3 Init a monitor which monitor this DeviceOperationList to optimize and manage this list;
         *
         * 2. Start a thread ,which is used to query memory database every second, to push a device list into fifo queue
         *
         * 3. Start a thread to fetch date stored in memory database in minutes, and trans into a perpetual database.
         *      And the trans behavior is triggered by time.
         *
         * 4. Start a thread to fetch the data stored in the queue one by one ,then deal this data and maintain the DeviceStateList
         *    and use this date to maintain the DeviceOperationList.If necessary, make a insert SQL and put it into database.
         *
         * 5.
         *
         */


    }
}
