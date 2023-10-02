package test.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tdd.User;
import tdd.UserRepository;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class testUserRepository {
    private UserRepository userRepository;

    @BeforeEach
    public void beforeEach() {
        userRepository = new UserRepository();
        userRepository.addUser(new User("User", "12345678", false));
        userRepository.addUser(new User("Admin", "sdjfsdhf@aa$%", true));
        userRepository.addUser(new User("Admin2", "sdjhf@aa$%", true));
        userRepository.addUser(new User("User2", "badP@$$w0rd", false));

        userRepository.authenticateUser("User","12345678");
    }

    @Test
    public void testUnLoginUsersExceptAdmin() {
        userRepository.unLoginAllUsersExceptAdmin();
        for (User user : userRepository.data) {
            if (!user.isAdmin) assertFalse(user.isAuthenticate);
        }

    }
}