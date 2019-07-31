package java8;
/*
() -> System.out.println("Hello there")
*/
/*
()-> {
            System.out.println("Hello");
            System.out.println("Multiline Hello!!");
        }
*/

interface Executable{
    void execute();
}
class Runner{
    public void run(Executable e){
        System.out.println("Executing code block...");
        e.execute();
    }
}
public class App {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("Hello there");
            }
        });
        System.out.println("==============");
        runner.run(() -> System.out.println("Hello there")); //Lambda Expressions
        runner.run(()-> {
            System.out.println("Hello");
            System.out.println("Multiline Hello!!");
        });
    }
}
