package com.fyber.inneractive.sdk.config.enums;

import com.facebook.share.internal.MessengerShareContentUtility;
import com.ironsource.C11744X3;
import com.unity3d.ads.BuildConfig;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public enum UnitDisplayType {
    INTERSTITIAL("interstitial", false),
    LANDSCAPE(C11744X3.i.f26320C, true),
    MRECT("mrect", false),
    BANNER("banner", false),
    REWARDED("rewarded", false),
    NATIVE("typenative", false),
    SQUARE(MessengerShareContentUtility.IMAGE_RATIO_SQUARE, true),
    VERTICAL("vertical", true),
    DEFAULT(BuildConfig.FLAVOR, false);

    private static final Map<String, UnitDisplayType> CONSTANTS = new HashMap();
    private final boolean deprecated;
    private String stringValue;

    static {
        for (UnitDisplayType unitDisplayType : values()) {
            CONSTANTS.put(unitDisplayType.stringValue, unitDisplayType);
        }
    }

    UnitDisplayType(String str, boolean z) {
        this.stringValue = str;
        this.deprecated = z;
    }

    public static UnitDisplayType fromValue(String str) {
        UnitDisplayType unitDisplayType = str != null ? CONSTANTS.get(str.toLowerCase(Locale.US)) : null;
        return unitDisplayType != null ? unitDisplayType : DEFAULT;
    }

    public boolean isDeprecated() {
        return this.deprecated;
    }

    public boolean isFullscreenUnit() {
        return this == INTERSTITIAL || this == REWARDED;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.stringValue;
    }

    public String value() {
        return this.stringValue;
    }
}
