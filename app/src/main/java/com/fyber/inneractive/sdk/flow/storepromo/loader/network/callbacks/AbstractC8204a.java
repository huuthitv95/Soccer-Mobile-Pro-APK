package com.fyber.inneractive.sdk.flow.storepromo.loader.network.callbacks;

import com.fyber.inneractive.sdk.flow.storepromo.model.EnumC8209b;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.storepromo.loader.network.callbacks.a */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC8204a {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f18284a;

    static {
        int[] iArr = new int[EnumC8209b.values().length];
        f18284a = iArr;
        try {
            iArr[EnumC8209b.ICON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18284a[EnumC8209b.SCREENSHOT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f18284a[EnumC8209b.VIDEO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f18284a[EnumC8209b.RATING_ICON.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f18284a[EnumC8209b.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
