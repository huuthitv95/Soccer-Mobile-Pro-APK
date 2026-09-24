package com.bytedance.sdk.openadsdk.core.p190aw.p193ri;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.xha.C2739lr;
import com.bytedance.sdk.component.xha.p170lr.C2742lr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p190aw.C3104ri;
import com.bytedance.sdk.openadsdk.core.p190aw.p192lr.C3099ik;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.File;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aw.ri.lr */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3105lr {

    /* JADX INFO: renamed from: di */
    public ri f9865di;

    /* JADX INFO: renamed from: fi */
    public int f9866fi;

    /* JADX INFO: renamed from: ik */
    protected int f9867ik;

    /* JADX INFO: renamed from: ka */
    protected double f9868ka;

    /* JADX INFO: renamed from: lr */
    protected final Context f9869lr;

    /* JADX INFO: renamed from: ri */
    public int f9870ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aw.ri.lr$ri */
    public static class ri {

        /* JADX INFO: renamed from: ik */
        public boolean f9871ik;

        /* JADX INFO: renamed from: lr */
        public int f9872lr;

        /* JADX INFO: renamed from: ri */
        public int f9873ri;
    }

    public AbstractC3105lr(Context context, int i, int i2) {
        this.f9867ik = 0;
        this.f9868ka = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        if (i2 > 0 && i > 0) {
            this.f9868ka = ((double) i) / ((double) i2);
        }
        float fM16598mj = C3583qd.m16598mj(context);
        if (fM16598mj != 0.0f && i > 0) {
            this.f9867ik = (int) (i / fM16598mj);
        }
        this.f9869lr = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: ri */
    public abstract C3104ri mo12555ri(String str, File file, List<C3099ik> list);

    /* JADX INFO: renamed from: ri */
    protected String m12556ri(String str, List<C3099ik> list) {
        int i = this.f9870ri;
        String strM10357ka = null;
        if (i >= 5) {
            return null;
        }
        this.f9870ri = i + 1;
        if (str == null) {
            return null;
        }
        try {
            C2742lr c2742lrM10410ik = C2751lr.m10463lr().m10466ik().m10410ik();
            c2742lrM10410ik.m10365ik(str);
            C2739lr c2739lrM10391ri = c2742lrM10410ik.m10391ri();
            strM10357ka = c2739lrM10391ri.m10357ka();
            c2739lrM10391ri.m10359ri();
            return strM10357ka;
        } catch (Exception e) {
            m12557ri(e, 0);
            if (!list.isEmpty()) {
                C3099ik.m12496lr((wjv) null, list, EnumC3106ri.WRAPPER_TIMEOUT, -1L, (String) null, (String) null);
            }
            return strM10357ka;
        }
    }

    /* JADX INFO: renamed from: ri */
    protected void m12557ri(Exception exc, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception", exc.getMessage());
            jSONObject.put("error_code", i);
            C3521ka.m15942ri().m15958ri("load_vast", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    protected boolean m12558ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return Integer.parseInt(str) < 2;
        } catch (NumberFormatException unused) {
            return true;
        }
    }
}
