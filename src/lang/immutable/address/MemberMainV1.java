package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args){

        Address address = new Address("서울");

        MemberV1 member1 = new MemberV1("회원1", address);
        MemberV1 member2 = new MemberV1("회원2", address);

        System.out.println(member1.getAddress());
        System.out.println(member2.getAddress());

        // 회원2 주소를 부산으로 변경

        member2.getAddress().setValue("부산");

        System.out.println(member1.getAddress());
        System.out.println(member2.getAddress());  // address.toString()
                                                   // Address 클래스에 오버라이딩된 toString()호출
        // 불변 객체.. 객체 상태 변함X
        ImmutableAddress immutableAddress = new ImmutableAddress("경기도");
        MemberV2 memberA = new MemberV2("회원A", immutableAddress);
        MemberV2 memberB = new MemberV2("회원B", immutableAddress);
        System.out.println(memberA.getImmutableAddress());
        System.out.println(memberA.getImmutableAddress());

        // 회원B 주소를 인천으로 변경
        ImmutableAddress immutableAddress1 = new ImmutableAddress("인천");
        memberB.setImmutableAddress(immutableAddress1);
        System.out.println(memberB.getImmutableAddress());


    }

}
