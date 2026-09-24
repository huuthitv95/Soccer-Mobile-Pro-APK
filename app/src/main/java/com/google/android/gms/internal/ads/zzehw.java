package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzehw extends zzcad {
    private final Context zza;
    private final zzhbs zzb;
    private final zzeie zzc;
    private final zzcre zzd;
    private final ArrayDeque zze;
    private final zzfpv zzf;
    private final zzcaz zzg;

    public zzehw(Context context, zzhbs zzhbsVar, zzcaz zzcazVar, zzcre zzcreVar, zzeie zzeieVar, ArrayDeque arrayDeque, zzeib zzeibVar, zzfpv zzfpvVar) {
        zzbie.zza(context);
        this.zza = context;
        this.zzb = zzhbsVar;
        this.zzg = zzcazVar;
        this.zzc = zzeieVar;
        this.zzd = zzcreVar;
        this.zze = arrayDeque;
        this.zzf = zzfpvVar;
    }

    private static ListenableFuture zzm(final zzcar zzcarVar, zzfoy zzfoyVar, final zzfda zzfdaVar) {
        zzhaq zzhaqVar = new zzhaq() { // from class: com.google.android.gms.internal.ads.zzehk
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzfdaVar.zzc().zza(com.google.android.gms.ads.internal.client.zzay.zza().zzo((Bundle) obj), zzcarVar.zzm);
            }
        };
        return zzfoyVar.zza(zzfos.GMS_SIGNALS, zzhbi.zza(zzcarVar.zza)).zzc(zzhaqVar).zzb(zzehl.zza).zzi();
    }

    private static ListenableFuture zzn(ListenableFuture listenableFuture, zzfoy zzfoyVar, zzbtw zzbtwVar, zzfps zzfpsVar, zzfpi zzfpiVar) {
        zzbtm zzbtmVarZza = zzbtwVar.zza("AFMA_getAdDictionary", zzbtt.zza, zzehq.zza);
        zzfpr.zzb(listenableFuture, zzfpiVar);
        zzfof zzfofVarZzi = zzfoyVar.zza(zzfos.BUILD_URL, listenableFuture).zzc(zzbtmVarZza).zzi();
        zzfpr.zzf(zzfofVarZzi, zzfpsVar, zzfpiVar);
        return zzfofVarZzi;
    }

    private final void zzo(ListenableFuture listenableFuture, zzcai zzcaiVar, zzcar zzcarVar) {
        zzhbi.zzr(zzhbi.zzj(listenableFuture, new zzhaq(this) { // from class: com.google.android.gms.internal.ads.zzeho
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzhbi.zza(zzfln.zza((InputStream) obj));
            }
        }, zzcff.zza), new zzehh(this, zzcarVar, zzcaiVar), zzcff.zzh);
    }

    private final synchronized void zzp() {
        int iIntValue = ((Long) zzbkl.zzb.zze()).intValue();
        while (true) {
            ArrayDeque arrayDeque = this.zze;
            if (arrayDeque.size() >= iIntValue) {
                arrayDeque.removeFirst();
            }
        }
    }

    private final synchronized void zzq(zzehr zzehrVar) {
        zzp();
        this.zze.addLast(zzehrVar);
    }

    private final synchronized zzehr zzr(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzehr zzehrVar = (zzehr) it.next();
            if (zzehrVar.zzc.equals(str)) {
                it.remove();
                return zzehrVar;
            }
        }
        return null;
    }

    public final ListenableFuture zzb(final zzcar zzcarVar, int i) {
        zzehr zzehrVarZzr;
        zzfof zzfofVarZzi;
        zzbtn zzbtnVarZzr = com.google.android.gms.ads.internal.zzt.zzr();
        Context context = this.zza;
        zzbtw zzbtwVarZza = zzbtnVarZzr.zza(context, VersionInfoParcel.forPackage(), this.zzf);
        zzfda zzfdaVarZzy = this.zzd.zzy(zzcarVar, i);
        zzbtm zzbtmVarZza = zzbtwVarZza.zza("google.afma.response.normalize", zzeht.zzd, zzbtt.zzb);
        if (((Boolean) zzbkl.zza.zze()).booleanValue()) {
            zzehrVarZzr = zzr(zzcarVar.zzh);
            if (zzehrVarZzr == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = zzcarVar.zzj;
            zzehrVarZzr = null;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        }
        zzehr zzehrVar = zzehrVarZzr;
        zzfpi zzfpiVarZzn = zzehrVar == null ? zzfpi.CC.zzn(context, 9) : zzehrVar.zzd;
        zzfps zzfpsVarZzf = zzfdaVarZzy.zzf();
        zzfpsVarZzf.zzb(zzcarVar.zza.getStringArrayList("ad_types"));
        zzeid zzeidVar = new zzeid(zzcarVar.zzg, zzfpsVarZzf, zzfpiVarZzn);
        zzeia zzeiaVar = new zzeia(context, zzcarVar.zzb.afmaVersion, this.zzg, i, null);
        zzfoy zzfoyVarZze = zzfdaVarZzy.zze();
        zzfpi zzfpiVarZzn2 = zzfpi.CC.zzn(context, 11);
        if (zzehrVar == null) {
            final ListenableFuture listenableFutureZzm = zzm(zzcarVar, zzfoyVarZze, zzfdaVarZzy);
            final ListenableFuture listenableFutureZzn = zzn(listenableFutureZzm, zzfoyVarZze, zzbtwVarZza, zzfpsVarZzf, zzfpiVarZzn);
            zzfpi zzfpiVarZzn3 = zzfpi.CC.zzn(context, 10);
            final zzfof zzfofVarZzi2 = zzfoyVarZze.zzb(zzfos.HTTP, listenableFutureZzn, listenableFutureZzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzehp
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    Bundle bundle;
                    zzcat zzcatVar = (zzcat) listenableFutureZzn.get();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcN)).booleanValue() && (bundle = zzcarVar.zzm) != null) {
                        bundle.putLong(zzdyi.GET_AD_DICTIONARY_SDKCORE_START.zza(), zzcatVar.zzj());
                        bundle.putLong(zzdyi.GET_AD_DICTIONARY_SDKCORE_END.zza(), zzcatVar.zzk());
                    }
                    return new zzeic((JSONObject) listenableFutureZzm.get(), zzcatVar);
                }
            }).zzb(zzeidVar).zzb(zzfpr.zzc(zzfpiVarZzn3)).zzb(zzeiaVar).zzi();
            zzfpr.zzd(zzfofVarZzi2, zzfpsVarZzf, zzfpiVarZzn3);
            zzfpr.zzb(zzfofVarZzi2, zzfpiVarZzn2);
            zzfofVarZzi = zzfoyVarZze.zzb(zzfos.PRE_PROCESS, listenableFutureZzm, listenableFutureZzn, zzfofVarZzi2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzehi
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    Bundle bundle;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcN)).booleanValue() && (bundle = zzcarVar.zzm) != null) {
                        bundle.putLong(zzdyi.HTTP_RESPONSE_READY.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
                    }
                    return new zzeht((zzehz) zzfofVarZzi2.get(), (JSONObject) listenableFutureZzm.get(), (zzcat) listenableFutureZzn.get());
                }
            }).zzc(zzbtmVarZza).zzi();
        } else {
            zzeic zzeicVar = new zzeic(zzehrVar.zzb, zzehrVar.zza);
            zzfpi zzfpiVarZzn4 = zzfpi.CC.zzn(context, 10);
            final zzfof zzfofVarZzi3 = zzfoyVarZze.zza(zzfos.HTTP, zzhbi.zza(zzeicVar)).zzb(zzeidVar).zzb(zzfpr.zzc(zzfpiVarZzn4)).zzb(zzeiaVar).zzi();
            zzfpr.zzd(zzfofVarZzi3, zzfpsVarZzf, zzfpiVarZzn4);
            final ListenableFuture listenableFutureZza = zzhbi.zza(zzehrVar);
            zzfpr.zzb(zzfofVarZzi3, zzfpiVarZzn2);
            zzfofVarZzi = zzfoyVarZze.zzb(zzfos.PRE_PROCESS, zzfofVarZzi3, listenableFutureZza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzehj
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    zzehz zzehzVar = (zzehz) zzfofVarZzi3.get();
                    ListenableFuture listenableFuture = listenableFutureZza;
                    return new zzeht(zzehzVar, ((zzehr) listenableFuture.get()).zzb, ((zzehr) listenableFuture.get()).zza);
                }
            }).zzc(zzbtmVarZza).zzi();
        }
        zzfpr.zzd(zzfofVarZzi, zzfpsVarZzf, zzfpiVarZzn2);
        return zzfofVarZzi;
    }

    public final ListenableFuture zzc(final zzcar zzcarVar, int i) {
        if (!((Boolean) zzbkl.zza.zze()).booleanValue()) {
            return zzhbi.zzc(new Exception("Split request is disabled."));
        }
        zzfmi zzfmiVar = zzcarVar.zzi;
        if (zzfmiVar == null) {
            return zzhbi.zzc(new Exception("Pool configuration missing from request."));
        }
        if (zzfmiVar.zzc == 0 || zzfmiVar.zzd == 0) {
            return zzhbi.zzc(new Exception("Caching is disabled."));
        }
        Context context = this.zza;
        zzbtw zzbtwVarZza = com.google.android.gms.ads.internal.zzt.zzr().zza(context, VersionInfoParcel.forPackage(), this.zzf);
        zzfda zzfdaVarZzy = this.zzd.zzy(zzcarVar, i);
        zzfoy zzfoyVarZze = zzfdaVarZzy.zze();
        final ListenableFuture listenableFutureZzm = zzm(zzcarVar, zzfoyVarZze, zzfdaVarZzy);
        zzfps zzfpsVarZzf = zzfdaVarZzy.zzf();
        final zzfpi zzfpiVarZzn = zzfpi.CC.zzn(context, 9);
        final ListenableFuture listenableFutureZzn = zzn(listenableFutureZzm, zzfoyVarZze, zzbtwVarZza, zzfpsVarZzf, zzfpiVarZzn);
        return zzfoyVarZze.zzb(zzfos.GET_URL_AND_CACHE_KEY, listenableFutureZzm, listenableFutureZzn).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzehm
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzl(listenableFutureZzn, listenableFutureZzm, zzcarVar, zzfpiVarZzn);
            }
        }).zzi();
    }

    public final ListenableFuture zzd(String str) {
        if (!((Boolean) zzbkl.zza.zze()).booleanValue()) {
            return zzhbi.zzc(new Exception("Split request is disabled."));
        }
        zzehg zzehgVar = new zzehg(this);
        if (zzr(str) != null) {
            return zzhbi.zza(zzehgVar);
        }
        String.valueOf(str);
        return zzhbi.zzc(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str))));
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    public final void zze(zzcar zzcarVar, zzcai zzcaiVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcN)).booleanValue() && (bundle = zzcarVar.zzm) != null) {
            bundle.putLong(zzdyi.SERVICE_CONNECTED.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        ListenableFuture listenableFutureZzb = zzb(zzcarVar, Binder.getCallingUid());
        zzo(listenableFutureZzb, zzcaiVar, zzcarVar);
        if (((Boolean) zzbke.zzi.zze()).booleanValue()) {
            final zzeie zzeieVar = this.zzc;
            Objects.requireNonNull(zzeieVar);
            listenableFutureZzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeieVar.zza();
                }
            }, this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    public final void zzf(zzcar zzcarVar, zzcai zzcaiVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcN)).booleanValue() && (bundle = zzcarVar.zzm) != null) {
            bundle.putLong(zzdyi.SERVICE_CONNECTED.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzo(zzk(zzcarVar, Binder.getCallingUid()), zzcaiVar, zzcarVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    public final void zzg(zzcar zzcarVar, zzcai zzcaiVar) {
        zzo(zzc(zzcarVar, Binder.getCallingUid()), zzcaiVar, zzcarVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    public final void zzh(String str, zzcai zzcaiVar) {
        zzo(zzd(str), zzcaiVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    public final void zzi(String str) throws RemoteException {
        int callingUid = Binder.getCallingUid();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpy)).booleanValue()) {
            String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpz);
            if (str2.isEmpty()) {
                return;
            }
            Iterable<String> iterableZzd = zzgtl.zza(zzgsk.zzc(AbstractJsonLexerKt.COMMA)).zzd(str2);
            com.google.android.gms.ads.internal.util.zze.zza("AdRequestServiceImpl: Preconnecting");
            for (String str3 : iterableZzd) {
                Context context = this.zza;
                zzeia zzeiaVar = new zzeia(context, str, this.zzg, callingUid, "HEAD");
                HashMap map = new HashMap();
                map.put("User-Agent", com.google.android.gms.ads.internal.zzt.zzc().zze(context, str));
                zzehy zzehyVar = new zzehy(str3, 30000, map, new byte[0], "", false);
                try {
                    zzehz zzehzVarZzb = zzeiaVar.zza(zzehyVar);
                    zzehz zzehzVar = zzehzVarZzb;
                    if (zzehzVarZzb.zza != 200) {
                        int i = zzehzVarZzb.zza;
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 32);
                        sb.append("Unexpected preconnect response: ");
                        sb.append(i);
                        throw new RemoteException(sb.toString());
                    }
                } catch (Exception e) {
                    throw new RemoteException(e.getMessage());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    public final void zzj(zzcaa zzcaaVar, zzcaj zzcajVar) {
        if (((Boolean) zzbkt.zza.zze()).booleanValue()) {
            this.zzd.zzF();
            String str = zzcaaVar.zza;
            zzhbi.zzr(zzhbi.zza(null), new zzehf(this, zzcajVar, zzcaaVar), zzcff.zzh);
        } else {
            try {
                zzcajVar.zze("", zzcaaVar);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
            }
        }
    }

    public final ListenableFuture zzk(final zzcar zzcarVar, int i) {
        zzbtn zzbtnVarZzr = com.google.android.gms.ads.internal.zzt.zzr();
        Context context = this.zza;
        zzbtw zzbtwVarZza = zzbtnVarZzr.zza(context, VersionInfoParcel.forPackage(), this.zzf);
        if (!((Boolean) zzbkr.zza.zze()).booleanValue()) {
            return zzhbi.zzc(new Exception("Signal collection disabled."));
        }
        zzfda zzfdaVarZzy = this.zzd.zzy(zzcarVar, i);
        final zzfcb zzfcbVarZzd = zzfdaVarZzy.zzd();
        zzbtm zzbtmVarZza = zzbtwVarZza.zza("google.afma.request.getSignals", zzbtt.zza, zzbtt.zzb);
        zzfpi zzfpiVarZzn = zzfpi.CC.zzn(context, 22);
        zzfoy zzfoyVarZze = zzfdaVarZzy.zze();
        zzfos zzfosVar = zzfos.GET_SIGNALS;
        Bundle bundle = zzcarVar.zza;
        zzfof zzfofVarZzi = zzfoyVarZze.zza(zzfosVar, zzhbi.zza(bundle)).zzb(zzfpr.zzc(zzfpiVarZzn)).zzc(new zzhaq() { // from class: com.google.android.gms.internal.ads.zzehn
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) throws JSONException {
                return zzfcbVarZzd.zza(com.google.android.gms.ads.internal.client.zzay.zza().zzo((Bundle) obj), zzcarVar.zzm);
            }
        }).zzj(zzfos.JS_SIGNALS).zzc(zzbtmVarZza).zzi();
        zzfps zzfpsVarZzf = zzfdaVarZzy.zzf();
        zzfpsVarZzf.zzb(bundle.getStringArrayList("ad_types"));
        zzfpsVarZzf.zzd(bundle.getBundle("extras"));
        zzfpr.zze(zzfofVarZzi, zzfpsVarZzf, zzfpiVarZzn);
        if (((Boolean) zzbke.zzj.zze()).booleanValue()) {
            final zzeie zzeieVar = this.zzc;
            Objects.requireNonNull(zzeieVar);
            zzfofVarZzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeieVar.zza();
                }
            }, this.zzb);
        }
        return zzfofVarZzi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ InputStream zzl(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzcar zzcarVar, zzfpi zzfpiVar) {
        String strZzi = ((zzcat) listenableFuture.get()).zzi();
        zzq(new zzehr((zzcat) listenableFuture.get(), (JSONObject) listenableFuture2.get(), zzcarVar.zzh, strZzi, zzfpiVar));
        return new ByteArrayInputStream(strZzi.getBytes(StandardCharsets.UTF_8));
    }
}
