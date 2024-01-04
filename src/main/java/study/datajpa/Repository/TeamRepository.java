package study.datajpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.datajpa.Entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {

}
