package Second.Factory;

import Second.BaseConverter;
import Second.KelvinConverter;

public class KelvinDialog extends Dialog{
    @Override
    public BaseConverter createConverter(double T) {
        return new KelvinConverter(T);
    }
}
