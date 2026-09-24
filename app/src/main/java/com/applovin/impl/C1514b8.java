package com.applovin.impl;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.facebook.internal.security.CertificateUtil;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.b8 */
/* JADX INFO: loaded from: classes3.dex */
public class C1514b8 implements InterfaceC1718s4 {

    /* JADX INFO: renamed from: a */
    private String f1217a;

    /* JADX INFO: renamed from: b */
    private String f1218b;

    /* JADX INFO: renamed from: c */
    private String f1219c;

    /* JADX INFO: renamed from: d */
    private boolean f1220d;

    /* JADX INFO: renamed from: e */
    private long f1221e = -1;

    /* JADX INFO: renamed from: f */
    private int f1222f = -1;

    private C1514b8() {
    }

    /* JADX INFO: renamed from: a */
    private static int m2136a(String str, AbstractC1798v7 abstractC1798v7) {
        if ("start".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("firstQuartile".equalsIgnoreCase(str)) {
            return 25;
        }
        if (CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT.equalsIgnoreCase(str)) {
            return 50;
        }
        if ("thirdQuartile".equalsIgnoreCase(str)) {
            return 75;
        }
        if (!CampaignEx.JSON_NATIVE_VIDEO_COMPLETE.equalsIgnoreCase(str)) {
            return -1;
        }
        if (abstractC1798v7 != null) {
            return abstractC1798v7.m5488g();
        }
        return 95;
    }

    /* JADX INFO: renamed from: a */
    public static C1514b8 m2137a(C1702q8 c1702q8, AbstractC1798v7 abstractC1798v7, C1748l c1748l) {
        List<String> listExplode;
        int size;
        long seconds;
        if (c1702q8 == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (c1748l == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            String strM4128d = c1702q8.m4128d();
            if (TextUtils.isEmpty(strM4128d)) {
                c1748l.m4782Q();
                if (C1768p.m5160a()) {
                    c1748l.m4782Q().m5174b("VastTracker", "Unable to create tracker. Could not find URL.");
                }
                return null;
            }
            C1514b8 c1514b8 = new C1514b8();
            c1514b8.f1219c = strM4128d;
            c1514b8.f1217a = (String) c1702q8.m4123a().get("id");
            c1514b8.f1218b = (String) c1702q8.m4123a().get(NotificationCompat.CATEGORY_EVENT);
            c1514b8.f1220d = ((Boolean) c1748l.m4801a(C1831z4.f3990m5)).booleanValue();
            if (abstractC1798v7 != null) {
                c1514b8.f1220d = JsonUtils.getBoolean(abstractC1798v7.m5483b(), "vast_fire_trackers_from_webview", Boolean.valueOf(c1514b8.f1220d)).booleanValue();
            }
            c1514b8.f1222f = m2136a(c1514b8.m2140b(), abstractC1798v7);
            String str = (String) c1702q8.m4123a().get(TypedValues.CycleType.S_WAVE_OFFSET);
            if (StringUtils.isValidString(str)) {
                String strTrim = str.trim();
                if (strTrim.contains("%")) {
                    c1514b8.f1222f = StringUtils.parseInt(strTrim.substring(0, strTrim.length() - 1));
                    return c1514b8;
                }
                if (strTrim.contains(CertificateUtil.DELIMITER) && (size = (listExplode = CollectionUtils.explode(strTrim, CertificateUtil.DELIMITER)).size()) > 0) {
                    int i = size - 1;
                    long j = 0;
                    for (int i2 = i; i2 >= 0; i2--) {
                        String str2 = listExplode.get(i2);
                        if (StringUtils.isNumeric(str2)) {
                            int i3 = Integer.parseInt(str2);
                            if (i2 == i) {
                                seconds = i3;
                            } else if (i2 == size - 2) {
                                seconds = TimeUnit.MINUTES.toSeconds(i3);
                            } else if (i2 == size - 3) {
                                seconds = TimeUnit.HOURS.toSeconds(i3);
                            }
                            j += seconds;
                        }
                    }
                    c1514b8.f1221e = j;
                    c1514b8.f1222f = -1;
                }
            }
            return c1514b8;
        } catch (Throwable th) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5172a("VastTracker", "Error occurred while initializing", th);
            }
            c1748l.m4764E().m4333a("VastTracker", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1514b8 m2138a(JSONObject jSONObject, C1748l c1748l) {
        if (jSONObject == null) {
            return null;
        }
        C1514b8 c1514b8 = new C1514b8();
        String string = JsonUtils.getString(jSONObject, "uri_string", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        c1514b8.f1219c = string;
        c1514b8.f1217a = JsonUtils.getString(jSONObject, "identifier", "");
        c1514b8.f1218b = JsonUtils.getString(jSONObject, NotificationCompat.CATEGORY_EVENT, "");
        c1514b8.f1221e = JsonUtils.getLong(jSONObject, "offset_seconds", -1L);
        c1514b8.f1222f = JsonUtils.getInt(jSONObject, "offset_percent", -1);
        return c1514b8;
    }

    @Override // com.applovin.impl.InterfaceC1718s4
    /* JADX INFO: renamed from: a */
    public JSONObject mo1889a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "identifier", this.f1217a);
        JsonUtils.putString(jSONObject, NotificationCompat.CATEGORY_EVENT, this.f1218b);
        JsonUtils.putString(jSONObject, "uri_string", this.f1219c);
        JsonUtils.putLong(jSONObject, "offset_seconds", this.f1221e);
        JsonUtils.putInt(jSONObject, "offset_percent", this.f1222f);
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public boolean m2139a(long j, int i) {
        long j2 = this.f1221e;
        boolean z = j2 >= 0;
        boolean z2 = j >= j2;
        int i2 = this.f1222f;
        return (z && z2) || ((i2 >= 0) && (i >= i2));
    }

    /* JADX INFO: renamed from: b */
    public String m2140b() {
        return this.f1218b;
    }

    /* JADX INFO: renamed from: c */
    public String m2141c() {
        return this.f1219c;
    }

    /* JADX INFO: renamed from: d */
    public boolean m2142d() {
        return this.f1220d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1514b8)) {
            return false;
        }
        C1514b8 c1514b8 = (C1514b8) obj;
        if (this.f1221e != c1514b8.f1221e || this.f1222f != c1514b8.f1222f) {
            return false;
        }
        String str = this.f1217a;
        if (str == null ? c1514b8.f1217a != null : !str.equals(c1514b8.f1217a)) {
            return false;
        }
        String str2 = this.f1218b;
        if (str2 == null ? c1514b8.f1218b == null : str2.equals(c1514b8.f1218b)) {
            return this.f1219c.equals(c1514b8.f1219c);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f1217a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f1218b;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f1219c.hashCode()) * 31;
        long j = this.f1221e;
        return ((iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31) + this.f1222f;
    }

    public String toString() {
        return "VastTracker{identifier='" + this.f1217a + "', event='" + this.f1218b + "', uriString='" + this.f1219c + "', offsetSeconds=" + this.f1221e + ", offsetPercent=" + this.f1222f + AbstractJsonLexerKt.END_OBJ;
    }
}
