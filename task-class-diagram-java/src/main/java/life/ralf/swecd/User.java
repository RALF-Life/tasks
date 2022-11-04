package life.ralf.swecd;

import java.util.Set;

public record User(
        int id,
        String username,
        String email,
        boolean verified,
        String password,
        Set<FilterProfile> profiles
) {

}
