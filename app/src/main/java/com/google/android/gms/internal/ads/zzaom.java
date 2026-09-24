package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaom implements zzane {
    private final zzes zza = new zzes();

    @Override // com.google.android.gms.internal.ads.zzane
    public final void zza(byte[] bArr, int i, int i2, zzand zzandVar, zzds zzdsVar) {
        zzcx zzcxVarZzr;
        zzes zzesVar = this.zza;
        zzesVar.zzb(bArr, i2 + i);
        zzesVar.zzh(i);
        ArrayList arrayList = new ArrayList();
        while (zzesVar.zzd() > 0) {
            zzgsw.zzb(zzesVar.zzd() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int iZzB = zzesVar.zzB() - 8;
            if (zzesVar.zzB() == 1987343459) {
                CharSequence charSequenceZzc = null;
                zzcw zzcwVarZzb = null;
                while (iZzB > 0) {
                    zzgsw.zzb(iZzB >= 8, "Incomplete vtt cue box header found.");
                    int iZzB2 = zzesVar.zzB();
                    int iZzB3 = zzesVar.zzB();
                    int i3 = iZzB - 8;
                    int i4 = iZzB2 - 8;
                    String strZzk = zzfk.zzk(zzesVar.zzi(), zzesVar.zzg(), i4);
                    zzesVar.zzk(i4);
                    if (iZzB3 == 1937011815) {
                        zzcwVarZzb = zzaov.zzb(strZzk);
                    } else if (iZzB3 == 1885436268) {
                        charSequenceZzc = zzaov.zzc(null, strZzk.trim(), Collections.EMPTY_LIST);
                    }
                    iZzB = i3 - i4;
                }
                if (charSequenceZzc == null) {
                    charSequenceZzc = "";
                }
                if (zzcwVarZzb != null) {
                    zzcwVarZzb.zza(charSequenceZzc);
                    zzcxVarZzr = zzcwVarZzb.zzr();
                } else {
                    Pattern pattern = zzaov.zza;
                    zzaou zzaouVar = new zzaou();
                    zzaouVar.zzc = charSequenceZzc;
                    zzcxVarZzr = zzaouVar.zza().zzr();
                }
                arrayList.add(zzcxVarZzr);
            } else {
                zzesVar.zzk(iZzB);
            }
        }
        zzdsVar.zza(new zzamw(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
