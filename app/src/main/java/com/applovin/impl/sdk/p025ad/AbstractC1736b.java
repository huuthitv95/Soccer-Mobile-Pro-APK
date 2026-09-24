package com.applovin.impl.sdk.p025ad;

import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.arch.core.util.Function;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.AbstractC1570h4;
import com.applovin.impl.AbstractC1675o8;
import com.applovin.impl.AbstractC1677p0;
import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.C1567h1;
import com.applovin.impl.C1591j5;
import com.applovin.impl.C1698q4;
import com.applovin.impl.C1831z4;
import com.applovin.impl.InterfaceC1718s4;
import com.applovin.impl.adview.AbstractC1496e;
import com.applovin.impl.adview.C1503l;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.sdk.ad.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1736b extends AppLovinAdImpl implements InterfaceC1718s4 {

    /* JADX INFO: renamed from: d */
    private final Map f2896d;

    /* JADX INFO: renamed from: e */
    private final AtomicBoolean f2897e;

    /* JADX INFO: renamed from: f */
    private final AtomicBoolean f2898f;

    /* JADX INFO: renamed from: g */
    private final AtomicReference f2899g;

    /* JADX INFO: renamed from: h */
    private final Bundle f2900h;

    /* JADX INFO: renamed from: i */
    private String f2901i;

    /* JADX INFO: renamed from: j */
    private long f2902j;

    /* JADX INFO: renamed from: k */
    private int f2903k;

    /* JADX INFO: renamed from: l */
    private String f2904l;

    /* JADX INFO: renamed from: m */
    private d f2905m;

    /* JADX INFO: renamed from: com.applovin.impl.sdk.ad.b$b */
    public enum b {
        UNSPECIFIED,
        DISMISS,
        DO_NOT_DISMISS
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.ad.b$c */
    public enum c {
        DEFAULT,
        ACTIVITY_PORTRAIT,
        ACTIVITY_LANDSCAPE
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.ad.b$d */
    public class d {

        /* JADX INFO: renamed from: a */
        public final int f2914a;

        /* JADX INFO: renamed from: b */
        public final int f2915b;

        /* JADX INFO: renamed from: c */
        public final int f2916c;

        /* JADX INFO: renamed from: d */
        public final int f2917d;

        /* JADX INFO: renamed from: e */
        public final int f2918e;

        private d() {
            this.f2914a = AppLovinSdkUtils.dpToPx(C1748l.m4756p(), AbstractC1736b.this.m4551o());
            this.f2915b = AppLovinSdkUtils.dpToPx(C1748l.m4756p(), AbstractC1736b.this.m4555q());
            this.f2916c = AppLovinSdkUtils.dpToPx(C1748l.m4756p(), AbstractC1736b.this.m4547m());
            this.f2917d = AppLovinSdkUtils.dpToPx(C1748l.m4756p(), ((Integer) ((AppLovinAdBase) AbstractC1736b.this).sdk.m4801a(C1831z4.f3977l1)).intValue());
            this.f2918e = AppLovinSdkUtils.dpToPx(C1748l.m4756p(), ((Integer) ((AppLovinAdBase) AbstractC1736b.this).sdk.m4801a(C1831z4.f3968k1)).intValue());
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.ad.b$e */
    public enum e {
        RESIZE_ASPECT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public AbstractC1736b(JSONObject jSONObject, JSONObject jSONObject2, C1748l c1748l) {
        super(jSONObject, jSONObject2, c1748l);
        this.f2896d = Collections.synchronizedMap(new HashMap());
        this.f2897e = new AtomicBoolean();
        this.f2898f = new AtomicBoolean();
        this.f2899g = new AtomicReference();
        this.f2900h = new Bundle();
    }

    /* JADX INFO: renamed from: E */
    private List m4447E() {
        return getIntegerListFromAdObject("multi_close_style", null);
    }

    /* JADX INFO: renamed from: a */
    private AbstractC1496e.a m4448a(boolean z) {
        return z ? AbstractC1496e.a.WHITE_ON_TRANSPARENT : AbstractC1496e.a.WHITE_ON_BLACK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ List m4450a(MotionEvent motionEvent, C1591j5 c1591j5) {
        return AbstractC1701q7.m4040a(c1591j5.m3000a("video_click_tracking_urls", new JSONObject()), m4455a(motionEvent, true), null, m4487J(), m4485H0(), this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ List m4451a(MotionEvent motionEvent, boolean z, C1591j5 c1591j5) {
        return AbstractC1701q7.m4040a(c1591j5.m3000a("click_tracking_urls", new JSONObject()), m4455a(motionEvent, z), m4459c(motionEvent, z), m4487J(), m4485H0(), this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ List m4452a(Function function, C1591j5 c1591j5) {
        return (List) function.apply(c1591j5.m2998a("omid_verification_script_resources", (JSONArray) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ List m4453a(C1591j5 c1591j5) {
        return AbstractC1701q7.m4038a(c1591j5.m3000a("ad_closed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ List m4454a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            try {
                URL url = new URL(JsonUtils.getString(jSONObject, "url", null));
                String string = JsonUtils.getString(jSONObject, "vendor_key", null);
                String string2 = JsonUtils.getString(jSONObject, "parameters", null);
                if (StringUtils.isValidString(string) && StringUtils.isValidString(string2)) {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(string, url, string2));
                } else {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                }
            } catch (Throwable th) {
                this.sdk.m4782Q();
                if (C1768p.m5160a()) {
                    this.sdk.m4782Q().m5172a("DirectAd", "Failed to parse OMID verification script resource", th);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private Map m4455a(MotionEvent motionEvent, boolean z) {
        Point pointM3800b = AbstractC1677p0.m3800b(C1748l.m4756p());
        HashMap map = new HashMap(7);
        map.put("{CLCODE}", getClCode());
        map.put("{CLICK_X}", String.valueOf(motionEvent != null ? motionEvent.getRawX() : -1.0f));
        map.put("{CLICK_Y}", String.valueOf(motionEvent != null ? motionEvent.getRawY() : -1.0f));
        map.put("{SCREEN_WIDTH}", String.valueOf(pointM3800b.x));
        map.put("{SCREEN_HEIGHT}", String.valueOf(pointM3800b.y));
        map.put("{IS_VIDEO_CLICK}", String.valueOf(z));
        return map;
    }

    /* JADX INFO: renamed from: b */
    private List m4457b(final MotionEvent motionEvent, final boolean z) {
        List listM4040a;
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            return (List) c1591j5.m2995a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda13
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.m4451a(motionEvent, z, (C1591j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listM4040a = AbstractC1701q7.m4040a(getJsonObjectFromAdObject("click_tracking_urls", new JSONObject()), m4455a(motionEvent, z), m4459c(motionEvent, z), m4487J(), m4485H0(), this.sdk);
        }
        return listM4040a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ List m4458b(C1591j5 c1591j5) {
        return AbstractC1701q7.m4038a(c1591j5.m3000a("app_killed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: renamed from: c */
    private String m4459c(MotionEvent motionEvent, boolean z) {
        String stringFromAdObject = getStringFromAdObject("click_tracking_url", null);
        Map mapM4455a = m4455a(motionEvent, z);
        if (stringFromAdObject != null) {
            return StringUtils.replace(stringFromAdObject, mapM4455a);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public /* synthetic */ Map m4460c(C1591j5 c1591j5) {
        try {
            return JsonUtils.toStringMap(c1591j5.m3000a("custom_tabs_http_headers", new JSONObject()));
        } catch (JSONException e2) {
            this.sdk.m4782Q();
            if (C1768p.m5160a()) {
                this.sdk.m4782Q().m5172a("DirectAd", "Failed to retrieve http headers for Custom Tabs", e2);
            }
            return new HashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ List m4461d(C1591j5 c1591j5) {
        return AbstractC1701q7.m4038a(c1591j5.m3000a("custom_tabs_navigation_aborted_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ List m4462e(C1591j5 c1591j5) {
        return AbstractC1701q7.m4038a(c1591j5.m3000a("custom_tabs_navigation_failed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: renamed from: e0 */
    private String m4463e0() {
        String stringFromAdObject = getStringFromAdObject("video_end_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ List m4464f(C1591j5 c1591j5) {
        return AbstractC1701q7.m4038a(c1591j5.m3000a("custom_tabs_navigation_finished_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ List m4465g(C1591j5 c1591j5) {
        return AbstractC1701q7.m4038a(c1591j5.m3000a("custom_tabs_navigation_started_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C1567h1 m4466h(C1591j5 c1591j5) {
        JSONObject jSONObjectM3000a = c1591j5.m3000a("custom_tabs_settings", (JSONObject) null);
        if (jSONObjectM3000a != null) {
            return new C1567h1(jSONObjectM3000a);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ List m4467i(C1591j5 c1591j5) {
        return AbstractC1701q7.m4038a(c1591j5.m3000a("custom_tabs_tab_hidden_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ List m4468j(C1591j5 c1591j5) {
        return AbstractC1701q7.m4038a(c1591j5.m3000a("custom_tabs_tab_shown_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ List m4469k(C1591j5 c1591j5) {
        return AbstractC1701q7.m4039a(c1591j5.m3000a("imp_urls", new JSONObject()), getClCode(), null, null, m4487J(), m4485H0(), this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Map m4470l(C1591j5 c1591j5) {
        try {
            return JsonUtils.toStringMap(c1591j5.m3000a("http_headers_for_postbacks", new JSONObject()));
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ List m4471m(C1591j5 c1591j5) {
        return AbstractC1701q7.m4038a(c1591j5.m3000a("video_end_urls", new JSONObject()), getClCode(), m4463e0(), this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ C1503l m4472n(C1591j5 c1591j5) {
        JSONObject jSONObjectM3000a = c1591j5.m3000a("web_view_settings", (JSONObject) null);
        if (jSONObjectM3000a != null) {
            return new C1503l(jSONObjectM3000a);
        }
        return null;
    }

    /* JADX INFO: renamed from: A */
    public List mo4220A() {
        List listM4039a;
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            return (List) c1591j5.m2995a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda4
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.m4469k((C1591j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listM4039a = AbstractC1701q7.m4039a(getJsonObjectFromAdObject("imp_urls", new JSONObject()), getClCode(), null, null, m4487J(), m4485H0(), this.sdk);
        }
        return listM4039a;
    }

    /* JADX INFO: renamed from: A0 */
    public abstract void mo4221A0();

    /* JADX INFO: renamed from: B */
    public int m4473B() {
        return getIntFromAdObject("mdafra", ((Integer) this.sdk.m4801a(C1831z4.f3823T0)).intValue());
    }

    /* JADX INFO: renamed from: B0 */
    public boolean m4474B0() {
        return getBooleanFromAdObject("aarwdc", (Boolean) this.sdk.m4801a(C1831z4.f4085y2));
    }

    /* JADX INFO: renamed from: C */
    public boolean m4475C() {
        return getBooleanFromAdObject("playback_requires_user_action", Boolean.TRUE);
    }

    /* JADX INFO: renamed from: C0 */
    public boolean m4476C0() {
        return getBooleanFromAdObject("always_reward_user", (Boolean) this.sdk.m4801a(C1831z4.f3950i1));
    }

    /* JADX INFO: renamed from: D */
    public List m4477D() {
        List listM4447E = m4447E();
        if (listM4447E == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listM4447E.size());
        Iterator it = listM4447E.iterator();
        while (it.hasNext()) {
            arrayList.add(m4518a(((Integer) it.next()).intValue()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m4478D0() {
        return getBooleanFromAdObject("should_apply_mute_setting_to_poststitial", Boolean.FALSE);
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m4479E0() {
        return this.f2898f.get();
    }

    /* JADX INFO: renamed from: F */
    public List m4480F() {
        return getIntegerListFromAdObject("multi_close_delay_graphic", null);
    }

    /* JADX INFO: renamed from: F0 */
    public boolean m4481F0() {
        return m4498O0() || m4494M0() || m4496N0();
    }

    /* JADX INFO: renamed from: G */
    public Uri m4482G() {
        String stringFromAdObject = getStringFromAdObject("mute_image", "https://assets.applovin.com/sound_off.png");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    /* JADX INFO: renamed from: G0 */
    public boolean m4483G0() {
        return getBooleanFromAdObject("serfaad", (Boolean) this.sdk.m4801a(C1831z4.f3815S0));
    }

    /* JADX INFO: renamed from: H */
    public List m4484H() {
        String stringFromAdObject = getStringFromAdObject("optional_html_resources", null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: H0 */
    public boolean m4485H0() {
        return getBooleanFromAdObject("fire_postbacks_from_webview", Boolean.FALSE);
    }

    /* JADX INFO: renamed from: I */
    public abstract String mo4222I();

    /* JADX INFO: renamed from: I0 */
    public boolean m4486I0() {
        return getBooleanFromAdObject("should_forward_close_button_tapped_to_poststitial", Boolean.FALSE);
    }

    /* JADX INFO: renamed from: J */
    public Map m4487J() {
        HashMap map = new HashMap();
        try {
            C1591j5 c1591j5 = this.synchronizedAdObject;
            map.putAll(c1591j5 != null ? (Map) c1591j5.m2995a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda7
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return AbstractC1736b.m4470l((C1591j5) obj);
                }
            }) : JsonUtils.toStringMap(getJsonObjectFromAdObject("http_headers_for_postbacks", new JSONObject())));
        } catch (JSONException e2) {
            this.sdk.m4782Q();
            if (C1768p.m5160a()) {
                this.sdk.m4782Q().m5172a("DirectAd", "Failed to retrieve http headers for postbacks", e2);
            }
        }
        if (getBooleanFromAdObject("use_webview_ua_for_postbacks", Boolean.FALSE)) {
            map.put("User-Agent", AbstractC1675o8.m3769a());
        }
        return map;
    }

    /* JADX INFO: renamed from: J0 */
    public boolean m4488J0() {
        return getBooleanFromAdObject("fmsstwvoar", Boolean.FALSE);
    }

    /* JADX INFO: renamed from: K */
    public b m4489K() {
        String stringFromAdObject = getStringFromAdObject("poststitial_dismiss_type", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            if ("dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return b.DISMISS;
            }
            if ("no_dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return b.DO_NOT_DISMISS;
            }
        }
        return b.UNSPECIFIED;
    }

    /* JADX INFO: renamed from: K0 */
    public boolean m4490K0() {
        return getBooleanFromAdObject("sftbpn", Boolean.FALSE);
    }

    /* JADX INFO: renamed from: L */
    public int m4491L() {
        return getColorFromAdObject("postitial_progress_bar_color", -922746881);
    }

    /* JADX INFO: renamed from: L0 */
    public boolean m4492L0() {
        return getBooleanFromAdObject("fvcetwv", Boolean.FALSE);
    }

    /* JADX INFO: renamed from: M */
    public long m4493M() {
        return getLongFromAdObject("postitial_progress_bar_total_ms", -1L);
    }

    /* JADX INFO: renamed from: M0 */
    public boolean m4494M0() {
        return getStringListFromAdObject("system_bars_hide_list", this.sdk.m4821c(C1831z4.f4077x2)).contains(NotificationCompat.CATEGORY_NAVIGATION);
    }

    /* JADX INFO: renamed from: N */
    public List m4495N() {
        return getStringListFromAdObject("pbpn", this.sdk.m4821c(C1831z4.f3805Q6));
    }

    /* JADX INFO: renamed from: N0 */
    public boolean m4496N0() {
        return getStringListFromAdObject("system_bars_hide_list", this.sdk.m4821c(C1831z4.f4077x2)).contains("none");
    }

    /* JADX INFO: renamed from: O */
    public long m4497O() {
        long longFromAdObject = getLongFromAdObject("report_reward_duration", -1L);
        if (longFromAdObject >= 0) {
            return TimeUnit.SECONDS.toMillis(longFromAdObject);
        }
        return -1L;
    }

    /* JADX INFO: renamed from: O0 */
    public boolean m4498O0() {
        return getStringListFromAdObject("system_bars_hide_list", this.sdk.m4821c(C1831z4.f4077x2)).contains("status");
    }

    /* JADX INFO: renamed from: P */
    public int m4499P() {
        return getIntFromAdObject("report_reward_percent", -1);
    }

    /* JADX INFO: renamed from: P0 */
    public boolean m4500P0() {
        return getBooleanFromAdObject("avoms", Boolean.FALSE);
    }

    /* JADX INFO: renamed from: Q */
    public List m4501Q() {
        String stringFromAdObject = getStringFromAdObject("required_html_resources", null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: Q0 */
    public boolean m4502Q0() {
        return getBooleanFromAdObject("report_reward_percent_include_close_delay", Boolean.TRUE);
    }

    /* JADX INFO: renamed from: R */
    public int m4503R() {
        return this.f2903k;
    }

    /* JADX INFO: renamed from: R0 */
    public boolean m4504R0() {
        return getBooleanFromAdObject("require_interaction_for_click", Boolean.FALSE);
    }

    /* JADX INFO: renamed from: S */
    public List m4505S() {
        String stringFromAdObject = getStringFromAdObject("resource_cache_prefix", null);
        ArrayList arrayList = stringFromAdObject != null ? new ArrayList(CollectionUtils.explode(stringFromAdObject)) : new ArrayList(this.sdk.m4821c(C1831z4.f3719G0));
        if (AbstractC1701q7.m4115j(C1748l.m4756p())) {
            arrayList.add("https://p.applov.in/");
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: S0 */
    public boolean m4506S0() {
        return getBooleanFromAdObject("sruifwvc", Boolean.FALSE);
    }

    /* JADX INFO: renamed from: T */
    public List m4507T() {
        return getStringListFromAdObject("rea", m4501Q());
    }

    /* JADX INFO: renamed from: T0 */
    public boolean m4508T0() {
        return m4536g() >= 0;
    }

    /* JADX INFO: renamed from: U */
    public AbstractC1496e.a m4509U() {
        int intFromAdObject = getIntFromAdObject("skip_style", -1);
        return intFromAdObject == -1 ? m4553p() : m4518a(intFromAdObject);
    }

    /* JADX INFO: renamed from: U0 */
    public boolean m4510U0() {
        return getBooleanFromAdObject("respect_adview_fully_watched", Boolean.FALSE);
    }

    /* JADX INFO: renamed from: V */
    public List m4511V() {
        return getStringListFromAdObject("substrings_for_disabled_click_logic", Collections.EMPTY_LIST);
    }

    /* JADX INFO: renamed from: V0 */
    public boolean m4512V0() {
        return getBooleanFromAdObject("sscomt", Boolean.FALSE);
    }

    /* JADX INFO: renamed from: W */
    public c m4513W() {
        c cVar = c.DEFAULT;
        String upperCase = getStringFromAdObject("ad_target", cVar.toString()).toUpperCase(Locale.ENGLISH);
        if ("ACTIVITY_PORTRAIT".equalsIgnoreCase(upperCase)) {
            return c.ACTIVITY_PORTRAIT;
        }
        return "ACTIVITY_LANDSCAPE".equalsIgnoreCase(upperCase) ? c.ACTIVITY_LANDSCAPE : cVar;
    }

    /* JADX INFO: renamed from: W0 */
    public boolean m4514W0() {
        return getBooleanFromAdObject("sudbia", (Boolean) this.sdk.m4801a(C1831z4.f3797P6));
    }

    /* JADX INFO: renamed from: X */
    public String m4515X() {
        return this.f2904l;
    }

    /* JADX INFO: renamed from: X0 */
    public boolean m4516X0() {
        return getBooleanFromAdObject("upiosp", Boolean.FALSE);
    }

    /* JADX INFO: renamed from: Y */
    public Uri m4517Y() {
        String stringFromAdObject = getStringFromAdObject("unmute_image", "https://assets.applovin.com/sound_on.png");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    /* JADX INFO: renamed from: Z */
    public abstract Uri mo4224Z();

    /* JADX INFO: renamed from: a */
    protected AbstractC1496e.a m4518a(int i) {
        if (i == 1) {
            return AbstractC1496e.a.WHITE_ON_TRANSPARENT;
        }
        if (i == 2) {
            return AbstractC1496e.a.INVISIBLE;
        }
        return i == 3 ? AbstractC1496e.a.TRANSPARENT_SKIP : AbstractC1496e.a.WHITE_ON_BLACK;
    }

    /* JADX INFO: renamed from: a */
    public List m4519a(MotionEvent motionEvent) {
        return m4457b(motionEvent, false);
    }

    /* JADX INFO: renamed from: a */
    public void m4520a(long j) {
        this.f2902j = j;
    }

    /* JADX INFO: renamed from: a */
    public void m4521a(C1698q4 c1698q4) {
        this.f2899g.set(c1698q4);
    }

    /* JADX INFO: renamed from: a */
    public void m4522a(String str) {
        this.f2901i = str;
    }

    /* JADX INFO: renamed from: a */
    public void m4523a(String str, String str2) {
        this.f2896d.put(str, str2);
    }

    /* JADX INFO: renamed from: a0 */
    public long m4524a0() {
        return getLongFromAdObject("close_delay", 0L);
    }

    /* JADX INFO: renamed from: b */
    public List m4525b(final MotionEvent motionEvent) {
        List listM4040a;
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            listM4040a = (List) c1591j5.m2995a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda3
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.m4450a(motionEvent, (C1591j5) obj);
                }
            });
        } else {
            synchronized (this.adObjectLock) {
                listM4040a = AbstractC1701q7.m4040a(getJsonObjectFromAdObject("video_click_tracking_urls", new JSONObject()), m4455a(motionEvent, true), null, m4487J(), m4485H0(), this.sdk);
            }
        }
        return listM4040a.isEmpty() ? m4457b(motionEvent, true) : listM4040a;
    }

    /* JADX INFO: renamed from: b */
    public void m4526b(String str) {
        this.f2904l = str;
    }

    /* JADX INFO: renamed from: b */
    public void m4527b(boolean z) {
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            c1591j5.m3003a("html_resources_cached", z);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putBoolean(this.adObject, "html_resources_cached", z);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public long m4528b0() {
        return TimeUnit.SECONDS.toMillis(getLongFromAdObject("close_delay_max_buffering_time_seconds", 5L));
    }

    /* JADX INFO: renamed from: c */
    public long m4529c() {
        return getLongFromAdObject("batfort", TimeUnit.SECONDS.toMillis(1L));
    }

    /* JADX INFO: renamed from: c0 */
    public int m4530c0() {
        return AbstractC1701q7.m4086c(getIntFromAdObject("video_completion_percent", -1));
    }

    /* JADX INFO: renamed from: d */
    public void m4531d() {
        this.f2898f.set(true);
    }

    /* JADX INFO: renamed from: d0 */
    public List m4532d0() {
        List listM4038a;
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            return (List) c1591j5.m2995a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda9
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.m4471m((C1591j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listM4038a = AbstractC1701q7.m4038a(getJsonObjectFromAdObject("video_end_urls", new JSONObject()), getClCode(), m4463e0(), this.sdk);
        }
        return listM4038a;
    }

    /* JADX INFO: renamed from: e */
    public List m4533e() {
        List listM4038a;
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            return (List) c1591j5.m2995a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda16
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.m4453a((C1591j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listM4038a = AbstractC1701q7.m4038a(getJsonObjectFromAdObject("ad_closed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listM4038a;
    }

    /* JADX INFO: renamed from: f */
    public long m4534f() {
        return getLongFromAdObject("ad_dismiss_delay_on_app_launch_ms", TimeUnit.SECONDS.toMillis(3L));
    }

    /* JADX INFO: renamed from: f0 */
    public e m4535f0() {
        String stringFromAdObject = getStringFromAdObject("video_gravity", null);
        if (ViewHierarchyConstants.DIMENSION_TOP_KEY.equals(stringFromAdObject)) {
            return e.TOP;
        }
        if ("bottom".equals(stringFromAdObject)) {
            return e.BOTTOM;
        }
        if ("left".equals(stringFromAdObject)) {
            return e.LEFT;
        }
        return "right".equals(stringFromAdObject) ? e.RIGHT : e.RESIZE_ASPECT;
    }

    /* JADX INFO: renamed from: g */
    public long m4536g() {
        return getLongFromAdObject("ad_reshow_delay_on_app_launch_ms", -1L);
    }

    /* JADX INFO: renamed from: g0 */
    public int m4537g0() {
        return getColorFromAdObject("progress_bar_color", -922746881);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC1560g4
    public abstract AbstractC1570h4 getAdEventTracker();

    public String getCachePrefix() {
        return getStringFromAdObject("cache_prefix", null);
    }

    public Bundle getCustomTabsHeaders() {
        Map map;
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            map = (Map) c1591j5.m2995a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda15
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.m4460c((C1591j5) obj);
                }
            });
        } else {
            try {
                map = JsonUtils.toStringMap(getJsonObjectFromAdObject("custom_tabs_http_headers", new JSONObject()));
            } catch (JSONException e2) {
                this.sdk.m4782Q();
                if (C1768p.m5160a()) {
                    this.sdk.m4782Q().m5172a("DirectAd", "Failed to retrieve http headers for Custom Tabs", e2);
                }
                map = new HashMap();
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        if (getBooleanFromAdObject("custom_tabs_should_use_webview_ua", Boolean.FALSE)) {
            bundle.putString("User-Agent", AbstractC1675o8.m3769a());
        }
        return bundle;
    }

    public List getCustomTabsNavigationAbortedPostbacks() {
        List listM4038a;
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            return (List) c1591j5.m2995a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda1
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.m4461d((C1591j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listM4038a = AbstractC1701q7.m4038a(getJsonObjectFromAdObject("custom_tabs_navigation_aborted_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listM4038a;
    }

    public List getCustomTabsNavigationFailedPostbacks() {
        List listM4038a;
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            return (List) c1591j5.m2995a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda5
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.m4462e((C1591j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listM4038a = AbstractC1701q7.m4038a(getJsonObjectFromAdObject("custom_tabs_navigation_failed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listM4038a;
    }

    public List getCustomTabsNavigationFinishedPostbacks() {
        List listM4038a;
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            return (List) c1591j5.m2995a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda8
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.m4464f((C1591j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listM4038a = AbstractC1701q7.m4038a(getJsonObjectFromAdObject("custom_tabs_navigation_finished_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listM4038a;
    }

    public List getCustomTabsNavigationStartedPostbacks() {
        List listM4038a;
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            return (List) c1591j5.m2995a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda2
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.m4465g((C1591j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listM4038a = AbstractC1701q7.m4038a(getJsonObjectFromAdObject("custom_tabs_navigation_started_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listM4038a;
    }

    public C1567h1 getCustomTabsSettings() {
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            return (C1567h1) c1591j5.m2995a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda12
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return AbstractC1736b.m4466h((C1591j5) obj);
                }
            });
        }
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("custom_tabs_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new C1567h1(jsonObjectFromAdObject);
        }
        return null;
    }

    public List getCustomTabsTabHiddenPostbacks() {
        List listM4038a;
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            return (List) c1591j5.m2995a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda17
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.m4467i((C1591j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listM4038a = AbstractC1701q7.m4038a(getJsonObjectFromAdObject("custom_tabs_tab_hidden_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listM4038a;
    }

    public List getCustomTabsTabShownPostbacks() {
        List listM4038a;
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            return (List) c1591j5.m2995a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda0
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.m4468j((C1591j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listM4038a = AbstractC1701q7.m4038a(getJsonObjectFromAdObject("custom_tabs_tab_shown_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listM4038a;
    }

    public List getCustomTabsWarmupUrls() {
        return getStringListFromAdObject("custom_tabs_warmup_urls", Collections.EMPTY_LIST);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC1560g4
    public String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", null);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC1560g4
    public String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", "");
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC1560g4
    public List getOpenMeasurementVerificationScriptResources() {
        List list;
        final Function function = new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda10
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return this.f$0.m4454a((JSONArray) obj);
            }
        };
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            return (List) c1591j5.m2995a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda11
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return AbstractC1736b.m4452a(function, (C1591j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            list = (List) function.apply(getJsonArrayFromAdObject("omid_verification_script_resources", null));
        }
        return list;
    }

    /* JADX INFO: renamed from: h */
    public Bundle m4538h() {
        return this.f2900h;
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m4539h0() {
        return getBooleanFromAdObject("progress_bar_enabled", Boolean.FALSE);
    }

    /* JADX INFO: renamed from: i */
    public C1698q4 m4540i() {
        return (C1698q4) this.f2899g.getAndSet(null);
    }

    /* JADX INFO: renamed from: i0 */
    public abstract Uri mo4235i0();

    public boolean isCustomTabsClientWarmupEnabled() {
        return getBooleanFromAdObject("custom_tabs_client_warmup_enabled", Boolean.FALSE);
    }

    public boolean isCustomTabsEnabled() {
        return getBooleanFromAdObject("custom_tabs_enabled", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC1560g4
    public abstract boolean isOpenMeasurementEnabled();

    /* JADX INFO: renamed from: j */
    public List m4541j() {
        List listM4038a;
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            return (List) c1591j5.m2995a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda6
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.m4458b((C1591j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listM4038a = AbstractC1701q7.m4038a(getJsonObjectFromAdObject("app_killed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listM4038a;
    }

    /* JADX INFO: renamed from: j0 */
    public int m4542j0() {
        int i;
        if (AbstractC1701q7.m4065a(getSize())) {
            i = 1;
        } else {
            i = ((Boolean) this.sdk.m4801a(C1831z4.f3919e6)).booleanValue() ? 0 : -1;
        }
        return getIntFromAdObject("whalt", i);
    }

    /* JADX INFO: renamed from: k */
    public String m4543k() {
        String stringFromAdObject = getStringFromAdObject("base_url", RemoteSettings.FORWARD_SLASH_STRING);
        if (AbstractJsonLexerKt.NULL.equalsIgnoreCase(stringFromAdObject)) {
            return null;
        }
        return stringFromAdObject;
    }

    /* JADX INFO: renamed from: k0 */
    public C1503l m4544k0() {
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            return (C1503l) c1591j5.m2995a(new Function() { // from class: com.applovin.impl.sdk.ad.b$$ExternalSyntheticLambda14
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return AbstractC1736b.m4472n((C1591j5) obj);
                }
            });
        }
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("web_view_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new C1503l(jsonObjectFromAdObject);
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public Map m4545l() {
        return this.f2896d;
    }

    /* JADX INFO: renamed from: l0 */
    public List m4546l0() {
        return CollectionUtils.explode(getStringFromAdObject("wlh", null));
    }

    /* JADX INFO: renamed from: m */
    public int m4547m() {
        return getIntFromAdObject("close_button_horizontal_margin", ((Integer) this.sdk.m4801a(C1831z4.f3784O1)).intValue());
    }

    /* JADX INFO: renamed from: m0 */
    public List m4548m0() {
        return CollectionUtils.explode(getStringFromAdObject("wls", ""));
    }

    /* JADX INFO: renamed from: n */
    public d m4549n() {
        if (this.f2905m == null) {
            this.f2905m = new d();
        }
        return this.f2905m;
    }

    /* JADX INFO: renamed from: n0 */
    public void m4550n0() {
        this.f2903k++;
    }

    /* JADX INFO: renamed from: o */
    public int m4551o() {
        return getIntFromAdObject("close_button_size", ((Integer) this.sdk.m4801a(C1831z4.f3792P1)).intValue());
    }

    /* JADX INFO: renamed from: o0 */
    public boolean m4552o0() {
        return this.f2903k > 0;
    }

    /* JADX INFO: renamed from: p */
    public AbstractC1496e.a m4553p() {
        List listM4447E = m4447E();
        int intFromAdObject = getIntFromAdObject("close_style", (listM4447E == null || listM4447E.size() <= 0) ? -1 : ((Integer) listM4447E.get(0)).intValue());
        return intFromAdObject == -1 ? m4448a(hasVideoUrl()) : m4518a(intFromAdObject);
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m4554p0() {
        return getBooleanFromAdObject("bvde", (Boolean) this.sdk.m4801a(C1831z4.f3982l6));
    }

    /* JADX INFO: renamed from: q */
    public int m4555q() {
        return getIntFromAdObject("close_button_top_margin", ((Integer) this.sdk.m4801a(C1831z4.f3800Q1)).intValue());
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m4556q0() {
        return getBooleanFromAdObject("lhs_close_button", (Boolean) this.sdk.m4801a(C1831z4.f3776N1));
    }

    /* JADX INFO: renamed from: r */
    public long m4557r() {
        List listM4480F = m4480F();
        long longFromAdObject = getLongFromAdObject("close_delay_graphic", (listM4480F == null || listM4480F.size() <= 0) ? 0L : ((Integer) listM4480F.get(0)).intValue());
        if (longFromAdObject == -1 || longFromAdObject == -2) {
            return 0L;
        }
        return longFromAdObject;
    }

    /* JADX INFO: renamed from: r0 */
    public boolean m4558r0() {
        return getBooleanFromAdObject("forward_lifecycle_events_to_webview", Boolean.FALSE);
    }

    /* JADX INFO: renamed from: s */
    public int m4559s() {
        return getColorFromAdObject("countdown_color", -922746881);
    }

    /* JADX INFO: renamed from: s0 */
    public boolean m4560s0() {
        return getBooleanFromAdObject("gase", Boolean.FALSE);
    }

    public boolean shouldCustomTabsTrackEvents() {
        return getBooleanFromAdObject("custom_tabs_should_track_events", Boolean.FALSE);
    }

    /* JADX INFO: renamed from: t */
    public int m4561t() {
        return getIntFromAdObject("countdown_length", 0);
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m4562t0() {
        return getBooleanFromAdObject("lock_current_orientation", Boolean.FALSE);
    }

    /* JADX INFO: renamed from: u */
    public boolean m4563u() {
        return getBooleanFromAdObject("dismiss_on_skip", Boolean.FALSE);
    }

    /* JADX INFO: renamed from: u0 */
    public abstract boolean mo4246u0();

    /* JADX INFO: renamed from: v */
    public String m4564v() {
        return this.f2901i;
    }

    /* JADX INFO: renamed from: v0 */
    public AtomicBoolean m4565v0() {
        return this.f2897e;
    }

    /* JADX INFO: renamed from: w */
    public int m4566w() {
        return getIntFromAdObject("poststitial_dismiss_forward_delay_millis", -1);
    }

    /* JADX INFO: renamed from: w0 */
    public boolean m4567w0() {
        return getBooleanFromAdObject("lhs_skip_button", (Boolean) this.sdk.m4801a(C1831z4.f3880a2));
    }

    /* JADX INFO: renamed from: x */
    public int m4568x() {
        return getIntFromAdObject("poststitial_shown_forward_delay_millis", -1);
    }

    /* JADX INFO: renamed from: x0 */
    public boolean mo4247x0() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE);
    }

    /* JADX INFO: renamed from: y */
    public int m4569y() {
        return AbstractC1701q7.m4016a(getIntFromAdObject("graphic_completion_percent", -1), 90);
    }

    /* JADX INFO: renamed from: y0 */
    public abstract boolean mo4248y0();

    /* JADX INFO: renamed from: z */
    public long m4570z() {
        return this.f2902j;
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m4571z0() {
        return getBooleanFromAdObject("web_contents_debugging_enabled", Boolean.valueOf(AbstractC1701q7.m4115j(C1748l.m4756p()) || AbstractC1701q7.m4111h(C1748l.m4756p()) || ((Boolean) this.sdk.m4801a(C1831z4.f3685B6)).booleanValue()));
    }
}
