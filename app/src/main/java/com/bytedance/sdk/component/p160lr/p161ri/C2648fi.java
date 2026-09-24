package com.bytedance.sdk.component.p160lr.p161ri;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.component.lr.ri.fi */
/* JADX INFO: loaded from: classes3.dex */
public final class C2648fi extends C2645aw {

    /* JADX INFO: renamed from: lr */
    List<String> f7541lr;

    /* JADX INFO: renamed from: ri */
    List<String> f7542ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.lr.ri.fi$ri */
    public static final class ri {

        /* JADX INFO: renamed from: ri */
        private final List<String> f7544ri = new ArrayList();

        /* JADX INFO: renamed from: lr */
        private final List<String> f7543lr = new ArrayList();

        /* JADX INFO: renamed from: ri */
        public ri m9912ri(String str, String str2) {
            this.f7544ri.add(str);
            this.f7543lr.add(str2);
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public C2648fi m9913ri() {
            return new C2648fi(this.f7544ri, this.f7543lr);
        }
    }

    C2648fi(List<String> list, List<String> list2) {
        this.f7542ri = list;
        this.f7541lr = list2;
    }
}
