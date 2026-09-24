package com.bytedance.sdk.component.adexpress.dynamic.animation.p114ri;

import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dzy;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2477ri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.ri.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2394lr implements dzy {

    /* JADX INFO: renamed from: ri */
    List<AbstractC2393ka> f6423ri = new ArrayList();

    public C2394lr(View view, List<C2477ri> list) {
        Iterator<C2477ri> it = list.iterator();
        while (it.hasNext()) {
            AbstractC2393ka abstractC2393kaM8293ri = C2392ik.m8292ri().m8293ri(view, it.next());
            if (abstractC2393kaM8293ri != null) {
                this.f6423ri.add(abstractC2393kaM8293ri);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dzy
    /* JADX INFO: renamed from: lr */
    public void mo8296lr() {
        Iterator<AbstractC2393ka> it = this.f6423ri.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo8296lr();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m8299ri() {
        Iterator<AbstractC2393ka> it = this.f6423ri.iterator();
        while (it.hasNext()) {
            try {
                it.next().m8295ik();
            } catch (Exception unused) {
            }
        }
    }
}
