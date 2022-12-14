package io.codelex.oop.practice.exercise7and8;

import java.util.Objects;

public class Computer {
    private String processor;
    private String ram;
    private String graphicsCard;
    private String company;
    private String model;

    public Computer(String processor, String ram, String graphicsCard, String company, String model) {
        this.processor = processor;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.company = company;
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer{" + "processor='" + processor + '\'' + ", ram='" + ram + '\'' + ", graphicsCard='" +
                graphicsCard + '\'' + ", company='" + company + '\'' + ", model='" + model + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Computer computer)) {
            return false;
        }
        return Objects.equals(getProcessor(), computer.getProcessor()) && Objects.equals(getRam(), computer.getRam()) &&
                Objects.equals(getGraphicsCard(), computer.getGraphicsCard()) &&
                Objects.equals(getCompany(), computer.getCompany()) && Objects.equals(getModel(), computer.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProcessor(), getRam(), getGraphicsCard(), getCompany(), getModel());
    }
}
