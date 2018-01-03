package cn.riversky.yanmo.createtype.prototype.example2.clone;

/**
 * Created by admin on 2017/11/30.
 */
public class ConcreatePrototy2 implements Prototype {
    @Override
    public Prototype clone() {
        return new ConcreatePrototy2();
    }
}
