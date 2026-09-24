package com.fyber.inneractive.sdk.p278ui;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.ui.i */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC9131i {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f21425a;

    static {
        int[] iArr = new int[IFyberAdIdentifier.Corner.values().length];
        f21425a = iArr;
        try {
            iArr[IFyberAdIdentifier.Corner.TOP_LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f21425a[IFyberAdIdentifier.Corner.TOP_RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f21425a[IFyberAdIdentifier.Corner.BOTTOM_LEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f21425a[IFyberAdIdentifier.Corner.BOTTOM_RIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
