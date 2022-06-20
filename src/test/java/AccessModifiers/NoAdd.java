package AccessModifiers;

import net.bytebuddy.implementation.bind.MethodDelegationBinder;

public class NoAdd implements ChildClass.BR {

    @Override
    public int add() {
        return 0;
    }
}
