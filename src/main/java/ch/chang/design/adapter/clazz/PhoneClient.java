package ch.chang.design.adapter.clazz;

public class PhoneClient {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.power(new ChinaPowerAdapter());
    }
}
