package web.model;

public class Car {
    private int Id;
    private String model;
    public String color;

    public Car() {
    }

    public Car(int id) {
        Id = id;
    }

    public Car(int id, String model, String color) {
        Id = id;
        this.model = model;
        this.color = color;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Id=" + Id +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
