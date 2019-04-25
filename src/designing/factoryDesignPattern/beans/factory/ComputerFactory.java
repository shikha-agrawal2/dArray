package designing.factoryDesignPattern.beans.factory;

import designing.factoryDesignPattern.beans.Computer;
import designing.factoryDesignPattern.beans.PC;
import designing.factoryDesignPattern.beans.Server;

public class ComputerFactory {

    public static Computer createComputer(ComputerType type, String ram, String hdd, String cpu) {

        Computer comp = null;
        switch (type) {
            case PC:
                comp = new PC(ram, hdd, cpu);
                break;
            case SERVER:
                comp = new Server(ram, hdd, cpu);
                break;
        }

        return comp;
    }
}
