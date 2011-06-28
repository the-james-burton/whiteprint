package com.design.patterns.adapter;

import org.junit.Test;

public class AdapterVariations {
    WhatIUse   whatIUse   = new WhatIUse();
    WhatIHave  whatIHave  = new WhatIHave();
    WhatIWant  adapt      = new SurrogateAdapter(whatIHave);
    WhatIUse2  whatIUse2  = new WhatIUse2();
    WhatIHave2 whatIHave2 = new WhatIHave2();
    WhatIHave3 whatIHave3 = new WhatIHave3();

    @Test
    public void test() {
        whatIUse.op(adapt);
        // Approach 2:
        whatIUse2.op(whatIHave);
        // Approach 3:
        whatIUse.op(whatIHave2);
        // Approach 4:
        whatIUse.op(whatIHave3.whatIWant());
    }
}
