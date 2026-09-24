package com.fyber.inneractive.sdk.flow.endcard;

import com.fyber.inneractive.sdk.model.vast.EnumC8300i;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.endcard.i */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC8091i {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f17998a;

    static {
        int[] iArr = new int[EnumC8300i.values().length];
        f17998a = iArr;
        try {
            iArr[EnumC8300i.Html.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f17998a[EnumC8300i.Iframe.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f17998a[EnumC8300i.Static.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
