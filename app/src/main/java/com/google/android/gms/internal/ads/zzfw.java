package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfw extends zzfy {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzfw(int i, long j) {
        super(i, null);
        this.zza = j;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final String toString() {
        List list = this.zzb;
        String strZze = zze(this.zzd);
        String string = Arrays.toString(list.toArray());
        String string2 = Arrays.toString(this.zzc.toArray());
        int length = strZze.length();
        StringBuilder sb = new StringBuilder(length + 9 + String.valueOf(string).length() + 13 + String.valueOf(string2).length());
        sb.append(strZze);
        sb.append(" leaves: ");
        sb.append(string);
        sb.append(" containers: ");
        sb.append(string2);
        return sb.toString();
    }

    public final void zza(zzfx zzfxVar) {
        this.zzb.add(zzfxVar);
    }

    public final void zzb(zzfw zzfwVar) {
        this.zzc.add(zzfwVar);
    }

    public final zzfx zzc(int i) {
        List list = this.zzb;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzfx zzfxVar = (zzfx) list.get(i2);
            if (zzfxVar.zzd == i) {
                return zzfxVar;
            }
        }
        return null;
    }

    public final zzfw zzd(int i) {
        List list = this.zzc;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzfw zzfwVar = (zzfw) list.get(i2);
            if (zzfwVar.zzd == i) {
                return zzfwVar;
            }
        }
        return null;
    }
}
