package study.datajpa.Repository;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import study.datajpa.Entity.Member;

import java.util.List;

@RequiredArgsConstructor
public class MemberRepositoryImpl implements  MemberRepositoryCustom{

    private final EntityManager em;

    @Override
    public List<Member> findMemberCustom() {
        return em.createQuery(
                "select m from Member m",Member.class)
                .getResultList();
    }
}
