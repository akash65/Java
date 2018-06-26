class Overload{
    public static void main(String[] args){
        Overload obj=new Overload();
        Overload obj2=new Overload("python");
        obj.setName("java");
        obj2.getName();
        obj.getName();
    }
    String name;
    Overload(){
        System.out.println("overloading method");
    }
    Overload(String t){
        name=t;
    }
    void setName(String t){
        name=t;
    }
    void getName(){
        System.out.println("getting name"+name);
    }
}