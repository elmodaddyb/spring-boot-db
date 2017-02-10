package srcdevbin.spring.db;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Profile({"mysql"})
public interface JpaSessionRepository extends JpaRepository<SessionData, String> {
}
