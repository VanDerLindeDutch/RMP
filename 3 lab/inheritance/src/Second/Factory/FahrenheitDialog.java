package Second.Factory;

import Second.BaseConverter;
import Second.FahrenheitConverter;

public class FahrenheitDialog extends Dialog
{
    @Override
    public BaseConverter createConverter(double T) {
        return new FahrenheitConverter(T);
    }
}
