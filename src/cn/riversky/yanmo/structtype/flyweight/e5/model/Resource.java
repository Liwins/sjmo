package cn.riversky.yanmo.structtype.flyweight.e5.model;

/**
 * Created by admin on 2017/12/11.
 */
public class Resource {
    private String mode;
    private String permission;

    public Resource() {
    }

    public Resource(String mode, String permission) {
        this.mode = mode;
        this.permission = permission;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "mode='" + mode + '\'' +
                ", permission='" + permission + '\'' +
                '}';
    }
}
