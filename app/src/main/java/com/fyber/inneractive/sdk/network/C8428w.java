package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.AbstractC7945a;
import com.fyber.inneractive.sdk.config.C8016l0;
import com.fyber.inneractive.sdk.config.C8022o0;
import com.fyber.inneractive.sdk.config.C8028r0;
import com.fyber.inneractive.sdk.config.C8043t0;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.InterfaceC8041s0;
import com.fyber.inneractive.sdk.config.enums.Track;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.serverapi.AbstractC9113b;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.IAlog;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.w */
/* JADX INFO: loaded from: classes4.dex */
public final class C8428w {

    /* JADX INFO: renamed from: h */
    public static final SimpleDateFormat f18752h = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

    /* JADX INFO: renamed from: a */
    public InneractiveAdRequest f18753a;

    /* JADX INFO: renamed from: b */
    public EnumC8415t f18754b;

    /* JADX INFO: renamed from: c */
    public EnumC8424u f18755c;

    /* JADX INFO: renamed from: d */
    public JSONArray f18756d;

    /* JADX INFO: renamed from: e */
    public final AbstractC9087e f18757e;

    /* JADX INFO: renamed from: f */
    public final JSONArray f18758f;

    /* JADX INFO: renamed from: g */
    public boolean f18759g;

    public C8428w(EnumC8415t enumC8415t) {
        this((AbstractC9087e) null);
        this.f18754b = enumC8415t;
        this.f18753a = null;
        this.f18756d = null;
    }

    public C8428w(EnumC8415t enumC8415t, InneractiveAdRequest inneractiveAdRequest, AbstractC9087e abstractC9087e) {
        this(abstractC9087e);
        this.f18754b = enumC8415t;
        this.f18753a = inneractiveAdRequest;
        this.f18756d = null;
    }

    public C8428w(EnumC8424u enumC8424u) {
        this((AbstractC9087e) null);
        this.f18755c = enumC8424u;
        this.f18753a = null;
        this.f18756d = null;
    }

    public C8428w(EnumC8424u enumC8424u, InneractiveAdRequest inneractiveAdRequest, AbstractC9087e abstractC9087e) {
        this(abstractC9087e);
        this.f18755c = enumC8424u;
        this.f18753a = inneractiveAdRequest;
        this.f18756d = null;
    }

    public C8428w(AbstractC9087e abstractC9087e) {
        this.f18759g = false;
        this.f18757e = abstractC9087e;
        this.f18758f = new JSONArray();
    }

