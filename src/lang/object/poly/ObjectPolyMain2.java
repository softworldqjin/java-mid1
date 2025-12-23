package lang.object.poly;

public class ObjectPolyMain2 {
    public static void main(String[] args){
        Car car = new Car();
        Dog dog = new Dog();
        action(car);
        action(dog);

    }
    private static void action(Object object){  // Object는 모든 타입의 부모니까, 자식 클래스 모름
        if (object instanceof Car car){         // Car 클래스로 다운 캐스팅
            car.move();
        } else if (object instanceof Dog dog){  // Dog 클래스로 다운 캐스팅
            dog.move();
        }
    }
}
