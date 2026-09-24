package com.google.android.gms.internal.games_v2;

import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfb {
    public static Object zza(@CheckForNull Object obj) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new zzfc(sb.toString());
    }
}
