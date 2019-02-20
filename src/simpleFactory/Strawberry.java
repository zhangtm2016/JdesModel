package simpleFactory;

/**
 * 解释: 草莓
 * Created by tianming.zhang on 2019/2/20.
 */
public class Strawberry implements Fruit {

    /*生长*/
    public void grow(){
        System.out.print(" Apple is growing..");
    }

    /*收获*/
    public void harvest(){
        System.out.print("Apple has been harvested.");
    }

    /*种植*/
    public void plant(){
        System.out.print("Apple has been planted.");
    }

    /*辅助方法*/
    public static void log(String msg){
        System.out.print(msg);
    }
}
