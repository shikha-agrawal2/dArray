package designing.factoryDesignPattern.beans;
//https://github.com/journaldev/journaldev/blob/master/java-design-patterns/Factory-Design-Pattern/src/com/journaldev/test/ComputerClient.java
//https://www.journaldev.com/1392/factory-design-pattern-in-java
//builder pattern- https://www.journaldev.com/996/java-inner-class
//A static class object can be created with the following statement.
//        OuterClass.StaticNestedClass nestedObject =
//        new OuterClass.StaticNestedClass();
public class PC implements Computer {

    private String RAM;
    private String HDD;
    private String CPU;

    public PC(String ram, String hdd, String cpu) {
        this.RAM = ram;
        this.HDD = hdd;
        this.CPU = cpu;
    }

    @Override
    public String getRAM() {
        return this.RAM;
    }

    @Override
    public String getHDD() {
        return this.HDD;
    }

    @Override
    public String getCPU() {
        return this.CPU;
    }
}
