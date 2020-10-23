import java.io.PrintStream;

public class NameThread implements Runnable {
    Name name;
    int num;

    public NameThread(Name name, int num) {
        this.name = name;
        this.num = num;
    }

    public void run() {
        synchronized(this.name) {
            for(int i = 0; i < 6; ++i) {
                PrintStream var10000 = System.out;
                String var10001 = this.name.getName();
                var10000.println(var10001 + this.num);
                this.name.notify();

                try {
                    this.name.wait();
                } catch (InterruptedException var5) {
                    var5.printStackTrace();
                }
            }

            this.name.notifyAll();
        }
    }
}
