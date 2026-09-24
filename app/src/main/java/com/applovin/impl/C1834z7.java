package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.z7 */
/* JADX INFO: loaded from: classes3.dex */
public class C1834z7 implements InterfaceC1718s4 {

    /* JADX INFO: renamed from: a */
    private a f4110a;

    /* JADX INFO: renamed from: b */
    private Uri f4111b;

    /* JADX INFO: renamed from: c */
    private String f4112c;

    /* JADX INFO: renamed from: com.applovin.impl.z7$a */
    /* JADX INFO: loaded from: classes9.dex */
    public enum a {
        UNSPECIFIED,
        STATIC,
        IFRAME,
        HTML
    }

    private C1834z7() {
    }

    /* JADX INFO: renamed from: a */
    static C1834z7 m5755a(C1702q8 c1702q8, C1834z7 c1834z7, C1748l c1748l) {
        if (c1702q8 == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (c1748l == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (c1834z7 == null) {
            try {
                c1834z7 = new C1834z7();
            } catch (Throwable th) {
                c1748l.m4782Q();
                if (C1768p.m5160a()) {
                    c1748l.m4782Q().m5172a("VastNonVideoResource", "Error occurred while initializing", th);
                }
                c1748l.m4764E().m4333a("VastNonVideoResource", th);
                return null;
            }
        }
        if (c1834z7.f4111b == null && !StringUtils.isValidString(c1834z7.f4112c)) {
            String strM5757a = m5757a(c1702q8, "StaticResource");
            if (URLUtil.isValidUrl(strM5757a)) {
                c1834z7.f4111b = Uri.parse(strM5757a);
                c1834z7.f4110a = a.STATIC;
                return c1834z7;
            }
            String strM5757a2 = m5757a(c1702q8, "IFrameResource");
            if (StringUtils.isValidString(strM5757a2)) {
                c1834z7.f4110a = a.IFRAME;
                if (URLUtil.isValidUrl(strM5757a2)) {
                    c1834z7.f4111b = Uri.parse(strM5757a2);
                    return c1834z7;
                }
                c1834z7.f4112c = strM5757a2;
                return c1834z7;
            }
            String strM5757a3 = m5757a(c1702q8, "HTMLResource");
            if (StringUtils.isValidString(strM5757a3)) {
                c1834z7.f4110a = a.HTML;
                if (URLUtil.isValidUrl(strM5757a3)) {
                    c1834z7.f4111b = Uri.parse(strM5757a3);
                    return c1834z7;
                }
                c1834z7.f4112c = strM5757a3;
            }
        }
        return c1834z7;
    }

    /* JADX INFO: renamed from: a */
    public static C1834z7 m5756a(JSONObject jSONObject, C1748l c1748l) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "type", null);
        a aVarValueOf = string == null ? null : a.valueOf(string);
        String string2 = JsonUtils.getString(jSONObject, "resource_uri", null);
        Uri uri = StringUtils.isValidString(string2) ? Uri.parse(string2) : null;
        C1834z7 c1834z7 = new C1834z7();
        c1834z7.f4110a = aVarValueOf;
        c1834z7.f4111b = uri;
        c1834z7.f4112c = JsonUtils.getString(jSONObject, "resource_contents", null);
        return c1834z7;
    }

    /* JADX INFO: renamed from: a */
    private static String m5757a(C1702q8 c1702q8, String str) {
        C1702q8 c1702q8M4126c = c1702q8.m4126c(str);
        if (c1702q8M4126c != null) {
            return c1702q8M4126c.m4128d();
        }
        return null;
    }

    @Override // com.applovin.impl.InterfaceC1718s4
    /* JADX INFO: renamed from: a */
    public JSONObject mo1889a() {
        JSONObject jSONObject = new JSONObject();
        a aVar = this.f4110a;
        JsonUtils.putString(jSONObject, "type", aVar == null ? null : aVar.toString());
        Uri uri = this.f4111b;
        JsonUtils.putString(jSONObject, "resource_uri", uri != null ? uri.toString() : null);
        JsonUtils.putString(jSONObject, "resource_contents", this.f4112c);
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public void m5758a(Uri uri) {
        this.f4111b = uri;
    }

    /* JADX INFO: renamed from: a */
    public void m5759a(String str) {
        this.f4112c = str;
    }

    /* JADX INFO: renamed from: b */
    public String m5760b() {
        return this.f4112c;
    }

    /* JADX INFO: renamed from: c */
    public Uri m5761c() {
        return this.f4111b;
    }

    /* JADX INFO: renamed from: d */
    public a m5762d() {
        return this.f4110a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1834z7)) {
            return false;
        }
        C1834z7 c1834z7 = (C1834z7) obj;
        if (this.f4110a != c1834z7.f4110a) {
            return false;
        }
        Uri uri = this.f4111b;
        if (uri == null ? c1834z7.f4111b != null : !uri.equals(c1834z7.f4111b)) {
            return false;
        }
        String str = this.f4112c;
        String str2 = c1834z7.f4112c;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public int hashCode() {
        a aVar = this.f4110a;
        int iHashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Uri uri = this.f4111b;
        int iHashCode2 = (iHashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        String str = this.f4112c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "VastNonVideoResource{type=" + this.f4110a + ", resourceUri=" + this.f4111b + ", resourceContents='" + this.f4112c + "'}";
    }
}
