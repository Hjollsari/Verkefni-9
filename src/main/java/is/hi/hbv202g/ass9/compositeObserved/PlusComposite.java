package is.hi.hbv202g.ass9.compositeObserved;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpression, Observer {
    private List<MathExpression> children = new ArrayList<>();
    private int LastObservedResult;

    public void add(MathExpression mathExpression) {
        children.add(mathExpression);
    }

    public int getResult() {
        int result = 0;
        for (MathExpression child : children) {
            result += child.getResult();
        }
        return result;
    }
    public void update(){
        LastObservedResult=getResult();
        System.out.println(LastObservedResult);
    }
    public int getLastObservedResult(){
        return LastObservedResult;
    }
}
