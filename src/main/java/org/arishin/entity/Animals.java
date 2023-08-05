package org.arishin.entity;

import java.util.Objects;

public abstract class Animals {
    private double weight;
    private String name;
    private boolean flag;

    public Animals() {

    }

    public Animals(boolean flag) {
        this.flag = flag;
    }

    public Animals(double weight, boolean flag) {
        this.weight = weight;
        this.flag = flag;
    }

    public Animals(double weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animals animals)) return false;
        return Double.compare(getWeight(), animals.getWeight()) == 0 && isFlag() == animals.isFlag() && Objects.equals(getName(), animals.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWeight(), getName(), isFlag());
    }

    @Override
    public String toString() {
        return "Animals{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", flag=" + flag +
                '}';
    }
}
