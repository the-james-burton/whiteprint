package com.googlecode.whiteprint.tip.adapter.variations;

import org.junit.Test;

public class AdapterVariationsTest {
    WhatIUse whatIUse = new WhatIUse();
    WhatIHave whatIHave = new WhatIHave();
    WhatIWant adapt = new SurrogateAdapter(this.whatIHave);
    WhatIUse2 whatIUse2 = new WhatIUse2();
    WhatIHave2 whatIHave2 = new WhatIHave2();
    WhatIHave3 whatIHave3 = new WhatIHave3();

    @Test
    public void test() {
	this.whatIUse.op(this.adapt);
	// Approach 2:
	this.whatIUse2.op(this.whatIHave);
	// Approach 3:
	this.whatIUse.op(this.whatIHave2);
	// Approach 4:
	this.whatIUse.op(this.whatIHave3.whatIWant());
    }
}
