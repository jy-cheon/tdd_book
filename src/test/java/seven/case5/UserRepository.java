package seven.case5;

public interface UserRepository {
    void save(User user);

    User findById(String id);
}
