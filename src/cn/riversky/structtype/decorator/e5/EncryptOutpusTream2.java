package cn.riversky.structtype.decorator.e5;

import cn.riversky.structtype.decorator.io.QEncodeUtils;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 使用继承装饰类的方式进行加密装饰
 * @author Created by admin on 2017/12/13.
 */
public class EncryptOutpusTream2 extends FilterOutputStream {
    /**
     * Creates an output stream filter built on top of the specified
     * underlying output stream.
     *
     * @param out the underlying output stream to be assigned to
     *            the field <tt>this.out</tt> for later use, or
     *            <code>null</code> if this instance is to be
     *            created without an underlying stream.
     */
    public EncryptOutpusTream2(OutputStream out) {
        super(out);
    }

    /**
     * 实现同样的效果
     * @param b
     * @throws IOException
     */
    @Override
    public void write(int b) throws IOException {
     super.write(QEncodeUtils.charNextTwo(b));
    }
}
