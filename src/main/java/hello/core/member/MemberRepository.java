package hello.core.member;

public interface MemberRepository {

    void save(Member member); //회원 저장

    Member findBy(Long memberid); //회원의 Id로 회원 찾는 기능
}
