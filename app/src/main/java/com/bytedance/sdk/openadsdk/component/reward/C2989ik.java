package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2724nr;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.utils.dzy;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2989ik extends AbstractRunnableC2676ik {

    /* JADX INFO: renamed from: ri */
    private final List<? extends AbstractRunnableC2676ik> f9165ri;

    public C2989ik(String str, List<? extends AbstractRunnableC2676ik> list) {
        super(str);
        this.f9165ri = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        List<? extends AbstractRunnableC2676ik> list;
        if (C2724nr.m10255ik(C3299nr.m14642ri()) != 0 && (list = this.f9165ri) != null) {
            Iterator<? extends AbstractRunnableC2676ik> it = list.iterator();
            while (it.hasNext()) {
                dzy.m16410ri(it.next(), 1);
                it.remove();
            }
        }
        try {
            com.bytedance.sdk.component.utils.jbs.m10235ri().removeCallbacks(this);
        } catch (Exception unused) {
        }
    }
}
