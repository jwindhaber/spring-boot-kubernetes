package easytax.kubernetes.example.simplewebpostgres;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author juergen.windhaber
 * @since 18.0.0
 */
@RestController
public class SimpleControllerPostgres {

    private SimpleRepository simpleRepository;

    public SimpleControllerPostgres(SimpleRepository simpleRepository) {
        this.simpleRepository = simpleRepository;
    }

    @GetMapping(path = "/hello")
    public String sayHello() {
        simpleRepository.checkPostgres();
        return "Hello you old fart!";
    }

}
