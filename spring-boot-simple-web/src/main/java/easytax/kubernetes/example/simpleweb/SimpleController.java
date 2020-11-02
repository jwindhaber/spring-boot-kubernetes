package easytax.kubernetes.example.simpleweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author juergen.windhaber
 * @since 18.0.0
 */
@RestController
public class SimpleController {

    @GetMapping(path = "/hello")
    public String sayHello() {
        return "Hello you old fart!";
    }

}
