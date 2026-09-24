package com.fyber.inneractive.sdk.flow.endcard.loaders.companion;

import com.fyber.inneractive.sdk.model.vast.EnumC8302k;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.endcard.loaders.companion.c */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC8099c {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f18021a;

    static {
        int[] iArr = new int[EnumC8302k.values().length];
        f18021a = iArr;
        try {
            iArr[EnumC8302k.Jpeg.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18021a[EnumC8302k.Jpg.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f18021a[EnumC8302k.Png.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
