package remindme_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import remindme_server.entity.Remind;

public interface RemindRepository extends JpaRepository<Remind, Long> {

}
