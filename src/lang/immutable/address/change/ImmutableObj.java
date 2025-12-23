package lang.immutable.address.change;

public class ImmutableObj {
    private final int value;

    public ImmutableObj(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public ImmutableObj add(int addNum){
        int result = value + addNum;
        return new ImmutableObj(result);
    }

    @Override
    public String toString() {
        return "ImmutableObj{" +
                "value=" + value +
                '}';
    }
}
