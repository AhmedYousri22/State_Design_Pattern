public class Test {
    public static void main(String[] args) {
        MobileContext mobileContext=new MobileContext();
        mobileContext.alert();
        mobileContext.setState(new Silent());
    mobileContext.alert();
    }
}
