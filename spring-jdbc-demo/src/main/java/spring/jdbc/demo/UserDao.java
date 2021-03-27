package spring.jdbc.demo;

/**
 * @author hanliukui
 * @Date 2021/3/27 12:01
 */
public interface UserDao {

    /**
     * 添加 用户信息
     * @param user
     * @return
     */
    User add(User user);

    /**
     * 更新 用户信息
     * @param user
     * @return
     */
    User update(User user);

    /**
     * 删除 用户信息
     * @param id
     */
    void delete(String id);

}
