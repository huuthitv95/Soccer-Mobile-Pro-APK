package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.C12538u;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.f8 */
/* JADX INFO: loaded from: classes3.dex */
public class C1554f8 implements InterfaceC1718s4 {

    /* JADX INFO: renamed from: a */
    private Uri f1626a;

    /* JADX INFO: renamed from: b */
    private Uri f1627b;

    /* JADX INFO: renamed from: c */
    private a f1628c;

    /* JADX INFO: renamed from: d */
    private String f1629d;

    /* JADX INFO: renamed from: e */
    private int f1630e;

    /* JADX INFO: renamed from: f */
    private int f1631f;

    /* JADX INFO: renamed from: g */
    private long f1632g;

    /* JADX INFO: renamed from: com.applovin.impl.f8$a */
    public enum a {
        Progressive,
        Streaming
    }

    private C1554f8() {
    }

    /* JADX INFO: renamed from: a */
    private static long m2624a(C1702q8 c1702q8) {
        Map mapM4123a = c1702q8.m4123a();
        long j = StringUtils.parseLong((String) mapM4123a.get("bitrate"), 0L);
        return j != 0 ? j : (StringUtils.parseLong((String) mapM4123a.get("minBitrate"), 0L) + StringUtils.parseLong((String) mapM4123a.get("maxBitrate"), 0L)) / 2;
    }

    /* JADX INFO: renamed from: a */
    private static a m2625a(String str) {
        if (StringUtils.isValidString(str)) {
            if ("progressive".equalsIgnoreCase(str)) {
                return a.Progressive;
            }
            if ("streaming".equalsIgnoreCase(str)) {
                return a.Streaming;
            }
        }
        return a.Progressive;
    }

    /* JADX INFO: renamed from: a */
    public static C1554f8 m2626a(C1702q8 c1702q8, C1748l c1748l) {
        if (c1702q8 == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (c1748l == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            String strM4128d = c1702q8.m4128d();
            if (!URLUtil.isValidUrl(strM4128d)) {
                c1748l.m4782Q();
                if (!C1768p.m5160a()) {
                    return null;
                }
                c1748l.m4782Q().m5174b("VastVideoFile", "Unable to create video file. Could not find URL.");
                return null;
            }
            Uri uri = Uri.parse(strM4128d);
            C1554f8 c1554f8 = new C1554f8();
            c1554f8.f1626a = uri;
            c1554f8.f1627b = uri;
            c1554f8.f1632g = m2624a(c1702q8);
            c1554f8.f1628c = m2625a((String) c1702q8.m4123a().get(C12538u.f32486g));
            c1554f8.f1631f = StringUtils.parseInt((String) c1702q8.m4123a().get("height"));
            c1554f8.f1630e = StringUtils.parseInt((String) c1702q8.m4123a().get("width"));
            c1554f8.f1629d = ((String) c1702q8.m4123a().get("type")).toLowerCase(Locale.ENGLISH);
            return c1554f8;
        } catch (Throwable th) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5172a("VastVideoFile", "Error occurred while initializing", th);
            }
            c1748l.m4764E().m4333a("VastVideoFile", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1554f8 m2627a(JSONObject jSONObject, C1748l c1748l) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "source_video_uri", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        Uri uri = Uri.parse(string);
        if (TextUtils.isEmpty(JsonUtils.getString(jSONObject, "video_uri", null))) {
            return null;
        }
        Uri uri2 = Uri.parse(string);
        String string2 = JsonUtils.getString(jSONObject, "file_type", null);
        if (TextUtils.isEmpty(string2)) {
            return null;
        }
        a aVarValueOf = a.valueOf(JsonUtils.getString(jSONObject, "delivery_type", a.Progressive.toString()));
        int i = JsonUtils.getInt(jSONObject, "width", 0);
        int i2 = JsonUtils.getInt(jSONObject, "height", 0);
        int i3 = JsonUtils.getInt(jSONObject, "bitrate", 0);
        C1554f8 c1554f8 = new C1554f8();
        c1554f8.f1626a = uri;
        c1554f8.f1627b = uri2;
        c1554f8.f1628c = aVarValueOf;
        c1554f8.f1629d = string2;
        c1554f8.f1630e = i;
        c1554f8.f1631f = i2;
        c1554f8.f1632g = i3;
        return c1554f8;
    }

    @Override // com.applovin.impl.InterfaceC1718s4
    /* JADX INFO: renamed from: a */
    public JSONObject mo1889a() {
        JSONObject jSONObject = new JSONObject();
        Uri uri = this.f1626a;
        if (uri != null) {
            JsonUtils.putString(jSONObject, "source_video_uri", uri.toString());
        }
        Uri uri2 = this.f1627b;
        if (uri2 != null) {
            JsonUtils.putString(jSONObject, "video_uri", uri2.toString());
        }
        a aVar = this.f1628c;
        JsonUtils.putString(jSONObject, "delivery_type", aVar == null ? null : aVar.toString());
        JsonUtils.putString(jSONObject, "file_type", this.f1629d);
        JsonUtils.putInt(jSONObject, "width", this.f1630e);
        JsonUtils.putInt(jSONObject, "height", this.f1631f);
        JsonUtils.putLong(jSONObject, "bitrate", this.f1632g);
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public void m2628a(Uri uri) {
        this.f1627b = uri;
    }

    /* JADX INFO: renamed from: b */
    public long m2629b() {
        return this.f1632g;
    }

    /* JADX INFO: renamed from: c */
    public String m2630c() {
        return this.f1629d;
    }

    /* JADX INFO: renamed from: d */
    public Uri m2631d() {
        return this.f1626a;
    }

    /* JADX INFO: renamed from: e */
    public Uri m2632e() {
        return this.f1627b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1554f8)) {
            return false;
        }
        C1554f8 c1554f8 = (C1554f8) obj;
        if (this.f1630e != c1554f8.f1630e || this.f1631f != c1554f8.f1631f || this.f1632g != c1554f8.f1632g) {
            return false;
        }
        Uri uri = this.f1626a;
        if (uri == null ? c1554f8.f1626a != null : !uri.equals(c1554f8.f1626a)) {
            return false;
        }
        Uri uri2 = this.f1627b;
        if (uri2 == null ? c1554f8.f1627b != null : !uri2.equals(c1554f8.f1627b)) {
            return false;
        }
        if (this.f1628c != c1554f8.f1628c) {
            return false;
        }
        String str = this.f1629d;
        String str2 = c1554f8.f1629d;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public int hashCode() {
        Uri uri = this.f1626a;
        int iHashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.f1627b;
        int iHashCode2 = (iHashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        a aVar = this.f1628c;
        int iHashCode3 = (iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f1629d;
        return ((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.f1630e) * 31) + this.f1631f) * 31) + Long.valueOf(this.f1632g).hashCode();
    }

    public String toString() {
        return "VastVideoFile{sourceVideoUri=" + this.f1626a + ", videoUri=" + this.f1627b + ", deliveryType=" + this.f1628c + ", fileType='" + this.f1629d + "', width=" + this.f1630e + ", height=" + this.f1631f + ", bitrate=" + this.f1632g + AbstractJsonLexerKt.END_OBJ;
    }
}
