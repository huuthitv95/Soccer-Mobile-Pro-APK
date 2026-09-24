package com.google.android.gms.internal.ads;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzaif extends zzaih {
    private long zzb;
    private long[] zzc;
    private long[] zzd;

    public zzaif() {
        super(new zzafm());
        this.zzb = -9223372036854775807L;
        this.zzc = new long[0];
        this.zzd = new long[0];
    }

    private static Double zzg(zzes zzesVar) {
        return Double.valueOf(Double.longBitsToDouble(zzesVar.zzD()));
    }

    private static String zzh(zzes zzesVar) {
        int iZzt = zzesVar.zzt();
        int iZzg = zzesVar.zzg();
        zzesVar.zzk(iZzt);
        return new String(zzesVar.zzi(), iZzg, iZzt);
    }

    private static HashMap zzi(zzes zzesVar) {
        int iZzH = zzesVar.zzH();
        HashMap map = new HashMap(iZzH);
        for (int i = 0; i < iZzH; i++) {
            String strZzh = zzh(zzesVar);
            Object objZzj = zzj(zzesVar, zzesVar.zzs());
            if (objZzj != null) {
                map.put(strZzh, objZzj);
            }
        }
        return map;
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    protected final boolean zza(zzes zzesVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    protected final boolean zzb(zzes zzesVar, long j) {
        if (zzesVar.zzs() == 2 && "onMetaData".equals(zzh(zzesVar)) && zzesVar.zzd() != 0 && zzesVar.zzs() == 8) {
            HashMap mapZzi = zzi(zzesVar);
            Object obj = mapZzi.get("duration");
            if (obj instanceof Double) {
                double dDoubleValue = ((Double) obj).doubleValue();
                if (dDoubleValue > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    this.zzb = (long) (dDoubleValue * 1000000.0d);
                }
            }
            Object obj2 = mapZzi.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.zzc = new long[size];
                    this.zzd = new long[size];
                    for (int i = 0; i < size; i++) {
                        Object obj5 = list.get(i);
                        Object obj6 = list2.get(i);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.zzc = new long[0];
                            this.zzd = new long[0];
                            break;
                        }
                        this.zzc[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.zzd[i] = ((Double) obj5).longValue();
                    }
                }
            }
        }
        return false;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final long[] zzd() {
        return this.zzc;
    }

    public final long[] zze() {
        return this.zzd;
    }

    private static Object zzj(zzes zzesVar, int i) {
        if (i == 0) {
            return zzg(zzesVar);
        }
        if (i == 1) {
            return Boolean.valueOf(zzesVar.zzs() == 1);
        }
        if (i == 2) {
            return zzh(zzesVar);
        }
        if (i != 3) {
            if (i == 8) {
                return zzi(zzesVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) zzg(zzesVar).doubleValue());
                zzesVar.zzk(2);
                return date;
            }
            int iZzH = zzesVar.zzH();
            ArrayList arrayList = new ArrayList(iZzH);
            for (int i2 = 0; i2 < iZzH; i2++) {
                Object objZzj = zzj(zzesVar, zzesVar.zzs());
                if (objZzj != null) {
                    arrayList.add(objZzj);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strZzh = zzh(zzesVar);
            int iZzs = zzesVar.zzs();
            if (iZzs == 9) {
                return map;
            }
            Object objZzj2 = zzj(zzesVar, iZzs);
            if (objZzj2 != null) {
                map.put(strZzh, objZzj2);
            }
        }
    }
}
