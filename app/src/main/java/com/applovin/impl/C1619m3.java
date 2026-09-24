package com.applovin.impl;

import android.os.Bundle;
import androidx.arch.core.util.Function;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.m3 */
/* JADX INFO: loaded from: classes3.dex */
public class C1619m3 {

    /* JADX INFO: renamed from: a */
    protected final C1748l f2055a;

    /* JADX INFO: renamed from: b */
    private final JSONObject f2056b;

    /* JADX INFO: renamed from: d */
    protected final JSONObject f2058d;

    /* JADX INFO: renamed from: f */
    private final Map f2060f;

    /* JADX INFO: renamed from: g */
    private final C1591j5 f2061g;

    /* JADX INFO: renamed from: h */
    protected final C1591j5 f2062h;

    /* JADX INFO: renamed from: i */
    private String f2063i;

    /* JADX INFO: renamed from: j */
    private String f2064j;

    /* JADX INFO: renamed from: c */
    private final Object f2057c = new Object();

    /* JADX INFO: renamed from: e */
    protected final Object f2059e = new Object();

    public C1619m3(Map map, JSONObject jSONObject, JSONObject jSONObject2, C1748l c1748l) {
        if (c1748l == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (jSONObject2 == null) {
            throw new IllegalArgumentException("No full response specified");
        }
        if (jSONObject == null) {
            throw new IllegalArgumentException("No ad object specified");
        }
        this.f2055a = c1748l;
        if (((Boolean) c1748l.m4801a(C1831z4.f3709E6)).booleanValue()) {
            this.f2061g = new C1591j5(jSONObject2);
            this.f2062h = new C1591j5(jSONObject);
            this.f2056b = null;
            this.f2058d = null;
        } else {
            this.f2056b = jSONObject2;
            this.f2058d = jSONObject;
            this.f2061g = null;
            this.f2062h = null;
        }
        this.f2060f = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Bundle m3179a(C1591j5 c1591j5) {
        return JsonUtils.toBundle(c1591j5.m3000a("server_parameters", (JSONObject) null));
    }

    /* JADX INFO: renamed from: j */
    private int m3180j() {
        return m3183a("mute_state", m3193b("mute_state", ((Integer) this.f2055a.m4801a(AbstractC1776t3.f3348d8)).intValue()));
    }

    /* JADX INFO: renamed from: a */
    protected double m3181a(String str, double d) {
        double d2;
        C1591j5 c1591j5 = this.f2061g;
        if (c1591j5 != null) {
            return c1591j5.m2990a(str, d);
        }
        synchronized (this.f2057c) {
            d2 = JsonUtils.getDouble(this.f2056b, str, d);
        }
        return d2;
    }

    /* JADX INFO: renamed from: a */
    protected double m3182a(String str, float f) {
        double d;
        C1591j5 c1591j5 = this.f2062h;
        if (c1591j5 != null) {
            return c1591j5.m2990a(str, f);
        }
        synchronized (this.f2059e) {
            d = JsonUtils.getDouble(this.f2058d, str, f);
        }
        return d;
    }

    /* JADX INFO: renamed from: a */
    protected int m3183a(String str, int i) {
        int i2;
        C1591j5 c1591j5 = this.f2062h;
        if (c1591j5 != null) {
            return c1591j5.m2992a(str, i);
        }
        synchronized (this.f2059e) {
            i2 = JsonUtils.getInt(this.f2058d, str, i);
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    protected long m3184a(String str, long j) {
        long j2;
        C1591j5 c1591j5 = this.f2062h;
        if (c1591j5 != null) {
            return c1591j5.m2993a(str, j);
        }
        synchronized (this.f2059e) {
            j2 = JsonUtils.getLong(this.f2058d, str, j);
        }
        return j2;
    }

    /* JADX INFO: renamed from: a */
    protected Boolean m3185a(String str, Boolean bool) {
        Boolean bool2;
        C1591j5 c1591j5 = this.f2062h;
        if (c1591j5 != null) {
            return c1591j5.m2994a(str, bool);
        }
        synchronized (this.f2059e) {
            bool2 = JsonUtils.getBoolean(this.f2058d, str, bool);
        }
        return bool2;
    }

    /* JADX INFO: renamed from: a */
    public String m3186a(String str) {
        String strM3187a = m3187a(str, "");
        return StringUtils.isValidString(strM3187a) ? strM3187a : m3197b(str, "");
    }

    /* JADX INFO: renamed from: a */
    protected String m3187a(String str, String str2) {
        String string;
        C1591j5 c1591j5 = this.f2062h;
        if (c1591j5 != null) {
            return c1591j5.m2996a(str, str2);
        }
        synchronized (this.f2059e) {
            string = JsonUtils.getString(this.f2058d, str, str2);
        }
        return string;
    }

    /* JADX INFO: renamed from: a */
    protected JSONArray m3188a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        C1591j5 c1591j5 = this.f2062h;
        if (c1591j5 != null) {
            return c1591j5.m2998a(str, jSONArray);
        }
        synchronized (this.f2059e) {
            jSONArray2 = JsonUtils.getJSONArray(this.f2058d, str, jSONArray);
        }
        return jSONArray2;
    }

    /* JADX INFO: renamed from: a */
    protected JSONObject m3189a() {
        JSONObject jSONObject;
        C1591j5 c1591j5 = this.f2062h;
        if (c1591j5 != null) {
            return c1591j5.m2999a();
        }
        synchronized (this.f2059e) {
            jSONObject = this.f2058d;
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    protected JSONObject m3190a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        C1591j5 c1591j5 = this.f2062h;
        if (c1591j5 != null) {
            return c1591j5.m3000a(str, jSONObject);
        }
        synchronized (this.f2059e) {
            jSONObject2 = JsonUtils.getJSONObject(this.f2058d, str, jSONObject);
        }
        return jSONObject2;
    }

    /* JADX INFO: renamed from: a */
    protected void m3191a(String str, Object obj) {
        C1591j5 c1591j5 = this.f2062h;
        if (c1591j5 != null) {
            c1591j5.m3002a(str, obj);
            return;
        }
        synchronized (this.f2059e) {
            JsonUtils.putObject(this.f2058d, str, obj);
        }
    }

    /* JADX INFO: renamed from: b */
    protected float m3192b(String str, float f) {
        float f2;
        C1591j5 c1591j5 = this.f2062h;
        if (c1591j5 != null) {
            return c1591j5.m2991a(str, f);
        }
        synchronized (this.f2059e) {
            f2 = JsonUtils.getFloat(this.f2058d, str, f);
        }
        return f2;
    }

    /* JADX INFO: renamed from: b */
    protected int m3193b(String str, int i) {
        int i2;
        C1591j5 c1591j5 = this.f2061g;
        if (c1591j5 != null) {
            return c1591j5.m2992a(str, i);
        }
        synchronized (this.f2057c) {
            i2 = JsonUtils.getInt(this.f2056b, str, i);
        }
        return i2;
    }

    /* JADX INFO: renamed from: b */
    protected long m3194b(String str, long j) {
        long j2;
        C1591j5 c1591j5 = this.f2061g;
        if (c1591j5 != null) {
            return c1591j5.m2993a(str, j);
        }
        synchronized (this.f2057c) {
            j2 = JsonUtils.getLong(this.f2056b, str, j);
        }
        return j2;
    }

    /* JADX INFO: renamed from: b */
    protected Boolean m3195b(String str, Boolean bool) {
        Boolean bool2;
        C1591j5 c1591j5 = this.f2061g;
        if (c1591j5 != null) {
            return c1591j5.m2994a(str, bool);
        }
        synchronized (this.f2057c) {
            bool2 = JsonUtils.getBoolean(this.f2056b, str, bool);
        }
        return bool2;
    }

    /* JADX INFO: renamed from: b */
    public String m3196b() {
        return m3187a("class", (String) null);
    }

    /* JADX INFO: renamed from: b */
    protected String m3197b(String str, String str2) {
        String string;
        C1591j5 c1591j5 = this.f2061g;
        if (c1591j5 != null) {
            return c1591j5.m2996a(str, str2);
        }
        synchronized (this.f2057c) {
            string = JsonUtils.getString(this.f2056b, str, str2);
        }
        return string;
    }

    /* JADX INFO: renamed from: b */
    public List m3198b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        C1591j5 c1591j5 = this.f2061g;
        List listM3006b = c1591j5 != null ? c1591j5.m3006b(str, Collections.EMPTY_LIST) : JsonUtils.optList(m3199b(str, new JSONArray()), Collections.EMPTY_LIST);
        C1591j5 c1591j6 = this.f2062h;
        List listM3006b2 = c1591j6 != null ? c1591j6.m3006b(str, Collections.EMPTY_LIST) : JsonUtils.optList(m3188a(str, new JSONArray()), Collections.EMPTY_LIST);
        ArrayList arrayList = new ArrayList(listM3006b.size() + listM3006b2.size());
        arrayList.addAll(listM3006b);
        arrayList.addAll(listM3006b2);
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    protected JSONArray m3199b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        C1591j5 c1591j5 = this.f2061g;
        if (c1591j5 != null) {
            return c1591j5.m2998a(str, jSONArray);
        }
        synchronized (this.f2057c) {
            jSONArray2 = JsonUtils.getJSONArray(this.f2056b, str, jSONArray);
        }
        return jSONArray2;
    }

    /* JADX INFO: renamed from: c */
    public String m3200c() {
        return m3187a("name", (String) null);
    }

    /* JADX INFO: renamed from: c */
    protected void m3201c(String str, int i) {
        C1591j5 c1591j5 = this.f2062h;
        if (c1591j5 != null) {
            c1591j5.m3007b(str, i);
            return;
        }
        synchronized (this.f2059e) {
            JsonUtils.putInt(this.f2058d, str, i);
        }
    }

    /* JADX INFO: renamed from: c */
    protected void m3202c(String str, long j) {
        C1591j5 c1591j5 = this.f2062h;
        if (c1591j5 != null) {
            c1591j5.m3008b(str, j);
            return;
        }
        synchronized (this.f2059e) {
            JsonUtils.putLong(this.f2058d, str, j);
        }
    }

    /* JADX INFO: renamed from: c */
    protected void m3203c(String str, String str2) {
        C1591j5 c1591j5 = this.f2062h;
        if (c1591j5 != null) {
            c1591j5.m3009b(str, str2);
            return;
        }
        synchronized (this.f2059e) {
            JsonUtils.putString(this.f2058d, str, str2);
        }
    }

    /* JADX INFO: renamed from: c */
    protected boolean m3204c(String str) {
        boolean zHas;
        C1591j5 c1591j5 = this.f2062h;
        if (c1591j5 != null) {
            return c1591j5.m3004a(str);
        }
        synchronized (this.f2059e) {
            zHas = this.f2058d.has(str);
        }
        return zHas;
    }

    /* JADX INFO: renamed from: d */
    public String m3205d() {
        if (m3204c("consent_string")) {
            return m3187a("consent_string", (String) null);
        }
        return m3206d("consent_string") ? m3197b("consent_string", (String) null) : this.f2055a.m4855t0().m2234j();
    }

    /* JADX INFO: renamed from: d */
    protected boolean m3206d(String str) {
        boolean zHas;
        C1591j5 c1591j5 = this.f2061g;
        if (c1591j5 != null) {
            return c1591j5.m3004a(str);
        }
        synchronized (this.f2057c) {
            zHas = this.f2056b.has(str);
        }
        return zHas;
    }

    /* JADX INFO: renamed from: e */
    protected Object m3207e(String str) {
        Object objOpt;
        C1591j5 c1591j5 = this.f2062h;
        if (c1591j5 != null) {
            return c1591j5.m3005b(str);
        }
        synchronized (this.f2059e) {
            objOpt = this.f2058d.opt(str);
        }
        return objOpt;
    }

    /* JADX INFO: renamed from: e */
    public String m3208e() {
        return this.f2064j;
    }

    /* JADX INFO: renamed from: f */
    public Bundle m3209f() {
        return BundleUtils.getBundle("custom_parameters", new Bundle(), m3216l());
    }

    /* JADX INFO: renamed from: f */
    public void m3210f(String str) {
        this.f2064j = str;
    }

    /* JADX INFO: renamed from: g */
    public JSONObject m3211g() {
        JSONObject jSONObject;
        C1591j5 c1591j5 = this.f2061g;
        if (c1591j5 != null) {
            return c1591j5.m2999a();
        }
        synchronized (this.f2057c) {
            jSONObject = this.f2056b;
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: g */
    public void m3212g(String str) {
        this.f2063i = str;
    }

    public String getAdUnitId() {
        return m3197b("ad_unit_id", "");
    }

    public String getPlacement() {
        return this.f2063i;
    }

    /* JADX INFO: renamed from: h */
    public long m3213h() {
        return m3184a("init_completion_delay_ms", -1L);
    }

    /* JADX INFO: renamed from: i */
    public Map m3214i() {
        return this.f2060f;
    }

    /* JADX INFO: renamed from: k */
    public String m3215k() {
        return m3200c().split("_")[0];
    }

    /* JADX INFO: renamed from: l */
    public Bundle m3216l() {
        Bundle bundle;
        if (m3207e("server_parameters") instanceof JSONObject) {
            C1591j5 c1591j5 = this.f2062h;
            bundle = c1591j5 != null ? (Bundle) c1591j5.m2995a(new Function() { // from class: com.applovin.impl.m3$$ExternalSyntheticLambda0
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return C1619m3.m3179a((C1591j5) obj);
                }
            }) : JsonUtils.toBundle(m3190a("server_parameters", (JSONObject) null));
        } else {
            bundle = new Bundle();
        }
        int iM3180j = m3180j();
        if (iM3180j != -1) {
            if (iM3180j == 2) {
                bundle.putBoolean("is_muted", this.f2055a.m4847p0().isMuted());
            } else {
                bundle.putBoolean("is_muted", iM3180j == 0);
            }
        }
        if (!bundle.containsKey("amount")) {
            bundle.putLong("amount", m3194b("amount", 0L));
        }
        if (!bundle.containsKey("currency")) {
            bundle.putString("currency", m3197b("currency", ""));
        }
        return bundle;
    }

    /* JADX INFO: renamed from: m */
    public long m3217m() {
        return m3184a("adapter_timeout_ms", ((Long) this.f2055a.m4801a(AbstractC1776t3.f3381z7)).longValue());
    }

    /* JADX INFO: renamed from: n */
    public Boolean m3218n() {
        String str = this.f2055a.m4847p0().getExtraParameters().get("huc");
        if (StringUtils.isValidString(str)) {
            return Boolean.valueOf(str);
        }
        return m3204c("huc") ? m3185a("huc", Boolean.FALSE) : m3195b("huc", (Boolean) null);
    }

    /* JADX INFO: renamed from: o */
    public Boolean m3219o() {
        String str = this.f2055a.m4847p0().getExtraParameters().get("dns");
        if (StringUtils.isValidString(str)) {
            return Boolean.valueOf(str);
        }
        return m3204c("dns") ? m3185a("dns", Boolean.FALSE) : m3195b("dns", (Boolean) null);
    }

    /* JADX INFO: renamed from: p */
    public boolean m3220p() {
        return m3185a("is_testing", Boolean.FALSE).booleanValue();
    }

    /* JADX INFO: renamed from: q */
    public boolean m3221q() {
        return m3185a("reinitialize_if_init_fails", Boolean.FALSE).booleanValue();
    }

    /* JADX INFO: renamed from: r */
    public boolean m3222r() {
        return m3185a("run_on_ui_thread", Boolean.TRUE).booleanValue();
    }

    /* JADX INFO: renamed from: s */
    public boolean m3223s() {
        return m3185a("eagerly_initialize", Boolean.TRUE).booleanValue();
    }

    public String toString() {
        return "MediationAdapterSpec{adapterClass='" + m3196b() + "', adapterName='" + m3200c() + "', isTesting=" + m3220p() + AbstractJsonLexerKt.END_OBJ;
    }
}
