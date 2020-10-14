package Factory;

import Converter.BaseConverter;
import Converter.FahrenheitConverter;

public class FahrenheitDialog extends Dialog {
    @Override
    public BaseConverter createConverter(double T) {
        return new FahrenheitConverter(T);
    }
}
