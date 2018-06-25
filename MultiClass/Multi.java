class Parent{
    Parent(){
        System.out.println("parent class contructor");
    }
    public void display(){
        System.out.println("display parent class");
    }
    public static void main(String args[]){
        Parent p=new Parent();
        Child c=new Child();
        p.display();
        c.display();
    }
}
class Child{
    Child(){
        System.out.println("child class constructor");
    }
    public void display(){
        System.out.println("child class method");
    }
}