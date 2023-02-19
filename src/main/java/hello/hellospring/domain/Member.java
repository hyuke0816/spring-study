package hello.hellospring.domain;

import jakarta.persistence.*;

/**
 * packageName : hello.hellospring.domain
 * fileName : Member
 * author : hyuk
 * date : 2023/02/19
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023/02/19         hyuk          최초 생성
 */

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 시스템이 저장하는 id

    private String name; // 이름

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
