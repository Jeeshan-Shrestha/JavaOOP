package TimerAndTImerTask;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class main {
    public static void main(String[] args)
    {
        //Timer and timerTasks

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int counter = 0;
            @Override
            public void run() {
                System.out.println("hello world");
                counter++;
                if (counter >= 10)
                {
                    timer.cancel();
                }
            }

        };
        timer.schedule(task,1000,1000);
    }

}
