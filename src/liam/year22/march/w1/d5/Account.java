package liam.year22.march.w1.d5;

/**
 * @Description
 * 银行转账问题
 * 通过id大小来实现嵌套资源加锁的情况，避免嵌套加的问题
 * @Author liam661
 * @Date 2022/3/4 17:03
 **/
public class Account {
    private int id;
    private String name;
    private double balance;

    public void transfer(Account from, Account to, double money){
        if(from.getId() > to.getId()){
            synchronized (from){
                synchronized (to){
                    //
                    System.out.println("转账成功");
                }
            }
        }else {
            synchronized (to){
                synchronized (from){
                    //
                    System.out.println("转账成功");
                }
            }
        }
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
