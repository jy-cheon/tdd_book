package seven.case4;

public interface UserRepository {
    void save(User user);

    User findById(String id);
}
