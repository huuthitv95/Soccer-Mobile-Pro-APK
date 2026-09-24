package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.AbstractC9203w1;
import java.util.ArrayList;
import org.w3c.dom.Node;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.model.vast.u */
/* JADX INFO: loaded from: classes4.dex */
public final class C8312u {

    /* JADX INFO: renamed from: a */
    public String f18571a;

    /* JADX INFO: renamed from: b */
    public ArrayList f18572b;

    /* JADX INFO: renamed from: a */
    public static C8312u m20710a(Node node) {
        C8297f c8297f;
        C8312u c8312u = new C8312u();
        c8312u.f18571a = AbstractC9203w1.m22041b(node, "version");
        ArrayList<Node> arrayListM22042c = AbstractC9203w1.m22042c(node, "Ad");
        if (!arrayListM22042c.isEmpty()) {
            c8312u.f18572b = new ArrayList();
            for (Node node2 : arrayListM22042c) {
                if (node2 == null) {
                    c8297f = null;
                } else {
                    C8297f c8297f2 = new C8297f();
                    c8297f2.f18528a = AbstractC9203w1.m22041b(node2, "id");
                    Node nodeM22043d = AbstractC9203w1.m22043d(node2, "Wrapper");
                    if (nodeM22043d != null) {
                        c8297f2.f18529b = C8292a0.m20698c(nodeM22043d);
                    }
                    Node nodeM22043d2 = AbstractC9203w1.m22043d(node2, "InLine");
                    if (nodeM22043d2 != null) {
                        c8297f2.f18530c = C8307p.m20707c(nodeM22043d2);
                    }
                    c8297f = c8297f2;
                }
                c8312u.f18572b.add(c8297f);
            }
        }
        return c8312u;
    }

    public final String toString() {
        return new StringBuilder("Vast: version - " + this.f18571a + "\nAds: ").toString();
    }
}
