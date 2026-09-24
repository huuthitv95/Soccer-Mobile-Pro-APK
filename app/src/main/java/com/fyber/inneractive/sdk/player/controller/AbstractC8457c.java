package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.model.vast.EnumC8300i;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.controller.c */
/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class AbstractC8457c {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f18824a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f18825b;

    static {
        int[] iArr = new int[EnumC8300i.values().length];
        f18825b = iArr;
        try {
            iArr[EnumC8300i.Static.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18825b[EnumC8300i.Html.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f18825b[EnumC8300i.FMP_End_Card.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f18825b[EnumC8300i.Iframe.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[UnitDisplayType.values().length];
        f18824a = iArr2;
        try {
            iArr2[UnitDisplayType.INTERSTITIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f18824a[UnitDisplayType.REWARDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
