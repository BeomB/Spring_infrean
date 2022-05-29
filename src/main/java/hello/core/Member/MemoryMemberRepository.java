package hello.core.Member;

import java.util.HashMap;

public class MemoryMemberRepository implements MemberRepository {               //MemoryMemberRepository는 MemberRepository를 구현한다.

    private static HashMap<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member memeber) {
        store.put(memeber.getId(), memeber);
    }

    @Override
    public Member findById(Long id) {
        return store.get(id);
    }
}
