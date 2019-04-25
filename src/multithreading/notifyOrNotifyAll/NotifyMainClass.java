package multithreading.notifyOrNotifyAll;
//Notification to number of threads : We can use notify() method to give the notification for only one thread which is waiting for a particular object whereas
// by the help of notifyAll() methods we can give the notification to all waiting threads of a particular object.
class Geek1 extends Thread {
    public void run() {
        synchronized (this) {
            System.out.println
                    (Thread.currentThread().getName() + "...starts");
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println
                    (Thread.currentThread().getName() + "...notified");
        }
    }
}

class Geek2 extends Thread {
    Geek1 geeks1;

    Geek2(Geek1 geeks1) {
        this.geeks1 = geeks1;
    }

    public void run() {
        synchronized (this.geeks1) {
            System.out.println
                    (Thread.currentThread().getName() + "...starts");

            try {
                this.geeks1.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println
                    (Thread.currentThread().getName() + "...notified");
        }
    }
}

class Geek3 extends Thread {
    Geek1 geeks1;

    Geek3(Geek1 geeks1) {
        this.geeks1 = geeks1;
    }

    public void run() {
        synchronized (this.geeks1) {
            System.out.println
                    (Thread.currentThread().getName() + "...starts");
            this.geeks1.notify();
            System.out.println
                    (Thread.currentThread().getName() + "...notified");
        }
    }
}

class NotifyMainClass {
    public static void main(String[] args) throws InterruptedException {

        Geek1 geeks1 = new Geek1();
        Geek2 geeks2 = new Geek2(geeks1);
        Geek3 geeks3 = new Geek3(geeks1);
        Thread t1 = new Thread(geeks1, "Thread-1");
        Thread t2 = new Thread(geeks2, "Thread-2");
        Thread t3 = new Thread(geeks3, "Thread-3");
        t1.start();
        t2.start();
        Thread.sleep(100);
        t3.start();
    }
}