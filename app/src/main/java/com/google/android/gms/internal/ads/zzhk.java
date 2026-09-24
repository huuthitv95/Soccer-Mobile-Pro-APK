package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public class zzhk extends IOException {
    public final int zza;

    public zzhk(int i) {
        this.zza = i;
    }

    public zzhk(String str, int i) {
        super(str);
        this.zza = i;
    }

    public zzhk(String str, Throwable th, int i) {
        super(str, th);
        this.zza = i;
    }

    public zzhk(Throwable th, int i) {
        super(th);
        this.zza = i;
    }
}
