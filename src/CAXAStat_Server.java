/**
 * Created by HuangBoyuan on 2015/7/31.
 */
public class CAXAStat_Server {
    public static void main(String[] args){
        System.out.println("HelloWorld");
        /**
         * 1. Init a queue to store the query result from memory database every second
         *  1.1 Init a monitor which monitor this queue to optimize this queue;
         *
         * 2. Start a thread ,which is used to query memory database every second, to push a device list into fifo
         *
         * 3. Start a thread to fetch minutes date stored in memory database, and trans into a perpetual database.
         *      And the trans behavior is triggered by time.
         *
         *
         */


    }
}
