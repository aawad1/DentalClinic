package ba.unsa.etf.rpr.domain;

import java.util.Objects;

public class Treatment implements Idable {
    private int id;
    private String name;
    private String description;
    private Double cost;

    //Constructors

    public Treatment(int id, String name, String description, Double cost) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.cost = cost;
    }
    public Treatment() {}

    //Getters and Setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Treatment treatment = (Treatment) o;
        return id == treatment.id && Double.compare(treatment.cost, cost) == 0 && Objects.equals(name, treatment.name) && Objects.equals(description, treatment.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, cost);
    }

    @Override
    public String toString() {
        return "Treatment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", cost=" + cost +
                '}';
    }
}

