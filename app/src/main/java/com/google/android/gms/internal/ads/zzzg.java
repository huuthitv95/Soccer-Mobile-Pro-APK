package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzzg extends zzat {
    public final zzgvz zzc;

    public zzzg(String str, Uri uri, List list) {
        super(str, null, false, 1);
        this.zzc = zzgvz.zzq(list);
    }

    @Override // com.google.android.gms.internal.ads.zzat, java.lang.Throwable
    public final String getMessage() {
        zzgvz zzgvzVar = this.zzc;
        String message = super.getMessage();
        if (zzgvzVar.isEmpty()) {
            return message;
        }
        int length = message.length();
        String strValueOf = String.valueOf(zzgvzVar);
        StringBuilder sb = new StringBuilder(length + 17 + String.valueOf(strValueOf).length());
        sb.append(message);
        sb.append("\nsniff failures: ");
        sb.append(strValueOf);
        return sb.toString();
    }
}
