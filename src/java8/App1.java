package java8;

/*
()-> {
            return 8;
        }
*/
/*
() -> 9      //for single line return in lambda
 */
interface Executable1 {
    int execute();
}

class Runner1 {
    public void run(Executable1 e) {
        System.out.println("Executing code block...");
        int value = e.execute();
        System.out.println("Return value is " + value);
    }
}

public class App1 {
    public static void main(String[] args) {
        Runner1 runner = new Runner1();
        runner.run(new Executable1() {
            @Override
            public int execute() {
                System.out.println("Hello there");
                return 7;
            }
        });
        System.out.println("==============");
        runner.run(() -> {
            return 8;
        });
        runner.run(() -> 9);
    }
}
