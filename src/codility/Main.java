package codility;

import java.awt.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamField;

public class Main {
    private static final ObjectStreamField[] s = {new ObjectStreamField("br", Point.class), new ObjectStreamField("be", Dimension.class)};

    private Rectangle rect;

    private void readOb(ObjectInputStream o) throws ClassNotFoundException, IOException {
        //fields.

    }
}
