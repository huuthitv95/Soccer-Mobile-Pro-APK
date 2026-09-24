package com.bytedance.adsdk.p065lr.p074ri.p075lr;

import android.graphics.Path;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.C2080mj;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.bgr;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ri.lr.mj */
/* JADX INFO: loaded from: classes3.dex */
public class C2137mj {

    /* JADX INFO: renamed from: ik */
    private final List<C2080mj> f5196ik;

    /* JADX INFO: renamed from: lr */
    private final List<AbstractC2139ri<Integer, Integer>> f5197lr;

    /* JADX INFO: renamed from: ri */
    private final List<AbstractC2139ri<bgr, Path>> f5198ri;

    public C2137mj(List<C2080mj> list) {
        this.f5196ik = list;
        this.f5198ri = new ArrayList(list.size());
        this.f5197lr = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f5198ri.add(list.get(i).m6852lr().mo6903ri());
            this.f5197lr.add(list.get(i).m6850ik().mo6903ri());
        }
    }

    /* JADX INFO: renamed from: ik */
    public List<AbstractC2139ri<Integer, Integer>> m7100ik() {
        return this.f5197lr;
    }

    /* JADX INFO: renamed from: lr */
    public List<AbstractC2139ri<bgr, Path>> m7101lr() {
        return this.f5198ri;
    }

    /* JADX INFO: renamed from: ri */
    public List<C2080mj> m7102ri() {
        return this.f5196ik;
    }
}
