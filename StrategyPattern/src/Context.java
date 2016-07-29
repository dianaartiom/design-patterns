/**
 * Created by diana on 7/29/16.
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        return this.strategy.doOperation(a, b);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
