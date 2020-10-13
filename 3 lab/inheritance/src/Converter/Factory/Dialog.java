package Converter.Factory;

import Converter.BaseConverter;

public abstract class Dialog {
    public void makeConvertion(double T) {
        BaseConverter base = this.createConverter(T);
        System.out.println(base.convert());
    }

    protected abstract BaseConverter createConverter(double T);
}
