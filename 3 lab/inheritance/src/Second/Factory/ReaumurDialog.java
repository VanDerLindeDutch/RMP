package Second.Factory;

import Second.BaseConverter;
import Second.ReaumurConverter;

public class ReaumurDialog extends Dialog{
    @Override
    public BaseConverter createConverter(double T) {
        return new ReaumurConverter(T);
    }
}
