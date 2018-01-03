package cn.riversky.yanmo.structtype.decorator.e5;

import cn.riversky.yanmo.structtype.decorator.io.QEncodeUtils;

import java.io.IOException;
import java.io.InputStream;

/**
 * 实现输出流的加密
 * @author Created by admin on 2017//13.
 */
public class DencryptInputStream extends InputStream {

    private InputStream in=null;

    public DencryptInputStream(InputStream in) {
        this.in = in;
    }

    /**
     * 解密（其实就是码值前移两位）
     *
     * @throws IOException
     */
    @Override
    public int read() throws IOException {

        return QEncodeUtils.charLastTwo(in.read());
    }
}
