package com.bytedance.adsdk.p065lr;

import android.util.Pair;
import com.bytedance.adsdk.p065lr.p066di.C2020ka;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.nr */
/* JADX INFO: loaded from: classes3.dex */
public class C2126nr {

    /* JADX INFO: renamed from: ri */
    private boolean f5153ri = false;

    /* JADX INFO: renamed from: lr */
    private final Set<Object> f5152lr = new C2128ri();

    /* JADX INFO: renamed from: ik */
    private final Map<String, C2020ka> f5150ik = new HashMap();

    /* JADX INFO: renamed from: ka */
    private final Comparator<Pair<String, Float>> f5151ka = new Comparator<Pair<String, Float>>() { // from class: com.bytedance.adsdk.lr.nr.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float fFloatValue = ((Float) pair.second).floatValue();
            float fFloatValue2 = ((Float) pair2.second).floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    };

    /* JADX INFO: renamed from: ri */
    public void m7054ri(String str, float f) {
        if (this.f5153ri) {
            C2020ka c2020ka = this.f5150ik.get(str);
            if (c2020ka == null) {
                c2020ka = new C2020ka();
                this.f5150ik.put(str, c2020ka);
            }
            c2020ka.m6586ri(f);
            if (str.equals("__container")) {
                Iterator<Object> it = this.f5152lr.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    void m7055ri(boolean z) {
        this.f5153ri = z;
    }
}
