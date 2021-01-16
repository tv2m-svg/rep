
package task41;


public class LiftOff implements Runnable{
    private int countDown;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }
    
    public String status(){
        return "#" + id + "(" + (countDown > 0?countDown:"LiftOff!")+"), ";
    }

    @Override
    public void run() {
        while (countDown>0) {
            countDown--;
            System.out.print(status());
            Thread.yield();            
        }
    }
}
