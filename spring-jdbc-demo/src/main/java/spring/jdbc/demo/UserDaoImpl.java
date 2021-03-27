package spring.jdbc.demo;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author hanliukui
 * @Date 2021/3/27 12:49
 */
public class UserDaoImpl implements UserDao {

    private final JdbcTemplate jdbcTemplate;

    public UserDaoImpl(JdbcTemplate jdbcTemplate){

        this.jdbcTemplate = jdbcTemplate;
    }

    public User add(User user) {
        String sql = "insert into myuser(id,name,age,mobile) values (?,?,?,?)";
        int count = jdbcTemplate.update(sql, user.getId(), user.getName(), user.getAge(), user.getMobile());
        return user;
    }

    public User update(User user) {
        String sql = "update myuser set id=?, name=?, age=?, mobile=?";
        int count = jdbcTemplate.update(sql, user.getId(), user.getName(), user.getAge(), user.getMobile());
        return user;
    }

    public void delete(String id) {
        jdbcTemplate.update("delete from myuser whrere id = ?",id);
    }
}
