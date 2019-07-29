package designing.builderDesignPattern;
/*First of all you need to create a static nested class and then copy all the arguments from the outer class to the Builder class. We should follow the naming convention and if the class name is Computer then builder class should be named as ComputerBuilder.
Java Builder class should have a public constructor with all the required attributes as parameters.
Java Builder class should have methods to set the optional parameters and it should return the same Builder object after setting the optional attribute.
The final step is to provide a build() method in the builder class that will return the Object needed by client program. For this we need to have a private constructor in the Class with Builder class as argument.
*/
public class Computer {

    //required parameters
    private String RAM;
    private String HDD;
    private String CPU;


    //optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    //private constructor
    private Computer(Builder builder) {
        this.HDD = builder.HDD;
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
    }

    public String getRAM() {
        return RAM;
    }
    public String getHDD() {
        return HDD;
    }
    public String getCPU() {
        return CPU;
    }
    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }
    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }
//static nested class so that builder object is created by Outerclass.Builder
    public static class Builder{
        //required parameters
        private String RAM;
        private String HDD;
        private String CPU;


        //optional parameters
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public Builder(String ram, String hdd, String cpu) {
            this.RAM = ram;
            this.HDD = hdd;
            this.CPU = cpu;
        }

        public Builder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public Builder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

}
