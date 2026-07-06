package learning;

public class USBSystem {

    // 1. 定义 USB 接口
    static interface USB {
        // TODO: 定义 connect() 和 disconnect() 方法
        void connect();
        void disconnect();
    }

    // 2. Mouse 实现 USB
    static class Mouse implements USB {
        // TODO: 实现 connect() 和 disconnect()
        public void connect() {
            System.out.println("Mouse connected");
        }
        public void disconnect(){
            System.out.println("Mouse disconnected");
        }
        // TODO: 添加 click() 方法
        public void click(){
            System.out.println("Mouse clicked");
        }
    }

    // 3. Keyboard 实现 USB
    static class Keyboard implements USB {
        // TODO: 实现 connect() 和 disconnect()
        public void connect() {
            System.out.println("Keyborad connected");
        }
        public void disconnect(){
            System.out.println("Keyborad disconnected");
        }
        // TODO: 添加 type() 方法
        public void type(){
            System.out.println("Keyborad type");
        }
    }

    // 4. Printer 实现 USB
    static class Printer implements USB {
        // TODO: 实现 connect() 和 disconnect()
        public void connect() {
            System.out.println("Printer connected");
        }
        public void disconnect(){
            System.out.println("Printer disconnected");
        }
        // TODO: 添加 print() 方法
        public void print(){
            System.out.println("Printer print");
        }
    }

    public static void main(String[] args) {
        // TODO: 多态创建对象
        USB device1=new Mouse();
        USB device2=new Keyboard();
        USB device3=new Printer();
        // TODO: 调用 connect() 和 disconnect()
        device1.connect();
        device1.disconnect();
        device2.connect();
        device2.disconnect();
        device3.connect();
        device3.disconnect();
        // TODO: 向下转型，调用独有方法
        if (device1 instanceof Mouse){
            Mouse d=(Mouse) device1;
            d.click();
        }
        if (device2 instanceof Keyboard){
            Keyboard d=(Keyboard) device2;
            d.type();
        }
        if (device3 instanceof Printer){
            Printer d=(Printer) device3;
            d.print();
        }
    }
}