abstract class Parent{
    public abstract void show();
    }
    class Child
    {
            public void show(){
                System.out.println("this is first example");
            }
    public static void main(String[] args)
        {
            Child obj = new Child();
            obj.show();
        }
    }