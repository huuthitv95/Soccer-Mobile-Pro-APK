package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.ironsource.mediationsdk.C12357j;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzedc extends com.google.android.gms.ads.internal.client.zzds {
    final Map zza = new HashMap();
    private final Context zzb;
    private final WeakReference zzc;
    private final zzecq zzd;
    private final zzhbs zze;
    private zzecf zzf;

    zzedc(Context context, WeakReference weakReference, zzecq zzecqVar, zzede zzedeVar, zzhbs zzhbsVar) {
        this.zzb = context;
        this.zzc = weakReference;
        this.zzd = zzecqVar;
        this.zze = zzhbsVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzg(String str) {
        try {
            zzhbi.zzr(this.zzf.zzn(str), new zzecx(this), this.zze);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "OutOfContextTester.setAdAsOutOfContext");
            this.zzd.zzn();
        }
    }

    private final synchronized void zzk(String str) {
        try {
            zzhbi.zzr(this.zzf.zzn(str), new zzecy(this), this.zze);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "OutOfContextTester.setAdAsShown");
            this.zzd.zzn();
        }
    }

    private final Context zzl() {
        Context context = (Context) this.zzc.get();
        return context == null ? this.zzb : context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzm(Object obj) {
        ResponseInfo responseInfo;
        com.google.android.gms.ads.internal.client.zzdx zzdxVarZzd;
        if (obj instanceof LoadAdError) {
            responseInfo = ((LoadAdError) obj).getResponseInfo();
        } else if (obj instanceof AppOpenAd) {
            responseInfo = ((AppOpenAd) obj).getResponseInfo();
        } else if (obj instanceof InterstitialAd) {
            responseInfo = ((InterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedAd) {
            responseInfo = ((RewardedAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedInterstitialAd) {
            responseInfo = ((RewardedInterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof AdView) {
            responseInfo = ((AdView) obj).getResponseInfo();
        } else {
            if (!(obj instanceof NativeAd)) {
                return "";
            }
            responseInfo = ((NativeAd) obj).getResponseInfo();
        }
        if (responseInfo == null || (zzdxVarZzd = responseInfo.zzd()) == null) {
            return "";
        }
        try {
            return zzdxVarZzd.zzj();
        } catch (RemoteException unused) {
            return "";
        }
    }

    public final void zzb(zzecf zzecfVar) {
        this.zzf = zzecfVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final synchronized void zzc(zzedd zzeddVar) {
        byte b;
        String strZzb = zzeddVar.zzb();
        switch (strZzb.hashCode()) {
            case -1999289321:
                if (!strZzb.equals("NATIVE")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case -1372958932:
                if (!strZzb.equals("INTERSTITIAL")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case -428325382:
                if (!strZzb.equals("APP_OPEN_AD")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 543046670:
                if (!strZzb.equals("REWARDED")) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 1854800829:
                if (!strZzb.equals("REWARDED_INTERSTITIAL")) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case 1951953708:
                if (!strZzb.equals(C12357j.f31263a)) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            String strZza = zzeddVar.zza();
            AppOpenAd.load(zzl(), strZza, zzeddVar.zzc(), new zzecr(this, strZza));
            return;
        }
        if (b == 1) {
            String strZza2 = zzeddVar.zza();
            zzbhv zzbhvVar = zzbie.zzkM;
            BaseAdView adManagerAdView = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue() && zzeddVar.zzg()) ? new AdManagerAdView(zzl()) : new AdView(zzl());
            adManagerAdView.setAdSize(zzeddVar.zzd());
            adManagerAdView.setAdUnitId(strZza2);
            adManagerAdView.setAdListener(new zzecs(this, strZza2, adManagerAdView));
            VideoOptions videoOptionsZzf = zzeddVar.zzf();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue() && zzeddVar.zzg() && videoOptionsZzf != null) {
                ((AdManagerAdView) adManagerAdView).setVideoOptions(videoOptionsZzf);
            }
            adManagerAdView.loadAd(zzeddVar.zzc());
            return;
        }
        if (b == 2) {
            String strZza3 = zzeddVar.zza();
            InterstitialAd.load(zzl(), strZza3, zzeddVar.zzc(), new zzect(this, strZza3));
            return;
        }
        if (b != 3) {
            if (b == 4) {
                String strZza4 = zzeddVar.zza();
                RewardedAd.load(zzl(), strZza4, zzeddVar.zzc(), new zzecu(this, strZza4));
                return;
            } else {
                if (b != 5) {
                    return;
                }
                String strZza5 = zzeddVar.zza();
                RewardedInterstitialAd.load(zzl(), strZza5, zzeddVar.zzc(), new zzecv(this, strZza5));
                return;
            }
        }
        final String strZza6 = zzeddVar.zza();
        AdLoader.Builder builder = new AdLoader.Builder(zzl(), strZza6);
        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.google.android.gms.internal.ads.zzeda
            @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
            public final /* synthetic */ void onNativeAdLoaded(NativeAd nativeAd) {
                this.zza.zzf(strZza6, nativeAd);
            }
        });
        builder.withAdListener(new zzecw(this));
        NativeAdOptions nativeAdOptionsZze = zzeddVar.zze();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkM)).booleanValue() && nativeAdOptionsZze != null) {
            builder.withNativeAdOptions(nativeAdOptionsZze);
        }
        builder.build().loadAd(zzeddVar.zzc());
    }

    public final synchronized void zzd(String str) {
        Map map;
        Object obj;
        Activity activityZzo = this.zzd.zzo();
        if (activityZzo != null && (obj = (map = this.zza).get(str)) != null) {
            zzbhv zzbhvVar = zzbie.zzkL;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue() || (obj instanceof AppOpenAd) || (obj instanceof InterstitialAd) || (obj instanceof RewardedAd) || (obj instanceof RewardedInterstitialAd)) {
                map.remove(str);
            }
            zzk(zzm(obj));
            if (obj instanceof AppOpenAd) {
                ((AppOpenAd) obj).show(activityZzo);
                return;
            }
            if (obj instanceof InterstitialAd) {
                ((InterstitialAd) obj).show(activityZzo);
                return;
            }
            if (obj instanceof RewardedAd) {
                ((RewardedAd) obj).show(activityZzo, zzedb.zza);
                return;
            }
            if (obj instanceof RewardedInterstitialAd) {
                ((RewardedInterstitialAd) obj).show(activityZzo, zzecz.zza);
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).booleanValue() && ((obj instanceof AdView) || (obj instanceof NativeAd))) {
                Intent intent = new Intent();
                Context contextZzl = zzl();
                intent.setClassName(contextZzl, OutOfContextTestingActivity.CLASS_NAME);
                intent.putExtra("adUnit", str);
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzY(contextZzl, intent);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zze(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        ViewGroup viewGroup = (ViewGroup) ObjectWrapper.unwrap(iObjectWrapper2);
        if (context == null || viewGroup == null) {
            return;
        }
        Map map = this.zza;
        Object obj = map.get(str);
        if (obj != null) {
            map.remove(str);
        }
        if (obj instanceof AdView) {
            zzede.zza(context, viewGroup, (AdView) obj);
        } else if (obj instanceof NativeAd) {
            zzede.zzb(context, viewGroup, (NativeAd) obj);
        }
    }

    protected final synchronized void zzf(String str, Object obj) {
        this.zza.put(str, obj);
        zzg(zzm(obj));
    }

    final /* synthetic */ zzecq zzi() {
        return this.zzd;
    }
}
