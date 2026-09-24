package com.chartboost.sdk.impl;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.iab.omid.library.chartboost.adsession.FriendlyObstructionPurpose;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.chartboost.sdk.impl.sk */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC4057sk {

    /* JADX INFO: renamed from: c */
    public static final EnumC4057sk f16296c;

    /* JADX INFO: renamed from: d */
    public static final EnumC4057sk f16297d;

    /* JADX INFO: renamed from: e */
    public static final EnumC4057sk f16298e;

    /* JADX INFO: renamed from: f */
    public static final EnumC4057sk f16299f;

    /* JADX INFO: renamed from: g */
    public static final EnumC4057sk f16300g;

    /* JADX INFO: renamed from: h */
    public static final EnumC4057sk f16301h;

    /* JADX INFO: renamed from: i */
    public static final EnumC4057sk f16302i;

    /* JADX INFO: renamed from: j */
    public static final EnumC4057sk f16303j;

    /* JADX INFO: renamed from: k */
    public static final EnumC4057sk f16304k;

    /* JADX INFO: renamed from: l */
    public static final EnumC4057sk f16305l;

    /* JADX INFO: renamed from: m */
    public static final EnumC4057sk f16306m;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ EnumC4057sk[] f16307n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ EnumEntries f16308o;

    /* JADX INFO: renamed from: b */
    public FriendlyObstructionPurpose f16309b;

    static {
        FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.VIDEO_CONTROLS;
        f16296c = new EnumC4057sk("VIDEO_CONTROLS", 0, friendlyObstructionPurpose);
        f16297d = new EnumC4057sk("CLOSE_BUTTON", 1, FriendlyObstructionPurpose.CLOSE_AD);
        FriendlyObstructionPurpose friendlyObstructionPurpose2 = FriendlyObstructionPurpose.OTHER;
        f16298e = new EnumC4057sk("CTA_BUTTON", 2, friendlyObstructionPurpose2);
        f16299f = new EnumC4057sk("SKIP_BUTTON", 3, friendlyObstructionPurpose);
        f16300g = new EnumC4057sk("INDUSTRY_ICON", 4, friendlyObstructionPurpose2);
        f16301h = new EnumC4057sk("COUNTDOWN_TIMER", 5, friendlyObstructionPurpose2);
        FriendlyObstructionPurpose friendlyObstructionPurpose3 = FriendlyObstructionPurpose.NOT_VISIBLE;
        f16302i = new EnumC4057sk("OVERLAY", 6, friendlyObstructionPurpose3);
        f16303j = new EnumC4057sk("BLUR", 7, friendlyObstructionPurpose2);
        f16304k = new EnumC4057sk("PROGRESS_BAR", 8, friendlyObstructionPurpose2);
        f16305l = new EnumC4057sk("NOT_VISIBLE", 9, friendlyObstructionPurpose3);
        f16306m = new EnumC4057sk(NativeAdContent.ViewTag.OTHER, 10, friendlyObstructionPurpose2);
        EnumC4057sk[] enumC4057skArrM19445a = m19445a();
        f16307n = enumC4057skArrM19445a;
        f16308o = EnumEntriesKt.enumEntries(enumC4057skArrM19445a);
    }

    public EnumC4057sk(String str, int i, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        super(str, i);
        this.f16309b = friendlyObstructionPurpose;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC4057sk[] m19445a() {
        return new EnumC4057sk[]{f16296c, f16297d, f16298e, f16299f, f16300g, f16301h, f16302i, f16303j, f16304k, f16305l, f16306m};
    }

    public static EnumC4057sk valueOf(String str) {
        return (EnumC4057sk) Enum.valueOf(EnumC4057sk.class, str);
    }

    public static EnumC4057sk[] values() {
        return (EnumC4057sk[]) f16307n.clone();
    }

    /* JADX INFO: renamed from: b */
    public final FriendlyObstructionPurpose m19446b() {
        return this.f16309b;
    }
}
