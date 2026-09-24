package com.fyber.inneractive.sdk.flow.storepromo.loader;

import com.fyber.inneractive.sdk.flow.storepromo.model.EnumC8209b;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.storepromo.loader.h */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC8196h {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f18262a;

    static {
        int[] iArr = new int[EnumC8209b.values().length];
        f18262a = iArr;
        try {
            iArr[EnumC8209b.SCREENSHOT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18262a[EnumC8209b.VIDEO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f18262a[EnumC8209b.ICON.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f18262a[EnumC8209b.RATING_ICON.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
