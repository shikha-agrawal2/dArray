package coreJava;

import java.util.Objects;

public class PassByValuePojo {
    int a;

    public PassByValuePojo(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassByValuePojo that = (PassByValuePojo) o;
        return a == that.a;
    }

    @Override
    public int hashCode() {

        return Objects.hash(a);
    }
}
