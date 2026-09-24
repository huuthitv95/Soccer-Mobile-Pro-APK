package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaow implements zzane {
    private final zzes zza = new zzes();
    private final zzaon zzb = new zzaon();

    @Override // com.google.android.gms.internal.ads.zzane
    public final void zza(byte[] bArr, int i, int i2, zzand zzandVar, zzds zzdsVar) {
        zzes zzesVar = this.zza;
        zzesVar.zzb(bArr, i2 + i);
        zzesVar.zzh(i);
        ArrayList arrayList = new ArrayList();
        try {
            int iZzg = zzesVar.zzg();
            String strZzN = zzesVar.zzN(StandardCharsets.UTF_8);
            if (strZzN == null || !strZzN.startsWith("WEBVTT")) {
                zzesVar.zzh(iZzg);
                String strZzN2 = zzesVar.zzN(StandardCharsets.UTF_8);
                String.valueOf(strZzN2);
                throw zzat.zzb("Expected WEBVTT. Got ".concat(String.valueOf(strZzN2)), null);
            }
            while (!TextUtils.isEmpty(zzesVar.zzN(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                byte b = -1;
                int iZzg2 = 0;
                while (b == -1) {
                    iZzg2 = zzesVar.zzg();
                    String strZzN3 = zzesVar.zzN(StandardCharsets.UTF_8);
                    if (strZzN3 == null) {
                        b = 0;
                    } else if ("STYLE".equals(strZzN3)) {
                        b = 2;
                    } else {
                        b = strZzN3.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                    }
                }
                zzesVar.zzh(iZzg2);
                if (b == 0) {
                    zzamy.zza(new zzaoz(arrayList2), zzandVar, zzdsVar);
                    return;
                }
                if (b == 1) {
                    while (!TextUtils.isEmpty(zzesVar.zzN(StandardCharsets.UTF_8))) {
                    }
                } else if (b != 2) {
                    zzaop zzaopVarZza = zzaov.zza(zzesVar, arrayList);
                    if (zzaopVarZza != null) {
                        arrayList2.add(zzaopVarZza);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    zzesVar.zzN(StandardCharsets.UTF_8);
                    arrayList.addAll(this.zzb.zza(zzesVar));
                }
            }
        } catch (zzat e) {
            throw new IllegalArgumentException(e);
        }
    }
}
