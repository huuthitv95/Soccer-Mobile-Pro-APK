package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.AbstractC9203w1;
import org.w3c.dom.Node;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.model.vast.a0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8292a0 extends AbstractC8298g {

    /* JADX INFO: renamed from: i */
    public String f18498i;

    public C8292a0() {
        this.f18536f = 1;
    }

    /* JADX INFO: renamed from: c */
    public static C8292a0 m20698c(Node node) {
        C8292a0 c8292a0 = new C8292a0();
        super.m20704b(node);
        c8292a0.f18498i = AbstractC9203w1.m22040a(AbstractC9203w1.m22043d(node, "VASTAdTagURI"));
        return c8292a0;
    }
}
