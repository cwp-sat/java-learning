package learning;

public class Abstract {

    //    抽象类
    static abstract class Animal{
        String name;

        public Animal(String name){
            this.name=name;
        }
        //普通实现
        public void eat(){
            System.out.println(name+"is eating");
        }
        //抽象方法（没有方法体，子类必须重写）
        public abstract void speak();
    }
    //子类即成父类，必须实现所有抽象方法
    static class Dog extends Animal{
        public Dog(String name){
            super(name);
        }
        @Override
        public void speak(){
            System.out.println(name+" is barks:Woof!");
        }
    }
    public static void main(String[] args) {
        Animal dog=new Dog("erha");
        dog.speak();
    }
}
