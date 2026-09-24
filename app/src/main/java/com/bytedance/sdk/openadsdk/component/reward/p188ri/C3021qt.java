package com.bytedance.sdk.openadsdk.component.reward.p188ri;

import android.R;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2;
import com.bytedance.sdk.openadsdk.component.reward.view.C3075sf;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.model.C3273ac;
import com.bytedance.sdk.openadsdk.core.model.C3277co;
import com.bytedance.sdk.openadsdk.core.model.C3283ka;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p219ik.AbstractC3217fi;
import com.bytedance.sdk.openadsdk.core.p219ik.AbstractViewOnClickListenerC3218ik;
import com.bytedance.sdk.openadsdk.core.p219ik.C3220lr;
import com.bytedance.sdk.openadsdk.core.p219ik.C3221ri;
import com.bytedance.sdk.openadsdk.p175ay.p176lr.C2889fi;
import com.bytedance.sdk.openadsdk.p175ay.p177ri.C2897ik;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3531ka;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.slm;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.ri.qt */
/* JADX INFO: loaded from: classes3.dex */
public class C3021qt {

    /* JADX INFO: renamed from: ik */
    private final AbstractC3217fi f9360ik;

    /* JADX INFO: renamed from: lr */
    private final C3220lr f9361lr;

    /* JADX INFO: renamed from: ri */
    private final C3022ri f9362ri;

    public C3021qt(C3022ri c3022ri) {
        this.f9362ri = c3022ri;
        this.f9360ik = m11992ri(c3022ri, c3022ri.f9389lr);
        this.f9361lr = new C3220lr(c3022ri.f9384ig, c3022ri.f9389lr, c3022ri.f9381fi, c3022ri.f9387ka ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.qt.1
            @Override // com.bytedance.sdk.openadsdk.core.p219ik.C3220lr, com.bytedance.sdk.openadsdk.core.p219ik.AbstractViewOnClickListenerC3218ik
            /* JADX INFO: renamed from: ri */
            public void mo10681ri(View view, float f, float f2, float f3, float f4, SparseArray<AbstractViewOnClickListenerC3218ik.ri> sparseArray, boolean z) {
                try {
                    C3021qt.this.m11978ri(view, f, f2, f3, f4, sparseArray, this.f10686zf, this.f10684su, this.igq);
                } catch (Exception e) {
                    C2707ac.m10196ik("TTAD.RFReportManager", "onClickReport error :" + e.getMessage());
                }
                C2889fi.m11114ri(C3021qt.this.f9362ri.f9389lr, 9);
                C3021qt.this.f9362ri.ihz.feb();
            }
        };
    }

    private boolean jbs() {
        return this.f9362ri.f9389lr != null && this.f9362ri.f9389lr.zxp() == 1;
    }

