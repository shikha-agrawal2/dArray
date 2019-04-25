package multithreading.notifyOrNotifyAll;
//Notification to number of threads : We can use notify() method to give the notification for only one thread which is waiting for a particular object whereas
// by the help of notifyAll() methods we can give the notification to all waiting threads of a particular object.
class Geek4 extends Thread {
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

class Geek5 extends Thread {
    Geek4 geeks4;

    Geek5(Geek4 geeks4) {
        this.geeks4 = geeks4;
    }

    public void run() {
        synchronized (this.geeks4) {
            System.out.println
                    (Thread.currentThread().getName() + "...starts");

            try {
                this.geeks4.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println
                    (Thread.currentThread().getName() + "...notified");
        }
    }
}

class Geek6 extends Thread {
    Geek4 geeks4;

    Geek6(Geek4 geeks4) {
        this.geeks4 = geeks4;
    }

    public void run() {
        synchronized (this.geeks4) {
            System.out.println
                    (Thread.currentThread().getName() + "...starts");
            this.geeks4.notifyAll();
            System.out.println
                    (Thread.currentThread().getName() + "...notified");
        }
    }
}

class NotifyAllMainClass {
    public static void main(String[] args) throws InterruptedException {

        Geek4 geeks4 = new Geek4();
        Geek5 geeks5 = new Geek5(geeks4);
        Geek6 geeks6 = new Geek6(geeks4);
        Thread t1 = new Thread(geeks4, "Thread-1");
        Thread t2 = new Thread(geeks5, "Thread-2");
        Thread t3 = new Thread(geeks6, "Thread-3");
        t1.start();
        t2.start();
        Thread.sleep(100);
        t3.start();
    }
}