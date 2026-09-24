package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.player.enums.EnumC8489b;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.o */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC8871o {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f20842a;

    static {
        int[] iArr = new int[EnumC8489b.values().length];
        f20842a = iArr;
        try {
            iArr[EnumC8489b.Prepared.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f20842a[EnumC8489b.Buffering.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f20842a[EnumC8489b.Playing.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f20842a[EnumC8489b.Paused.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f20842a[EnumC8489b.Completed.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
