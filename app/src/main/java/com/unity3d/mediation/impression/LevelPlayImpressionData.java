package com.unity3d.mediation.impression;

import java.text.DecimalFormat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class LevelPlayImpressionData {
    public static final C14641a Companion = new C14641a(null);
    public static final String IMPRESSION_DATA_KEY_ABTEST = "ab";
    public static final String IMPRESSION_DATA_KEY_AD_FORMAT = "adFormat";
    public static final String IMPRESSION_DATA_KEY_AD_NETWORK = "adNetwork";
    public static final String IMPRESSION_DATA_KEY_AUCTION_ID = "auctionId";
    public static final String IMPRESSION_DATA_KEY_COUNTRY = "country";
    public static final String IMPRESSION_DATA_KEY_CREATIVE_ID = "creativeId";
    public static final String IMPRESSION_DATA_KEY_ENCRYPTED_CPM = "encryptedCPM";
    public static final String IMPRESSION_DATA_KEY_INSTANCE_ID = "instanceId";
    public static final String IMPRESSION_DATA_KEY_INSTANCE_NAME = "instanceName";
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_ID = "mediationAdUnitId";
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_NAME = "mediationAdUnitName";
    public static final String IMPRESSION_DATA_KEY_PLACEMENT = "placement";
    public static final String IMPRESSION_DATA_KEY_PRECISION = "precision";
    public static final String IMPRESSION_DATA_KEY_REVENUE = "revenue";
    public static final String IMPRESSION_DATA_KEY_SEGMENT_NAME = "segmentName";

    /* JADX INFO: renamed from: a */
    private final JSONObject f41489a;

    /* JADX INFO: renamed from: b */
    private final DecimalFormat f41490b;

    /* JADX INFO: renamed from: com.unity3d.mediation.impression.LevelPlayImpressionData$a */
    public static final class C14641a {
        private C14641a() {
        }

        public /* synthetic */ C14641a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LevelPlayImpressionData(JSONObject allData) {
        Intrinsics.checkNotNullParameter(allData, "allData");
        this.f41489a = allData;
        this.f41490b = new DecimalFormat("#.#####");
    }

    public final String getAb() {
        String it = this.f41489a.optString("ab", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getAdFormat() {
        String it = this.f41489a.optString("adFormat", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getAdNetwork() {
        String it = this.f41489a.optString("adNetwork", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final JSONObject getAllData() {
        return this.f41489a;
    }

    public final String getAuctionId() {
        String it = this.f41489a.optString("auctionId", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getCountry() {
        String it = this.f41489a.optString("country", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getCreativeId() {
        String it = this.f41489a.optString("creativeId", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getEncryptedCPM() {
        String it = this.f41489a.optString("encryptedCPM", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getInstanceId() {
        String it = this.f41489a.optString("instanceId", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getInstanceName() {
        String it = this.f41489a.optString("instanceName", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getMediationAdUnitId() {
        String it = this.f41489a.optString("mediationAdUnitId", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getMediationAdUnitName() {
        String it = this.f41489a.optString("mediationAdUnitName", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getPlacement() {
        String it = this.f41489a.optString("placement", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getPrecision() {
        String it = this.f41489a.optString("precision", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final Double getRevenue() {
        Double dValueOf = Double.valueOf(this.f41489a.optDouble("revenue"));
        if (Double.isNaN(dValueOf.doubleValue())) {
            return null;
        }
        return dValueOf;
    }

    public final String getSegmentName() {
        String it = this.f41489a.optString("segmentName", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public String toString() {
        LevelPlayImpressionData levelPlayImpressionData;
        String str;
        String auctionId = getAuctionId();
        String mediationAdUnitName = getMediationAdUnitName();
        String mediationAdUnitId = getMediationAdUnitId();
        String adFormat = getAdFormat();
        String country = getCountry();
        String ab = getAb();
        String segmentName = getSegmentName();
        String placement = getPlacement();
        String adNetwork = getAdNetwork();
        String instanceName = getInstanceName();
        String instanceId = getInstanceId();
        if (getRevenue() == null) {
            str = null;
            levelPlayImpressionData = this;
        } else {
            levelPlayImpressionData = this;
            str = levelPlayImpressionData.f41490b.format(levelPlayImpressionData.getRevenue());
        }
        return "auctionId: '" + auctionId + "', mediationAdUnitName: '" + mediationAdUnitName + "', mediationAdUnitId: '" + mediationAdUnitId + "', adFormat: '" + adFormat + "', country: '" + country + "', ab: '" + ab + "', segmentName: '" + segmentName + "', placement: '" + placement + "', adNetwork: '" + adNetwork + "', instanceName: '" + instanceName + "', instanceId: '" + instanceId + "', revenue: " + str + ", precision: '" + levelPlayImpressionData.getPrecision() + "', encryptedCPM: '" + levelPlayImpressionData.getEncryptedCPM() + "', creativeId: '" + levelPlayImpressionData.getCreativeId() + "'";
    }
}
