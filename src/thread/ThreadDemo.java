package thread;

class ThreadByInheritance extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.print(0);
        }
    }
}
class ThreadByImplement implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.print(1);
        }
    }
}

class ThreadEx01 implements Runnable {
    @Override
    public void run() {

    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        // 상속으로 구현
        ThreadByInheritance thread1 = new ThreadByInheritance();


        // 인터페이스로 구현
        Runnable r = new ThreadByImplement();
        //생성자: Thread(Runnable target)
        Thread thread2 =new Thread(r);

        Thread t1 = Thread.currentThread();
        System.out.println("currentThread = " + t1);

        Thread t2 = new Thread((new ThreadEx01()));
        System.out.println("newThread = " + t2);

        thread1.start();
        thread2.start();

        /*
        *   결과값을 보면 0과 1이 뒤섞여 잇는 것을 볼 수 있는데
        *   이것을 보면 각 쓰레드가 번갈아가면서 수행된 것이다.
        *   쓰레드는 OS의 스케쥴링에 따라 작업 시간을 할당받고 다른 쓰레드와 번갈아가면서 작업을 수행한다.
        *   아주 빠른 속도로 작업을 번갈아가면서 수행하기 때문에 동시에 실행되는 것 같은 효과를 볼 수 있다.
        * */
    }
}
