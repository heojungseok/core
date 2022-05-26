package hello.core.singletone;

public class SingletoneService {
    //1. static 영역에 객체를 딱 1개만 생성
    private static final SingletoneService instance = new SingletoneService(); //static은 클래스 레벨에 올라가기에 하나만 존재
    //2. public 으로 열어서 객체 인스턴스가 필요하다면 아래 static 메서드를 통해서만 조회하도록 허용
    public static SingletoneService getInstance(){
        return instance;
    }
    //3. 생성자 private으로 선언해서 외부에서 new 키워드로 사용한 객체 생성 안됨
    private SingletoneService(){
    }
    public void  logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
}
