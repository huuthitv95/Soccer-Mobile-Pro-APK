package com.unity3d.mediation;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.ironsource.C12317m4;
import com.ironsource.C12434q2;
import com.ironsource.C12586wb;
import com.ironsource.mediationsdk.C12333d;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class LevelPlayAdInfo {

    /* JADX INFO: renamed from: a */
    private final String f41451a;

    /* JADX INFO: renamed from: b */
    private final String f41452b;

    /* JADX INFO: renamed from: c */
    private final String f41453c;

    /* JADX INFO: renamed from: d */
    private final C12434q2 f41454d;

    /* JADX INFO: renamed from: e */
    private final LevelPlayAdSize f41455e;

    /* JADX INFO: renamed from: f */
    private final String f41456f;

    /* JADX INFO: renamed from: g */
    private final Map<String, Object> f41457g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayAdInfo(LevelPlayAdInfo adInfo, String str) {
        this(adInfo.f41451a, adInfo.f41452b, adInfo.f41453c, adInfo.f41454d, adInfo.f41455e, str, adInfo.f41457g);
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    public LevelPlayAdInfo(String adId, String adUnitId, String adFormat, C12434q2 c12434q2, LevelPlayAdSize levelPlayAdSize, String str, Map<String, ? extends Object> adapterData) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adapterData, "adapterData");
        this.f41451a = adId;
        this.f41452b = adUnitId;
        this.f41453c = adFormat;
        this.f41454d = c12434q2;
        this.f41455e = levelPlayAdSize;
        this.f41456f = str;
        this.f41457g = adapterData;
    }

    public /* synthetic */ LevelPlayAdInfo(String str, String str2, String str3, C12434q2 c12434q2, LevelPlayAdSize levelPlayAdSize, String str4, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : c12434q2, (i & 16) != 0 ? null : levelPlayAdSize, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? MapsKt.emptyMap() : map);
    }

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ <T> T m43189a(String str) {
        JSONObject jSONObjectM33153m;
        C12434q2 c12434q2 = this.f41454d;
        T t = (c12434q2 == null || (jSONObjectM33153m = c12434q2.m33153m()) == null) ? null : (T) jSONObjectM33153m.opt(str);
        Intrinsics.reifiedOperationMarker(2, "T");
        return t;
    }

    /* JADX INFO: renamed from: a */
    private final String m43190a() {
        return this.f41451a;
    }

    /* JADX INFO: renamed from: b */
    private final String m43191b() {
        return this.f41452b;
    }

    /* JADX INFO: renamed from: c */
    private final String m43192c() {
        return this.f41453c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LevelPlayAdInfo copy$default(LevelPlayAdInfo levelPlayAdInfo, String str, String str2, String str3, C12434q2 c12434q2, LevelPlayAdSize levelPlayAdSize, String str4, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = levelPlayAdInfo.f41451a;
        }
        if ((i & 2) != 0) {
            str2 = levelPlayAdInfo.f41452b;
        }
        if ((i & 4) != 0) {
            str3 = levelPlayAdInfo.f41453c;
        }
        if ((i & 8) != 0) {
            c12434q2 = levelPlayAdInfo.f41454d;
        }
        if ((i & 16) != 0) {
            levelPlayAdSize = levelPlayAdInfo.f41455e;
        }
        if ((i & 32) != 0) {
            str4 = levelPlayAdInfo.f41456f;
        }
        if ((i & 64) != 0) {
            map = levelPlayAdInfo.f41457g;
        }
        String str5 = str4;
        Map map2 = map;
        LevelPlayAdSize levelPlayAdSize2 = levelPlayAdSize;
        String str6 = str3;
        return levelPlayAdInfo.copy(str, str2, str6, c12434q2, levelPlayAdSize2, str5, map2);
    }

    /* JADX INFO: renamed from: d */
    private final C12434q2 m43193d() {
        return this.f41454d;
    }

    /* JADX INFO: renamed from: e */
    private final LevelPlayAdSize m43194e() {
        return this.f41455e;
    }

    /* JADX INFO: renamed from: f */
    private final String m43195f() {
        return this.f41456f;
    }

    /* JADX INFO: renamed from: g */
    private final Map<String, Object> m43196g() {
        return this.f41457g;
    }

    public final LevelPlayAdInfo copy(String adId, String adUnitId, String adFormat, C12434q2 c12434q2, LevelPlayAdSize levelPlayAdSize, String str, Map<String, ? extends Object> adapterData) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adapterData, "adapterData");
        return new LevelPlayAdInfo(adId, adUnitId, adFormat, c12434q2, levelPlayAdSize, str, adapterData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelPlayAdInfo)) {
            return false;
        }
        LevelPlayAdInfo levelPlayAdInfo = (LevelPlayAdInfo) obj;
        return Intrinsics.areEqual(this.f41451a, levelPlayAdInfo.f41451a) && Intrinsics.areEqual(this.f41452b, levelPlayAdInfo.f41452b) && Intrinsics.areEqual(this.f41453c, levelPlayAdInfo.f41453c) && Intrinsics.areEqual(this.f41454d, levelPlayAdInfo.f41454d) && Intrinsics.areEqual(this.f41455e, levelPlayAdInfo.f41455e) && Intrinsics.areEqual(this.f41456f, levelPlayAdInfo.f41456f) && Intrinsics.areEqual(this.f41457g, levelPlayAdInfo.f41457g);
    }

    public final String getAb() {
        JSONObject jSONObjectM33153m;
        C12434q2 c12434q2 = this.f41454d;
        Object objOpt = (c12434q2 == null || (jSONObjectM33153m = c12434q2.m33153m()) == null) ? null : jSONObjectM33153m.opt("ab");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public final String getAdFormat() {
        JSONObject jSONObjectM33153m;
        C12434q2 c12434q2 = this.f41454d;
        Object objOpt = (c12434q2 == null || (jSONObjectM33153m = c12434q2.m33153m()) == null) ? null : jSONObjectM33153m.opt("adFormat");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? this.f41453c : str;
    }

    public final String getAdId() {
        return this.f41451a;
    }

    public final String getAdNetwork() {
        JSONObject jSONObjectM33153m;
        C12434q2 c12434q2 = this.f41454d;
        Object objOpt = (c12434q2 == null || (jSONObjectM33153m = c12434q2.m33153m()) == null) ? null : jSONObjectM33153m.opt("adNetwork");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public final LevelPlayAdSize getAdSize() {
        return this.f41455e;
    }

    public final String getAdUnitId() {
        JSONObject jSONObjectM33153m;
        C12434q2 c12434q2 = this.f41454d;
        Object objOpt = (c12434q2 == null || (jSONObjectM33153m = c12434q2.m33153m()) == null) ? null : jSONObjectM33153m.opt("mediationAdUnitId");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? this.f41452b : str;
    }

    public final String getAdUnitName() {
        JSONObject jSONObjectM33153m;
        C12434q2 c12434q2 = this.f41454d;
        Object objOpt = (c12434q2 == null || (jSONObjectM33153m = c12434q2.m33153m()) == null) ? null : jSONObjectM33153m.opt("mediationAdUnitName");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public final String getAuctionId() {
        JSONObject jSONObjectM33153m;
        C12434q2 c12434q2 = this.f41454d;
        Object objOpt = (c12434q2 == null || (jSONObjectM33153m = c12434q2.m33153m()) == null) ? null : jSONObjectM33153m.opt("auctionId");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public final String getCountry() {
        JSONObject jSONObjectM33153m;
        C12434q2 c12434q2 = this.f41454d;
        Object objOpt = (c12434q2 == null || (jSONObjectM33153m = c12434q2.m33153m()) == null) ? null : jSONObjectM33153m.opt("country");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public final String getCreativeId() {
        JSONObject jSONObjectM33153m;
        C12434q2 c12434q2 = this.f41454d;
        Object objOpt = (c12434q2 == null || (jSONObjectM33153m = c12434q2.m33153m()) == null) ? null : jSONObjectM33153m.opt("creativeId");
        if (!(objOpt instanceof String)) {
            objOpt = null;
        }
        String str = (String) objOpt;
        if (str != null) {
            return str;
        }
        Object obj = this.f41457g.get("creativeId");
        String str2 = obj instanceof String ? (String) obj : null;
        return str2 == null ? "" : str2;
    }

    public final String getEncryptedCPM() {
        JSONObject jSONObjectM33153m;
        C12434q2 c12434q2 = this.f41454d;
        Object objOpt = (c12434q2 == null || (jSONObjectM33153m = c12434q2.m33153m()) == null) ? null : jSONObjectM33153m.opt("encryptedCPM");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public final String getImpressionPrecision$mediationsdk_release() {
        JSONObject jSONObjectM33153m;
        C12434q2 c12434q2 = this.f41454d;
        Object objOpt = (c12434q2 == null || (jSONObjectM33153m = c12434q2.m33153m()) == null) ? null : jSONObjectM33153m.opt("precision");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public final double getImpressionRevenue$mediationsdk_release() {
        JSONObject jSONObjectM33153m;
        C12434q2 c12434q2 = this.f41454d;
        Double dValueOf = (c12434q2 == null || (jSONObjectM33153m = c12434q2.m33153m()) == null) ? null : Double.valueOf(jSONObjectM33153m.optDouble("revenue"));
        return (Intrinsics.areEqual(dValueOf, Double.NaN) || dValueOf == null) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : dValueOf.doubleValue();
    }

    public final String getInstanceId() {
        JSONObject jSONObjectM33153m;
        C12434q2 c12434q2 = this.f41454d;
        Object objOpt = (c12434q2 == null || (jSONObjectM33153m = c12434q2.m33153m()) == null) ? null : jSONObjectM33153m.opt("instanceId");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public final String getInstanceName() {
        JSONObject jSONObjectM33153m;
        C12434q2 c12434q2 = this.f41454d;
        Object objOpt = (c12434q2 == null || (jSONObjectM33153m = c12434q2.m33153m()) == null) ? null : jSONObjectM33153m.opt("instanceName");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public final String getPlacementName() {
        String str = this.f41456f;
        return str == null ? "" : str;
    }

    public final String getPrecision() {
        C12586wb c12586wbM33144d;
        String strM34056c;
        C12434q2 c12434q2 = this.f41454d;
        return (c12434q2 == null || (c12586wbM33144d = c12434q2.m33144d()) == null || (strM34056c = c12586wbM33144d.m34056c()) == null) ? getImpressionPrecision$mediationsdk_release() : strM34056c;
    }

    public final double getRevenue() {
        C12586wb c12586wbM33144d;
        C12434q2 c12434q2 = this.f41454d;
        return (c12434q2 == null || (c12586wbM33144d = c12434q2.m33144d()) == null) ? getImpressionRevenue$mediationsdk_release() : c12586wbM33144d.m34057d();
    }

    public final String getSegmentName() {
        JSONObject jSONObjectM33153m;
        C12434q2 c12434q2 = this.f41454d;
        Object objOpt = (c12434q2 == null || (jSONObjectM33153m = c12434q2.m33153m()) == null) ? null : jSONObjectM33153m.opt("segmentName");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public int hashCode() {
        int iHashCode = ((((this.f41451a.hashCode() * 31) + this.f41452b.hashCode()) * 31) + this.f41453c.hashCode()) * 31;
        C12434q2 c12434q2 = this.f41454d;
        int iHashCode2 = (iHashCode + (c12434q2 == null ? 0 : c12434q2.hashCode())) * 31;
        LevelPlayAdSize levelPlayAdSize = this.f41455e;
        int iHashCode3 = (iHashCode2 + (levelPlayAdSize == null ? 0 : levelPlayAdSize.hashCode())) * 31;
        String str = this.f41456f;
        return ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.f41457g.hashCode();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0033 -> B:24:0x0046). Please report as a decompilation issue!!! */
    public final JSONObject impressionData$mediationsdk_release() {
        JSONObject jSONObject;
        String str;
        JSONObject jSONObjectM33153m;
        try {
            C12434q2 c12434q2 = this.f41454d;
            if (c12434q2 == null || (jSONObjectM33153m = c12434q2.m33153m()) == null) {
                jSONObject = new JSONObject();
            } else {
                Iterator<String> itKeys = jSONObjectM33153m.keys();
                Intrinsics.checkNotNullExpressionValue(itKeys, "it.keys()");
                jSONObject = new JSONObject(jSONObjectM33153m, (String[]) SequencesKt.toList(SequencesKt.asSequence(itKeys)).toArray(new String[0]));
            }
        } catch (Exception e) {
            IronLog.INTERNAL.error("failed to copy impression JSON", e);
            C12317m4.m32153d().m32155a(e);
            jSONObject = new JSONObject();
        }
        try {
            String placement = jSONObject.optString("placement");
            Intrinsics.checkNotNullExpressionValue(placement, "placement");
            if (placement.length() > 0 && (str = this.f41456f) != null) {
                jSONObject.put("placement", StringsKt.replace$default(placement, C12333d.f31054r, str, false, 4, (Object) null));
            }
            if (getCreativeId().length() > 0) {
                jSONObject.put("creativeId", getCreativeId());
            }
        } catch (Exception e2) {
            IronLog.INTERNAL.error("failed to put impression values", e2);
            C12317m4.m32153d().m32155a(e2);
        }
        return jSONObject;
    }

    public String toString() {
        return "adId: " + getAdId() + ", adUnitId: " + getAdUnitId() + ", adUnitName: " + getAdUnitName() + ", adSize: " + this.f41455e + ", adFormat: " + getAdFormat() + ", placementName: " + getPlacementName() + ", auctionId: " + getAuctionId() + ", country: " + getCountry() + ", ab: " + getAb() + ", segmentName: " + getSegmentName() + ", adNetwork: " + getAdNetwork() + ", instanceName: " + getInstanceName() + ", instanceId: " + getInstanceId() + ", revenue: " + getRevenue() + ", precision: " + getPrecision() + ", encryptedCPM: " + getEncryptedCPM() + ", creativeId: " + getCreativeId();
    }
}
