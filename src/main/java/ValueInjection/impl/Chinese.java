package ValueInjection.impl;

import ValueInjection.service.Axe;
import ValueInjection.service.Persion;

/**
 * Created by housh on 2017/2/22.
 */
public class Chinese implements Persion {
    private Axe axe;

    public void setAxe(Axe axe) {
        this.axe = axe;
    }

    public void useAxe() {
        System.out.println(axe.chop());
    }
}
