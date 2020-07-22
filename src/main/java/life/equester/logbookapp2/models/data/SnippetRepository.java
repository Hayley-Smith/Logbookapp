package life.equester.logbookapp2.models.data;

import life.equester.logbookapp2.models.Snippet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;



@Repository
public interface SnippetRepository extends CrudRepository<Snippet, Integer> {
    List<Snippet> findByTimeStampBetween(Date start, Date end);
}
