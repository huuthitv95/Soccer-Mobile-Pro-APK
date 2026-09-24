package com.bytedance.sdk.openadsdk.core.model;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2707ac;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.zf */
/* JADX INFO: loaded from: classes3.dex */
public class C3298zf {

    /* JADX INFO: renamed from: di */
    private String f11496di;

    /* JADX INFO: renamed from: fi */
    private String f11497fi;

    /* JADX INFO: renamed from: ik */
    private int f11498ik;
    private String jbs;

    /* JADX INFO: renamed from: ka */
    private int f11499ka;

    /* JADX INFO: renamed from: lr */
    private String f11500lr;

    /* JADX INFO: renamed from: mj */
    private int f11501mj;

    /* JADX INFO: renamed from: qt */
    private String f11502qt;

    /* JADX INFO: renamed from: ri */
    private String f11503ri;

    /* JADX INFO: renamed from: sf */
    private int f11504sf;
    private String xha;

    /* JADX INFO: renamed from: ri */
    public static C3298zf m14616ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C3298zf c3298zf = new C3298zf();
        try {
            c3298zf.m14618di(jSONObject.optString("market_dpl", ""));
            c3298zf.xha(jSONObject.optString("market_dpl_auto", ""));
            c3298zf.m14622ik(jSONObject.optInt("exec_type", 0));
            c3298zf.m14625ka(jSONObject.optInt("oem_vendor_type", 0));
            c3298zf.m14626ka(jSONObject.optString("market_pkg", ""));
            c3298zf.m14620fi(jSONObject.optString("regex", ""));
            c3298zf.m14628lr(jSONObject.optInt("overlay", 1));
            c3298zf.m14629lr(jSONObject.optString("caller_id", ""));
            c3298zf.m14623ik(jSONObject.optString("ext_map", null));
            c3298zf.m14633ri(jSONObject.optInt("gp_card", 0));
            c3298zf.m14635ri(jSONObject.optString("app_pkg", ""));
            return c3298zf;
        } catch (Throwable th) {
            C2707ac.m10196ik("OemModel", th.getMessage());
            return c3298zf;
        }
    }

    /* JADX INFO: renamed from: di */
    public int m14617di() {
        return this.f11499ka;
    }

    /* JADX INFO: renamed from: di */
    public void m14618di(String str) {
        this.f11503ri = str;
    }

    /* JADX INFO: renamed from: fi */
    public String m14619fi() {
        return this.f11496di;
    }

    /* JADX INFO: renamed from: fi */
    public void m14620fi(String str) {
        this.f11496di = str;
    }

    /* JADX INFO: renamed from: ik */
    public String m14621ik() {
        return this.jbs;
    }

    /* JADX INFO: renamed from: ik */
    public void m14622ik(int i) {
        this.f11498ik = i;
    }

    /* JADX INFO: renamed from: ik */
    public void m14623ik(String str) {
        this.f11502qt = str;
    }

    public boolean jbs() {
        return this.f11504sf == 1;
    }

    /* JADX INFO: renamed from: ka */
    public String m14624ka() {
        return this.f11497fi;
    }

    /* JADX INFO: renamed from: ka */
    public void m14625ka(int i) {
        this.f11499ka = i;
    }

    /* JADX INFO: renamed from: ka */
    public void m14626ka(String str) {
        this.f11497fi = str;
    }

    /* JADX INFO: renamed from: lr */
    public int m14627lr() {
        return this.f11501mj;
    }

    /* JADX INFO: renamed from: lr */
    public void m14628lr(int i) {
        this.f11501mj = i;
    }

    /* JADX INFO: renamed from: lr */
    public void m14629lr(String str) {
        this.jbs = str;
    }

    /* JADX INFO: renamed from: mj */
    public boolean m14630mj() {
        return this.f11499ka == 2;
    }

    /* JADX INFO: renamed from: qt */
    public String m14631qt() {
        return this.f11498ik == 2 ? this.f11500lr : this.f11503ri;
    }

    /* JADX INFO: renamed from: ri */
    public String m14632ri() {
        return this.xha;
    }

    /* JADX INFO: renamed from: ri */
    public void m14633ri(int i) {
        this.f11504sf = i;
    }

    /* JADX INFO: renamed from: ri */
    public void m14634ri(Intent intent) {
        if (TextUtils.isEmpty(this.f11502qt)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.f11502qt);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    intent.putExtra(next, (String) obj);
                } else if (obj instanceof Integer) {
                    intent.putExtra(next, (Integer) obj);
                } else if (obj instanceof Boolean) {
                    intent.putExtra(next, (Boolean) obj);
                } else if (obj instanceof Long) {
                    intent.putExtra(next, (Long) obj);
                } else if (obj instanceof Double) {
                    intent.putExtra(next, (Double) obj);
                } else if (obj instanceof Float) {
                    intent.putExtra(next, (Float) obj);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m14635ri(String str) {
        this.xha = str;
    }

    /* JADX INFO: renamed from: sf */
    public JSONObject m14636sf() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f11503ri)) {
                jSONObject.put("market_dpl", this.f11503ri);
            }
            if (!TextUtils.isEmpty(this.f11500lr)) {
                jSONObject.put("market_dpl_auto", this.f11500lr);
            }
            if (!TextUtils.isEmpty(this.f11497fi)) {
                jSONObject.put("market_pkg", this.f11497fi);
            }
            if (!TextUtils.isEmpty(this.xha)) {
                jSONObject.put("app_pkg", this.xha);
            }
            if (!TextUtils.isEmpty(this.f11496di)) {
                jSONObject.put("regex", this.f11496di);
            }
            jSONObject.put("exec_type", this.f11498ik);
            jSONObject.put("oem_vendor_type", this.f11499ka);
            jSONObject.put("overlay", this.f11501mj);
            jSONObject.put("gp_card", this.f11504sf);
            if (!TextUtils.isEmpty(this.jbs)) {
                jSONObject.put("caller_id", this.jbs);
            }
            if (!TextUtils.isEmpty(this.f11502qt)) {
                jSONObject.put("ext_map", this.f11502qt);
            }
            return jSONObject;
        } catch (Throwable th) {
            C2707ac.m10196ik("OemModel", th.getMessage());
            return null;
        }
    }

    public void xha(String str) {
        this.f11500lr = str;
    }

    public boolean xha() {
        return this.f11499ka == 1;
    }
}
