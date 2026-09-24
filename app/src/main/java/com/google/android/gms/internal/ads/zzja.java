package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.C11744X3;
import com.unity3d.services.core.p295di.ServiceProvider;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzja implements zzls {
    public static final zzgvz zza = zzgvz.zzn(C11744X3.i.f26356b, "content", "data", "android.resource", "rawresource", "asset");
    private final zzbe zzb;
    private final zzbd zzc;
    private final zzabj zzd;
    private final long zze;
    private final long zzf;
    private final long zzg;
    private final long zzh;
    private final long zzi;
    private final long zzj;
    private final long zzk;
    private final long zzl;
    private final long zzm;
    private final zzgwc zzn;
    private final ConcurrentHashMap zzo;
    private long zzp;

    public zzja() {
        zzabj zzabjVar = new zzabj(true, 65536);
        zzgwc zzgwcVarZza = zzgwc.zza();
        zzq(1000, 0, "bufferForPlaybackMs", "0");
        zzq(1000, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        zzq(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzq(1000, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        zzq(50000, 1000, "minBufferMs", "bufferForPlaybackMs");
        zzq(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        zzq(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzq(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        zzq(50000, 50000, "maxBufferMs", "minBufferMs");
        zzq(50000, 1000, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        zzq(0, 0, "backBufferDurationMs", "0");
        this.zzb = new zzbe();
        this.zzc = new zzbd();
        this.zzd = zzabjVar;
        this.zze = zzfk.zzs(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT);
        this.zzf = zzfk.zzs(1000L);
        this.zzg = zzfk.zzs(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT);
        this.zzh = zzfk.zzs(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT);
        this.zzi = zzfk.zzs(1000L);
        this.zzj = zzfk.zzs(1000L);
        this.zzk = zzfk.zzs(2000L);
        this.zzl = zzfk.zzs(1000L);
        this.zzm = zzfk.zzs(0L);
        this.zzo = new ConcurrentHashMap();
        this.zzn = zzgwc.zzc(zzgwcVarZza);
        this.zzp = -1L;
    }

    private final int zzm(zzpz zzpzVar) {
        Integer num = (Integer) this.zzn.get(zzpzVar.zzb);
        if (num == null || num.intValue() == -1) {
            return -1;
        }
        return num.intValue();
    }

    private final void zzn(zzpz zzpzVar) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zziz zzizVar = (zziz) concurrentHashMap.get(zzpzVar);
        if (zzizVar != null) {
            int i = zzizVar.zza - 1;
            zzizVar.zza = i;
            if (i == 0) {
                concurrentHashMap.remove(zzpzVar);
                zzo();
            }
        }
    }

    private final void zzo() {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        if (concurrentHashMap.isEmpty()) {
            this.zzd.zze();
            return;
        }
        zzabj zzabjVar = this.zzd;
        Iterator it = concurrentHashMap.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((zziz) it.next()).zzc;
        }
        zzabjVar.zzf(i);
    }

    private final boolean zzp(zzlr zzlrVar) {
        zzbf zzbfVar = zzlrVar.zzb;
        zzag zzagVar = zzbfVar.zzb(zzbfVar.zzo(zzlrVar.zzc.zza, this.zzc).zzc, this.zzb, 0L).zzd.zzb;
        if (zzagVar == null) {
            return false;
        }
        String scheme = zzagVar.zza.getScheme();
        return TextUtils.isEmpty(scheme) || zza.contains(scheme);
    }

    private static void zzq(int i, int i2, String str, String str2) {
        zzgsw.zzh(i >= i2, "%s cannot be less than %s", str, str2);
    }

    private final int zzr(zzpz zzpzVar) {
        zziz zzizVar = (zziz) this.zzo.get(zzpzVar);
        zzizVar.getClass();
        return zzizVar.zzc() * 65536;
    }

    private final int zzs(zzpz zzpzVar) {
        zziz zzizVar = (zziz) this.zzo.get(zzpzVar);
        zzizVar.getClass();
        return zzizVar.zzc;
    }

    private static final boolean zzt(boolean z) {
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zza(zzpz zzpzVar) {
        long id = Thread.currentThread().getId();
        long j = this.zzp;
        zzgsw.zzj(j == -1 || j == id, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.zzp = id;
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zziz zzizVar = (zziz) concurrentHashMap.get(zzpzVar);
        if (zzizVar == null) {
            concurrentHashMap.put(zzpzVar, new zziz());
        } else {
            zzizVar.zza++;
        }
        zziz zzizVar2 = (zziz) concurrentHashMap.get(zzpzVar);
        zzizVar2.getClass();
        int iZzm = zzm(zzpzVar);
        if (iZzm == -1) {
            iZzm = 13107200;
        }
        zzizVar2.zzc = iZzm;
        zzizVar2.zzb = false;
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzb(zzlr zzlrVar, zzzf zzzfVar, zzaas[] zzaasVarArr) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzpz zzpzVar = zzlrVar.zza;
        int iZzm = zzm(zzpzVar);
        zziz zzizVar = (zziz) concurrentHashMap.get(zzpzVar);
        zzizVar.getClass();
        if (iZzm == -1) {
            boolean zZzp = zzp(zzlrVar);
            int length = zzaasVarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 13107200;
                if (i < length) {
                    zzaas zzaasVar = zzaasVarArr[i];
                    if (zzaasVar != null) {
                        switch (zzaasVar.zza().zzc) {
                            case -1:
                            case 1:
                                break;
                            case 0:
                                i3 = 144310272;
                                break;
                            case 2:
                                i3 = !zZzp ? 131072000 : 19660800;
                                break;
                            case 3:
                            case 5:
                            default:
                                i3 = 131072;
                                break;
                            case 4:
                                i3 = 26214400;
                                break;
                        }
                        i2 += i3;
                    }
                    i++;
                } else {
                    String str = zzfk.zza;
                    iZzm = Math.max(13107200, Math.min(i2, 210239488));
                }
            }
        }
        zzizVar.zzc = iZzm;
        zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzc(zzpz zzpzVar) {
        zzn(zzpzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final void zzd(zzpz zzpzVar) {
        zzn(zzpzVar);
        if (this.zzo.isEmpty()) {
            this.zzp = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final zzabd zze(zzpz zzpzVar) {
        return new zziy(this, zzpzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final long zzf(zzpz zzpzVar) {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final boolean zzg(zzpz zzpzVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final boolean zzh(zzlr zzlrVar) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzpz zzpzVar = zzlrVar.zza;
        zziz zzizVar = (zziz) concurrentHashMap.get(zzpzVar);
        zzizVar.getClass();
        int iZzr = zzr(zzpzVar);
        int iZzs = zzs(zzpzVar);
        boolean z = true;
        if (zzpzVar.equals(zzpz.zza)) {
            return iZzr < iZzs;
        }
        boolean zZzp = zzp(zzlrVar);
        long jMin = zZzp ? this.zzf : this.zze;
        long j = zZzp ? this.zzh : this.zzg;
        float f = zzlrVar.zzf;
        if (f > 1.0f) {
            jMin = Math.min(zzfk.zzx(jMin, f), j);
        }
        long j2 = zzlrVar.zze;
        if (j2 < Math.max(jMin, 500000L)) {
            if (!zzt(zZzp) && iZzr >= iZzs) {
                z = false;
            }
            zzizVar.zzb = z;
            if (!z && j2 < 500000) {
                zzef.zzc("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= j || iZzr >= iZzs) {
            zzizVar.zzb = false;
        }
        return zzizVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final boolean zzi(zzlr zzlrVar) {
        long jMin;
        boolean z;
        boolean z2 = zzlrVar.zzg;
        long j = zzlrVar.zze;
        float f = zzlrVar.zzf;
        boolean zZzp = zzp(zzlrVar);
        long jZzy = zzfk.zzy(j, f);
        if (z2) {
            if (zZzp) {
                jMin = this.zzl;
                z = true;
            } else {
                jMin = this.zzk;
                z = false;
            }
        } else if (zZzp) {
            jMin = this.zzj;
            z = true;
        } else {
            jMin = this.zzi;
            z = false;
        }
        long j2 = zzlrVar.zzh;
        if (j2 != -9223372036854775807L) {
            jMin = Math.min(j2 / 2, jMin);
        }
        if (jMin <= 0 || jZzy >= jMin) {
            return true;
        }
        if (!zzt(z)) {
            zzpz zzpzVar = zzlrVar.zza;
            if (zzr(zzpzVar) >= zzs(zzpzVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzls
    public final boolean zzj(zzpz zzpzVar, zzbf zzbfVar, zzxc zzxcVar, long j) {
        Iterator it = this.zzo.values().iterator();
        while (it.hasNext()) {
            if (((zziz) it.next()).zzb) {
                return false;
            }
        }
        return true;
    }

    final /* synthetic */ zzabj zzk() {
        return this.zzd;
    }

    final /* synthetic */ ConcurrentHashMap zzl() {
        return this.zzo;
    }
}
