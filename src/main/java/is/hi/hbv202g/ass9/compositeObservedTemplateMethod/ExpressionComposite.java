package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class ExpressionComposite implements MathExpression, Observer {
    protected List<MathExpression> children = new ArrayList<>();
    private int LastObservedResult;
    public void add(MathExpression mathExpression) {
        children.add(mathExpression);
    }
    public void update(){
        LastObservedResult=getResult();
        System.out.println(LastObservedResult);
    }
    public int getLastObservedResult(){
        return LastObservedResult;
    }
}
    

