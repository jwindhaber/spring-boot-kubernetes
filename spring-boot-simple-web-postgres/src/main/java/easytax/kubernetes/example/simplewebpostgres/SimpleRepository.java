package easytax.kubernetes.example.simplewebpostgres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author juergen.windhaber
 * @since 18.0.0
 */
@Repository
public class SimpleRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public Integer checkPostgres() {
        return jdbcTemplate.queryForObject("SELECT 1", Integer.class);
    }


}
