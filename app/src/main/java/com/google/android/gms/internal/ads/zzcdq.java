package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcdq implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzcdt zza;
    private final String zzb;

    public zzcdq(zzcdt zzcdtVar, String str) {
        Objects.requireNonNull(zzcdtVar);
        this.zza = zzcdtVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        zzcdt zzcdtVar = this.zza;
        synchronized (zzcdtVar) {
            Iterator it = zzcdtVar.zzd().iterator();
            while (it.hasNext()) {
                ((zzcdr) it.next()).zza(sharedPreferences, this.zzb, str);
            }
        }
    }
}
