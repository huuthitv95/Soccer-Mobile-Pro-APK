package com.google.android.gms.internal.ads;

import android.content.p003pm.PackageManager$OnChecksumsReadyListener;
import android.content.pm.ApkChecksum;
import com.google.android.material.chip.Chip$$ExternalSyntheticApiModelOutline0;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzazd implements PackageManager$OnChecksumsReadyListener {
    final zzhcb zza = zzhcb.zze();

    public final void onChecksumsReady(List list) {
        if (list == null) {
            this.zza.zza("");
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ApkChecksum apkChecksumM22324m = Chip$$ExternalSyntheticApiModelOutline0.m22324m(list.get(i));
                if (apkChecksumM22324m.getType() == 8) {
                    zzhcb zzhcbVar = this.zza;
                    zzgyu zzgyuVarZzi = zzgyu.zzn().zzi();
                    byte[] value = apkChecksumM22324m.getValue();
                    zzhcbVar.zza(zzgyuVarZzi.zzj(value, 0, value.length));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        this.zza.zza("");
    }
}
