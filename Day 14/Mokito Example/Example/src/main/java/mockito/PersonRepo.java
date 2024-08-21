package mockito;

import java.util.List;

public class PersonRepo {
    public List<String> findAll() {
        // Normally, this would interact with a database
        return Arrays.asList("Matthew", "Jasdhirn", "Cait1yn", "Alex", "Ruii");
    }
}
