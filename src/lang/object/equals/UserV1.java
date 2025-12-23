package lang.object.equals;

import java.util.Objects;

public class UserV1 {
    private String id;

    public UserV1(String id){
        this.id = id;
    }
//    @Override
//    public boolean equals(Object obj){
//        UserV1 userV1 = (UserV1) obj;
//        return this.id.equals(userV1.id);
        // 모든 클래스의 부모 Object
        // 의 자식 클래스인 String
        // 문자열.equals(문자열) --> String클래스 안에있는 eqauls() 호출
        // 아니면 Object 클래스 안에있는 eqauls() 호출

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        UserV1 userV1 = (UserV1) object;
        return Objects.equals(id, userV1.id);
    }


}
