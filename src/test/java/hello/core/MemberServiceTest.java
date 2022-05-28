package hello.core;

import hello.core.Member.Grade;
import hello.core.Member.Member;
import hello.core.Member.MemberService;
import hello.core.Member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void Join()
    {

        //given
        Member newMember1 = new Member(1L,"이범기", Grade.BASIC);
        Member newMember2 = new Member(2L,"차승윤", Grade.VIP);

        ///when
        memberService.join(newMember1);
        memberService.join(newMember2);

        Member findMember1 = memberService.findMember(1L);
        Member findMember2 = memberService.findMember(2L);

        //then
        Assertions.assertThat(newMember1).isEqualTo(findMember1);
        Assertions.assertThat(newMember2).isEqualTo(findMember2);

    }

}
