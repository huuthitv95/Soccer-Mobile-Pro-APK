package com.bytedance.sdk.openadsdk.core.p219ik;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik;
import com.bytedance.sdk.component.adexpress.dynamic.C2480ri;
import com.bytedance.sdk.component.utils.C2722lr;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.C3214ig;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3234lr;
import com.bytedance.sdk.openadsdk.core.model.C3277co;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.C3283ka;
import com.bytedance.sdk.openadsdk.core.model.slm;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p190aw.C3097ka;
import com.bytedance.sdk.openadsdk.core.p221ka.C3263ri;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.C3371ka;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.InterfaceC3370ik;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.p236ka.C3423lr;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ik.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3220lr extends AbstractViewOnClickListenerC3218ik {

    /* JADX INFO: renamed from: xd */
    private static int f10691xd = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: aw */
    protected InterfaceC1999ik f10692aw;
    protected boolean bgr;

    /* JADX INFO: renamed from: bu */
    protected C3263ri f10693bu;

    /* JADX INFO: renamed from: co */
    protected PAGNativeAd f10694co;

    /* JADX INFO: renamed from: di */
    protected final wjv f10695di;

    /* JADX INFO: renamed from: fi */
    public slm f10696fi;

    /* JADX INFO: renamed from: ik */
    private boolean f10697ik;
    protected WeakReference<View> jbs;

    /* JADX INFO: renamed from: ka */
    protected Context f10698ka;

    /* JADX INFO: renamed from: lr */
    private WeakReference<Activity> f10699lr;

    /* JADX INFO: renamed from: mj */
    protected final int f10700mj;

    /* JADX INFO: renamed from: nr */
    protected InterfaceC3234lr f10701nr;

    /* JADX INFO: renamed from: qt */
    protected C3277co f10702qt;

    /* JADX INFO: renamed from: ri */
    private String f10703ri;

    /* JADX INFO: renamed from: sf */
    protected ri f10704sf;
    protected Map<String, Object> slm;
    protected int tan;

    /* JADX INFO: renamed from: vr */
    protected InterfaceC3370ik f10705vr;
    protected final String xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ik.lr$ri */
    public interface ri {
        /* JADX INFO: renamed from: ri */
        void mo11528ri(View view, int i);
    }

    public C3220lr(Context context, wjv wjvVar, String str, int i) {
        this.bgr = false;
        this.tan = 0;
        this.f10697ik = false;
        this.f10698ka = context;
        this.f10695di = wjvVar;
        this.xha = str;
        this.f10700mj = i;
    }

    public C3220lr(Context context, wjv wjvVar, String str, int i, boolean z) {
        this(context, wjvVar, str, i);
        this.f10697ik = z;
    }

    /* JADX INFO: renamed from: lr */
    public static boolean m13516lr(View view) {
        return 520093705 == view.getId() || 520093707 == view.getId() || 520093703 == view.getId() || m13517ri(view.getContext()) == view.getId() || com.bytedance.sdk.openadsdk.utils.slm.f13273hd == view.getId() || com.bytedance.sdk.openadsdk.utils.slm.iyl == view.getId();
    }

    /* JADX INFO: renamed from: ri */
    private static int m13517ri(Context context) {
        if (f10691xd == Integer.MIN_VALUE) {
            f10691xd = C2729uq.m10302fi(context, "btn_native_creative");
        }
        return f10691xd;
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m13518ri(View view, wjv wjvVar, boolean z) {
        if (view != null && wjvVar != null) {
            try {
                String strValueOf = String.valueOf(view.getTag(C2480ri.f6818ac));
                if (view.getTag(C2480ri.f6818ac) != null && !TextUtils.isEmpty(strValueOf)) {
                    if ("click".equals(strValueOf)) {
                        return z;
                    }
                    return true;
                }
            } catch (Exception unused) {
            }
            if (m13516lr(view)) {
                return wjvVar.yjm() != 1 || z;
            }
            if (wjvVar.m14558xe() == 1 && !z) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: fi */
    public String m13519fi() {
        return this.f10703ri;
    }

    /* JADX INFO: renamed from: fi */
    public void m13520fi(boolean z) {
        this.bgr = z;
    }

    /* JADX INFO: renamed from: ik */
    public void m13521ik(int i) {
        this.f10684su = i;
    }

    /* JADX INFO: renamed from: ka */
    public View m13522ka() {
        WeakReference<Activity> weakReference = this.f10699lr;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.f10699lr.get().findViewById(R.id.content);
    }

    /* JADX INFO: renamed from: ka */
    public void m13523ka(int i) {
        this.tan = i;
    }

    /* JADX INFO: renamed from: lr */
    public void m13524lr(int i) {
        this.igq = i;
    }

    /* JADX INFO: renamed from: ri */
    protected C3277co mo13525ri(float f, float f2, float f3, float f4, SparseArray<AbstractViewOnClickListenerC3218ik.ri> sparseArray, long j, long j2, View view, String str, float f5, int i, float f6, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
        return new C3277co.ri().m14046di(f).m14048fi(f2).m14052ka(f3).m14050ik(f4).m14056lr(j).m14061ri(j2).m14065ri(C3583qd.m16626ri(view)).m14058lr(C3583qd.m16585ik(view)).m14053ka(this.f10684su).m14049fi(this.igq).m14047di(this.f10686zf).m14062ri(sparseArray).m14055lr(C3304qt.m14669lr().m14700ri() ? 1 : 2).m14063ri(str).m14059ri(f5).m14051ik(i).m14054lr(f6).m14060ri(i2).m14064ri(jSONObject).m14057lr(jSONObject2).m14066ri();
    }

    /* JADX INFO: renamed from: ri */
    public void m13526ri(int i) {
        this.f10686zf = i;
    }

    /* JADX INFO: renamed from: ri */
    public void m13527ri(Activity activity) {
        if (activity == null) {
            return;
        }
        this.f10699lr = new WeakReference<>(activity);
    }

    /* JADX INFO: renamed from: ri */
    public void m13528ri(View view) {
        if (view == null) {
            return;
        }
        this.jbs = new WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.openadsdk.core.p219ik.AbstractViewOnClickListenerC3218ik
    /* JADX INFO: renamed from: ri */
    public void mo10681ri(View view, float f, float f2, float f3, float f4, SparseArray<AbstractViewOnClickListenerC3218ik.ri> sparseArray, boolean z) {
        int i;
        boolean z2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        C3097ka c3097kaM14188ri;
        if (this.f10698ka == null) {
            this.f10698ka = C3299nr.m14642ri();
        }
        if ((this.f10697ik || !m13537ri(view, 1, f, f2, f3, f4, sparseArray, z)) && this.f10698ka != null) {
            slm slmVar = this.f10696fi;
            if (slmVar != null) {
                i = slmVar.f11352mj;
                jSONObject = this.f10696fi.jbs;
                jSONObject2 = this.f10696fi.f11345aw;
                z2 = this.f10696fi.bgr;
            } else {
                i = -1;
                z2 = false;
                jSONObject = null;
                jSONObject2 = null;
            }
            long j = this.f10675ay;
            long j2 = this.f10678fr;
            WeakReference<View> weakReference = this.jbs;
            C3277co c3277coMo13525ri = mo13525ri(f, f2, f3, f4, sparseArray, j, j2, weakReference == null ? null : weakReference.get(), m13519fi(), C3583qd.m16598mj(this.f10698ka), C3583qd.m16600qt(this.f10698ka), C3583qd.jbs(this.f10698ka), i, jSONObject, jSONObject2);
            this.f10702qt = c3277coMo13525ri;
            if (mo13539ri(c3277coMo13525ri, this.slm)) {
                return;
            }
            if (this.f10692aw != null) {
                if (this.slm == null) {
                    this.slm = new HashMap();
                }
                this.slm.put("duration", Long.valueOf(this.f10692aw.mo6373di()));
            }
            wjv wjvVar = this.f10695di;
            if (this.f10697ik || z2) {
                C3414ik.m15563ri("click", wjvVar, this.f10702qt, this.xha, true, this.slm, z ? 1 : 2);
                C3283ka c3283kaM14473qc = wjvVar.m14473qc();
                if (c3283kaM14473qc == null || wjvVar.m14576zz() || (c3097kaM14188ri = c3283kaM14473qc.m14188ri()) == null) {
                    return;
                }
                InterfaceC1999ik interfaceC1999ik = this.f10692aw;
                c3097kaM14188ri.xha(interfaceC1999ik != null ? interfaceC1999ik.mo6373di() : 0L);
                return;
            }
            ri riVar = this.f10704sf;
            if (riVar != null) {
                riVar.mo11528ri(view, -1);
            }
            if (m13538ri(view, z)) {
                boolean zM14092lr = C3279dw.m14092lr(wjvVar);
                String strM16474ri = zM14092lr ? this.xha : C3571ig.m16474ri(this.f10700mj);
                if (view != null) {
                    try {
                        if (Boolean.TRUE.equals(view.getTag(520093762))) {
                            C3214ig.m13499ri(true);
                        }
                    } catch (Exception unused) {
                    }
                }
                Activity activityM10240ri = view != null ? C2722lr.m10240ri(view) : null;
                boolean zM13500ri = C3214ig.m13500ri(activityM10240ri == null ? this.f10698ka : activityM10240ri, wjvVar, this.f10700mj, this.f10694co, this.f10693bu, strM16474ri, this.f10705vr, zM14092lr, 0);
                C3214ig.m13499ri(false);
                if (zM13500ri || wjvVar == null || wjvVar.lau() == null || wjvVar.lau().m14012ik() != 2) {
                    if (wjvVar != null && !zM13500ri && TextUtils.isEmpty(wjvVar.smj()) && C3423lr.m15611ri(this.xha)) {
                        C3371ka.m15240ri(this.f10698ka, this.xha).mo15239ri(wjvVar);
                    }
                    C3414ik.m15563ri("click", wjvVar, this.f10702qt, this.xha, zM13500ri, this.slm, z ? 1 : 2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m13529ri(InterfaceC1999ik interfaceC1999ik) {
        this.f10692aw = interfaceC1999ik;
    }

    /* JADX INFO: renamed from: ri */
    public void m13530ri(PAGNativeAd pAGNativeAd) {
        this.f10694co = pAGNativeAd;
    }

    /* JADX INFO: renamed from: ri */
    public void m13531ri(ri riVar) {
        this.f10704sf = riVar;
    }

    /* JADX INFO: renamed from: ri */
    public void m13532ri(InterfaceC3234lr interfaceC3234lr) {
        this.f10701nr = interfaceC3234lr;
    }

    /* JADX INFO: renamed from: ri */
    public void m13533ri(C3263ri c3263ri) {
        this.f10693bu = c3263ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m13534ri(InterfaceC3370ik interfaceC3370ik) {
        this.f10705vr = interfaceC3370ik;
    }

    /* JADX INFO: renamed from: ri */
    public void m13535ri(String str) {
        this.f10703ri = str;
    }

    /* JADX INFO: renamed from: ri */
    public void m13536ri(Map<String, Object> map) {
        Map<String, Object> map2 = this.slm;
        if (map2 != null) {
            map2.putAll(map);
            map.putAll(this.slm);
        }
        this.slm = map;
    }

    /* JADX INFO: renamed from: ri */
    protected boolean m13537ri(View view, int i, float f, float f2, float f3, float f4, SparseArray<AbstractViewOnClickListenerC3218ik.ri> sparseArray, boolean z) {
        if (this.f10701nr == null) {
            return false;
        }
        this.f10701nr.mo13683ri(view, i, new slm.C3292ri().m14281ka(f).m14279ik(f2).m14282lr(f3).m14287ri(f4).m14284lr(this.f10675ay).m14289ri(this.f10678fr).m14290ri(sparseArray).m14293ri(z).m14294ri());
        return true;
    }

    /* JADX INFO: renamed from: ri */
    public boolean m13538ri(View view, boolean z) {
        return m13518ri(view, this.f10695di, z);
    }

    /* JADX INFO: renamed from: ri */
    public boolean mo13539ri(C3277co c3277co, Map<String, Object> map) {
        return false;
    }
}
