package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfse {
    private final Map zza;
    private final zzftm zzb;
    private final zzfsp zzc;
    private final Context zzd;
    private volatile ConnectivityManager zze;
    private final AtomicBoolean zzf = new AtomicBoolean(false);
    private final Clock zzg;
    private AtomicInteger zzh;
    private final zzfrz zzi;
    private final com.google.android.gms.ads.internal.util.zzg zzj;

    zzfse(zzftm zzftmVar, zzfsp zzfspVar, Context context, Clock clock, zzfrz zzfrzVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        HashMap map = new HashMap();
        this.zza = map;
        map.put(AdFormat.APP_OPEN_AD, new HashMap());
        map.put(AdFormat.INTERSTITIAL, new HashMap());
        map.put(AdFormat.REWARDED, new HashMap());
        this.zzb = zzftmVar;
        this.zzc = zzfspVar;
        this.zzd = context;
        this.zzg = clock;
        this.zzi = zzfrzVar;
        this.zzj = zzgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzl(boolean z) {
        ArrayList arrayList = new ArrayList();
        Map map = this.zza;
        synchronized (map) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                arrayList.addAll(((Map) it.next()).values());
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zzftl zzftlVar = (zzftl) arrayList.get(i);
            if (z) {
                zzftlVar.zzj();
            } else {
                zzftlVar.zzi();
            }
        }
    }

    private final Object zzn(Class cls, AdFormat adFormat, String str) {
        zzfsp zzfspVar = this.zzc;
        Clock clock = this.zzg;
        zzfspVar.zze(clock.currentTimeMillis(), "2");
        Map map = this.zza;
        synchronized (map) {
            if (!map.containsKey(adFormat)) {
                return null;
            }
            zzftl zzftlVar = (zzftl) ((Map) map.get(adFormat)).get(str);
            if (zzftlVar != null && adFormat.equals(zzftlVar.zzo())) {
                zzfsv zzfsvVar = new zzfsv(zzftlVar.zze.zza, zzftlVar.zzo());
                zzfsvVar.zza(str);
                zzfsw zzfswVar = new zzfsw(zzfsvVar, null);
                zzfspVar.zzf(clock.currentTimeMillis(), zzfswVar, zzftlVar.zze.zzd, zzftlVar.zzp(), "2");
                try {
                    String strZzk = zzftlVar.zzk();
                    Object objZzg = zzftlVar.zzg();
                    Object objCast = objZzg == null ? null : cls.cast(objZzg);
                    if (objCast != null) {
                        zzfspVar.zzh(clock.currentTimeMillis(), zzftlVar.zze.zzd, zzftlVar.zzp(), strZzk, zzfswVar, "2");
                    }
                    return objCast;
                } catch (ClassCastException e) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "PreloadAdManager.pollAd");
                    String name = cls.getName();
                    String.valueOf(name);
                    com.google.android.gms.ads.internal.util.zze.zzb("Unable to cast ad to the requested type:".concat(String.valueOf(name)), e);
                }
            }
            return null;
        }
    }

    private final boolean zzo(AdFormat adFormat) {
        int iMax;
        Map map = this.zza;
        int size = map.containsKey(adFormat) ? ((Map) map.get(adFormat)).size() : 0;
        int iOrdinal = adFormat.ordinal();
        if (iOrdinal == 1) {
            iMax = Math.max(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzft)).intValue(), 1);
        } else if (iOrdinal == 2) {
            iMax = Math.max(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfu)).intValue(), 1);
        } else if (iOrdinal != 5) {
            iMax = 0;
        } else {
            iMax = Math.max(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfv)).intValue(), 1);
        }
        return size < iMax;
    }

    public final boolean zza(String str, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzce zzceVar) {
        int iZzT;
        if (!this.zzf.getAndSet(true)) {
            if (this.zze == null) {
                synchronized (this) {
                    if (this.zze == null) {
                        try {
                            this.zze = (ConnectivityManager) this.zzd.getSystemService("connectivity");
                        } catch (ClassCastException e) {
                            int i = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get connectivity manager", e);
                        }
                    }
                }
            }
            if (!PlatformVersion.isAtLeastO() || this.zze == null) {
                this.zzh = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzH)).intValue());
            } else {
                try {
                    this.zze.registerDefaultNetworkCallback(new zzfsc(this));
                } catch (RuntimeException e2) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to register network callback", e2);
                    this.zzh = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzH)).intValue());
                }
            }
            com.google.android.gms.ads.internal.zzt.zzg().zzb(new zzfsd(this));
        }
        AdFormat adFormat = AdFormat.getAdFormat(zzfpVar.zzb);
        if (adFormat == null) {
            return false;
        }
        Map map = this.zza;
        synchronized (map) {
            if (map.containsKey(adFormat)) {
                if (!((Map) map.get(adFormat)).containsKey(str)) {
                    if (zzo(adFormat)) {
                        if (zzfpVar.zze) {
                            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzP)).booleanValue() && (iZzT = this.zzj.zzT()) > 0) {
                                zzfpVar = zzfpVar.zza(iZzT);
                            }
                        }
                        zzftl zzftlVarZzb = this.zzb.zzb(str, zzfpVar, zzceVar);
                        if (zzftlVarZzb != null) {
                            AtomicInteger atomicInteger = this.zzh;
                            if (atomicInteger != null) {
                                zzftlVarZzb.zzm(atomicInteger.get());
                            }
                            zzfsp zzfspVar = this.zzc;
                            zzftlVarZzb.zzl(zzfspVar);
                            synchronized (map) {
                                if (!((Map) map.get(adFormat)).containsKey(str) && zzo(adFormat)) {
                                    ((Map) map.get(adFormat)).put(str, zzftlVarZzb);
                                    zzfrz zzfrzVar = this.zzi;
                                    if (zzfrzVar != null) {
                                        zzfrzVar.zze(str, adFormat, zzftlVarZzb);
                                    } else {
                                        zzftlVarZzb.zzd();
                                    }
                                    zzfsv zzfsvVar = new zzfsv(zzfpVar.zza, adFormat);
                                    zzfsvVar.zza(str);
                                    zzfspVar.zza(zzfpVar.zzd, this.zzg.currentTimeMillis(), new zzfsw(zzfsvVar, null), "2");
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean zzb(AdFormat adFormat, String str) {
        zzfsw zzfswVar;
        Clock clock = this.zzg;
        long jCurrentTimeMillis = clock.currentTimeMillis();
        Map map = this.zza;
        synchronized (map) {
            if (!map.containsKey(adFormat)) {
                return false;
            }
            zzftl zzftlVar = (zzftl) ((Map) map.get(adFormat)).get(str);
            String strZzk = zzftlVar == null ? null : zzftlVar.zzk();
            boolean z = strZzk != null && adFormat.equals(zzftlVar.zzo());
            Long lValueOf = z ? Long.valueOf(clock.currentTimeMillis()) : null;
            if (zzftlVar == null) {
                zzfswVar = null;
            } else {
                zzfsv zzfsvVar = new zzfsv(zzftlVar.zze.zza, adFormat);
                zzfsvVar.zza(str);
                zzfswVar = new zzfsw(zzfsvVar, null);
            }
            this.zzc.zzd(zzftlVar == null ? 0 : zzftlVar.zze.zzd, zzftlVar != null ? zzftlVar.zzp() : 0, jCurrentTimeMillis, lValueOf, strZzk, zzfswVar, "2");
            return z;
        }
    }

    public final zzcbw zzc(String str) {
        return (zzcbw) zzn(zzcbw.class, AdFormat.REWARDED, str);
    }

    public final zzbfx zzd(String str) {
        return (zzbfx) zzn(zzbfx.class, AdFormat.APP_OPEN_AD, str);
    }

    public final com.google.android.gms.ads.internal.client.zzbu zze(String str) {
        return (com.google.android.gms.ads.internal.client.zzbu) zzn(com.google.android.gms.ads.internal.client.zzbu.class, AdFormat.INTERSTITIAL, str);
    }

    public final com.google.android.gms.ads.internal.client.zzfp zzf(AdFormat adFormat, String str) {
        Map map = this.zza;
        synchronized (map) {
            if (map.containsKey(adFormat)) {
                zzftl zzftlVar = (zzftl) ((Map) map.get(adFormat)).get(str);
                this.zzc.zzo(this.zzg.currentTimeMillis(), str, zzftlVar == null ? null : zzftlVar.zze.zza, adFormat, zzftlVar == null ? -1 : zzftlVar.zze.zzd, zzftlVar != null ? zzftlVar.zzp() : -1);
                if (zzftlVar != null) {
                    return zzftlVar.zze;
                }
            }
        }
        return null;
    }

    public final int zzg(AdFormat adFormat, String str) {
        Map map = this.zza;
        synchronized (map) {
            if (!map.containsKey(adFormat)) {
                return 0;
            }
            zzftl zzftlVar = (zzftl) ((Map) map.get(adFormat)).get(str);
            int iZzp = zzftlVar != null ? zzftlVar.zzp() : 0;
            this.zzc.zzp(iZzp, this.zzg.currentTimeMillis(), str, zzftlVar == null ? null : zzftlVar.zze.zza, adFormat, zzftlVar == null ? -1 : zzftlVar.zze.zzd);
            return iZzp;
        }
    }

    public final Map zzh(int i) {
        HashMap map = new HashMap();
        Map map2 = this.zza;
        AdFormat adFormat = AdFormat.getAdFormat(i);
        synchronized (map2) {
            if (adFormat != null) {
                if (map2.containsKey(adFormat)) {
                    for (zzftl zzftlVar : ((Map) map2.get(adFormat)).values()) {
                        map.put(zzftlVar.zzn(), zzftlVar.zze);
                    }
                    this.zzc.zzn(adFormat, this.zzg.currentTimeMillis(), map.size());
                    return map;
                }
            }
            return map;
        }
    }

    public final boolean zzi(AdFormat adFormat, String str) {
        Map map = this.zza;
        synchronized (map) {
            if (!map.containsKey(adFormat)) {
                return false;
            }
            zzftl zzftlVar = (zzftl) ((Map) map.get(adFormat)).remove(str);
            if (zzftlVar == null) {
                return false;
            }
            zzftlVar.zzh();
            zzfrz zzfrzVar = this.zzi;
            if (zzfrzVar != null) {
                zzfrzVar.zzf(zzftlVar);
            }
            int iZzp = zzftlVar.zzp();
            zzftlVar.zzr();
            zzfsp zzfspVar = this.zzc;
            long jCurrentTimeMillis = this.zzg.currentTimeMillis();
            com.google.android.gms.ads.internal.client.zzfp zzfpVar = zzftlVar.zze;
            zzfspVar.zzm(jCurrentTimeMillis, str, zzfpVar.zza, adFormat, zzfpVar.zzd, iZzp);
            return true;
        }
    }

    public final void zzj(int i) {
        AdFormat adFormat = AdFormat.getAdFormat(i);
        if (adFormat == null) {
            return;
        }
        Map map = this.zza;
        synchronized (map) {
            if (map.containsKey(adFormat)) {
                Map map2 = (Map) map.get(adFormat);
                int size = map2.size();
                if (size == 0) {
                    return;
                }
                zzgvz zzgvzVarZzq = zzgvz.zzq(map2.values());
                map2.clear();
                int size2 = zzgvzVarZzq.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    zzftl zzftlVar = (zzftl) zzgvzVarZzq.get(i2);
                    if (zzftlVar != null) {
                        zzftlVar.zzh();
                        zzfrz zzfrzVar = this.zzi;
                        if (zzfrzVar != null) {
                            zzfrzVar.zzf(zzftlVar);
                        }
                        zzftlVar.zzr();
                        String strZzn = zzftlVar.zzn();
                        String.valueOf(strZzn);
                        String strValueOf = String.valueOf(strZzn);
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Destroyed ad preloader for preloadId: ".concat(strValueOf));
                    }
                }
                String strConcat = "Destroyed all ad preloaders for ad format: ".concat(adFormat.toString());
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh(strConcat);
                this.zzc.zzl(this.zzg.currentTimeMillis(), adFormat, size);
            }
        }
    }

    final /* synthetic */ void zzk(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzy)).booleanValue()) {
            zzl(z);
        }
    }
}
