package hello.core;

import hello.core.Member.Grade;
import hello.core.Member.Member;
import hello.core.Member.MemberService;
import hello.core.Member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();
        // 서비스를 구현 => 이 부분에서 memberService라는 추상화와 MemeberServiceImPl() 이라는 구현에 의존
        MemberService memberService = appConfig.memberService();

        Member newMember1 = new Member(1L, "이범기", Grade.BASIC);
        Member newMember2 = new Member(2L, "차승윤", Grade.VIP);

        memberService.join(newMember1);
        memberService.join(newMember2);

        Member findMember1 = memberService.findMember(1L);
        Member findMember2 = memberService.findMember(2L);

        System.out.println("newMember1 = " + newMember1.getName());
        System.out.println("newMember2 = " + newMember2.getName());
        System.out.println("findMember1 = " + findMember1.getName());
        System.out.println("findMember2 = " + findMember2.getName());

    }


}
