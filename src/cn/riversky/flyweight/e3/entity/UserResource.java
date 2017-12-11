package cn.riversky.flyweight.e3.entity;

/**
 * Created by admin on 2017/12/11.
 */
public class UserResource {
    private String name;
    private String model;
    private String power;

    public UserResource() {
    }

    public UserResource(String name, String model, String power) {
        this.name = name;
        this.model = model;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "UserResource{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", power='" + power + '\'' +
                '}';
    }
}
