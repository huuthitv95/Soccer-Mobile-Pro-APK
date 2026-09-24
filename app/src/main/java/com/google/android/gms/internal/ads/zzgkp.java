package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgkp extends RuntimeException {
    public zzgkp() {
        this(0);
    }

    public zzgkp(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 3);
        sb.append("r: ");
        sb.append(i);
        super(sb.toString());
    }

    public zzgkp(int i, Throwable th) {
        super("r: 2", th);
    }
}
