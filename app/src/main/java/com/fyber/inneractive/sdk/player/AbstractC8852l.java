package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.player.enums.EnumC8488a;
import com.fyber.inneractive.sdk.player.enums.EnumC8489b;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.l */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC8852l {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f20792a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f20793b;

    static {
        int[] iArr = new int[EnumC8488a.values().length];
        f20793b = iArr;
        try {
            iArr[EnumC8488a.Uninitialized.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f20793b[EnumC8488a.Started.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f20793b[EnumC8488a.FirstQuarter.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f20793b[EnumC8488a.MidPoint.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f20793b[EnumC8488a.ThirdPQuarter.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f20793b[EnumC8488a.Completed.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr2 = new int[EnumC8489b.values().length];
        f20792a = iArr2;
        try {
            iArr2[EnumC8489b.Prepared.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f20792a[EnumC8489b.Playing.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f20792a[EnumC8489b.Completed.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
