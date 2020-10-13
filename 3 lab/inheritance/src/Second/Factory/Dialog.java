package Second.Factory;

import Second.BaseConverter;

import java.util.Scanner;

public abstract class Dialog {
    public void makeConvertion(double T) {
        BaseConverter base = this.createConverter(T);
        System.out.println(base.convert());
    }

    protected abstract BaseConverter createConverter(double T);
}
