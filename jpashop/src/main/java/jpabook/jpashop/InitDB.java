package jpabook.jpashop;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import jpabook.jpashop.domain.Member;
import jpabook.jpashop.domain.item.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class InitDB {

    private final InitService initService;

    @PostConstruct
    public void init() {
        initService.dbInit1();
    }

    @Component
    @Transactional
    @RequiredArgsConstructor
    static class InitService {
        private final EntityManager em;
        public void dbInit1() {
            Member member = new Member();
            member.setName("a");
            em.persist(member);

            Book book1 = new Book();
            book1.setName("jpa");
            Book book2 = new Book();
            book2.setName("jpa");
            em.persist(book1);
            em.persist(book2);
            

        }
    }

}
