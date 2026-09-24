package com.chartboost.sdk.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.chartboost.sdk.Analytics;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.i1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3813i1 {

    /* JADX INFO: renamed from: a */
    public final C3965og f14537a;

    /* JADX INFO: renamed from: b */
    public final C3746f3 f14538b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3644ag f14539c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3888l7 f14540d;

    /* JADX INFO: renamed from: e */
    public final C4031rg f14541e;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.i1$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f14542a;

        static {
            int[] iArr = new int[Analytics.IAPType.values().length];
            try {
                iArr[Analytics.IAPType.GOOGLE_PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Analytics.IAPType.AMAZON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f14542a = iArr;
        }
    }

    public C3813i1(C3965og sdkInitializer, C3746f3 networkService, InterfaceC3644ag requestBodyBuilder, InterfaceC3888l7 eventTracker, C4031rg session) {
        Intrinsics.checkNotNullParameter(sdkInitializer, "sdkInitializer");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(session, "session");
        this.f14537a = sdkInitializer;
        this.f14538b = networkService;
        this.f14539c = requestBodyBuilder;
        this.f14540d = eventTracker;
        this.f14541e = session;
    }

    /* JADX INFO: renamed from: a */
    public final float m17947a(String str) {
        try {
            Matcher matcher = Pattern.compile("(\\d+\\.\\d+)|(\\d+)").matcher(str);
            matcher.find();
            String strGroup = matcher.group();
            if (TextUtils.isEmpty(strGroup)) {
                C4048sb.m19411b("Invalid price object", (Throwable) null, 2, (Object) null);
                return -1.0f;
            }
            Intrinsics.checkNotNull(strGroup);
            return Float.parseFloat(strGroup);
        } catch (IllegalStateException e) {
            C4048sb.m19410b("Invalid price object", e);
            return -1.0f;
        }
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m17948a(String str, String str2) throws JSONException {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            C4048sb.m19411b("Null object is passed for for amazon user id or amazon purchase token", (Throwable) null, 2, (Object) null);
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SDKConstants.PARAM_USER_ID, str);
        jSONObject.put("purchaseToken", str2);
        jSONObject.put("type", Analytics.IAPType.AMAZON.ordinal());
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public final void m17949a(String eventLabel, Analytics.LevelType type, int i, int i2, String description, long j) {
        Intrinsics.checkNotNullParameter(eventLabel, "eventLabel");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(description, "description");
        try {
            if (!m17953a()) {
                C4048sb.m19411b("You need call Chartboost.startWithAppId() before tracking in-app purchases", (Throwable) null, 2, (Object) null);
                return;
            }
            if (eventLabel.length() == 0) {
                C4048sb.m19411b("Invalid value: event label cannot be empty or null", (Throwable) null, 2, (Object) null);
                return;
            }
            if (i >= 0 && i2 >= 0) {
                if (description.length() == 0) {
                    C4048sb.m19411b("Invalid value: description cannot be empty or null", (Throwable) null, 2, (Object) null);
                    return;
                }
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event_label", eventLabel);
                jSONObject.put("event_field", type.getLevelType());
                jSONObject.put("main_level", i);
                jSONObject.put("sub_level", i2);
                jSONObject.put("description", description);
                jSONObject.put("timestamp", j);
                jSONObject.put("data_type", "level_info");
                jSONArray.put(jSONObject);
                m17951a(jSONArray);
                return;
            }
            C4048sb.m19411b("Invalid value: Level number should be > 0", (Throwable) null, 2, (Object) null);
        } catch (Exception e) {
            C4048sb.m19410b("", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m17950a(String productID, String title, String description, String price, String currency, String str, String str2, String str3, String str4, Analytics.IAPType iapType) {
        JSONObject jSONObjectM17954b;
        Intrinsics.checkNotNullParameter(productID, "productID");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(iapType, "iapType");
        try {
            if (!m17953a()) {
                C4048sb.m19411b("You need call Chartboost.startWithAppId() before tracking in-app purchases", (Throwable) null, 2, (Object) null);
                return;
            }
            float fM17947a = m17947a(price);
            if (fM17947a == -1.0f) {
                return;
            }
            int i = a.f14542a[iapType.ordinal()];
            if (i == 1) {
                jSONObjectM17954b = m17954b(str, str2);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                jSONObjectM17954b = m17948a(str3, str4);
            }
            if (jSONObjectM17954b.length() == 0) {
                C4048sb.m19411b("Error while parsing the receipt to a JSON Object", (Throwable) null, 2, (Object) null);
                return;
            }
            String string = jSONObjectM17954b.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            byte[] bytes = string.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            String strEncodeToString = Base64.encodeToString(bytes, 2);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("localized-title", title);
            jSONObject.put("localized-description", description);
            jSONObject.put("price", Float.valueOf(fM17947a));
            jSONObject.put("currency", currency);
            jSONObject.put("productID", productID);
            jSONObject.put("receipt", strEncodeToString);
            m17952a(jSONObject);
        } catch (Exception e) {
            C4048sb.m19410b("", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m17951a(JSONArray jSONArray) {
        C3792h3 c3792h3 = new C3792h3("https://live.chartboost.com", "/post-install-event/tracking", this.f14539c.mo16842a(), EnumC4095ue.NORMAL, "tracking", null, this.f14540d, this.f14541e);
        c3792h3.m17833a("track_info", jSONArray);
        c3792h3.f14362s = true;
        this.f14538b.m17614a(c3792h3);
    }

    /* JADX INFO: renamed from: a */
    public final void m17952a(JSONObject jSONObject) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.US, "%s%s", Arrays.copyOf(new Object[]{"/post-install-event/", "iap"}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        C3792h3 c3792h3 = new C3792h3("https://live.chartboost.com", str, this.f14539c.mo16842a(), EnumC4095ue.NORMAL, "iap", null, this.f14540d, this.f14541e);
        c3792h3.m17833a("iap", jSONObject);
        c3792h3.f14362s = true;
        this.f14538b.m17614a(c3792h3);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m17953a() {
        return this.f14537a.mo18802a();
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m17954b(String str, String str2) throws JSONException {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            C4048sb.m19411b("Null object is passed for for purchase data or purchase signature", (Throwable) null, 2, (Object) null);
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("purchaseData", str);
        jSONObject.put("purchaseSignature", str2);
        jSONObject.put("type", Analytics.IAPType.GOOGLE_PLAY.ordinal());
        return jSONObject;
    }
}
