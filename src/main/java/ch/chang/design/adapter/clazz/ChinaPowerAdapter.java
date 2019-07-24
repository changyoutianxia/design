package ch.chang.design.adapter.clazz;

public class ChinaPowerAdapter   extends PakistanPower implements ChinaPower  {
    public int getChinaPower() {
        int pakistanPower = getPakistanPower();
        int chinaPower = pakistanPower * 2;
        return chinaPower;
    }
}
