package org.arishin.entity;

import java.util.Objects;

public class Dog extends Animals{

    private String address;

    public Dog() {
        super();
    }

    public Dog(boolean flag) {
        super(flag);
    }

    public Dog(double weight, String name, String address) {
        super(weight, name);
        this.address = address;

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "address='" + address + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog dog)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getAddress(), dog.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getAddress());
    }
}
