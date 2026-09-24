package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.games.GamesActivityResultCodes;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeji {
    private final zzbhd zza;
    private final Context zzb;
    private final zzein zzc;
    private final VersionInfoParcel zzd;

    public zzeji(Context context, VersionInfoParcel versionInfoParcel, zzbhd zzbhdVar, zzein zzeinVar) {
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zza = zzbhdVar;
        this.zzc = zzeinVar;
    }

    public final void zza(final boolean z) {
        try {
            this.zzc.zza(new zzfny() { // from class: com.google.android.gms.internal.ads.zzejh
                @Override // com.google.android.gms.internal.ads.zzfny
                public final /* synthetic */ Object zza(Object obj) {
                    this.zza.zzb(z, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e) {
            String message = e.getMessage();
            String.valueOf(message);
            String strValueOf = String.valueOf(message);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Error in offline signals database startup: ".concat(strValueOf));
        }
    }

    final /* synthetic */ Void zzb(boolean z, SQLiteDatabase sQLiteDatabase) {
        if (z) {
            this.zzb.deleteDatabase("OfflineUpload.db");
        } else {
            ArrayList arrayList = new ArrayList();
            Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    arrayList.add(zzbhj.zzaf.zza.zzk(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (zzieg e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to deserialize proto from offline signals database:");
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(e.getMessage());
                }
            }
            cursorQuery.close();
            Context context = this.zzb;
            zzbhj.zzaf.zzc zzcVarZzB = zzbhj.zzaf.zzB();
            zzcVarZzB.zzB(context.getPackageName());
            zzcVarZzB.zzH(Build.MODEL);
            zzcVarZzB.zzo(zzejc.zzc(sQLiteDatabase, 0));
            zzcVarZzB.zzj(arrayList);
            zzcVarZzB.zzs(zzejc.zzc(sQLiteDatabase, 1));
            zzcVarZzB.zzQ(zzejc.zzc(sQLiteDatabase, 3));
            zzcVarZzB.zzw(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
            zzcVarZzB.zzM(zzejc.zzd(sQLiteDatabase, 2));
            final zzbhj.zzaf zzafVarZzbu = zzcVarZzB.zzbu();
            int size = arrayList.size();
            long jZzb = 0;
            for (int i2 = 0; i2 < size; i2++) {
                zzbhj.zzaf.zza zzaVar = (zzbhj.zzaf.zza) arrayList.get(i2);
                if (zzaVar.zzf() == zzbhj.zzq.ENUM_TRUE && zzaVar.zzb() > jZzb) {
                    jZzb = zzaVar.zzb();
                }
            }
            if (jZzb != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", Long.valueOf(jZzb));
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
            }
            zzbhd zzbhdVar = this.zza;
            zzbhdVar.zzb(new zzbhc() { // from class: com.google.android.gms.internal.ads.zzejf
                @Override // com.google.android.gms.internal.ads.zzbhc
                public final /* synthetic */ void zza(zzbhj.zzt.zza zzaVar2) {
                    zzaVar2.zzaf(zzafVarZzbu);
                }
            });
            VersionInfoParcel versionInfoParcel = this.zzd;
            zzbhj.zzar.zza zzaVarZzs = zzbhj.zzar.zzs();
            zzaVarZzs.zzc(versionInfoParcel.buddyApkVersion);
            zzaVarZzs.zzg(versionInfoParcel.clientJarVersion);
            zzaVarZzs.zzk(true == versionInfoParcel.isClientJar ? 0 : 2);
            final zzbhj.zzar zzarVarZzbu = zzaVarZzs.zzbu();
            zzbhdVar.zzb(new zzbhc() { // from class: com.google.android.gms.internal.ads.zzejg
                @Override // com.google.android.gms.internal.ads.zzbhc
                public final /* synthetic */ void zza(zzbhj.zzt.zza zzaVar2) {
                    zzbhj.zzm.zza zzaVarZzcc = zzaVar2.zzG().zzcc();
                    zzaVarZzcc.zzs(zzarVarZzbu);
                    zzaVar2.zzI(zzaVarZzcc);
                }
            });
            zzbhdVar.zzc(GamesActivityResultCodes.RESULT_APP_MISCONFIGURED);
            zzejc.zzb(sQLiteDatabase);
        }
        return null;
    }
}
