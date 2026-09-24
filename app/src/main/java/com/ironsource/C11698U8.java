package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;
import java.text.DecimalFormat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.U8 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11698U8 {

    /* JADX INFO: renamed from: c */
    public static final a f25908c = new a(null);

    /* JADX INFO: renamed from: d */
    public static final String f25909d = "auctionId";

    /* JADX INFO: renamed from: e */
    public static final String f25910e = "adUnit";

    /* JADX INFO: renamed from: f */
    public static final String f25911f = "adFormat";

    /* JADX INFO: renamed from: g */
    public static final String f25912g = "mediationAdUnitName";

    /* JADX INFO: renamed from: h */
    public static final String f25913h = "mediationAdUnitId";

    /* JADX INFO: renamed from: i */
    public static final String f25914i = "country";

    /* JADX INFO: renamed from: j */
    public static final String f25915j = "ab";

    /* JADX INFO: renamed from: k */
    public static final String f25916k = "segmentName";

    /* JADX INFO: renamed from: l */
    public static final String f25917l = "placement";

    /* JADX INFO: renamed from: m */
    public static final String f25918m = "adNetwork";

    /* JADX INFO: renamed from: n */
    public static final String f25919n = "instanceName";

    /* JADX INFO: renamed from: o */
    public static final String f25920o = "instanceId";

    /* JADX INFO: renamed from: p */
    public static final String f25921p = "revenue";

    /* JADX INFO: renamed from: q */
    public static final String f25922q = "precision";

    /* JADX INFO: renamed from: r */
    public static final String f25923r = "encryptedCPM";

    /* JADX INFO: renamed from: s */
    public static final String f25924s = "creativeId";

    /* JADX INFO: renamed from: a */
    private final LevelPlayAdInfo f25925a;

    /* JADX INFO: renamed from: b */
    private final DecimalFormat f25926b;

    /* JADX INFO: renamed from: com.ironsource.U8$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C11698U8(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f25925a = adInfo;
        this.f25926b = new DecimalFormat("#.#####");
    }

    /* JADX INFO: renamed from: a */
    public final String m27597a() {
        return this.f25925a.getAb();
    }

    /* JADX INFO: renamed from: b */
    public final String m27598b() {
        return this.f25925a.getAdFormat();
    }

    /* JADX INFO: renamed from: c */
    public final String m27599c() {
        return this.f25925a.getAdNetwork();
    }

    /* JADX INFO: renamed from: d */
    public final JSONObject m27600d() {
        return this.f25925a.impressionData$mediationsdk_release();
    }

    /* JADX INFO: renamed from: e */
    public final String m27601e() {
        return this.f25925a.getAuctionId();
    }

    /* JADX INFO: renamed from: f */
    public final String m27602f() {
        return this.f25925a.getCountry();
    }

    /* JADX INFO: renamed from: g */
    public final String m27603g() {
        return this.f25925a.getCreativeId();
    }

    /* JADX INFO: renamed from: h */
    public final String m27604h() {
        return this.f25925a.getEncryptedCPM();
    }

    /* JADX INFO: renamed from: i */
    public final String m27605i() {
        return this.f25925a.getInstanceId();
    }

    /* JADX INFO: renamed from: j */
    public final String m27606j() {
        return this.f25925a.getInstanceName();
    }

    /* JADX INFO: renamed from: k */
    public final String m27607k() {
        return this.f25925a.getAdUnitId();
    }

    /* JADX INFO: renamed from: l */
    public final String m27608l() {
        return this.f25925a.getAdUnitName();
    }

    /* JADX INFO: renamed from: m */
    public final String m27609m() {
        return this.f25925a.getPlacementName();
    }

    /* JADX INFO: renamed from: n */
    public final String m27610n() {
        return this.f25925a.getImpressionPrecision$mediationsdk_release();
    }

    /* JADX INFO: renamed from: o */
    public final double m27611o() {
        return this.f25925a.getImpressionRevenue$mediationsdk_release();
    }

    /* JADX INFO: renamed from: p */
    public final String m27612p() {
        return this.f25925a.getSegmentName();
    }

    public String toString() {
        String strM27601e = m27601e();
        String strM27608l = m27608l();
        String strM27607k = m27607k();
        String strM27598b = m27598b();
        String strM27602f = m27602f();
        String strM27597a = m27597a();
        String strM27612p = m27612p();
        String strM27609m = m27609m();
        String strM27599c = m27599c();
        String strM27606j = m27606j();
        String strM27605i = m27605i();
        m27611o();
        return "auctionId: '" + strM27601e + "', mediationAdUnitName: '" + strM27608l + "', mediationAdUnitId: '" + strM27607k + "', adFormat: '" + strM27598b + "', country: '" + strM27602f + "', ab: '" + strM27597a + "', segmentName: '" + strM27612p + "', placement: '" + strM27609m + "', adNetwork: '" + strM27599c + "', instanceName: '" + strM27606j + "', instanceId: '" + strM27605i + "', revenue: " + this.f25926b.format(m27611o()) + ", precision: '" + m27610n() + "', encryptedCPM: '" + m27604h() + "', creativeId: '" + m27603g() + "'";
    }
}
