package hello.core.Member;

public interface MemberRepository {             ///MemberRepository 인터페이스 설정 -> 인터페이스는 로드맵 역할을 한다.

    void save(Member memeber);

    Member findById(Long id);



}
