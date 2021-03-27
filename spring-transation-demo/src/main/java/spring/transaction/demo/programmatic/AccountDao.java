package spring.transaction.demo.programmatic;

/**
 * @author hanliukui
 * @Date 2021/3/26 15:22
 */
public interface AccountDao {
    /**
     * 汇款
     * @param outer 汇款人
     * @param money 汇款金额
     */
    public void out(String outer,int money);

    /**
     * 收款
     * @param inner 收款人
     * @param money 收款金额
     */
    public void in(String inner,int money);
}
