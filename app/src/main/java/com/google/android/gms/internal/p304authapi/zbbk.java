package com.google.android.gms.internal.p304authapi;

import android.os.Build;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zbbk {
    public static final int zba;

    static {
        zba = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
