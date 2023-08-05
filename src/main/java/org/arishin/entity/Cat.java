package org.arishin.entity;

import java.util.Objects;

public class Cat extends Animals{
    private String ownerName;

    public Cat() {
    }

    public Cat(boolean flag ){
        super(flag);
    }

    public Cat(double weight, String name, String ownerName) {
        super(weight, name);
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getOwnerName(), cat.getOwnerName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getOwnerName());
    }

    @Override
    public String toString() {
        return "Cat{" +
                "ownerName='" + ownerName + '\'' +
                "} " + super.toString();
    }
}
