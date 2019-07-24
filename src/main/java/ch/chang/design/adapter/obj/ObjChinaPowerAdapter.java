package ch.chang.design.adapter.obj;

import ch.chang.design.adapter.clazz.ChinaPower;
import ch.chang.design.adapter.clazz.PakistanPower;

public class ObjChinaPowerAdapter implements ChinaPower {
    private PakistanPower pakistanPower;

    public ObjChinaPowerAdapter(PakistanPower pakistanPower) {
        this.pakistanPower = pakistanPower;
    }

    public int getChinaPower() {
        int pakistanPower = this.pakistanPower.getPakistanPower();
        return pakistanPower*3;
    }
}