    /* JADX INFO: renamed from: a */
    public final C8428w m20807a(Object... objArr) {
        if (objArr.length > 0) {
            JSONObject jSONObject = new JSONObject();
            for (int i = 0; i < objArr.length - 1; i += 2) {
                String string = objArr[i].toString();
                Object obj = objArr[i + 1];
                try {
                    jSONObject.put(string, obj);
                } catch (Exception unused) {
                    IAlog.m21950f("Got exception adding param to json object: %s, %s", string, obj);
                }
            }
            this.f18758f.put(jSONObject);
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x014c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0157  */
    /* JADX WARN: Code duplicated, block: B:107:0x0165  */
    /* JADX WARN: Code duplicated, block: B:110:0x0170  */
    /* JADX WARN: Code duplicated, block: B:111:0x0173  */
    /* JADX WARN: Code duplicated, block: B:90:0x0122  */
    /* JADX WARN: Code duplicated, block: B:93:0x0130  */
    /* JADX WARN: Code duplicated, block: B:94:0x0132  */
    /* JADX INFO: renamed from: a */
    public final void m20808a(String str) {
        String str2;
        String str3;
        Long l;
        String str4;
        String str5;
        String campaignId;
        String str6;
        String spotId;
        StringBuilder sb;
        AbstractC9087e abstractC9087e;
        UnitDisplayType unitDisplayTypeM21905a;
        String lowerCase;
        AbstractC9087e abstractC9087e2;
        String str7;
        InneractiveAdRequest inneractiveAdRequest;
        AbstractC9087e abstractC9087e3;
        boolean zIsDeprecated;
        UnitDisplayType unitDisplayType;
        UnitDisplayType unitDisplayType2;
        if (IAConfigManager.m20377c() && !EnumC8424u.IA_IAB_GDPR_TCF_PURPOSE_1_DISABLED.equals(this.f18755c)) {
            String strM21943a = IAlog.m21943a(this);
            Object obj = this.f18755c;
            if (obj == null) {
                obj = this.f18754b;
            }
            IAlog.m21945a("%sSdk event dispatcher - aborting dispatch: %s", strM21943a, obj);
            return;
        }
        AbstractC9087e abstractC9087e4 = this.f18757e;
        if (abstractC9087e4 != null) {
            ImpressionData impressionData = abstractC9087e4.f21318r;
            String impressionId = impressionData != null ? impressionData.getImpressionId() : null;
            ImpressionData impressionData2 = this.f18757e.f21318r;
            String demandSource = impressionData2 != null ? impressionData2.getDemandSource() : null;
            ImpressionData impressionData3 = this.f18757e.f21318r;
            Long demandId = impressionData3 != null ? impressionData3.getDemandId() : null;
            ImpressionData impressionData4 = this.f18757e.f21318r;
            String creativeId = impressionData4 != null ? impressionData4.getCreativeId() : null;
            ImpressionData impressionData5 = this.f18757e.f21318r;
            String advertiserDomain = impressionData5 != null ? impressionData5.getAdvertiserDomain() : null;
            ImpressionData impressionData6 = this.f18757e.f21318r;
            if (impressionData6 != null) {
                str2 = impressionId;
                str3 = demandSource;
                l = demandId;
                str4 = creativeId;
                str5 = advertiserDomain;
                campaignId = impressionData6.getCampaignId();
            } else {
                str2 = impressionId;
                campaignId = null;
                str3 = demandSource;
                l = demandId;
                str4 = creativeId;
                str5 = advertiserDomain;
            }
        } else {
            str2 = null;
            str3 = null;
            l = null;
            str4 = null;
            str5 = null;
            campaignId = null;
        }
        IAConfigManager iAConfigManager = IAConfigManager.f17654M;
        C8432y c8432y = new C8432y(iAConfigManager.f17671c, str2, str3, l, str4, str5, campaignId, str);
        InneractiveAdRequest inneractiveAdRequest2 = this.f18753a;
        InterfaceC8041s0 selectedUnitConfig = inneractiveAdRequest2 == null ? null : inneractiveAdRequest2.getSelectedUnitConfig();
        if (selectedUnitConfig != null) {
            C8028r0 c8028r0 = (C8028r0) selectedUnitConfig;
            C8022o0 c8022o0 = c8028r0.f17814d;
            Track track = Track.ERRORS;
            Set set = c8022o0.f17806a;
            if (!(set == null ? false : set.contains(track))) {
                return;
            }
            C8016l0 c8016l0 = c8028r0.f17813c;
            if (c8016l0 == null || (unitDisplayType2 = c8016l0.f17798b) == null) {
                C8043t0 c8043t0 = c8028r0.f17816f;
                zIsDeprecated = (c8043t0 == null || (unitDisplayType = c8043t0.f17876j) == null) ? false : unitDisplayType.isDeprecated();
            } else {
                zIsDeprecated = unitDisplayType2.isDeprecated();
            }
            if (zIsDeprecated) {
                return;
            }
        }
        if (selectedUnitConfig == null && (abstractC9087e3 = this.f18757e) != null) {
            AbstractC7945a.m20382a(abstractC9087e3.f21313m);
        }
        AbstractC9087e abstractC9087e5 = this.f18757e;
        String str8 = abstractC9087e5 == null ? null : abstractC9087e5.f21304d;
        String str9 = TextUtils.isEmpty(iAConfigManager.f17687s) ? null : iAConfigManager.f17687s;
        if (this.f18754b == null && this.f18755c == null) {
            IAlog.m21945a("Sdk event dispatcher - error id or event id must be provided", new Object[0]);
            return;
        }
        InneractiveAdRequest inneractiveAdRequest3 = this.f18753a;
        if (inneractiveAdRequest3 == null) {
            AbstractC9087e abstractC9087e6 = this.f18757e;
            if (abstractC9087e6 != null) {
                spotId = abstractC9087e6.f21326z;
            } else {
                str6 = null;
            }
            sb = new StringBuilder();
            if (!TextUtils.isEmpty(iAConfigManager.f17680l)) {
                sb.append(iAConfigManager.f17680l);
                sb.append("_");
            }
            abstractC9087e = this.f18757e;
            if (abstractC9087e == null) {
                unitDisplayTypeM21905a = null;
            } else {
                unitDisplayTypeM21905a = abstractC9087e.f21314n;
            }
            if (unitDisplayTypeM21905a == null && (inneractiveAdRequest = this.f18753a) != null && inneractiveAdRequest.getSpotId() != null) {
                unitDisplayTypeM21905a = AbstractC9113b.m21905a(this.f18753a.getSpotId());
            }
            if (unitDisplayTypeM21905a != null) {
                lowerCase = unitDisplayTypeM21905a.name().toLowerCase(Locale.US);
            } else {
                lowerCase = "unknown";
            }
            sb.append(lowerCase);
            String string = sb.toString();
            AbstractC9087e abstractC9087e7 = this.f18757e;
            Integer numValueOf = abstractC9087e7 != null ? Integer.valueOf(abstractC9087e7.f21307g) : null;
            abstractC9087e2 = this.f18757e;
            if (abstractC9087e2 == null) {
                str7 = "";
            } else {
                str7 = abstractC9087e2.f21308h;
            }
            AbstractC9183r.f21477a.execute(new RunnableC8426v(this, c8432y, str8, str9, string, str6, numValueOf, str7));
        }
        spotId = inneractiveAdRequest3.getSpotId();
        str6 = spotId;
        sb = new StringBuilder();
        if (!TextUtils.isEmpty(iAConfigManager.f17680l)) {
            sb.append(iAConfigManager.f17680l);
            sb.append("_");
        }
        abstractC9087e = this.f18757e;
        if (abstractC9087e == null) {
            unitDisplayTypeM21905a = null;
        } else {
            unitDisplayTypeM21905a = abstractC9087e.f21314n;
        }
        if (unitDisplayTypeM21905a == null) {
            unitDisplayTypeM21905a = AbstractC9113b.m21905a(this.f18753a.getSpotId());
        }
        if (unitDisplayTypeM21905a != null) {
            lowerCase = unitDisplayTypeM21905a.name().toLowerCase(Locale.US);
        } else {
            lowerCase = "unknown";
        }
        sb.append(lowerCase);
        String string2 = sb.toString();
        AbstractC9087e abstractC9087e8 = this.f18757e;
        Integer numValueOf2 = abstractC9087e8 != null ? Integer.valueOf(abstractC9087e8.f21307g) : null;
        abstractC9087e2 = this.f18757e;
        if (abstractC9087e2 == null) {
            str7 = "";
        } else {
            str7 = abstractC9087e2.f21308h;
        }
        AbstractC9183r.f21477a.execute(new RunnableC8426v(this, c8432y, str8, str9, string2, str6, numValueOf2, str7));
    }
}
