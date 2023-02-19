package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

/**
 * packageName : hello.hellospring.repository
 * fileName : MemberRepository
 * author : hyuk
 * date : 2023/02/19
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023/02/19         hyuk          최초 생성
 */
public interface MemberRepository {
    Member save(Member member); // 저장소 저장
    Optional<Member> findById(Long id); // id로 찾기
    Optional<Member> findByName(String name); // name으로 찾기
    List<Member> findAll(); // 전체조회

//    void clearStore();
}