    /* JADX INFO: renamed from: lr */
    private void m11974lr(View view, float f, float f2, float f3, float f4, SparseArray<AbstractViewOnClickListenerC3218ik.ri> sparseArray, int i, int i2, int i3) {
        if (!jbs() || this.f9362ri.f9389lr == null || view == null) {
            return;
        }
        boolean z = C3273ac.m13956co(this.f9362ri.f9389lr) && (view instanceof TopLayoutDislike2) && this.f9362ri.f9394oh.f9314ri.getITopLayout() == view;
        int id = view.getId();
        if (z || id == slm.xha || id == slm.f13261di || id == slm.f13268fi || id == slm.f13282ka || id == slm.bgr || id == slm.iph || id == slm.f13289nr || id == 520093705 || id == slm.f13255aw || id == 520093707 || id == slm.jbs) {
            int iM16600qt = C3583qd.m16600qt(C3299nr.m14642ri());
            C3277co c3277coM14066ri = new C3277co.ri().m14046di(f).m14048fi(f2).m14052ka(f3).m14050ik(f4).m14056lr(System.currentTimeMillis()).m14061ri(0L).m14065ri(C3583qd.m16626ri(this.f9362ri.dzy.mo12235sf())).m14058lr(C3583qd.m16585ik(this.f9362ri.dzy.mo12235sf())).m14053ka(i2).m14049fi(i3).m14047di(i).m14062ri(sparseArray).m14055lr(C3304qt.m14669lr().m14700ri() ? 1 : 2).m14051ik(iM16600qt).m14059ri(C3583qd.m16598mj(C3299nr.m14642ri())).m14054lr(C3583qd.jbs(C3299nr.m14642ri())).m14066ri();
            HashMap map = new HashMap();
            map.put("duration", Long.valueOf(this.f9362ri.ihz.m12122aw()));
            String str = this.f9362ri.f9381fi;
            if (z) {
                str = "landingpage_endcard";
            }
            C3414ik.m15563ri("click_other", this.f9362ri.f9389lr, c3277coM14066ri, str, true, (Map<String, Object>) map, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: mj */
    public JSONObject m11975mj() {
        if (!this.f9362ri.f9410xe || this.f9362ri.ajz == null) {
            return null;
        }
        try {
            return C3414ik.m15527ri(this.f9362ri.ajz.f8475sf + 1);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: qt */
    private JSONObject m11976qt() {
        try {
            long jWjv = this.f9362ri.ihz.wjv();
            int iM12123ay = this.f9362ri.ihz.m12123ay();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", jWjv);
                jSONObject.put("percent", iM12123ay);
                return jSONObject;
            } catch (Throwable unused) {
                return jSONObject;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m11978ri(View view, float f, float f2, float f3, float f4, SparseArray<AbstractViewOnClickListenerC3218ik.ri> sparseArray, int i, int i2, int i3) {
        if (view == null) {
            return;
        }
        if (view.getId() == slm.xha) {
            m11983ri("click_play_star_level", (JSONObject) null);
        } else if (view.getId() == slm.f13261di || view.getId() == slm.jbs) {
            m11983ri("click_play_star_nums", (JSONObject) null);
        } else if (view.getId() == slm.f13268fi) {
            m11983ri("click_play_source", (JSONObject) null);
        } else if (view.getId() == slm.f13282ka) {
            m11983ri("click_play_logo", (JSONObject) null);
        } else if (view.getId() == slm.bgr || view.getId() == slm.iph || view.getId() == slm.f13289nr) {
            m11983ri("click_start_play_bar", m11976qt());
        } else if (view.getId() == 520093705) {
            m11983ri("click_start_play", m11976qt());
        } else if (view.getId() == slm.f13255aw) {
            m11983ri("click_video", m11976qt());
        } else if (view.getId() == 520093707 || view.getId() == slm.f13296qt) {
            m11983ri("fallback_endcard_click", m11976qt());
        }
        m11974lr(view, f, f2, f3, f4, sparseArray, i, i2, i3);
    }

    /* JADX INFO: renamed from: ri */
    private void m11979ri(C2889fi.ri riVar) {
        if (!this.f9362ri.f9410xe || this.f9362ri.ajz == null) {
            return;
        }
        riVar.f8613lr = this.f9362ri.ajz.f8475sf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m11983ri(String str, JSONObject jSONObject) {
        wjv wjvVar = this.f9362ri.f9389lr;
        String str2 = this.f9362ri.f9381fi;
        if (!this.f9362ri.f9387ka) {
            jSONObject = null;
        }
        C3414ik.m15554ri(wjvVar, str2, str, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m11984ri(JSONObject jSONObject, JSONObject jSONObject2, boolean z, int i, boolean z2) {
        C3283ka c3283kaM14473qc;
        wjv wjvVar = this.f9362ri.f9389lr;
        C3414ik.m15558ri(wjvVar, this.f9362ri.f9381fi, jSONObject, jSONObject2);
        this.f9362ri.f9397qd.mo10572qt();
        if (!z) {
            i = -1;
        }
        C2889fi.ri riVar = new C2889fi.ri(i);
        m11979ri(riVar);
        C2889fi.m11110ri(this.f9362ri.f9384ig.findViewById(R.id.content), wjvVar, riVar);
        C2897ik.m11145ri(wjvVar);
        if (!z2 || (c3283kaM14473qc = wjvVar.m14473qc()) == null) {
            return;
        }
        c3283kaM14473qc.m14188ri().m12481ri(0L);
    }

    private boolean xha() {
        C3022ri c3022ri = this.f9362ri;
        if (c3022ri == null) {
            return true;
        }
        return (c3022ri.ajz != null && this.f9362ri.ajz.m11008jc().m10969su()) && !this.f9362ri.tnn && (this.f9362ri.ajz != null && !this.f9362ri.ajz.m11024xm());
    }

    /* JADX INFO: renamed from: di */
    public void m11985di() {
        JSONObject jSONObject = new JSONObject();
        int i = 1;
        try {
            if (this.f9362ri.jbs.get()) {
                if (!this.f9362ri.ory.m12084ik()) {
                    if (this.f9362ri.hcw.m11825ka()) {
                        i = 3;
                    } else {
                        i = this.f9362ri.ory.m12086ka() ? 2 : 0;
                    }
                }
                jSONObject.put("endcard_content", i);
            } else {
                jSONObject.put("endCardNotShow", 1);
            }
        } catch (JSONException unused) {
        }
        C3414ik.m15522lr(this.f9362ri.f9389lr, this.f9362ri.f9381fi, "click_close", jSONObject);
    }

    /* JADX INFO: renamed from: fi */
    public AbstractC3217fi m11986fi() {
        return this.f9360ik;
    }

    /* JADX INFO: renamed from: ik */
    public AbstractC3217fi m11987ik() {
        this.f9360ik.m13528ri(this.f9362ri.f9384ig.findViewById(R.id.content));
        if (this.f9362ri.f9406uq.m11944ik() != null) {
            this.f9360ik.m13534ri(this.f9362ri.f9406uq.m11944ik());
        }
        this.f9362ri.wjv.m11970ri(this.f9360ik);
        this.f9360ik.m13546ri(new C3221ri.ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.qt.3
            @Override // com.bytedance.sdk.openadsdk.core.p219ik.C3221ri.ri
            public long getVideoProgress() {
                return C3021qt.this.f9362ri.ihz.m12122aw();
            }
        });
        C3075sf c3075sf = this.f9362ri.dzy;
        AbstractC3217fi abstractC3217fi = this.f9360ik;
        c3075sf.mo12232ri(abstractC3217fi, abstractC3217fi, this.f9361lr);
        this.f9362ri.f9409xd.m11899ri(this.f9360ik);
        if (C3273ac.m13956co(this.f9362ri.f9389lr) && this.f9362ri.f9394oh.f9314ri != null && this.f9362ri.f9394oh.f9314ri.getITopLayout() != null) {
            C3583qd.m16614ri(this.f9362ri.f9394oh.f9314ri.getITopLayout(), (View.OnClickListener) this.f9361lr, "LandPage#TopLayoutEmptyClick");
        }
        return this.f9360ik;
    }

    /* JADX INFO: renamed from: ik */
    public void m11988ik(boolean z) {
        C3022ri c3022ri = this.f9362ri;
        if (c3022ri != null && z && c3022ri.f9389lr.nhl() && !this.f9362ri.f9389lr.igq()) {
            this.f9362ri.f9389lr.xha(true);
            C3414ik.m15548ri(this.f9362ri.f9389lr, this.f9362ri.f9381fi, this.f9362ri.f9389lr.wzv());
        }
    }

    /* JADX INFO: renamed from: ka */
    public C3220lr m11989ka() {
        return this.f9361lr;
    }

    /* JADX INFO: renamed from: lr */
    public void m11990lr() {
        if (xha()) {
            return;
        }
        wjv wjvVar = this.f9362ri.f9389lr;
        if (wjvVar == null || !wjvVar.feb()) {
            JSONObject jSONObject = new JSONObject();
            boolean z = false;
            int iM12274sf = -1;
            try {
                if (this.f9362ri.f9389lr.m14383di() && this.f9362ri.f9374ay != null && this.f9362ri.f9389lr.ajz() == 2) {
                    jSONObject.put("dynamic_show_type", this.f9362ri.f9374ay.m12274sf());
                    this.f9362ri.f9374ay.m12264ri(jSONObject);
                    z = true;
                    iM12274sf = this.f9362ri.f9374ay.m12274sf();
                }
                View viewFindViewById = this.f9362ri.f9384ig.findViewById(R.id.content);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("width", viewFindViewById.getWidth());
                jSONObject2.put("height", viewFindViewById.getHeight());
                jSONObject2.put("alpha", viewFindViewById.getAlpha());
                jSONObject.put("root_view", jSONObject2.toString());
            } catch (Throwable th) {
                C2707ac.m10206ri("TTAD.RFReportManager", "reportShowWhenBindVideoAd error", th);
            }
            m11984ri(jSONObject, m11975mj(), z, iM12274sf, false);
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m11991lr(boolean z) {
        C3022ri c3022ri = this.f9362ri;
        if (c3022ri == null) {
            return;
        }
        if (z || c3022ri.gcp <= 0 || this.f9362ri.f9389lr == null || !this.f9362ri.f9389lr.feb()) {
            this.f9362ri.gcp = SystemClock.elapsedRealtime();
        } else {
            C3414ik.m15564ri(String.valueOf(SystemClock.elapsedRealtime() - this.f9362ri.gcp), this.f9362ri.f9389lr, this.f9362ri.f9381fi, this.f9362ri.ihz.m12129fi());
            this.f9362ri.gcp = 0L;
        }
        C2889fi.m11114ri(this.f9362ri.f9389lr, z ? 4 : 8);
        C2897ik.m11146ri(this.f9362ri.f9389lr, z ? 4 : 8);
    }

    /* JADX INFO: renamed from: ri */
    public AbstractC3217fi m11992ri(final C3022ri c3022ri, final wjv wjvVar) {
        return new AbstractC3217fi(c3022ri.f9384ig, wjvVar, c3022ri.f9381fi, c3022ri.f9387ka ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.qt.4
            @Override // com.bytedance.sdk.openadsdk.core.p219ik.AbstractC3217fi
            /* JADX INFO: renamed from: ri */
            public void mo11996ri(View view, float f, float f2, float f3, float f4, SparseArray<AbstractViewOnClickListenerC3218ik.ri> sparseArray, int i, int i2, int i3, boolean z) {
                if (wjvVar.m14576zz() && view != null) {
                    Object tag = view.getTag(570425345);
                    if (tag instanceof String) {
                        m13535ri((String) tag);
                    }
                }
                HashMap map = new HashMap();
                map.put("duration", Long.valueOf(c3022ri.ihz.m12122aw()));
                if (c3022ri.jbs.get()) {
                    map.put("click_scence", 2);
                } else {
                    map.put("click_scence", 1);
                }
                if (c3022ri.ajz != null) {
                    c3022ri.ajz.mo11019ri(map, f, f2);
                }
                m13536ri(map);
                c3022ri.f9397qd.mo10614xd();
                c3022ri.f9406uq.m11947ri(view, f, f2, f3, f4, sparseArray, i, i2, i3, new C3018ka.ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.qt.4.1
                    @Override // com.bytedance.sdk.openadsdk.component.reward.p188ri.C3018ka.ri
                    /* JADX INFO: renamed from: ri */
                    public void mo11948ri(View view2, float f5, float f6, float f7, float f8, SparseArray<AbstractViewOnClickListenerC3218ik.ri> sparseArray2, int i4, int i5, int i6) {
                        C3021qt.this.m11978ri(view2, f5, f6, f7, f8, sparseArray2, i4, i5, i6);
                    }

                    @Override // com.bytedance.sdk.openadsdk.component.reward.p188ri.C3018ka.ri
                    /* JADX INFO: renamed from: ri */
                    public void mo11949ri(String str, JSONObject jSONObject) {
                        C3021qt.this.m11983ri(str, jSONObject);
                    }
                });
                C2889fi.m11114ri(wjvVar, 9);
                c3022ri.ihz.feb();
            }
        };
    }

    /* JADX INFO: renamed from: ri */
    public void m11993ri() {
        wjv wjvVar;
        if (xha() || (wjvVar = this.f9362ri.f9389lr) == null || wjvVar.feb()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObjectM11975mj = m11975mj();
        boolean z = false;
        int iM12274sf = -1;
        try {
            if (this.f9362ri.m11999ik()) {
                if (jSONObjectM11975mj == null) {
                    jSONObjectM11975mj = new JSONObject();
                }
                int iM12003ri = this.f9362ri.m12003ri();
                if (1001 == iM12003ri) {
                    jSONObject.put("dynamic_show_type", iM12003ri + this.f9362ri.m12001lr());
                } else {
                    jSONObject.put("dynamic_show_type", iM12003ri);
                }
            } else if (this.f9362ri.f9389lr.m14383di() && this.f9362ri.f9374ay != null && this.f9362ri.f9389lr.ajz() == 2) {
                jSONObject.put("dynamic_show_type", this.f9362ri.f9374ay.m12274sf());
                this.f9362ri.f9374ay.m12264ri(jSONObject);
                z = true;
                iM12274sf = this.f9362ri.f9374ay.m12274sf();
            }
        } catch (JSONException e) {
            Log.e("TTAD.RFReportManager", "Inject render fail info to pagJsonData failed", e);
        }
        m11984ri(jSONObject, jSONObjectM11975mj, z, iM12274sf, true);
    }

    /* JADX INFO: renamed from: ri */
    public void m11994ri(final Map<String, Object> map) {
        if (xha()) {
            return;
        }
        wjv wjvVar = this.f9362ri.f9389lr;
        if (wjvVar == null || !wjvVar.feb()) {
            final View viewFindViewById = this.f9362ri.f9384ig.findViewById(R.id.content);
            if (viewFindViewById == null) {
                viewFindViewById = this.f9362ri.f9384ig.getWindow().getDecorView();
            }
            int width = viewFindViewById.getWidth();
            int height = viewFindViewById.getHeight();
            Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.qt.2
                @Override // java.lang.Runnable
                public void run() {
                    boolean z;
                    int iM12274sf;
                    Map map2;
                    C3022ri unused = C3021qt.this.f9362ri;
                    JSONObject jSONObject = null;
                    try {
                        jSONObject = map != null ? new JSONObject(map) : new JSONObject();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("width", viewFindViewById.getWidth());
                        jSONObject2.put("height", viewFindViewById.getHeight());
                        jSONObject2.put("alpha", viewFindViewById.getAlpha());
                        jSONObject.put("root_view", jSONObject2.toString());
                    } catch (Throwable th) {
                        C2707ac.m10206ri("TTAD.RFReportManager", "run: ", th);
                    }
                    JSONObject jSONObject3 = jSONObject;
                    if (C3021qt.this.f9362ri.f9374ay == null || (map2 = map) == null || !map2.containsKey("dynamic_show_type")) {
                        z = false;
                        iM12274sf = -1;
                    } else {
                        iM12274sf = C3021qt.this.f9362ri.f9374ay.m12274sf();
                        z = true;
                    }
                    C3021qt c3021qt = C3021qt.this;
                    c3021qt.m11984ri(jSONObject3, c3021qt.m11975mj(), z, iM12274sf, false);
                }
            };
            Thread.currentThread().getName();
            if (width <= 0 || height <= 0) {
                viewFindViewById.post(runnable);
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                viewFindViewById.post(runnable);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11995ri(boolean z) {
        if (this.f9362ri.f9389lr == null) {
            return;
        }
        C3531ka c3531kaM15973fi = C3531ka.m15967lr().m15984ri(z ? 7 : 8).m15975ik(String.valueOf(this.f9362ri.f9389lr.m14545ur())).m15973fi(this.f9362ri.f9389lr.m14424jf());
        c3531kaM15973fi.m15979lr(this.f9362ri.ory.m12092nr()).m15971di(this.f9362ri.ory.tan());
        c3531kaM15973fi.xha(this.f9362ri.f9389lr.yjg()).m15977ka(this.f9362ri.f9389lr.m14533tn());
        C3521ka.m15942ri().m15955lr(c3531kaM15973fi);
    }
}
