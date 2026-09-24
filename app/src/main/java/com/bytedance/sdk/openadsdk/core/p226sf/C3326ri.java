package com.bytedance.sdk.openadsdk.core.p226sf;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.C3089aw;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.p224qt.C3307lr;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p233lr.C3369ri;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3531ka;
import com.bytedance.sdk.openadsdk.slm.p261ri.InterfaceC3530ik;
import com.bytedance.sdk.openadsdk.tan.p263ka.C3535ri;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import com.pgl.ssdk.ces.out.PglSSCallBack;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.sf.ri */
/* JADX INFO: loaded from: classes3.dex */
class C3326ri {

    /* JADX INFO: renamed from: ik */
    private volatile boolean f11654ik = true;

    /* JADX INFO: renamed from: ka */
    private volatile boolean f11655ka = false;

    /* JADX INFO: renamed from: lr */
    private volatile boolean f11656lr;

    /* JADX INFO: renamed from: ri */
    private PglSSManager f11657ri;

    public C3326ri() {
        m14945ri();
    }

    /* JADX INFO: renamed from: ik */
    private void m14934ik(final String str) {
        if (this.f11655ka || TextUtils.isEmpty(str)) {
            return;
        }
        C3299nr.m14637fi().mo15674ri(new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.core.sf.ri.4
            @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
            /* JADX INFO: renamed from: ri */
            public InterfaceC3530ik mo11574ri() throws Exception {
                return C3531ka.m15967lr().m15985ri("secsdk_init_error").m15980lr(str);
            }
        }, false);
        this.f11655ka = true;
    }

    private void jbs() {
        if (this.f11657ri == null) {
            this.f11657ri = PglSSManager.getInstance();
        }
    }

    /* JADX INFO: renamed from: mj */
    private boolean m14935mj() {
        if (!this.f11656lr && this.f11654ik) {
            m14945ri();
        }
        return this.f11656lr;
    }

    /* JADX INFO: renamed from: qt */
    private Class m14936qt() {
        Class<?> cls;
        try {
            cls = Class.forName("com.pgl.ssdk.ces.out.PglSSManager");
            try {
                this.f11654ik = true;
                return cls;
            } catch (Throwable unused) {
                this.f11654ik = false;
                return cls;
            }
        } catch (Throwable unused2) {
            cls = null;
        }
    }

    /* JADX INFO: renamed from: di */
    public long m14938di() {
        if (!m14935mj()) {
            return 0L;
        }
        jbs();
        PglSSManager pglSSManager = this.f11657ri;
        if (pglSSManager != null) {
            return pglSSManager.getECForBidding();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: fi */
    public String m14939fi() {
        if (!m14935mj()) {
            return "";
        }
        jbs();
        PglSSManager pglSSManager = this.f11657ri;
        return pglSSManager != null ? pglSSManager.getSofChara() : "";
    }

    /* JADX INFO: renamed from: ik */
    public void m14940ik() {
        if (m14935mj()) {
            jbs();
            if (this.f11657ri != null) {
                C3332vr.m14978lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sf.ri.3
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            HashMap map = new HashMap();
                            map.put(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ, C3299nr.m14639ka().m14888uq());
                            C3326ri.this.f11657ri.setCustomInfo(map);
                        } catch (Throwable th) {
                            C2707ac.m10197ik("MSSdkImpl", "setCustomInfo", th.getMessage());
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: ka */
    public String m14941ka() {
        if (!m14935mj()) {
            return "";
        }
        jbs();
        PglSSManager pglSSManager = this.f11657ri;
        return pglSSManager != null ? pglSSManager.getToken() : "";
    }

    /* JADX INFO: renamed from: lr */
    public void m14942lr(String str) {
        if (m14935mj()) {
            jbs();
            PglSSManager pglSSManager = this.f11657ri;
            if (pglSSManager != null) {
                pglSSManager.setDeviceId(str);
            }
        }
    }

    /* JADX INFO: renamed from: lr */
    public boolean m14943lr() {
        return this.f11656lr;
    }

    /* JADX INFO: renamed from: ri */
    public Map<String, String> m14944ri(String str, byte[] bArr) {
        Map<String, String> featureHash;
        return (!m14935mj() || (featureHash = this.f11657ri.getFeatureHash(str, bArr)) == null) ? new HashMap() : featureHash;
    }

    /* JADX INFO: renamed from: ri */
    public synchronized void m14945ri() {
        if (C3307lr.m14718ri().m14722fi()) {
            return;
        }
        if (!this.f11656lr) {
            try {
                Context contextM14642ri = C3299nr.m14642ri();
                String strM14689ka = C3304qt.m14669lr().m14689ka();
                if (TextUtils.isEmpty(strM14689ka)) {
                    strM14689ka = C3304qt.m14673ri("app_id", Long.MAX_VALUE);
                }
                if (TextUtils.isEmpty(strM14689ka)) {
                    return;
                }
                String strM12377ri = C3089aw.m12377ri(contextM14642ri);
                String strM15229lr = C3369ri.m15224ri().m15229lr();
                PglSSConfig pglSSConfigBuild = PglSSConfig.builder().setAppId(strM14689ka).setOVRegionType(2).setAdsdkVersion(BuildConfig.VERSION_NAME).build();
                String strM16058lr = C3535ri.m16058lr("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
                HashMap map = new HashMap();
                if (!TextUtils.isEmpty(strM16058lr)) {
                    map.put(PglSSConfig.CUSTOMINFO_KEY_IPV6, strM16058lr);
                }
                Set<String> setM14899zv = C3322sf.m14819lr().m14899zv();
                if (setM14899zv != null && !setM14899zv.isEmpty()) {
                    map.put(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, setM14899zv);
                }
                String strM16464nr = C3571ig.m16464nr();
                if (!TextUtils.isEmpty(strM16464nr)) {
                    map.put(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST, strM16464nr);
                }
                map.put(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC, C3322sf.m14819lr().tpb());
                String strM16707ri = C3606fi.m16707ri(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, "");
                if (!TextUtils.isEmpty(strM16707ri)) {
                    map.put(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, strM16707ri);
                }
                pglSSConfigBuild.setCustomInfo(map);
                pglSSConfigBuild.setCallBack(new PglSSCallBack() { // from class: com.bytedance.sdk.openadsdk.core.sf.ri.1
                    @Override // com.pgl.ssdk.ces.out.PglSSCallBack
                    public void reportSoftDecData(final String str, final String str2) {
                        C3521ka.m15952ri(str, false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.core.sf.ri.1.1
                            @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
                            /* JADX INFO: renamed from: ri */
                            public InterfaceC3530ik mo11574ri() throws Exception {
                                return C3531ka.m15967lr().m15985ri(str).m15980lr(str2);
                            }
                        });
                    }
                });
                PglSSManager.init(contextM14642ri, pglSSConfigBuild, null, null, strM12377ri, strM15229lr);
                jbs();
                this.f11656lr = true;
            } catch (Throwable unused) {
                m14936qt();
                this.f11656lr = false;
            }
            try {
                if (this.f11654ik) {
                    m14934ik(PglSSManager.getLoadError());
                }
            } catch (Throwable th) {
                C2707ac.m10196ik("mssdk", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m14946ri(MotionEvent motionEvent) {
        if (m14943lr()) {
            jbs();
            PglSSManager pglSSManager = this.f11657ri;
            if (pglSSManager != null) {
                pglSSManager.checkEventVirtual(motionEvent);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m14947ri(String str) {
        if (m14935mj()) {
            jbs();
            PglSSManager pglSSManager = this.f11657ri;
            if (pglSSManager != null) {
                pglSSManager.setGaid(str);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m14948ri(String str, Map<String, Object> map) {
        if (m14935mj()) {
            jbs();
            PglSSManager pglSSManager = this.f11657ri;
            if (pglSSManager != null) {
                pglSSManager.reportNow(str, map);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m14949ri(final Map<String, Object> map) {
        if (m14935mj()) {
            jbs();
            if (this.f11657ri != null) {
                C3332vr.m14978lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sf.ri.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C3326ri.this.f11657ri.setCustomInfo(map);
                        } catch (Throwable th) {
                            C2707ac.m10197ik("MSSdkImpl", "setCustomInfo", th.getMessage());
                        }
                    }
                });
            }
        }
    }

    public int xha() {
        if (this.f11654ik) {
            return PglSSManager.getInitStatus();
        }
        return 5;
    }
}
