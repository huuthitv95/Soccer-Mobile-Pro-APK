package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzidg {
    private static final zzidg zzd = new zzidg(true);
    final zzigb zza = new zzifx();
    boolean zzb;
    boolean zzc;

    private zzidg() {
    }

    public static zzidg zza() {
        return zzd;
    }

    static void zzf(zzicw zzicwVar, zzigu zziguVar, int i, Object obj) throws IOException {
        if (zziguVar == zzigu.GROUP) {
            zzicwVar.zzb(i, 3);
            ((zzifc) obj).zzcX(zzicwVar);
            zzicwVar.zzb(i, 4);
            return;
        }
        zzicwVar.zzb(i, zziguVar.zzb());
        zzigv zzigvVar = zzigv.INT;
        switch (zziguVar) {
            case DOUBLE:
                zzicwVar.zzu(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case FLOAT:
                zzicwVar.zzs(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case INT64:
                zzicwVar.zzt(((Long) obj).longValue());
                break;
            case UINT64:
                zzicwVar.zzt(((Long) obj).longValue());
                break;
            case INT32:
                zzicwVar.zzq(((Integer) obj).intValue());
                break;
            case FIXED64:
                zzicwVar.zzu(((Long) obj).longValue());
                break;
            case FIXED32:
                zzicwVar.zzs(((Integer) obj).intValue());
                break;
            case BOOL:
                zzicwVar.zzp(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case STRING:
                if (!(obj instanceof zzicn)) {
                    zzicwVar.zzw((String) obj);
                } else {
                    zzicwVar.zzk((zzicn) obj);
                }
                break;
            case GROUP:
                ((zzifc) obj).zzcX(zzicwVar);
                break;
            case MESSAGE:
                zzicwVar.zzo((zzifc) obj);
                break;
            case BYTES:
                if (!(obj instanceof zzicn)) {
                    byte[] bArr = (byte[]) obj;
                    zzicwVar.zzl(bArr, 0, bArr.length);
                } else {
                    zzicwVar.zzk((zzicn) obj);
                }
                break;
            case UINT32:
                zzicwVar.zzr(((Integer) obj).intValue());
                break;
            case ENUM:
                if (!(obj instanceof zzidv)) {
                    zzicwVar.zzq(((Integer) obj).intValue());
                } else {
                    zzicwVar.zzq(((zzidv) obj).zza());
                }
                break;
            case SFIXED32:
                zzicwVar.zzs(((Integer) obj).intValue());
                break;
            case SFIXED64:
                zzicwVar.zzu(((Long) obj).longValue());
                break;
            case SINT32:
                int iIntValue = ((Integer) obj).intValue();
                zzicwVar.zzr((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case SINT64:
                long jLongValue = ((Long) obj).longValue();
                zzicwVar.zzt((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    static int zzh(zzigu zziguVar, int i, Object obj) {
        int iZzF = zzicw.zzF(i << 3);
        if (zziguVar == zzigu.GROUP) {
            iZzF += iZzF;
        }
        return iZzF + zzi(zziguVar, obj);
    }

    static int zzi(zzigu zziguVar, Object obj) {
        int iZzc;
        int iZzF;
        zzigu zziguVar2 = zzigu.DOUBLE;
        zzigv zzigvVar = zzigv.INT;
        switch (zziguVar) {
            case DOUBLE:
                ((Double) obj).doubleValue();
                int i = zzicw.zzb;
                return 8;
            case FLOAT:
                ((Float) obj).floatValue();
                int i2 = zzicw.zzb;
                return 4;
            case INT64:
                return zzicw.zzG(((Long) obj).longValue());
            case UINT64:
                return zzicw.zzG(((Long) obj).longValue());
            case INT32:
                return zzicw.zzG(((Integer) obj).intValue());
            case FIXED64:
                ((Long) obj).longValue();
                int i3 = zzicw.zzb;
                return 8;
            case FIXED32:
                ((Integer) obj).intValue();
                int i4 = zzicw.zzb;
                return 4;
            case BOOL:
                ((Boolean) obj).booleanValue();
                int i5 = zzicw.zzb;
                return 1;
            case STRING:
                if (!(obj instanceof zzicn)) {
                    int i6 = zzicw.zzb;
                    iZzc = zzigt.zzc((String) obj);
                    iZzF = zzicw.zzF(iZzc);
                } else {
                    int i7 = zzicw.zzb;
                    iZzc = ((zzicn) obj).zzb();
                    iZzF = zzicw.zzF(iZzc);
                }
                break;
            case GROUP:
                return ((zzifc) obj).zzbr();
            case MESSAGE:
                if (!(obj instanceof zziel)) {
                    return zzicw.zzH((zzifc) obj);
                }
                iZzc = ((zziel) obj).zzb();
                iZzF = zzicw.zzF(iZzc);
                break;
                break;
            case BYTES:
                if (!(obj instanceof zzicn)) {
                    int i8 = zzicw.zzb;
                    iZzc = ((byte[]) obj).length;
                    iZzF = zzicw.zzF(iZzc);
                } else {
                    int i9 = zzicw.zzb;
                    iZzc = ((zzicn) obj).zzb();
                    iZzF = zzicw.zzF(iZzc);
                }
                break;
            case UINT32:
                return zzicw.zzF(((Integer) obj).intValue());
            case ENUM:
                return obj instanceof zzidv ? zzicw.zzG(((zzidv) obj).zza()) : zzicw.zzG(((Integer) obj).intValue());
            case SFIXED32:
                ((Integer) obj).intValue();
                int i10 = zzicw.zzb;
                return 4;
            case SFIXED64:
                ((Long) obj).longValue();
                int i11 = zzicw.zzb;
                return 8;
            case SINT32:
                int iIntValue = ((Integer) obj).intValue();
                return zzicw.zzF((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case SINT64:
                long jLongValue = ((Long) obj).longValue();
                return zzicw.zzG((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iZzF + iZzc;
    }

    public static int zzj(zzidf zzidfVar, Object obj) {
        zzigu zziguVarZzb = zzidfVar.zzb();
        int iZza = zzidfVar.zza();
        if (!zzidfVar.zzd()) {
            return zzh(zziguVarZzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!zzidfVar.zze()) {
            int iZzh = 0;
            while (i < size) {
                iZzh += zzh(zziguVarZzb, iZza, list.get(i));
                i++;
            }
            return iZzh;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iZzi = 0;
        while (i < size) {
            iZzi += zzi(zziguVarZzb, list.get(i));
            i++;
        }
        return zzicw.zzF(iZza << 3) + iZzi + zzicw.zzF(iZzi);
    }

    private static boolean zzk(Map.Entry entry) {
        zzidf zzidfVar = (zzidf) entry.getKey();
        if (zzidfVar.zzc() != zzigv.MESSAGE) {
            return true;
        }
        if (!zzidfVar.zzd()) {
            return zzl(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!zzl(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzl(Object obj) {
        if (obj instanceof zzifd) {
            return ((zzifd) obj).zzbi();
        }
        if (obj instanceof zziel) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzm(Map.Entry entry) {
        int i;
        int iZzF;
        int iZzF2;
        zzidf zzidfVar = (zzidf) entry.getKey();
        Object value = entry.getValue();
        if (zzidfVar.zzc() != zzigv.MESSAGE || zzidfVar.zzd() || zzidfVar.zze()) {
            return zzj(zzidfVar, value);
        }
        if (value instanceof zziel) {
            int iZza = ((zzidf) entry.getKey()).zza();
            int iZzF3 = zzicw.zzF(8);
            i = iZzF3 + iZzF3;
            iZzF = zzicw.zzF(16) + zzicw.zzF(iZza);
            int iZzF4 = zzicw.zzF(24);
            int iZzb = ((zziel) value).zzb();
            iZzF2 = iZzF4 + zzicw.zzF(iZzb) + iZzb;
        } else {
            int iZza2 = ((zzidf) entry.getKey()).zza();
            int iZzF5 = zzicw.zzF(8);
            i = iZzF5 + iZzF5;
            iZzF = zzicw.zzF(16) + zzicw.zzF(iZza2);
            iZzF2 = zzicw.zzF(24) + zzicw.zzH((zzifc) value);
        }
        return i + iZzF + iZzF2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    private static final void zzn(zzidf zzidfVar, Object obj) {
        boolean z;
        zzidfVar.zzb();
        byte[] bArr = zziee.zzb;
        obj.getClass();
        zzigu zziguVar = zzigu.DOUBLE;
        zzigv zzigvVar = zzigv.INT;
        switch (r0.zza()) {
            case INT:
                z = obj instanceof Integer;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzidfVar.zza()), zzidfVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z = obj instanceof Long;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzidfVar.zza()), zzidfVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z = obj instanceof Float;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzidfVar.zza()), zzidfVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z = obj instanceof Double;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzidfVar.zza()), zzidfVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z = obj instanceof Boolean;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzidfVar.zza()), zzidfVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z = obj instanceof String;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzidfVar.zza()), zzidfVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zzicn) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzidfVar.zza()), zzidfVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzidv)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzidfVar.zza()), zzidfVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzifc) || (obj instanceof zziel)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzidfVar.zza()), zzidfVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzidfVar.zza()), zzidfVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzidg zzidgVar = new zzidg();
        zzigb zzigbVar = this.zza;
        int iZzc = zzigbVar.zzc();
        for (int i = 0; i < iZzc; i++) {
            Map.Entry entryZzd = zzigbVar.zzd(i);
            zzidgVar.zzd((zzidf) ((zzify) entryZzd).zza(), entryZzd.getValue());
        }
        for (Map.Entry entry : zzigbVar.zze()) {
            zzidgVar.zzd((zzidf) entry.getKey(), entry.getValue());
        }
        zzidgVar.zzc = this.zzc;
        return zzidgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzidg) {
            return this.zza.equals(((zzidg) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        zzigb zzigbVar = this.zza;
        int iZzc = zzigbVar.zzc();
        for (int i = 0; i < iZzc; i++) {
            Object value = zzigbVar.zzd(i).getValue();
            if (value instanceof zzidr) {
                ((zzidr) value).zzbm();
            }
        }
        Iterator it = zzigbVar.zze().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzidr) {
                ((zzidr) value2).zzbm();
            }
        }
        zzigbVar.zza();
        this.zzb = true;
    }

    public final Iterator zzc() {
        zzigb zzigbVar = this.zza;
        if (zzigbVar.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.zzc ? new zziek(zzigbVar.entrySet().iterator()) : zzigbVar.entrySet().iterator();
    }

    public final void zzd(zzidf zzidfVar, Object obj) {
        if (!zzidfVar.zzd()) {
            zzn(zzidfVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                zzn(zzidfVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zziel) {
            this.zzc = true;
        }
        this.zza.put(zzidfVar, obj);
    }

    public final boolean zze() {
        zzigb zzigbVar = this.zza;
        int iZzc = zzigbVar.zzc();
        for (int i = 0; i < iZzc; i++) {
            if (!zzk(zzigbVar.zzd(i))) {
                return false;
            }
        }
        Iterator it = zzigbVar.zze().iterator();
        while (it.hasNext()) {
            if (!zzk((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int zzg() {
        zzigb zzigbVar = this.zza;
        int iZzc = zzigbVar.zzc();
        int iZzm = 0;
        for (int i = 0; i < iZzc; i++) {
            iZzm += zzm(zzigbVar.zzd(i));
        }
        Iterator it = zzigbVar.zze().iterator();
        while (it.hasNext()) {
            iZzm += zzm((Map.Entry) it.next());
        }
        return iZzm;
    }

    private zzidg(boolean z) {
        zzb();
        zzb();
    }
}
