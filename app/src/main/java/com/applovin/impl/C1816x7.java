package com.applovin.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.x7 */
/* JADX INFO: loaded from: classes3.dex */
public class C1816x7 implements InterfaceC1718s4 {

    /* JADX INFO: renamed from: a */
    public final Set f3565a = new HashSet();

    /* JADX INFO: renamed from: b */
    public final Set f3566b = new HashSet();

    /* JADX INFO: renamed from: c */
    private Uri f3567c;

    /* JADX INFO: renamed from: d */
    private Uri f3568d;

    /* JADX INFO: renamed from: e */
    private int f3569e;

    /* JADX INFO: renamed from: f */
    private int f3570f;

    /* JADX INFO: renamed from: a */
    public static ImageView m5595a(Uri uri, Context context, C1748l c1748l) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setClickable(true);
        imageView.setVisibility(8);
        ImageViewUtils.setImageUri(imageView, uri, c1748l);
        return imageView;
    }

    /* JADX INFO: renamed from: a */
    public static C1816x7 m5596a(C1702q8 c1702q8, C1748l c1748l) {
        if (c1702q8 == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (c1748l == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        C1702q8 c1702q8M4126c = c1702q8.m4126c("StaticResource");
        if (c1702q8M4126c == null || !URLUtil.isValidUrl(c1702q8M4126c.m4128d())) {
            c1748l.m4782Q();
            if (!C1768p.m5160a()) {
                return null;
            }
            c1748l.m4782Q().m5174b("VastIndustryIcon", "Unable to create industry icon.  No valid image URL found.");
            return null;
        }
        C1816x7 c1816x7 = new C1816x7();
        c1816x7.f3567c = Uri.parse(c1702q8M4126c.m4128d());
        C1702q8 c1702q8M4124b = c1702q8.m4124b("IconClickThrough");
        if (c1702q8M4124b != null && URLUtil.isValidUrl(c1702q8M4124b.m4128d())) {
            c1816x7.f3568d = Uri.parse(c1702q8M4124b.m4128d());
        }
        String str = (String) c1702q8.m4123a().get("width");
        int i = 0;
        int i2 = (str == null || Integer.parseInt(str) <= 0) ? 0 : Integer.parseInt(str);
        String str2 = (String) c1702q8.m4123a().get("height");
        if (str2 != null && Integer.parseInt(str2) > 0) {
            i = Integer.parseInt(str2);
        }
        int iIntValue = ((Integer) c1748l.m4801a(C1831z4.f3875Z4)).intValue();
        if (i2 <= 0 || i <= 0) {
            c1816x7.f3570f = iIntValue;
            c1816x7.f3569e = iIntValue;
            return c1816x7;
        }
        double d = i2 / i;
        int iMin = Math.min(Math.max(i2, i), iIntValue);
        if (i2 >= i) {
            c1816x7.f3569e = iMin;
            c1816x7.f3570f = (int) (((double) iMin) / d);
            return c1816x7;
        }
        c1816x7.f3570f = iMin;
        c1816x7.f3569e = (int) (((double) iMin) * d);
        return c1816x7;
    }

    /* JADX INFO: renamed from: a */
    public static C1816x7 m5597a(JSONObject jSONObject, C1748l c1748l) {
        C1514b8 c1514b8M2138a;
        C1514b8 c1514b8M2138a2;
        if (jSONObject == null) {
            return null;
        }
        C1816x7 c1816x7 = new C1816x7();
        String string = JsonUtils.getString(jSONObject, "image_uri", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        c1816x7.f3567c = Uri.parse(string);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "click_trackers", new JSONArray());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null && (c1514b8M2138a2 = C1514b8.m2138a(jSONObject2, c1748l)) != null) {
                c1816x7.f3565a.add(c1514b8M2138a2);
            }
        }
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "view_trackers", new JSONArray());
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray2, i2, (JSONObject) null);
            if (jSONObject3 != null && (c1514b8M2138a = C1514b8.m2138a(jSONObject3, c1748l)) != null) {
                c1816x7.f3566b.add(c1514b8M2138a);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "click_uri", null);
        c1816x7.f3568d = StringUtils.isValidString(string2) ? Uri.parse(string2) : null;
        c1816x7.f3569e = JsonUtils.getInt(jSONObject, "width", 0);
        c1816x7.f3570f = JsonUtils.getInt(jSONObject, "height", 0);
        return c1816x7;
    }

    @Override // com.applovin.impl.InterfaceC1718s4
    /* JADX INFO: renamed from: a */
    public JSONObject mo1889a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f3565a.iterator();
        while (it.hasNext()) {
            jSONArray.put(((C1514b8) it.next()).mo1889a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = this.f3566b.iterator();
        while (it2.hasNext()) {
            jSONArray.put(((C1514b8) it2.next()).mo1889a());
        }
        JsonUtils.putJsonArray(jSONObject, "view_trackers", jSONArray2);
        Uri uri = this.f3567c;
        JsonUtils.putString(jSONObject, "image_uri", uri == null ? null : uri.toString());
        Uri uri2 = this.f3568d;
        JsonUtils.putString(jSONObject, "click_uri", uri2 != null ? uri2.toString() : null);
        JsonUtils.putInt(jSONObject, "width", this.f3569e);
        JsonUtils.putInt(jSONObject, "height", this.f3570f);
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public Set m5598b() {
        return this.f3565a;
    }

    /* JADX INFO: renamed from: c */
    public Uri m5599c() {
        return this.f3568d;
    }

    /* JADX INFO: renamed from: d */
    public int m5600d() {
        return this.f3570f;
    }

    /* JADX INFO: renamed from: e */
    public Uri m5601e() {
        return this.f3567c;
    }

    /* JADX INFO: renamed from: f */
    public Set m5602f() {
        return this.f3566b;
    }

    /* JADX INFO: renamed from: g */
    public int m5603g() {
        return this.f3569e;
    }

    public String toString() {
        return "VastIndustryIcon{imageUri='" + m5601e() + "', clickUri='" + m5599c() + "', width=" + m5603g() + ", height=" + m5600d() + "}";
    }
}
