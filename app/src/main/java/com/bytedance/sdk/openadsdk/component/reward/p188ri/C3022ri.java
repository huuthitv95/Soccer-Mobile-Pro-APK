package com.bytedance.sdk.openadsdk.component.reward.p188ri;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj;
import com.bytedance.sdk.openadsdk.activity.single.C2853fi;
import com.bytedance.sdk.openadsdk.component.reward.C2986co;
import com.bytedance.sdk.openadsdk.component.reward.p187lr.AbstractC2998lr;
import com.bytedance.sdk.openadsdk.component.reward.top.C3060ik;
import com.bytedance.sdk.openadsdk.component.reward.view.C3066co;
import com.bytedance.sdk.openadsdk.component.reward.view.C3072mj;
import com.bytedance.sdk.openadsdk.component.reward.view.C3073qt;
import com.bytedance.sdk.openadsdk.component.reward.view.C3075sf;
import com.bytedance.sdk.openadsdk.component.reward.view.jbs;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.bytedance.sdk.openadsdk.p236ka.xha;
import com.bytedance.sdk.openadsdk.utils.bgr;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3022ri {
    public bgr aac;

    /* JADX INFO: renamed from: ac */
    public final AtomicBoolean f9372ac;
    public AbstractC2859mj ajz;

    /* JADX INFO: renamed from: aw */
    public final AtomicBoolean f9373aw;

    /* JADX INFO: renamed from: ay */
    public final jbs f9374ay;
    public final AtomicBoolean bgr;
    public int bnj;

    /* JADX INFO: renamed from: bu */
    public final AtomicBoolean f9375bu;

    /* JADX INFO: renamed from: co */
    public final AtomicBoolean f9376co;

    /* JADX INFO: renamed from: di */
    public final int f9377di;

    /* JADX INFO: renamed from: dw */
    public com.bytedance.sdk.openadsdk.p174aw.jbs f9378dw;
    public final C3075sf dzy;

    /* JADX INFO: renamed from: eb */
    private long f9379eb;

    /* JADX INFO: renamed from: fe */
    public int f9380fe;
    public String feb;

    /* JADX INFO: renamed from: fi */
    public final String f9381fi;

    /* JADX INFO: renamed from: fr */
    public final C3023sf f9382fr;
    public long gcp;
    public final C3004aw hcw;
    public boolean hpn;
    private int hws;

    /* JADX INFO: renamed from: id */
    public final boolean f9383id;

    /* JADX INFO: renamed from: ig */
    public final Activity f9384ig;
    public final C3009di igq;
    public final C3040vr ihz;

    /* JADX INFO: renamed from: ik */
    public final boolean f9385ik;
    public final AtomicBoolean jbs;

    /* JADX INFO: renamed from: jc */
    public final igq f9386jc;
    private String jxw;

    /* JADX INFO: renamed from: ka */
    public final boolean f9387ka;

    /* JADX INFO: renamed from: kt */
    public final boolean f9388kt;

    /* JADX INFO: renamed from: lr */
    public wjv f9389lr;
    public boolean luy;

    /* JADX INFO: renamed from: mj */
    public int f9390mj;

    /* JADX INFO: renamed from: nd */
    public AbstractC2998lr f9391nd;

    /* JADX INFO: renamed from: nh */
    private int f9392nh;

    /* JADX INFO: renamed from: nr */
    public final AtomicBoolean f9393nr;

    /* JADX INFO: renamed from: oh */
    public final C3008co f9394oh;
    public final slm ory;

    /* JADX INFO: renamed from: pc */
    public C3060ik f9395pc;

    /* JADX INFO: renamed from: pv */
    public final C3072mj f9396pv;

    /* JADX INFO: renamed from: qd */
    public final InterfaceC3118lr f9397qd;

    /* JADX INFO: renamed from: qh */
    public boolean f9398qh;
    public boolean qmx;

    /* JADX INFO: renamed from: qt */
    public final AtomicBoolean f9399qt;

    /* JADX INFO: renamed from: ri */
    public final int f9400ri;
    public boolean rzk;
    public boolean saa;

    /* JADX INFO: renamed from: sf */
    public final AtomicBoolean f9401sf;
    public float siy;
    public final AtomicBoolean slm;
    public final Context srn;

    /* JADX INFO: renamed from: su */
    public final C3021qt f9402su;

    /* JADX INFO: renamed from: ta */
    public boolean f9403ta;
    public final AtomicBoolean tan;
    public boolean tnn;

    /* JADX INFO: renamed from: tw */
    public boolean f9404tw;

    /* JADX INFO: renamed from: ud */
    public boolean f9405ud;

    /* JADX INFO: renamed from: uq */
    public final C3018ka f9406uq;

    /* JADX INFO: renamed from: vr */
    public final AtomicBoolean f9407vr;

    /* JADX INFO: renamed from: vt */
    private long f9408vt;
    public int whw;
    public final C3020mj wjv;

    /* JADX INFO: renamed from: xd */
    public final C3010fi f9409xd;

    /* JADX INFO: renamed from: xe */
    public boolean f9410xe;
    public int xha;

    /* JADX INFO: renamed from: xm */
    public int f9411xm;
    public boolean yjm;

    /* JADX INFO: renamed from: zb */
    public boolean f9412zb;

    /* JADX INFO: renamed from: zf */
    public final C3011ik f9413zf;

    /* JADX INFO: renamed from: zk */
    public C2986co f9414zk;
    public boolean zyn;

    public C3022ri(Activity activity, igq igqVar, wjv wjvVar, InterfaceC3118lr interfaceC3118lr, int i, boolean z) {
        this(activity, igqVar, wjvVar, interfaceC3118lr, i, z, null);
    }

    public C3022ri(Activity activity, igq igqVar, wjv wjvVar, InterfaceC3118lr interfaceC3118lr, int i, boolean z, C3022ri c3022ri) {
        this.xha = 0;
        this.f9390mj = 0;
        this.jbs = new AtomicBoolean(false);
        this.f9399qt = new AtomicBoolean(false);
        this.f9401sf = new AtomicBoolean(false);
        this.f9376co = new AtomicBoolean(false);
        this.f9373aw = new AtomicBoolean(false);
        this.bgr = new AtomicBoolean(false);
        this.f9407vr = new AtomicBoolean(false);
        this.slm = new AtomicBoolean(false);
        this.f9375bu = new AtomicBoolean(false);
        this.f9393nr = new AtomicBoolean(false);
        this.tan = new AtomicBoolean(false);
        this.f9372ac = new AtomicBoolean(false);
        this.tnn = false;
        this.bnj = 1;
        this.gcp = 0L;
        this.ajz = null;
        this.luy = true;
        this.hpn = false;
        this.qmx = false;
        this.hws = -1;
        this.jxw = "";
        this.f9392nh = 0;
        this.f9384ig = activity;
        this.f9397qd = interfaceC3118lr;
        Context contextM14642ri = C3299nr.m14642ri();
        this.srn = contextM14642ri;
        this.f9389lr = wjvVar;
        this.f9400ri = i;
        this.f9405ud = c3022ri != null;
        this.f9412zb = i == 0 || i == 1;
        this.f9388kt = i == 0 || i == 2;
        this.f9386jc = igqVar;
        this.f9383id = z;
        boolean z2 = wjvVar.m14388eb().getDurationSlotType() == 7;
        this.f9387ka = z2;
        this.f9381fi = z2 ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.f9404tw = wjvVar.m14383di();
        int iM14545ur = wjvVar.m14545ur();
        this.f9377di = iM14545ur;
        this.zyn = C3299nr.m14639ka().m14834bu(String.valueOf(iM14545ur));
        this.f9385ik = C3322sf.m14819lr().bgr(String.valueOf(iM14545ur));
        this.f9382fr = new C3023sf(this);
        this.dzy = i == 2 ? new C3066co(this) : wjvVar.m14383di() ? new C3075sf(this) : new C3073qt(this);
        this.f9396pv = new C3072mj(this);
        this.ihz = new C3040vr(this);
        this.f9406uq = new C3018ka(this);
        this.wjv = new C3020mj(this, wjvVar);
        jbs jbsVar = c3022ri != null ? c3022ri.f9374ay : new jbs(this);
        this.f9374ay = jbsVar;
        jbsVar.m12269ri(this);
        this.ory = new slm(this);
        this.hcw = new C3004aw(this);
        this.f9394oh = new C3008co(this);
        this.f9409xd = new C3010fi(this);
        this.f9402su = new C3021qt(this);
        C3009di c3009di = c3022ri != null ? c3022ri.igq : new C3009di(this);
        this.igq = c3009di;
        c3009di.m11876ri(this);
        this.f9413zf = new C3011ik(this);
        this.f9378dw = new com.bytedance.sdk.openadsdk.p174aw.jbs(contextM14642ri);
        this.aac = com.bytedance.sdk.openadsdk.utils.jbs.m16529ri(activity, new com.bytedance.sdk.openadsdk.utils.jbs.InterfaceC3576ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.ri.1
            @Override // com.bytedance.sdk.openadsdk.utils.jbs.InterfaceC3576ri
            /* JADX INFO: renamed from: lr */
            public void mo10648lr() {
                if (C3022ri.this.f9394oh != null) {
                    C3022ri.this.f9394oh.m11858fi();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.utils.jbs.InterfaceC3576ri
            /* JADX INFO: renamed from: ri */
            public View mo10649ri() {
                if (C3022ri.this.dzy != null) {
                    return C3022ri.this.dzy.mo12226qt();
                }
                return null;
            }
        });
    }

    /* JADX INFO: renamed from: di */
    public long m11997di() {
        return this.f9408vt + (SystemClock.elapsedRealtime() - this.f9379eb);
    }

    /* JADX INFO: renamed from: fi */
    public void m11998fi() {
        if (this.f9379eb <= 0) {
            this.f9379eb = SystemClock.elapsedRealtime();
        }
        this.f9408vt += SystemClock.elapsedRealtime() - this.f9379eb;
    }

    /* JADX INFO: renamed from: ik */
    public boolean m11999ik() {
        return this.f9392nh != 0;
    }

    public Map<String, Object> jbs() {
        wjv wjvVar;
        HashMap map = new HashMap();
        if (this.f9374ay != null && (wjvVar = this.f9389lr) != null && wjvVar.ajz() == 2) {
            map.put("dynamic_show_type", Integer.valueOf(this.f9374ay.m12274sf()));
            JSONObject jSONObjectM12264ri = this.f9374ay.m12264ri((JSONObject) null);
            if (jSONObjectM12264ri != null) {
                Iterator<String> itKeys = jSONObjectM12264ri.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        map.put(next, jSONObjectM12264ri.get(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ka */
    public void m12000ka() {
        this.f9379eb = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: lr */
    public int m12001lr() {
        return this.hws;
    }

    /* JADX INFO: renamed from: mj */
    public xha m12002mj() {
        if (!this.f9389lr.m14383di()) {
            xha xhaVar = new xha();
            xhaVar.m15724ri(System.currentTimeMillis(), 1.0f);
            return xhaVar;
        }
        jbs jbsVar = this.f9374ay;
        if (jbsVar != null && jbsVar.m12263ri() != null) {
            return this.f9374ay.m12263ri().getAdShowTime();
        }
        xha xhaVar2 = new xha();
        xhaVar2.m15724ri(System.currentTimeMillis(), 1.0f);
        return xhaVar2;
    }

    /* JADX INFO: renamed from: ri */
    public int m12003ri() {
        return this.f9392nh;
    }

    /* JADX INFO: renamed from: ri */
    public void m12004ri(int i, String str, int i2) {
        this.hws = i;
        this.jxw = str;
        this.f9392nh = i2;
    }

    /* JADX INFO: renamed from: ri */
    public void m12005ri(boolean z) {
        this.f9398qh = z;
        this.f9394oh.m11863ka(z);
    }

    public boolean xha() {
        AbstractC2859mj abstractC2859mj;
        return !this.f9410xe || (abstractC2859mj = this.ajz) == null || !(abstractC2859mj instanceof C2853fi) || ((C2853fi) abstractC2859mj).f8283ri;
    }
}
