package codility;

public class ExampleGenerics<E> {
    E a;

    public <E> void printme(E e){
        System.out.println(e.getClass().getName());
    }

    public static void main(String[] args) {
        ExampleGenerics<ExampleGenerics> b = new ExampleGenerics<ExampleGenerics>();
        b.printme("Hello");
    }
}

