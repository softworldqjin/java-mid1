package lang.object.toString;

public class ToStringMain5 {
    public static void main(String[] args){
        Car car = new Car("k3");
        Dog dog = new Dog("maru", 3);

        String string = dog.toString();
        System.out.println(string);

        String string1 = car.toString();
        System.out.println(string1);

        System.out.println();

        // println 내부에서 toString호출
        System.out.println(car);    // car.toString() 호출됨
        System.out.println(dog);    // dog.toString() 호출됨

        System.out.println();

        // ObjectPrinter 클래스의 static 메서드 호출
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog);

        String refValue = Integer.toHexString(System.identityHashCode(dog));
        System.out.println(refValue);

        String refValue2 = Integer.toHexString(System.identityHashCode(car));
        System.out.println(refValue2);
    }
}
