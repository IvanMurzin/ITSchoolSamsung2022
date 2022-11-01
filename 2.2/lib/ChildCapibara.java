package lib;

import Africa.Capibara;

public class ChildCapibara extends Capibara {

    private Capibara parent;

    public ChildCapibara(String name, Capibara parent) {
        super(name);
        this.parent = parent;
//        System.out.println(this.name);
    }
}
