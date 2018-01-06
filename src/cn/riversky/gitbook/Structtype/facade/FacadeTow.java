package cn.riversky.gitbook.Structtype.facade;

import java.io.IOException;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/5.
 */
public class FacadeTow extends FacadeAbstract {
    private ReadFile reader;
    private WriteFile writer;
    private NewChipherMathine machine;

    public FacadeTow() {
        this.reader = new ReadFile();
        this.writer = new WriteFile();
        this.machine = new NewChipherMathine();
    }

    @Override
    void fileEncrypy(String src, String dst) throws IOException {
        writer.write(dst,machine.encrypt(reader.read(src)));
    }
}
