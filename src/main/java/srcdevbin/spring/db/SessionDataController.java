package srcdevbin.spring.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sessions")
public class SessionDataController {
	
    private CrudRepository<SessionData, String> repository;

    @Autowired
    public SessionDataController(CrudRepository<SessionData, String> repository) {
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<SessionData> sessions() {
        return repository.findAll();
    }
}
