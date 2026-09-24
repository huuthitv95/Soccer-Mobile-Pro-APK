package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.player.enums.EnumC8489b;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.d */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC8486d {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f18922a;

    static {
        int[] iArr = new int[EnumC8489b.values().length];
        f18922a = iArr;
        try {
            iArr[EnumC8489b.Prepared.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18922a[EnumC8489b.Buffering.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f18922a[EnumC8489b.Playing.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f18922a[EnumC8489b.Paused.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f18922a[EnumC8489b.Completed.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
