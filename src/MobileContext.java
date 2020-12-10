public class MobileContext {
    private State state;
    public MobileContext(){
        state=new Ringing();
    }

    public void setState(State state2) {
        state=state2;
    }
    public void alert()
    {
        state.alert();
    }
}
