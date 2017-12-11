package cn.riversky.flyweight.e4.model;

/**
 * Created by admin on 2017/12/11.
 */
public class UserResource {
    private String name;
    private String model;
    private String power;
    private String role;
    public UserResource() {
    }

    public UserResource(String name, String model, String power) {
        this.name = name;
        this.model = model;
        this.power = power;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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
