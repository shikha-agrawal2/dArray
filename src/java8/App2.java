package java8;


interface Executable2 {
    int execute(int a);
}

class Runner2 {
    public void run(Executable2 e) {
        System.out.println("Executing code block...");
        int value = e.execute(12);
        System.out.println("Return value is " + value);
    }
}

public class App2  {
    public static void main(String[] args) {
        Runner2 runner = new Runner2();
        runner.run(new Executable2() {
            @Override
            public int execute(int a) {
                System.out.println("Hello there");
                return 7+a;
            }
        });
        System.out.println("==============");
        runner.run((int a) -> {
            return 8;
        });
        runner.run((int a) -> 9);
    }
}
