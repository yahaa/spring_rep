package com.zihua.spring_test.outputImplement;

/**
 * Created by zihua on 16-12-26.
 */
public class Outputer {
    private OutputGe outputGe;

    public OutputGe getOutputGe() {
        return outputGe;
    }

    public void setOutputGe(OutputGe outputGe) {
        this.outputGe = outputGe;
    }

    public void output(Object o){
        outputGe.output(o);
    }
}
