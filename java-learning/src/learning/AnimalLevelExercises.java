package learning;

public class AnimalLevelExercises {

    static  class Animal{
        String name;
        int age;
        public Animal(String name,int age){
            this.name=name;
            this.age=age;
        }
        public void eat(){
            System.out.println(name+" is eating");
        }
        public void speak(){
            System.out.println(" Animal speaks");
        }
    }
    static class Dog extends Animal{
        String bread;
        public Dog(String name,int age,String bread){
            super(name,age);
            this.bread=bread;
        }
        public void fetch(){
            System.out.println(name+" is fetching");
        }
        @Override
        public void speak(){
            System.out.println(name+" barks:Woof!");
        }

    }
    static class Cat extends Animal{
        String color;
        public Cat(String name,int age,String color){
            super(name,age);
            this.color=color;
        }
        @Override
        public void speak(){
            System.out.println(name+" meows:Meows~");
        }
        public void scratch(){
            System.out.println(name+" is scratching");
        }
    }
    public static void main(String[] args){
        Animal dog=new Dog("yao",23,"Teddy");
        Animal cat=new Cat("xu",22,"yellow");
        dog.eat();
        dog.speak();
        cat.eat();
        cat.speak();
        if(dog instanceof Dog){
            Dog d=(Dog)dog;
            d.fetch();
        }
        if(cat instanceof Cat){
            Cat c=(Cat)cat;
            c.scratch();
        }
    }
}
