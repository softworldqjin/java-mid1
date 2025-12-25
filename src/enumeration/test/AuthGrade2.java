package enumeration.test;

public enum AuthGrade2 {
    GUEST("손님", 1), LOGIN("로그인 회원", 2), ADMIN("관리자", 3);

    private final String user;
    private final int count;

    AuthGrade2(String user, int count){
        this.user = user;
        this.count = count;
    }

    public String getUser(){
        return user;
    }
    public int getCount(){
        return count;
    }


}
