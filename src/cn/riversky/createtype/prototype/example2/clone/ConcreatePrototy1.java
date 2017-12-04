package cn.riversky.createtype.prototype.example2.clone;

/**
 * Created by admin on 2017/11/30.
 */
public class ConcreatePrototy1  implements Prototype{
    @Override
    public Prototype clone()  {
        return new ConcreatePrototy1();
    }
}
