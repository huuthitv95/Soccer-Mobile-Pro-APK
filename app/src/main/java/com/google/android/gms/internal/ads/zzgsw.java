package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgsw {
    public static void zza(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzb(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzc(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(zzgtn.zzd(str, Character.valueOf(c)));
        }
    }

    public static void zzd(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(zzgtn.zzd(str, Integer.valueOf(i)));
        }
    }

    public static void zze(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(zzgtn.zzd(str, Long.valueOf(j)));
        }
    }

    public static void zzf(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(zzgtn.zzd(str, obj));
        }
    }

    public static void zzg(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalArgumentException(zzgtn.zzd(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void zzh(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(zzgtn.zzd(str, obj, obj2));
        }
    }

    public static void zzi(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void zzj(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static Object zzk(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object zzl(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(zzgtn.zzd(str, obj2));
    }

    public static int zzm(int i, int i2, String str) {
        String strZzd;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            strZzd = zzgtn.zzd("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15);
                sb.append("negative size: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
            strZzd = zzgtn.zzd("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(strZzd);
    }

    public static int zzn(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(zzp(i, i2, "index"));
        }
        return i;
    }

    public static void zzo(int i, int i2, int i3) {
        String strZzp;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strZzp = zzp(i, i3, "start index");
            } else {
                strZzp = (i2 < 0 || i2 > i3) ? zzp(i2, i3, "end index") : zzgtn.zzd("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strZzp);
        }
    }

    private static String zzp(int i, int i2, String str) {
        if (i < 0) {
            return zzgtn.zzd("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zzgtn.zzd("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }
}
