package simpleFactory;

/**
 * 解释: 葡萄
 * Created by tianming.zhang on 2019/2/20.
 */
public class Grape implements Fruit {

    private boolean seedless;

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

    /*有无籽的取值方法*/
    public boolean getSeedless(){
        return seedless;
    }

    /*有无籽的赋值方法*/
    public void setSeedless(boolean seedless){
        this.seedless = seedless;
    }


}
