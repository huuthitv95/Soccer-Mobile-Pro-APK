package com.fyber.inneractive.sdk.cache.session.enums;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'REWARDED_VIDEO' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.fyber.inneractive.sdk.cache.session.enums.c */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC7919c {
    private static final /* synthetic */ EnumC7919c[] $VALUES;
    public static final EnumC7919c BANNER_DISPLAY;
    public static final EnumC7919c INTERSTITIAL_DISPLAY;
    public static final EnumC7919c INTERSTITIAL_VIDEO;
    public static final EnumC7919c NONE;
    public static final EnumC7919c RECTANGLE_DISPLAY;
    public static final EnumC7919c REWARDED_DISPLAY;
    public static final EnumC7919c REWARDED_VIDEO;
    private boolean mShouldCountCompletion;
    private UnitDisplayType mType;

    static {
        UnitDisplayType unitDisplayType = UnitDisplayType.REWARDED;
        EnumC7919c enumC7919c = new EnumC7919c("REWARDED_VIDEO", 0, unitDisplayType, true);
        REWARDED_VIDEO = enumC7919c;
        UnitDisplayType unitDisplayType2 = UnitDisplayType.INTERSTITIAL;
        EnumC7919c enumC7919c2 = new EnumC7919c("INTERSTITIAL_VIDEO", 1, unitDisplayType2, true);
        INTERSTITIAL_VIDEO = enumC7919c2;
        EnumC7919c enumC7919c3 = new EnumC7919c("RECTANGLE_DISPLAY", 2, UnitDisplayType.MRECT, false);
        RECTANGLE_DISPLAY = enumC7919c3;
        EnumC7919c enumC7919c4 = new EnumC7919c("REWARDED_DISPLAY", 3, unitDisplayType, true);
        REWARDED_DISPLAY = enumC7919c4;
        EnumC7919c enumC7919c5 = new EnumC7919c("BANNER_DISPLAY", 4, UnitDisplayType.BANNER, false);
        BANNER_DISPLAY = enumC7919c5;
        EnumC7919c enumC7919c6 = new EnumC7919c("INTERSTITIAL_DISPLAY", 5, unitDisplayType2, false);
        INTERSTITIAL_DISPLAY = enumC7919c6;
        EnumC7919c enumC7919c7 = new EnumC7919c("NONE", 6, UnitDisplayType.DEFAULT, false);
        NONE = enumC7919c7;
        $VALUES = new EnumC7919c[]{enumC7919c, enumC7919c2, enumC7919c3, enumC7919c4, enumC7919c5, enumC7919c6, enumC7919c7};
    }

    public EnumC7919c(String str, int i, UnitDisplayType unitDisplayType, boolean z) {
        super(str, i);
        this.mType = unitDisplayType;
        this.mShouldCountCompletion = z;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC7919c m20358a(String str, String str2) {
        int i = AbstractC7918b.f17599a[UnitDisplayType.fromValue(str).ordinal()];
        if (i == 1) {
            return str2.contains("video") ? REWARDED_VIDEO : REWARDED_DISPLAY;
        }
        if (i == 2) {
            return RECTANGLE_DISPLAY;
        }
        if (i == 3) {
            return BANNER_DISPLAY;
        }
        if (i != 4) {
            return null;
        }
        return str2.contains("video") ? INTERSTITIAL_VIDEO : INTERSTITIAL_DISPLAY;
    }

    public static EnumC7919c valueOf(String str) {
        return (EnumC7919c) Enum.valueOf(EnumC7919c.class, str);
    }

    public static EnumC7919c[] values() {
        return (EnumC7919c[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: a */
    public final UnitDisplayType m20359a() {
        return this.mType;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m20360b() {
        return this.mShouldCountCompletion;
    }
}
