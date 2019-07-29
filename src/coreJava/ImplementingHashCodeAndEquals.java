package coreJava;

import java.util.Objects;
//https://www.baeldung.com/java-hashcode
public class ImplementingHashCodeAndEquals {
    int id;
    String firstName;
    String lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImplementingHashCodeAndEquals that = (ImplementingHashCodeAndEquals) o;
        return Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {

        //return Objects.hash(firstName, lastName); // In java 7
        int result = 1;

        int prime = 31;
        result = prime * result + (int) id;
        result = prime * result + (firstName == null ? 0 : firstName.hashCode());
        result = prime * result + (lastName==null ? 0 : lastName.hashCode());

        return result;
    }
}
