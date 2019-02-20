package simpleFactory;

/**
 * 解释: 苹果
 * Created by tianming.zhang on 2019/2/20.
 */
public class Apple implements Fruit {

    private int treeAge;

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

    /*树龄的取值方法*/
    public int getTreeAge(){
        return getTreeAge();
    }

    /*树龄的赋值方法*/
    public void setTreeAge(int treeAge){
        this.treeAge = treeAge;
    }
}
