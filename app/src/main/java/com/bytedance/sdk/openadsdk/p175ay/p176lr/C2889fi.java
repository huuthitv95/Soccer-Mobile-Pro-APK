package com.bytedance.sdk.openadsdk.p175ay.p176lr;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ay.lr.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C2889fi {

    /* JADX INFO: renamed from: ri */
    private static final Map<Integer, AbstractC2892lr> f8612ri = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ay.lr.fi$ri */
    public static class ri {

        /* JADX INFO: renamed from: lr */
        public int f8613lr = -1;

        /* JADX INFO: renamed from: ri */
        public int f8614ri;

        public ri(int i) {
            this.f8614ri = i;
        }
    }

    /* JADX INFO: renamed from: ik */
    private static boolean m11105ik(wjv wjvVar) {
        if (wjvVar == null) {
            return false;
        }
        String strM16476ri = C3571ig.m16476ri(wjvVar);
        return ((!"open_ad".equals(strM16476ri) && !"fullscreen_interstitial_ad".equals(strM16476ri) && !"rewarded_video".equals(strM16476ri)) || C3279dw.m14092lr(wjvVar) || wjvVar.m14453nd() == 5 || wjvVar.m14453nd() == 33 || !wjv.m14332fi(wjvVar) || wjvVar.m14389eu() == null) ? false : true;
    }

    /* JADX INFO: renamed from: lr */
    public static Integer m11106lr(wjv wjvVar) {
        return Integer.valueOf((wjvVar.m14424jf() + wjvVar.m14533tn()).hashCode());
    }

    /* JADX INFO: renamed from: lr */
    public static void m11107lr(Integer num) {
        f8612ri.remove(num);
    }

    /* JADX INFO: renamed from: ri */
    private static AbstractC2892lr m11108ri(View view, wjv wjvVar, boolean z, ri riVar) {
        if (view == null || wjvVar == null || wjvVar.m14533tn() == null) {
            return null;
        }
        Integer numM11106lr = m11106lr(wjvVar);
        Map<Integer, AbstractC2892lr> map = f8612ri;
        if (!map.containsKey(numM11106lr)) {
            AbstractC2892lr abstractC2892lrM11122ri = AbstractC2892lr.m11122ri(z, numM11106lr, view, wjvVar, riVar);
            map.put(numM11106lr, abstractC2892lrM11122ri);
            return abstractC2892lrM11122ri;
        }
        AbstractC2892lr abstractC2892lr = map.get(numM11106lr);
        if (abstractC2892lr != null) {
            abstractC2892lr.m11131ri(view);
        }
        return abstractC2892lr;
    }

    /* JADX INFO: renamed from: ri */
    public static AbstractC2892lr m11109ri(Integer num) {
        return f8612ri.get(num);
    }

    /* JADX INFO: renamed from: ri */
    public static void m11110ri(View view, wjv wjvVar, ri riVar) {
        if (view == null || wjvVar == null || wjvVar.cgm()) {
            return;
        }
        boolean zM11105ik = m11105ik(wjvVar);
        if (C3279dw.m14092lr(wjvVar) && riVar != null) {
            riVar.f8614ri = -1;
        }
        m11111ri(m11108ri(view, wjvVar, zM11105ik, riVar));
    }

    /* JADX INFO: renamed from: ri */
    private static void m11111ri(AbstractC2892lr abstractC2892lr) {
        if (abstractC2892lr == null) {
            return;
        }
        abstractC2892lr.mo11129ri();
    }

    /* JADX INFO: renamed from: ri */
    public static void m11112ri(AbstractC2892lr abstractC2892lr, int i) {
        if (abstractC2892lr == null) {
            return;
        }
        abstractC2892lr.m11130ri(i);
    }

    /* JADX INFO: renamed from: ri */
    public static void m11113ri(wjv wjvVar) {
        if (wjvVar == null || wjvVar.m14533tn() == null) {
            return;
        }
        Integer numM11106lr = m11106lr(wjvVar);
        Map<Integer, AbstractC2892lr> map = f8612ri;
        AbstractC2892lr abstractC2892lr = map.get(numM11106lr);
        if (abstractC2892lr != null) {
            abstractC2892lr.m11128qt();
        }
        m11107lr(numM11106lr);
        if (map.size() <= 0) {
            xha.m11136ri();
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m11114ri(wjv wjvVar, int i) {
        if (wjvVar == null || wjvVar.m14533tn() == null) {
            return;
        }
        m11112ri(f8612ri.get(m11106lr(wjvVar)), i);
    }
}
