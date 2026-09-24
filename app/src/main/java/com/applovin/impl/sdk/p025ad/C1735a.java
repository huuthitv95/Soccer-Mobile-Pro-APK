package com.applovin.impl.sdk.p025ad;

import android.net.Uri;
import android.text.TextUtils;
import androidx.core.util.Consumer;
import com.applovin.impl.C1580i4;
import com.applovin.impl.C1591j5;
import com.applovin.impl.InterfaceC1718s4;
import com.applovin.impl.adview.AbstractC1496e;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.mbridge.msdk.foundation.entity.AbstractC13068b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.sdk.ad.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C1735a extends AbstractC1736b implements InterfaceC1718s4 {

    /* JADX INFO: renamed from: n */
    private final String f2892n;

    /* JADX INFO: renamed from: o */
    private final String f2893o;

    /* JADX INFO: renamed from: p */
    private final String f2894p;

    /* JADX INFO: renamed from: q */
    private final C1580i4 f2895q;

    public C1735a(JSONObject jSONObject, JSONObject jSONObject2, C1748l c1748l) {
        super(jSONObject, jSONObject2, c1748l);
        this.f2892n = m4440a1();
        this.f2893o = m4444e1();
        this.f2894p = m4434d1();
        this.f2895q = new C1580i4(this);
    }

    /* JADX INFO: renamed from: a */
    public static C1735a m4433a(JSONObject jSONObject, C1748l c1748l) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        if (jSONObject == null || (jSONObject2 = JsonUtils.getJSONObject(jSONObject, "full_response", (JSONObject) null)) == null || (jSONObject3 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject2, AbstractC13068b.JSON_KEY_ADS, new JSONArray()), 0, (JSONObject) null)) == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject3, "html", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        String string2 = JsonUtils.getString(jSONObject3, "video", "");
        JsonUtils.putString(jSONObject3, "html", JsonUtils.getString(jSONObject, "original_html_source", ""));
        JsonUtils.putString(jSONObject3, "video", JsonUtils.getString(jSONObject, "original_video_uri_string", ""));
        C1735a c1735a = new C1735a(jSONObject3, jSONObject2, c1748l);
        JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONObject, "cached_ad_html_resources_urls", new JSONObject());
        Iterator<String> itKeys = jSONObject4.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String string3 = JsonUtils.getString(jSONObject4, next, null);
            if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string3)) {
                c1735a.m4523a(next, string3);
            }
        }
        c1735a.m4442c(string);
        if (StringUtils.isValidString(string2)) {
            c1735a.m4438a(Uri.parse(string2));
        }
        return c1735a;
    }

    /* JADX INFO: renamed from: d1 */
    private String m4434d1() {
        return getStringFromAdObject("stream_url", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void m4435o(C1591j5 c1591j5) {
        c1591j5.m3009b("html", this.f2892n);
        c1591j5.m3009b("stream_url", this.f2894p);
    }

    @Override // com.applovin.impl.sdk.p025ad.AbstractC1736b
    /* JADX INFO: renamed from: A0 */
    public void mo4221A0() {
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            c1591j5.m3001a(new Consumer() { // from class: com.applovin.impl.sdk.ad.a$$ExternalSyntheticLambda0
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    this.f$0.m4435o((C1591j5) obj);
                }
            });
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html", this.f2892n);
            JsonUtils.putString(this.adObject, "stream_url", this.f2894p);
        }
    }

    @Override // com.applovin.impl.sdk.p025ad.AbstractC1736b
    /* JADX INFO: renamed from: I */
    public String mo4222I() {
        return this.f2893o;
    }

    /* JADX INFO: renamed from: Y0 */
    public Uri m4436Y0() {
        String stringFromAdObject = getStringFromAdObject(CampaignEx.JSON_KEY_CLICK_URL, "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.p025ad.AbstractC1736b
    /* JADX INFO: renamed from: Z */
    public Uri mo4224Z() {
        String stringFromAdObject = getStringFromAdObject("video_click_url", "");
        return StringUtils.isValidString(stringFromAdObject) ? Uri.parse(stringFromAdObject) : m4436Y0();
    }

    /* JADX INFO: renamed from: Z0 */
    public AbstractC1496e.a m4437Z0() {
        return m4518a(getIntFromAdObject("expandable_style", AbstractC1496e.a.INVISIBLE.m2018b()));
    }

    @Override // com.applovin.impl.InterfaceC1718s4
    /* JADX INFO: renamed from: a */
    public JSONObject mo1889a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "original_html_source", this.f2892n);
        JsonUtils.putString(jSONObject, "original_video_uri_string", this.f2893o);
        JsonUtils.putString(jSONObject, "original_video_stream_uri_string", this.f2894p);
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : m4545l().entrySet()) {
            JsonUtils.putString(jSONObject2, (String) entry.getKey(), (String) entry.getValue());
        }
        JsonUtils.putJSONObject(jSONObject, "cached_ad_html_resources_urls", jSONObject2);
        C1591j5 c1591j5 = this.synchronizedFullResponse;
        if (c1591j5 != null) {
            JsonUtils.putJSONObject(jSONObject, "full_response", c1591j5.m2999a());
            return jSONObject;
        }
        synchronized (this.fullResponseLock) {
            JsonUtils.putJSONObject(jSONObject, "full_response", this.fullResponse);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public void m4438a(Uri uri) {
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            c1591j5.m3009b("video", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "video", uri.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4439a(List list) {
        String strM4440a1 = m4440a1();
        if (CollectionUtils.isEmpty(list) || TextUtils.isEmpty(strM4440a1)) {
            return;
        }
        Map mapM4545l = m4545l();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String string = ((Uri) it.next()).toString();
            String str = (String) mapM4545l.get(string);
            if (StringUtils.isValidString(str)) {
                strM4440a1 = StringUtils.replace(strM4440a1, string, str);
            }
        }
        m4442c(strM4440a1);
    }

    /* JADX INFO: renamed from: a1 */
    public String m4440a1() {
        return getStringFromAdObject("html", "");
    }

    /* JADX INFO: renamed from: b1 */
    public float m4441b1() {
        return getFloatFromAdObject("mraid_close_delay_graphic", 0.0f);
    }

    /* JADX INFO: renamed from: c */
    public void m4442c(String str) {
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            c1591j5.m3009b("html", str);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html", str);
        }
    }

    /* JADX INFO: renamed from: c1 */
    public String m4443c1() {
        return this.f2894p;
    }

    /* JADX INFO: renamed from: e1 */
    public String m4444e1() {
        return getStringFromAdObject("video", "");
    }

    /* JADX INFO: renamed from: f1 */
    public boolean m4445f1() {
        if (this.adObject.has("close_button_expandable_hidden")) {
            return getBooleanFromAdObject("close_button_expandable_hidden", Boolean.FALSE);
        }
        return true;
    }

    /* JADX INFO: renamed from: g1 */
    public void m4446g1() {
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            c1591j5.m3010c("stream_url");
            return;
        }
        synchronized (this.adObjectLock) {
            this.adObject.remove("stream_url");
        }
    }

    @Override // com.applovin.impl.sdk.p025ad.AbstractC1736b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC1560g4
    public C1580i4 getAdEventTracker() {
        return this.f2895q;
    }

    @Override // com.applovin.impl.sdk.p025ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        JSONObject jSONObjectDeepCopy;
        JSONObject jSONObjectM2999a;
        C1591j5 c1591j5 = this.synchronizedFullResponse;
        if (c1591j5 != null) {
            jSONObjectM2999a = c1591j5.m2999a();
        } else {
            synchronized (this.fullResponseLock) {
                jSONObjectDeepCopy = JsonUtils.deepCopy(this.fullResponse);
            }
            jSONObjectM2999a = jSONObjectDeepCopy;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObjectM2999a, AbstractC13068b.JSON_KEY_ADS, new JSONArray());
        if (jSONArray.length() > 0) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, 0, new JSONObject());
            JsonUtils.putString(jSONObject, "html", this.f2892n);
            JsonUtils.putString(jSONObject, "video", this.f2893o);
            JsonUtils.putString(jSONObject, "stream_url", this.f2894p);
        }
        return jSONObjectM2999a;
    }

    @Override // com.applovin.impl.sdk.p025ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        return mo4235i0() != null;
    }

    @Override // com.applovin.impl.sdk.p025ad.AbstractC1736b
    /* JADX INFO: renamed from: i0 */
    public Uri mo4235i0() {
        String strM4434d1 = m4434d1();
        if (StringUtils.isValidString(strM4434d1)) {
            return Uri.parse(strM4434d1);
        }
        String strM4444e1 = m4444e1();
        if (StringUtils.isValidString(strM4444e1)) {
            return Uri.parse(strM4444e1);
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.p025ad.AbstractC1736b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC1560g4
    public boolean isOpenMeasurementEnabled() {
        if (this.sdk.m4831g0().m3131e()) {
            return true;
        }
        return getBooleanFromAdObject("omsdk_enabled", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.p025ad.AbstractC1736b
    /* JADX INFO: renamed from: u0 */
    public boolean mo4246u0() {
        return getBooleanFromFullResponse("is_persisted_ad", false);
    }

    @Override // com.applovin.impl.sdk.p025ad.AbstractC1736b
    /* JADX INFO: renamed from: y0 */
    public boolean mo4248y0() {
        return containsKeyForAdObject("stream_url");
    }
}
