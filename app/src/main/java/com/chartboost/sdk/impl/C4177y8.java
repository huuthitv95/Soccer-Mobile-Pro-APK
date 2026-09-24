package com.chartboost.sdk.impl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.y8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4177y8 {

    /* JADX INFO: renamed from: g */
    public static final a f17032g = new a(null);

    /* JADX INFO: renamed from: a */
    public final URL f17033a;

    /* JADX INFO: renamed from: b */
    public final List f17034b;

    /* JADX INFO: renamed from: c */
    public final List f17035c;

    /* JADX INFO: renamed from: d */
    public final boolean f17036d;

    /* JADX INFO: renamed from: e */
    public final boolean f17037e;

    /* JADX INFO: renamed from: f */
    public final String f17038f;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.y8$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C4177y8 m20051a(JSONObject jsonObject) {
            URL url;
            int length;
            int i;
            int length2;
            int i2;
            String strOptString;
            String strOptString2;
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            try {
                String strOptString3 = jsonObject.optString("base_url");
                Intrinsics.checkNotNull(strOptString3);
                if (StringsKt.isBlank(strOptString3)) {
                    strOptString3 = null;
                }
                url = strOptString3 != null ? new URL(strOptString3) : null;
            } catch (MalformedURLException e) {
                C4048sb.m19407a("Unable to create baseUrl.", e);
            }
            JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray("scripts");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                length = jSONArrayOptJSONArray.length();
                i = 0;
            } else {
                length = 0;
                i = 0;
            }
            while (i < length) {
                if (jSONArrayOptJSONArray != null && (strOptString2 = jSONArrayOptJSONArray.optString(i)) != null) {
                    arrayList.add(strOptString2);
                }
                i++;
            }
            JSONArray jSONArrayOptJSONArray2 = jsonObject.optJSONArray("scripts");
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray2 != null) {
                length2 = jSONArrayOptJSONArray2.length();
                i2 = 0;
            } else {
                length2 = 0;
                i2 = 0;
            }
            while (i2 < length2) {
                if (jSONArrayOptJSONArray2 != null && (strOptString = jSONArrayOptJSONArray2.optString(i2)) != null) {
                    arrayList2.add(strOptString);
                }
                i2++;
            }
            boolean zOptBoolean = jsonObject.optBoolean("strict_mraid_open", false);
            boolean zOptBoolean2 = jsonObject.optBoolean("attach_temp_container_to_activity", true);
            String strOptString4 = jsonObject.optString("mraid_version", "2.0");
            Intrinsics.checkNotNullExpressionValue(strOptString4, "optString(...)");
            return new C4177y8(url, arrayList, arrayList2, zOptBoolean, zOptBoolean2, strOptString4);
        }
    }

    public C4177y8(URL url, List scripts, List scriptsBeforeLoad, boolean z, boolean z2, String mraidVersion) {
        Intrinsics.checkNotNullParameter(scripts, "scripts");
        Intrinsics.checkNotNullParameter(scriptsBeforeLoad, "scriptsBeforeLoad");
        Intrinsics.checkNotNullParameter(mraidVersion, "mraidVersion");
        this.f17033a = url;
        this.f17034b = scripts;
        this.f17035c = scriptsBeforeLoad;
        this.f17036d = z;
        this.f17037e = z2;
        this.f17038f = mraidVersion;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m20045a() {
        return this.f17037e;
    }

    /* JADX INFO: renamed from: b */
    public final URL m20046b() {
        return this.f17033a;
    }

    /* JADX INFO: renamed from: c */
    public final String m20047c() {
        return this.f17038f;
    }

    /* JADX INFO: renamed from: d */
    public final List m20048d() {
        return this.f17034b;
    }

    /* JADX INFO: renamed from: e */
    public final List m20049e() {
        return this.f17035c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4177y8)) {
            return false;
        }
        C4177y8 c4177y8 = (C4177y8) obj;
        return Intrinsics.areEqual(this.f17033a, c4177y8.f17033a) && Intrinsics.areEqual(this.f17034b, c4177y8.f17034b) && Intrinsics.areEqual(this.f17035c, c4177y8.f17035c) && this.f17036d == c4177y8.f17036d && this.f17037e == c4177y8.f17037e && Intrinsics.areEqual(this.f17038f, c4177y8.f17038f);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m20050f() {
        return this.f17036d;
    }

    public int hashCode() {
        URL url = this.f17033a;
        return ((((((((((url == null ? 0 : url.hashCode()) * 31) + this.f17034b.hashCode()) * 31) + this.f17035c.hashCode()) * 31) + UByte$$ExternalSyntheticBackport0.m43487m(this.f17036d)) * 31) + UByte$$ExternalSyntheticBackport0.m43487m(this.f17037e)) * 31) + this.f17038f.hashCode();
    }

    public String toString() {
        return "HTMLConfig(baseUrl=" + this.f17033a + ", scripts=" + this.f17034b + ", scriptsBeforeLoad=" + this.f17035c + ", strictMraidOpen=" + this.f17036d + ", attachTempContainerToActivity=" + this.f17037e + ", mraidVersion=" + this.f17038f + ")";
    }
}
