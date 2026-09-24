package com.bytedance.adsdk.p065lr.p074ri.p076ri;

import android.graphics.Path;
import com.bytedance.adsdk.p065lr.p066di.C2017di;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ri.ri.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2152lr {

    /* JADX INFO: renamed from: ri */
    private final List<ihz> f5285ri = new ArrayList();

    /* JADX INFO: renamed from: ri */
    public void m7159ri(Path path) {
        for (int size = this.f5285ri.size() - 1; size >= 0; size--) {
            C2017di.m6549ri(path, this.f5285ri.get(size));
        }
    }

    /* JADX INFO: renamed from: ri */
    void m7160ri(ihz ihzVar) {
        this.f5285ri.add(ihzVar);
    }
}
