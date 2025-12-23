package lang.object;

public class ObjectMain1 {
    public static void main(String[] args){
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString은 Object 클래스가 보유 중임.
        String str = child.toString();  // toString() 객체에 대한 정보를 반환
                                        // lang.object.Child@xxxx Child클래스의 인스턴스
        System.out.println(str);

        // 자바에서 모든 객체의 최종 부모는 Object이다.
        // Object는 모든 객체를 담을 수 있다.
    }
}
