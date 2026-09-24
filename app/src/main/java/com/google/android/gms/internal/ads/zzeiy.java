package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzeiy implements zzhbf {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzeiz zzb;

    zzeiy(zzeiz zzeizVar, boolean z) {
        this.zza = z;
        Objects.requireNonNull(zzeizVar);
        this.zzb = zzeizVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0085  */
    /* JADX WARN: Code duplicated, block: B:33:0x0087  */
    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
    /* JADX WARN: Code duplicated, block: B:38:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    /* JADX WARN: Code duplicated, block: B:42:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6  */
    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List listUnmodifiableList;
        List listAsList;
        final ArrayList arrayList;
        Iterator it;
        byte b;
        zzbhj.zzd.zza zzaVar;
        zzeiz zzeizVar = this.zzb;
        Bundle bundle = (Bundle) obj;
        if (zzeizVar.zzf()) {
            return;
        }
        Object obj2 = bundle.get("ad_types");
        if (!(obj2 instanceof List)) {
            if (obj2 instanceof String[]) {
                listAsList = Arrays.asList((String[]) obj2);
            } else {
                listUnmodifiableList = Collections.EMPTY_LIST;
            }
            arrayList = new ArrayList();
            it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                switch ((String) it.next()) {
                    case "banner":
                        b = 0;
                        break;
                    case "native":
                        b = 2;
                        break;
                    case "rewarded":
                        b = 3;
                        break;
                    case "interstitial":
                        b = 1;
                        break;
                    default:
                        b = -1;
                        break;
                }
                if (b != 0) {
                    zzaVar = zzbhj.zzd.zza.BANNER;
                } else if (b != 1) {
                    zzaVar = zzbhj.zzd.zza.INTERSTITIAL;
                } else if (b != 2) {
                    zzaVar = zzbhj.zzd.zza.NATIVE_APP_INSTALL;
                } else if (b != 3) {
                    zzaVar = zzbhj.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                } else {
                    zzaVar = zzbhj.zzd.zza.REWARD_BASED_VIDEO_AD;
                }
                arrayList.add(zzaVar);
            }
            final zzbhj.zzaf.zzd zzdVarZze = zzeiz.zze(bundle);
            final zzbhj.zzab zzabVarZzb = zzeizVar.zzb(bundle);
            final boolean z = this.zza;
            zzeizVar.zza.zza(new zzfny() { // from class: com.google.android.gms.internal.ads.zzeix
                @Override // com.google.android.gms.internal.ads.zzfny
                public final /* synthetic */ Object zza(Object obj3) {
                    zzeiz zzeizVar2 = this.zza.zzb;
                    SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                    if (zzeizVar2.zzf()) {
                        return null;
                    }
                    zzbhj.zzaf.zzd zzdVar = zzdVarZze;
                    zzbhj.zzab zzabVar = zzabVarZzb;
                    ArrayList arrayList2 = arrayList;
                    boolean z2 = z;
                    byte[] bArrZzc = zzeizVar2.zzc(z2, arrayList2, zzabVar, zzdVar);
                    zzejc.zzf(sQLiteDatabase, z2, true);
                    zzejc.zze(sQLiteDatabase, zzeizVar2.zzd().zzb(), bArrZzc);
                    return null;
                }
            });
        }
        listAsList = (List) obj2;
        ArrayList arrayList2 = new ArrayList(listAsList.size());
        for (Object obj3 : listAsList) {
            if (obj3 instanceof String) {
                arrayList2.add((String) obj3);
            }
        }
        listUnmodifiableList = Collections.unmodifiableList(arrayList2);
        arrayList = new ArrayList();
        it = listUnmodifiableList.iterator();
        while (it.hasNext()) {
            switch ((String) it.next()) {
                case -1396342996:
                    if (!r2.equals("banner")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                    break;
                case -1052618729:
                    if (!r2.equals("native")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                    break;
                case -239580146:
                    if (!r2.equals("rewarded")) {
                        b = 3;
                    } else {
                        b = -1;
                    }
                    break;
                case 604727084:
                    if (!r2.equals("interstitial")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b != 0) {
                zzaVar = zzbhj.zzd.zza.BANNER;
            } else if (b != 1) {
                zzaVar = zzbhj.zzd.zza.INTERSTITIAL;
            } else if (b != 2) {
                zzaVar = zzbhj.zzd.zza.NATIVE_APP_INSTALL;
            } else if (b != 3) {
                zzaVar = zzbhj.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
            } else {
                zzaVar = zzbhj.zzd.zza.REWARD_BASED_VIDEO_AD;
            }
            arrayList.add(zzaVar);
        }
        final zzbhj.zzaf.zzd zzdVarZze2 = zzeiz.zze(bundle);
        final zzbhj.zzab zzabVarZzb2 = zzeizVar.zzb(bundle);
        final boolean z2 = this.zza;
        zzeizVar.zza.zza(new zzfny() { // from class: com.google.android.gms.internal.ads.zzeix
            @Override // com.google.android.gms.internal.ads.zzfny
            public final /* synthetic */ Object zza(Object obj4) {
                zzeiz zzeizVar2 = this.zza.zzb;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj4;
                if (zzeizVar2.zzf()) {
                    return null;
                }
                zzbhj.zzaf.zzd zzdVar = zzdVarZze2;
                zzbhj.zzab zzabVar = zzabVarZzb2;
                ArrayList arrayList3 = arrayList;
                boolean z3 = z2;
                byte[] bArrZzc = zzeizVar2.zzc(z3, arrayList3, zzabVar, zzdVar);
                zzejc.zzf(sQLiteDatabase, z3, true);
                zzejc.zze(sQLiteDatabase, zzeizVar2.zzd().zzb(), bArrZzc);
                return null;
            }
        });
    }
}
