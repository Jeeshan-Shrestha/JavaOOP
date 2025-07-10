package LamdaExpression;


@FunctionalInterface
interface A {
    int doSomething(int x,int y);
}


public class Main {
    public static void main(String[] args){
        A obj = (x,y) -> x+y;
        System.out.println(obj.doSomething(5, 5));
        }
}
