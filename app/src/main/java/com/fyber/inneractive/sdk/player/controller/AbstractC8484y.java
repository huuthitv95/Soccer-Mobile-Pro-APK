package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.player.enums.EnumC8489b;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.controller.y */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC8484y {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f18895a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f18896b;

    static {
        int[] iArr = new int[VideoClickOrigin.values().length];
        f18896b = iArr;
        try {
            iArr[VideoClickOrigin.STORE_PROMO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18896b[VideoClickOrigin.VIDEO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f18896b[VideoClickOrigin.APP_INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[EnumC8489b.values().length];
        f18895a = iArr2;
        try {
            iArr2[EnumC8489b.Start_in_progress.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f18895a[EnumC8489b.Prepared.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f18895a[EnumC8489b.Buffering.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f18895a[EnumC8489b.Playing.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f18895a[EnumC8489b.Paused.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f18895a[EnumC8489b.Completed.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f18895a[EnumC8489b.Error.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f18895a[EnumC8489b.Preparing.ordinal()] = 8;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f18895a[EnumC8489b.Seeking.ordinal()] = 9;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
