package learning;

public class Interface {

    //接口（所有方法默认public abstract）
    interface USB{
        void connect();  //相当于public abstract void connect();
        void disconnect();
    }
    //类实现接口（必须实现所有方法）
    static class Mouse implements USB{
        @Override
        public void connect(){
            System.out.println("Mouse connected");
        }
        @Override
        public void disconnect(){
            System.out.println("Mouse disconnected");
        }
    }
    public static void main(String[] args) {
        USB device=new Mouse();
        device.connect();//鼠标已连接
    }

}
