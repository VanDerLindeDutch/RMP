package Converter.Factory;

import Converter.BaseConverter;
import Converter.ReaumurConverter;

public class ReaumurDialog extends Dialog {
    @Override
    public BaseConverter createConverter(double T) {
        return new ReaumurConverter(T);
    }
}
