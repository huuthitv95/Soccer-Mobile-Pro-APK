package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.cache.session.enums.EnumC7917a;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.cache.session.f */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC7920f {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f17600a;

    static {
        int[] iArr = new int[EnumC7917a.values().length];
        f17600a = iArr;
        try {
            iArr[EnumC7917a.CLICK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f17600a[EnumC7917a.COMPLETION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f17600a[EnumC7917a.IMPRESSION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
