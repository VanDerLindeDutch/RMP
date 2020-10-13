package Converter.Factory;

import Converter.BaseConverter;
import Converter.KelvinConverter;

public class KelvinDialog extends Dialog {
    @Override
    public BaseConverter createConverter(double T) {
        return new KelvinConverter(T);
    }
}
