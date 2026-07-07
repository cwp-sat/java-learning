package learning;

import java.util.Scanner;

public class ATM {

    static class Account{
        private String id;
        private String password;
        private double balance;
        public Account(String id,String password,double balance){
            this.id=id;
            this.password=password;
            this.balance=balance;
        }
        public String getId() {return id;}
        public String getPassword() {return password;}
        public double getBalance() {return balance;}
        public void setBalance(double balance) {
            this.balance = balance;
        }
    }
    // ========== ATM 业务逻辑 ==========
    private Account account;
    private int failCount;
    private Scanner sc;

    // 构造方法：初始化 Scanner，设置初始账户
    public ATM() {
        sc = new Scanner(System.in);
        // 创建一个默认账户用于测试
        account = new Account("1001", "1234", 1000.0);
    }

    // 启动 ATM
    public void start() {
        // TODO: 调用 login()
        System.out.println("=== 欢迎使用 ATM 系统 ===");
        login();
    }

    // 登录
    private void login() {
        // TODO: 循环输入账号密码，匹配成功进入菜单，失败累计次数
        // 连续失败 3 次 → 输出提示并退出
        Scanner sc = new Scanner(System.in);
        failCount = 0;
        while(true){
            System.out.println("请输入账号:");
            String id=sc.nextLine();
            System.out.println("请输入密码");
            String password=sc.nextLine();
            if (id.equals(account.getId())&&password.equals(account.getPassword())){
                System.out.println("登录成功！");
                showMenu();
                break;  // 登录成功后退出 login()
            }else {
                failCount++;
                if(failCount==3){
                    System.out.println("连续三次输入失败，系统已锁定");
                    return;
                }
                System.out.println("账号或密码错误，请重试（剩余 "+ (3 - failCount) +"  次）");
            }
        }
    }

    // 显示菜单
    private void showMenu() {
        // TODO: 循环显示菜单，根据用户选择调用对应方法
        // 选 4 → break 退出循环
        while (true){
            System.out.println("=== 主菜单 ===\n" +
                    "1. 查询余额\n" +
                    "2. 存款\n" +
                    "3. 取款\n" +
                    "4. 退出\n" +
                    "请选择操作：");
            int choose=sc.nextInt();
            switch(choose){
                case 1:queryBalance();break;
                case 2:deposit();break;
                case 3:withdraw();break;
                case 4:System.out.println("感谢使用！");return;
                default: System.out.println("无效选项，请重新选择");
            }
        }
    }

    // 查询余额
    private void queryBalance() {
        // TODO: 显示当前余额
        System.out.println("您当前的余额是："+account.balance+"元");
    }

    // 存款
    private void deposit() {
        // TODO: 输入金额，加到余额上，输出成功信息
        System.out.println("请输入存款金额：");
        double money=sc.nextDouble();
        // 存款和取款时，输入的金额不能为负数
        if (money <= 0) {
            System.out.println("金额必须大于0");
            return;
        }
//        account.balance+=money;
        account.setBalance(account.getBalance() + money);   // 更符合封装理念
        System.out.println("存款成功！当前余额"+account.balance+"元");
    }

    // 取款
    private void withdraw() {
        // TODO: 输入金额，检查余额是否够，够则扣减，不够则提示
        System.out.println("请输入取款数目：");
        double money=sc.nextDouble();
        // 存款和取款时，输入的金额不能为负数
        if (money <= 0) {
            System.out.println("金额必须大于0");
            return;
        }
        if (account.balance<money){
            System.out.println("抱歉，您的余额不足");
        }else {
            account.balance-=money;
            System.out.println("您当前的余额是："+account.balance+"元");
        }
    }
    // ========== 测试入口 ==========
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.start();
    }

}
