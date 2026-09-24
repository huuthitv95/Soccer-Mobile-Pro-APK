package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzidd extends zzidc {
    zzidd() {
    }

    @Override // com.google.android.gms.internal.ads.zzidc
    final void zza(Object obj) {
        ((zzidn) obj).zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzidc
    final void zzb(zzigw zzigwVar, Map.Entry entry) throws IOException {
        zzido zzidoVar = (zzido) entry.getKey();
        if (!zzidoVar.zzc) {
            zzigu zziguVar = zzigu.DOUBLE;
            switch (zzidoVar.zzb) {
                case DOUBLE:
                    zzigwVar.zzf(zzidoVar.zza, ((Double) entry.getValue()).doubleValue());
                    break;
                case FLOAT:
                    zzigwVar.zze(zzidoVar.zza, ((Float) entry.getValue()).floatValue());
                    break;
                case INT64:
                    zzigwVar.zzc(zzidoVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case UINT64:
                    zzigwVar.zzh(zzidoVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case INT32:
                    zzigwVar.zzi(zzidoVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case FIXED64:
                    zzigwVar.zzj(zzidoVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case FIXED32:
                    zzigwVar.zzk(zzidoVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case BOOL:
                    zzigwVar.zzl(zzidoVar.zza, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case STRING:
                    zzigwVar.zzm(zzidoVar.zza, (String) entry.getValue());
                    break;
                case GROUP:
                    zzigwVar.zzs(zzidoVar.zza, entry.getValue(), zzifm.zza().zzb(entry.getValue().getClass()));
                    break;
                case MESSAGE:
                    zzigwVar.zzr(zzidoVar.zza, entry.getValue(), zzifm.zza().zzb(entry.getValue().getClass()));
                    break;
                case BYTES:
                    zzigwVar.zzn(zzidoVar.zza, (zzicn) entry.getValue());
                    break;
                case UINT32:
                    zzigwVar.zzo(zzidoVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case ENUM:
                    zzigwVar.zzi(zzidoVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case SFIXED32:
                    zzigwVar.zzb(zzidoVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case SFIXED64:
                    zzigwVar.zzd(zzidoVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case SINT32:
                    zzigwVar.zzp(zzidoVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case SINT64:
                    zzigwVar.zzq(zzidoVar.zza, ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        zzigu zziguVar2 = zzigu.DOUBLE;
        switch (zzidoVar.zzb) {
            case DOUBLE:
                zzifw.zza(zzidoVar.zza, (List) entry.getValue(), zzigwVar, zzidoVar.zzd);
                break;
            case FLOAT:
                zzifw.zzb(zzidoVar.zza, (List) entry.getValue(), zzigwVar, zzidoVar.zzd);
                break;
            case INT64:
                zzifw.zzc(zzidoVar.zza, (List) entry.getValue(), zzigwVar, zzidoVar.zzd);
                break;
            case UINT64:
                zzifw.zzd(zzidoVar.zza, (List) entry.getValue(), zzigwVar, zzidoVar.zzd);
                break;
            case INT32:
                zzifw.zzh(zzidoVar.zza, (List) entry.getValue(), zzigwVar, zzidoVar.zzd);
                break;
            case FIXED64:
                zzifw.zzf(zzidoVar.zza, (List) entry.getValue(), zzigwVar, zzidoVar.zzd);
                break;
            case FIXED32:
                zzifw.zzk(zzidoVar.zza, (List) entry.getValue(), zzigwVar, zzidoVar.zzd);
                break;
            case BOOL:
                zzifw.zzn(zzidoVar.zza, (List) entry.getValue(), zzigwVar, zzidoVar.zzd);
                break;
            case STRING:
                zzifw.zzo(zzidoVar.zza, (List) entry.getValue(), zzigwVar);
                break;
            case GROUP:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    zzifw.zzr(zzidoVar.zza, (List) entry.getValue(), zzigwVar, zzifm.zza().zzb(list.get(0).getClass()));
                    break;
                }
                break;
            case MESSAGE:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    zzifw.zzq(zzidoVar.zza, (List) entry.getValue(), zzigwVar, zzifm.zza().zzb(list2.get(0).getClass()));
                    break;
                }
                break;
            case BYTES:
                zzifw.zzp(zzidoVar.zza, (List) entry.getValue(), zzigwVar);
                break;
            case UINT32:
                zzifw.zzi(zzidoVar.zza, (List) entry.getValue(), zzigwVar, zzidoVar.zzd);
                break;
            case ENUM:
                zzifw.zzh(zzidoVar.zza, (List) entry.getValue(), zzigwVar, zzidoVar.zzd);
                break;
            case SFIXED32:
                zzifw.zzl(zzidoVar.zza, (List) entry.getValue(), zzigwVar, zzidoVar.zzd);
                break;
            case SFIXED64:
                zzifw.zzg(zzidoVar.zza, (List) entry.getValue(), zzigwVar, zzidoVar.zzd);
                break;
            case SINT32:
                zzifw.zzj(zzidoVar.zza, (List) entry.getValue(), zzigwVar, zzidoVar.zzd);
                break;
            case SINT64:
                zzifw.zze(zzidoVar.zza, (List) entry.getValue(), zzigwVar, zzidoVar.zzd);
                break;
        }
    }
}
