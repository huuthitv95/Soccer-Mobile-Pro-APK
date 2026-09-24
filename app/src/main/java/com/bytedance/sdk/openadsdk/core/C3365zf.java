package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.zf */
/* JADX INFO: loaded from: classes3.dex */
public class C3365zf {

    /* JADX INFO: renamed from: ri */
    public static ConcurrentHashMap<Integer, C3365zf> f11896ri = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: di */
    private String f11897di;

    /* JADX INFO: renamed from: fi */
    private int f11898fi;

    /* JADX INFO: renamed from: ka */
    private int f11900ka;

    /* JADX INFO: renamed from: lr */
    private String f11901lr = "";

    /* JADX INFO: renamed from: ik */
    private String f11899ik = "";

    /* JADX INFO: renamed from: di */
    private void m15144di() {
        this.f11901lr = "";
        this.f11899ik = "";
        this.f11900ka = 0;
        this.f11898fi = 0;
    }

    /* JADX INFO: renamed from: ik */
    public static void m15145ik(int i) {
        C3365zf c3365zf;
        if (i == 0) {
            return;
        }
        if (f11896ri == null) {
            f11896ri = new ConcurrentHashMap<>();
        }
        if (!f11896ri.containsKey(Integer.valueOf(i)) || (c3365zf = f11896ri.get(Integer.valueOf(i))) == null) {
            return;
        }
        c3365zf.m15152lr(1);
    }

    /* JADX INFO: renamed from: ik */
    public static void m15146ik(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        C3365zf c3365zf;
        if (wjvVar == null) {
            return;
        }
        int iM14545ur = wjvVar.m14545ur();
        Integer numValueOf = Integer.valueOf(iM14545ur);
        numValueOf.getClass();
        if (iM14545ur == 0) {
            return;
        }
        if (f11896ri == null) {
            f11896ri = new ConcurrentHashMap<>();
        }
        if (!f11896ri.containsKey(numValueOf) || (c3365zf = f11896ri.get(numValueOf)) == null) {
            return;
        }
        c3365zf.m15154ri(1);
    }

    /* JADX INFO: renamed from: lr */
    public static void m15147lr(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        if (wjvVar == null || TextUtils.isEmpty(wjvVar.yjg())) {
            return;
        }
        int iM14545ur = wjvVar.m14545ur();
        Integer numValueOf = Integer.valueOf(iM14545ur);
        numValueOf.getClass();
        if (iM14545ur == 0) {
            return;
        }
        if (f11896ri == null) {
            f11896ri = new ConcurrentHashMap<>();
        }
        C3365zf c3365zf = f11896ri.containsKey(numValueOf) ? f11896ri.get(numValueOf) : null;
        if (c3365zf == null) {
            c3365zf = new C3365zf();
        }
        String strM14424jf = wjvVar.m14424jf();
        if (TextUtils.isEmpty(strM14424jf) || !strM14424jf.equals(c3365zf.m15153ri())) {
            c3365zf.m15144di();
            c3365zf.m15155ri(wjvVar);
            f11896ri.put(numValueOf, c3365zf);
        }
    }

    /* JADX INFO: renamed from: fi */
    public int m15148fi() {
        return this.f11898fi;
    }

    /* JADX INFO: renamed from: ik */
    public String m15149ik() {
        return this.f11899ik;
    }

    /* JADX INFO: renamed from: ka */
    public int m15150ka() {
        return this.f11900ka;
    }

    /* JADX INFO: renamed from: lr */
    public String m15151lr() {
        return this.f11901lr;
    }

    /* JADX INFO: renamed from: lr */
    public void m15152lr(int i) {
        this.f11898fi = i;
    }

    /* JADX INFO: renamed from: ri */
    public String m15153ri() {
        return this.f11897di;
    }

    /* JADX INFO: renamed from: ri */
    public void m15154ri(int i) {
        this.f11900ka = i;
    }

    /* JADX INFO: renamed from: ri */
    public void m15155ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        if (wjvVar != null) {
            String strM14424jf = wjvVar.m14424jf();
            if (!TextUtils.isEmpty(strM14424jf)) {
                this.f11897di = strM14424jf;
            }
            String strSmj = wjvVar.smj();
            if (TextUtils.isEmpty(strSmj) && wjvVar.m14576zz()) {
                strSmj = wjvVar.m14525sr().jbs();
            }
            if (!TextUtils.isEmpty(strSmj)) {
                String[] strArrSplit = strSmj.split(RemoteSettings.FORWARD_SLASH_STRING);
                if (strArrSplit.length >= 3) {
                    this.f11901lr = strArrSplit[2];
                }
            }
            if (wjvVar.tyz() == null || TextUtils.isEmpty(wjvVar.tyz().m14069ik())) {
                return;
            }
            this.f11899ik = wjvVar.tyz().m14069ik();
        }
    }
}
