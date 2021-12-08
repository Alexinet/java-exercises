package com.company.Chairs;

public class ChairFactory implements Chair {
    @Override
    public Victorian createVictorian() {
        return new VictorianChair();
    }

    @Override
    public MultiFunc createMultiFunc() {
        return new MultiFuncChair();
    }

    @Override
    public Magic createMagic() {
        return new MagicChair();
    }
}