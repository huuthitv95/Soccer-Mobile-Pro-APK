package com.bytedance.sdk.openadsdk.core.p190aw.p192lr;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2728su;
import com.bytedance.sdk.component.xha.C2739lr;
import com.bytedance.sdk.component.xha.p170lr.AbstractC2740ik;
import com.bytedance.sdk.component.xha.p170lr.C2742lr;
import com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p190aw.p191ik.C3093ik;
import com.bytedance.sdk.openadsdk.core.p190aw.p193ri.EnumC3106ri;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aw.lr.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C3099ik {

    /* JADX INFO: renamed from: di */
    private boolean f9817di;

    /* JADX INFO: renamed from: fi */
    private ik f9818fi;

    /* JADX INFO: renamed from: ik */
    private final String f9819ik;

    /* JADX INFO: renamed from: ka */
    private final boolean f9820ka;

    /* JADX INFO: renamed from: ri */
    private static final Map<String, lr> f9816ri = new ConcurrentHashMap();

    /* JADX INFO: renamed from: lr */
    private static final AtomicBoolean f9815lr = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aw.lr.ik$ik */
    enum ik {
        TRACKING_URL,
        QUARTILE_EVENT
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aw.lr.ik$lr */
    public static class lr {

        /* JADX INFO: renamed from: ik */
        float f9836ik;

        /* JADX INFO: renamed from: lr */
        String f9837lr;

        /* JADX INFO: renamed from: ri */
        final wjv f9838ri;

        public lr(String str, wjv wjvVar) {
            this(str, wjvVar, -1.0f);
        }

        public lr(String str, wjv wjvVar, float f) {
            this.f9837lr = str;
            this.f9838ri = wjvVar;
            this.f9836ik = f;
        }

        public String toString() {
            return super.toString();
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aw.lr.ik$ri */
    public static class ri {

        /* JADX INFO: renamed from: ri */
        private final String f9841ri;

        /* JADX INFO: renamed from: lr */
        private ik f9840lr = ik.TRACKING_URL;

        /* JADX INFO: renamed from: ik */
        private boolean f9839ik = false;

        public ri(String str) {
            this.f9841ri = str;
        }

        /* JADX INFO: renamed from: ri */
        public ri m12509ri(boolean z) {
            this.f9839ik = z;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public C3099ik m12510ri() {
            return new C3099ik(this.f9841ri, this.f9840lr, Boolean.valueOf(this.f9839ik));
        }
    }

    static {
        C2728su.m10298ri(new C2728su.ri() { // from class: com.bytedance.sdk.openadsdk.core.aw.lr.ik.1
            @Override // com.bytedance.sdk.component.utils.C2728su.ri
            /* JADX INFO: renamed from: ri */
            public void mo10299ri(Context context, Intent intent, boolean z, int i) {
                if (i == 0 || C3099ik.f9816ri.size() <= 0) {
                    return;
                }
                C3099ik.xha();
            }
        }, C3299nr.m14642ri());
    }

    protected C3099ik(String str, ik ikVar, Boolean bool) {
        this.f9819ik = str;
        this.f9818fi = ikVar;
        this.f9820ka = bool.booleanValue();
    }

    /* JADX INFO: renamed from: ik */
    public static List<C3101ri> m12494ik(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new C3101ri.ri(jSONObjectOptJSONObject.optString("content"), jSONObjectOptJSONObject.optLong("trackingMilliseconds", 0L)).m12518ri());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: lr */
    public static List<C3100lr> m12495lr(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new C3100lr.ri(jSONObjectOptJSONObject.optString("content"), (float) jSONObjectOptJSONObject.optDouble("trackingFraction", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)).m12513ri());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: lr */
    public static void m12496lr(wjv wjvVar, List<C3099ik> list, EnumC3106ri enumC3106ri, long j, String str, String str2) {
        m12504ri(wjvVar, list, enumC3106ri, j, str, null, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public static void m12497lr(final boolean z, final String str, final String str2, final lr lrVar, final String str3, final boolean z2) {
        if (lrVar == null || lrVar.f9838ri == null) {
            return;
        }
        final boolean zM14576zz = lrVar.f9838ri.m14576zz();
        final String str4 = zM14576zz ? "dsp_track_link_result" : "track_link_result";
        C3414ik.m15533ri(new AbstractRunnableC2676ik(str4) { // from class: com.bytedance.sdk.openadsdk.core.aw.lr.ik.3
            @Override // java.lang.Runnable
            public void run() {
                final JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("type", lrVar.f9837lr);
                    jSONObject.put("success", z);
                    jSONObject.put("url", str3);
                    if (zM14576zz) {
                        if (!TextUtils.isEmpty(str)) {
                            jSONObject.put("description", str);
                        }
                        if (lrVar.f9836ik >= 0.0f) {
                            jSONObject.put("progress", ((double) Math.round(lrVar.f9836ik * 100.0f)) / 100.0d);
                        }
                    }
                } catch (Throwable unused) {
                }
                C3414ik.m15532ri(System.currentTimeMillis(), lrVar.f9838ri, str2, str4, new C3527ri() { // from class: com.bytedance.sdk.openadsdk.core.aw.lr.ik.3.1
                    @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                    /* JADX INFO: renamed from: ik */
                    public JSONObject mo11121ik() {
                        return jSONObject;
                    }

                    @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                    /* JADX INFO: renamed from: ri */
                    public JSONObject mo10798ri() {
                        if (!z2) {
                            return null;
                        }
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("retry", true);
                            return jSONObject2;
                        } catch (Throwable unused2) {
                            return null;
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static List<String> m12498ri(wjv wjvVar, List<C3099ik> list, EnumC3106ri enumC3106ri, long j, String str, String str2) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (C3099ik c3099ik : list) {
            if (c3099ik != null && (!c3099ik.m12506ka() || c3099ik.m12505ik())) {
                arrayList.add(c3099ik.m12508lr());
                c3099ik.mo12507l_();
            }
        }
        return arrayList.isEmpty() ? arrayList : new C3093ik(arrayList, wjvVar).m12435ri(enumC3106ri).m12434ri(j).m12433lr(str).m12436ri(str2).m12437ri();
    }

    /* JADX INFO: renamed from: ri */
    public static List<C3099ik> m12499ri(JSONArray jSONArray) {
        return m12500ri(jSONArray, false);
    }

    /* JADX INFO: renamed from: ri */
    public static List<C3099ik> m12500ri(JSONArray jSONArray, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String strOptString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(strOptString)) {
                    arrayList.add(new ri(strOptString).m12509ri(z).m12510ri());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ri */
    private static void m12501ri(final String str, final lr lrVar, final boolean z) {
        C2742lr c2742lrM10410ik = C2751lr.m10463lr().m10466ik().m10410ik();
        if (c2742lrM10410ik == null) {
            return;
        }
        c2742lrM10410ik.m10393ri(true);
        c2742lrM10410ik.m10365ik(str);
        c2742lrM10410ik.m10392ri(new AbstractC2746ri() { // from class: com.bytedance.sdk.openadsdk.core.aw.lr.ik.2
            @Override // com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri
            /* JADX INFO: renamed from: ri */
            public void mo10425ri(AbstractC2740ik abstractC2740ik, C2739lr c2739lr) {
                String str2;
                boolean z2;
                lr lrVar2 = lrVar;
                if (lrVar2 == null || lrVar2.f9838ri == null) {
                    return;
                }
                String str3 = null;
                if (c2739lr == null || !c2739lr.m10354di()) {
                    if (c2739lr != null) {
                        str3 = c2739lr.m10359ri() + CertificateUtil.DELIMITER + c2739lr.m10358lr();
                        if (!z && (c2739lr.m10359ri() <= 300 || c2739lr.m10359ri() >= 400)) {
                            C3099ik.f9816ri.put(str, lrVar);
                        }
                    }
                    str2 = str3;
                    z2 = false;
                } else {
                    str2 = null;
                    z2 = true;
                }
                C3099ik.m12497lr(z2, str2, C3571ig.m16444ik(lrVar.f9838ri.lji()), lrVar, str, z);
                if (!z2 || C3099ik.f9816ri.isEmpty()) {
                    return;
                }
                C3099ik.xha();
            }

            @Override // com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri
            /* JADX INFO: renamed from: ri */
            public void mo10423ri(AbstractC2740ik abstractC2740ik, IOException iOException) {
                lr lrVar2 = lrVar;
                if (lrVar2 != null && lrVar2.f9838ri != null) {
                    C3099ik.m12497lr(false, iOException != null ? iOException.getMessage() : null, C3571ig.m16444ik(lrVar.f9838ri.lji()), lrVar, str, z);
                }
                if (z || lrVar == null) {
                    return;
                }
                C3099ik.f9816ri.put(str, lrVar);
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m12502ri(List<String> list, lr lrVar) {
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (!TextUtils.isEmpty(str)) {
                m12501ri(str, lrVar, false);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m12504ri(wjv wjvVar, List<C3099ik> list, EnumC3106ri enumC3106ri, long j, String str, lr lrVar, String str2) {
        List<String> listM12498ri = m12498ri(wjvVar, list, enumC3106ri, j, str, str2);
        m12502ri(listM12498ri, lrVar);
        return !listM12498ri.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void xha() {
        if (f9815lr.compareAndSet(false, true)) {
            Map<String, lr> map = f9816ri;
            HashSet<Map.Entry> hashSet = new HashSet(map.entrySet());
            map.clear();
            for (Map.Entry entry : hashSet) {
                if (entry != null) {
                    m12501ri((String) entry.getKey(), (lr) entry.getValue(), true);
                }
            }
            f9815lr.set(false);
        }
    }

    /* JADX INFO: renamed from: ik */
    public boolean m12505ik() {
        return this.f9820ka;
    }

    /* JADX INFO: renamed from: ka */
    public boolean m12506ka() {
        return this.f9817di;
    }

    /* JADX INFO: renamed from: l_ */
    public void mo12507l_() {
        this.f9817di = true;
    }

    /* JADX INFO: renamed from: lr */
    public String m12508lr() {
        return this.f9819ik;
    }
}
