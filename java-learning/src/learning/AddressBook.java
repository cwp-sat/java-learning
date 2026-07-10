package learning;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    // 联系人内部类
    static class Contact {
        private String name;
        private String phone;
        private String email;
        // 构造方法
        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
        // getter
        public String getName() {return name;}
        public String getPhone() {return phone;}
        public String getEmail() {return email;}
        // setter
        public void setName(String name) {this.name = name;}
        public void setPhone(String phone) {this.phone = phone;}
        public void setEmail(String email) {this.email = email;}

        // 重写toString，格式化打印联系人信息
        @Override
        public String toString() {return "联系人{姓名='" + name + "', 电话='" + phone + "', 邮箱='" + email + "'}";}}

    // 集合存储联系人、扫描器
    private ArrayList<Contact> contacts;
    private Scanner sc;

    // 构造器初始化集合和输入对象
    public AddressBook() {
        contacts = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    // 程序入口主循环
    public void start() {
        while (true) {
            // 打印功能菜单
            System.out.println("==========简易通讯录==========");
            System.out.println("1. 添加联系人");
            System.out.println("2. 查看所有联系人");
            System.out.println("3. 根据姓名查找联系人");
            System.out.println("4. 根据姓名删除联系人");
            System.out.println("5. 退出程序");
            System.out.println("==============================");
            System.out.print("请输入操作序号：");
            int choice = sc.nextInt();
            sc.nextLine(); // 吸收换行符，避免nextLine读取空值
            // 根据选择调用对应功能
            switch (choice) {
                case 1: addContact();break;
                case 2: showAllContacts();break;
                case 3: findContact();break;
                case 4: deleteContact();break;
                case 5: System.out.println("程序退出，再见！");sc.close();return; // 结束方法，退出循环
                default: System.out.println("输入错误，请选择1-5之间的数字！");
            }
            System.out.println(); // 空行分隔界面
        }
    }

    // 1. 添加联系人
    public void addContact() {
        System.out.print("请输入联系人姓名：");
        String name = sc.nextLine();
        System.out.print("请输入联系人电话：");
        String phone = sc.nextLine();
        System.out.print("请输入联系人邮箱：");
        String email = sc.nextLine();
        // 创建对象存入集合
        Contact contact = new Contact(name, phone, email);
        contacts.add(contact);
        System.out.println("联系人添加成功！");
    }
    // 2. 展示全部联系人
    public void showAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("通讯录暂无任何联系人！");
            return;
        }
        System.out.println("=====全部联系人列表=====");
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
    // 3. 根据姓名查找联系人
    public void findContact() {
        System.out.print("请输入要查找的姓名：");
        String targetName = sc.nextLine();
        boolean isFound = false;
        for (Contact c : contacts) {
            if (c.getName().equals(targetName)) {
                System.out.println("找到联系人：" + c);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("未找到该姓名的联系人！");
        }
    }
    // 4. 根据姓名删除联系人
    public void deleteContact() {
        System.out.print("请输入要删除的姓名：");
        String targetName = sc.nextLine();
        boolean isDelete = false;
        // 遍历集合找到匹配姓名并删除
        for (int i = 0; i < contacts.size(); i++) {
            Contact c = contacts.get(i);
            if (c.getName().equals(targetName)) {
                contacts.remove(i);
                isDelete = true;
                System.out.println("联系人删除成功！");
                break;
            }
        }
        if (!isDelete) {
            System.out.println("未找到该姓名，删除失败！");
        }
    }
    // 程序主入口
    public static void main(String[] args) {
        new AddressBook().start();
    }
}