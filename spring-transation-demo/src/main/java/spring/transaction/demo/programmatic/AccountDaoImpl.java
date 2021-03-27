package spring.transaction.demo.programmatic;

import javax.sql.DataSource;

/**
 * @author hanliukui
 * @Date 2021/3/26 15:22
 */
public class AccountDaoImpl implements AccountDao {

    private final DataSource dataSource;

    public AccountDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void out(String outer, int money) {

    }

    public void in(String inner, int money) {

    }
}
