/**
 * Created by diana on 7/29/16.
 */
public class Main {

    public static void main(String[] args) {

        Strategy add = new OperationAdd();
        Strategy sub = new OperationSub();
        Strategy mul = new OperationMul();

        Context context = new Context(add);
        System.out.println(String.valueOf(context.executeStrategy(1, 2)));

        context.setStrategy(sub);
        System.out.println(String.valueOf(context.executeStrategy(1, 2)));

        context.setStrategy(mul);
        System.out.println(String.valueOf(context.executeStrategy(1, 2)));
    }
}
