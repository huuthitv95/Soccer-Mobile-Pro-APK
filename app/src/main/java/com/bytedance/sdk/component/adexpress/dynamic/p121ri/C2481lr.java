package com.bytedance.sdk.component.adexpress.dynamic.p121ri;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2405ac;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2406aw;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2407ay;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2408bu;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2409co;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2410di;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2411dw;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2413fr;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2417ik;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2418ka;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2420mj;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2421nr;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2422oh;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2423qt;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2425sf;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2426su;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2427uq;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2428vr;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2430zf;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bgr;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hcw;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.igq;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ihz;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jbs;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ory;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.slm;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wjv;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xha;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2475mj;
import com.bytedance.sdk.component.adexpress.p125lr.C2500aw;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.ri.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2481lr {
    /* JADX INFO: renamed from: ri */
    public static AbstractC2412fi m8736ri(Context context, DynamicRootView dynamicRootView, C2475mj c2475mj) {
        C2500aw renderRequest;
        if (context == null || dynamicRootView == null || c2475mj == null || c2475mj.m8627qt() == null) {
            return null;
        }
        switch (c2475mj.m8627qt().m8599ri()) {
            case -1:
                return new ory(context, dynamicRootView, c2475mj);
            case 0:
                return new C2413fr(context, dynamicRootView, c2475mj);
            case 1:
                return new C2425sf(context, dynamicRootView, c2475mj);
            case 2:
                return new xha(context, dynamicRootView, c2475mj);
            case 3:
                return new jbs(context, dynamicRootView, c2475mj);
            case 4:
                return new C2406aw(context, dynamicRootView, c2475mj);
            case 5:
                return new bgr(context, dynamicRootView, c2475mj);
            case 6:
            case 9:
            case 17:
                return new C2410di(context, dynamicRootView, c2475mj);
            case 7:
                return new C2422oh(context, dynamicRootView, c2475mj);
            case 8:
                return new C2421nr(context, dynamicRootView, c2475mj);
            case 10:
                return new slm(context, dynamicRootView, c2475mj);
            case 11:
                return new C2407ay(context, dynamicRootView, c2475mj);
            case 12:
                return new C2423qt(context, dynamicRootView, c2475mj);
            case 13:
                return new C2426su(context, dynamicRootView, c2475mj);
            case 14:
                return new igq(context, dynamicRootView, c2475mj);
            case 15:
                return C2490ka.m8810lr() ? new C2430zf(context, dynamicRootView, c2475mj) : new C2411dw(context, dynamicRootView, c2475mj);
            case 16:
                return new C2425sf(context, dynamicRootView, c2475mj);
            case 18:
                return new wjv(context, dynamicRootView, c2475mj);
            case 19:
                return new C2427uq(context, dynamicRootView, c2475mj);
            case 20:
                return new C2405ac(context, dynamicRootView, c2475mj);
            case 21:
                return new ihz(context, dynamicRootView, c2475mj);
            case 22:
                return new C2420mj(context, dynamicRootView, c2475mj);
            case 23:
                return new C2408bu(context, dynamicRootView, c2475mj);
            case 24:
                return new C2418ka(context, dynamicRootView, c2475mj);
            case 25:
                return new C2409co(context, dynamicRootView, c2475mj);
            case 26:
                return "vertical".equals(c2475mj.m8627qt().m8592fi().jxw()) ? new hcw(context, dynamicRootView, c2475mj) : new C2417ik(context, dynamicRootView, c2475mj);
            case 27:
                return new C2411dw(context, dynamicRootView, c2475mj);
            case 28:
                if (!C2490ka.m8810lr() || (renderRequest = dynamicRootView.getRenderRequest()) == null) {
                    return null;
                }
                return new C2428vr(context, dynamicRootView, c2475mj, renderRequest.m8877ay());
            default:
                return null;
        }
    }
}
