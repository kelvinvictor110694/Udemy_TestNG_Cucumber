package Utils;

public class InterfaceChild implements InterfaceBase {


    @Override
    public void test1() {

    }

    @Override
    public void test3() {
        InterfaceBase.super.test3();
    }
}
