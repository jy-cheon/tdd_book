package seven.case6;

import seven.case5.User;
import seven.case5.UserRepository;

import java.util.HashMap;
import java.util.Map;

public class MemoryUserRepository implements UserRepository {
    private Map<String, User> users = new HashMap<>();
    @Override
    public void save(User user) {
        users.put(user.getId(), user);
    }

    @Override
    public User findById(String id) {
        return users.get(id);
    }
}
