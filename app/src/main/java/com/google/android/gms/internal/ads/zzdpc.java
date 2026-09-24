package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.collection.ArrayMap;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdpc extends zzcxh {
    public static final zzgvz zzc = zzgvz.zzn("3010", "3008", "1005", "1009", "2011", "2007");
    private final List zzA;
    private final Executor zzd;
    private final zzdph zze;
    private final zzdpp zzf;
    private final zzdqg zzg;
    private final zzdpm zzh;
    private final zzdpr zzi;
    private final zzimc zzj;
    private final zzimc zzk;
    private final zzimc zzl;
    private final zzimc zzm;
    private final zzimc zzn;
    private zzdre zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private final zzcdk zzt;
    private final zzbai zzu;
    private final VersionInfoParcel zzv;
    private final Context zzw;
    private final zzdpe zzx;
    private final zzest zzy;
    private final Map zzz;

    public zzdpc(zzcxg zzcxgVar, Executor executor, zzdph zzdphVar, zzdpp zzdppVar, zzdqg zzdqgVar, zzdpm zzdpmVar, zzdpr zzdprVar, zzimc zzimcVar, zzimc zzimcVar2, zzimc zzimcVar3, zzimc zzimcVar4, zzimc zzimcVar5, zzcdk zzcdkVar, zzbai zzbaiVar, VersionInfoParcel versionInfoParcel, Context context, zzdpe zzdpeVar, zzest zzestVar, zzbeh zzbehVar) {
        super(zzcxgVar);
        this.zzd = executor;
        this.zze = zzdphVar;
        this.zzf = zzdppVar;
        this.zzg = zzdqgVar;
        this.zzh = zzdpmVar;
        this.zzi = zzdprVar;
        this.zzj = zzimcVar;
        this.zzk = zzimcVar2;
        this.zzl = zzimcVar3;
        this.zzm = zzimcVar4;
        this.zzn = zzimcVar5;
        this.zzt = zzcdkVar;
        this.zzu = zzbaiVar;
        this.zzv = versionInfoParcel;
        this.zzw = context;
        this.zzx = zzdpeVar;
        this.zzy = zzestVar;
        this.zzz = new HashMap();
        this.zzA = new ArrayList();
    }

    public static boolean zzI(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlX)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        long jZzy = com.google.android.gms.ads.internal.util.zzs.zzy(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            if (jZzy >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlY)).intValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzac, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzU(zzdre zzdreVar) {
        Iterator<String> itKeys;
        View view;
        zzbad zzbadVarZzb;
        if (!this.zzp) {
            this.zzo = zzdreVar;
            this.zzg.zza(zzdreVar);
            this.zzf.zza(zzdreVar.zzdF(), zzdreVar.zzj(), zzdreVar.zzk(), zzdreVar, zzdreVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdz)).booleanValue() && (zzbadVarZzb = this.zzu.zzb()) != null) {
                zzbadVarZzb.zzh(zzdreVar.zzdF());
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcv)).booleanValue()) {
                zzfjt zzfjtVar = this.zzb;
                if (zzfjtVar.zzak && (itKeys = zzfjtVar.zzaj.keys()) != null) {
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        zzdre zzdreVar2 = this.zzo;
                        WeakReference weakReference = zzdreVar2 == null ? null : (WeakReference) zzdreVar2.zzi().get(next);
                        this.zzz.put(next, false);
                        if (weakReference != null && (view = (View) weakReference.get()) != null) {
                            zzbeg zzbegVar = new zzbeg(this.zzw, view);
                            this.zzA.add(zzbegVar);
                            zzbegVar.zza(new zzdor(this, next));
                        }
                    }
                }
            }
            if (zzdreVar.zzg() != null) {
                zzdreVar.zzg().zza(this.zzt);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzad, reason: merged with bridge method [inline-methods] */
    public final void zzV(zzdre zzdreVar) {
        this.zzf.zzb(zzdreVar.zzdF(), zzdreVar.zzi());
        if (zzdreVar.zzdA() != null) {
            zzdreVar.zzdA().setClickable(false);
            zzdreVar.zzdA().removeAllViews();
        }
        if (zzdreVar.zzg() != null) {
            zzdreVar.zzg().zzb(this.zzt);
        }
        this.zzo = null;
    }

    private final synchronized void zzae(View view, Map map, Map map2) {
        this.zzg.zzc(this.zzo);
        this.zzf.zzw(view, map, map2, zzah());
        this.zzq = true;
    }

    private final synchronized void zzaf(View view, Map map, Map map2) {
        View viewZzag;
        if (!this.zzr && (viewZzag = zzag(map)) != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpb)).booleanValue()) {
                Rect rect = new Rect();
                if (viewZzag.getGlobalVisibleRect(rect, new Point()) && viewZzag.getHeight() == rect.height() && viewZzag.getWidth() == rect.width()) {
                    this.zzf.zzx(view, map, map2, zzah());
                    this.zzr = true;
                }
            } else if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpc)).booleanValue()) {
                zzbhv zzbhvVar = zzbie.zzpd;
                if (((Float) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).floatValue() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    double dFloatValue = ((Float) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).floatValue();
                    Rect rect2 = new Rect();
                    if (viewZzag.getGlobalVisibleRect(rect2, new Point())) {
                        if (rect2.height() * rect2.width() >= ((double) (viewZzag.getHeight() * viewZzag.getWidth())) * (dFloatValue / 100.0d)) {
                            this.zzf.zzx(view, map, map2, zzah());
                            this.zzr = true;
                        }
                    }
                }
            } else if (zzI(viewZzag)) {
                this.zzf.zzx(view, map, map2, zzah());
                this.zzr = true;
            }
        }
    }

    private final synchronized View zzag(Map map) {
        if (map != null) {
            zzgvz zzgvzVar = zzc;
            int size = zzgvzVar.size();
            int i = 0;
            while (i < size) {
                WeakReference weakReference = (WeakReference) map.get((String) zzgvzVar.get(i));
                i++;
                if (weakReference != null) {
                    return (View) weakReference.get();
                }
            }
        }
        return null;
    }

    private final synchronized ImageView.ScaleType zzah() {
        zzdre zzdreVar = this.zzo;
        if (zzdreVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        IObjectWrapper iObjectWrapperZzn = zzdreVar.zzn();
        if (iObjectWrapperZzn != null) {
            return (ImageView.ScaleType) ObjectWrapper.unwrap(iObjectWrapperZzn);
        }
        return zzdqg.zza;
    }

    private final void zzai(String str, boolean z) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgr)).booleanValue()) {
            zzL("Google", true);
            return;
        }
        ListenableFuture listenableFutureZzX = this.zze.zzX();
        if (listenableFutureZzX == null) {
            return;
        }
        zzhbi.zzr(listenableFutureZzX, new zzdos(this, "Google", true), this.zzd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzaj, reason: merged with bridge method [inline-methods] */
    public final void zzY(View view, zzelb zzelbVar) {
        zzcki zzckiVarZzW = this.zze.zzW();
        if (!this.zzh.zzd() || zzelbVar == null || zzckiVarZzW == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzh(zzelbVar.zza(), view);
    }

    public final synchronized void zzA(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzf.zzr(zzdgVar);
    }

    public final synchronized void zzB(com.google.android.gms.ads.internal.client.zzdc zzdcVar) {
        this.zzf.zzs(zzdcVar);
    }

    public final synchronized void zzC() {
        this.zzf.zzg();
    }

    public final synchronized void zzD() {
        zzdre zzdreVar = this.zzo;
        if (zzdreVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z = zzdreVar instanceof zzdqa;
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdox
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzW(z);
                }
            });
        }
    }

    public final synchronized void zzE(final View view, final int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmW)).booleanValue()) {
            zzdre zzdreVar = this.zzo;
            if (zzdreVar == null) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z = zzdreVar instanceof zzdqa;
                this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdoy
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzX(view, z, i);
                    }
                });
            }
        }
    }

    public final synchronized boolean zzF() {
        return this.zzf.zzh();
    }

    public final synchronized int zzG() {
        return this.zzf.zzu();
    }

    public final synchronized boolean zzH() {
        return this.zzf.zzv();
    }

    public final boolean zzJ() {
        return this.zzh.zzc();
    }

    public final String zzK() {
        return this.zzh.zzf();
    }

    public final zzelb zzL(String str, boolean z) {
        boolean z2;
        String str2;
        zzekx zzekxVar;
        zzeky zzekyVar;
        String str3;
        zzdpm zzdpmVar = this.zzh;
        if (zzdpmVar.zzd() && !TextUtils.isEmpty(str)) {
            zzdph zzdphVar = this.zze;
            zzcki zzckiVarZzW = zzdphVar.zzW();
            zzcki zzckiVarZzT = zzdphVar.zzT();
            if (zzckiVarZzW == null && zzckiVarZzT == null) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            zzdpmVar.zzg();
            int iZzc = zzdpmVar.zzg().zzc();
            int i2 = iZzc - 1;
            boolean z3 = false;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (iZzc != 1) {
                        str3 = iZzc != 2 ? "UNKNOWN" : "DISPLAY";
                    } else {
                        str3 = ShareConstants.VIDEO_URL;
                    }
                    StringBuilder sb = new StringBuilder(str3.length() + 49);
                    sb.append("Unknown omid media type: ");
                    sb.append(str3);
                    sb.append(". Not initializing Omid.");
                    String string = sb.toString();
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
                    return null;
                }
                if (zzckiVarZzW == null) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid media type was display but there was no display webview.");
                    return null;
                }
                z2 = false;
                z3 = true;
            } else if (zzckiVarZzT != null) {
                z2 = true;
            } else {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid media type was video but there was no video webview.");
            }
            if (z3) {
                str2 = null;
            } else if (z2) {
                str2 = "javascript";
                zzckiVarZzW = zzckiVarZzT;
            } else {
                zzckiVarZzW = null;
                str2 = null;
            }
            if (zzckiVarZzW == null) {
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Webview is null in InternalNativeAd");
                return null;
            }
            if (!com.google.android.gms.ads.internal.zzt.zzu().zza(this.zzw)) {
                int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to initialize omid in InternalNativeAd");
                return null;
            }
            VersionInfoParcel versionInfoParcel = this.zzv;
            int i8 = versionInfoParcel.buddyApkVersion;
            int i9 = versionInfoParcel.clientJarVersion;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i8).length() + 1 + String.valueOf(i9).length());
            sb2.append(i8);
            sb2.append(".");
            sb2.append(i9);
            String string2 = sb2.toString();
            if (z2) {
                zzekxVar = zzekx.VIDEO;
                zzekyVar = zzeky.DEFINED_BY_JAVASCRIPT;
            } else {
                zzekxVar = zzekx.NATIVE_DISPLAY;
                zzekyVar = zzdphVar.zzx() == 3 ? zzeky.UNSPECIFIED : zzeky.ONE_PIXEL;
            }
            zzelb zzelbVarZzd = com.google.android.gms.ads.internal.zzt.zzu().zzd(string2, zzckiVarZzW.zzD(), "", "javascript", str2, str, zzekyVar, zzekxVar, this.zzb.zzal);
            if (zzelbVarZzd == null) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to create omid session in InternalNativeAd");
                return null;
            }
            zzdphVar.zzq(zzelbVarZzd);
            zzckiVarZzW.zzak(zzelbVarZzd);
            if (z2) {
                zzftu zzftuVarZza = zzelbVarZzd.zza();
                if (zzckiVarZzT != null) {
                    com.google.android.gms.ads.internal.zzt.zzu().zzh(zzftuVarZza, zzckiVarZzT.zzE());
                }
                this.zzs = true;
            }
            if (z) {
                com.google.android.gms.ads.internal.zzt.zzu().zze(zzelbVarZzd.zza());
                zzckiVarZzW.zze("onSdkLoaded", new ArrayMap());
            }
            return zzelbVarZzd;
        }
        return null;
    }

    public final boolean zzM() {
        return this.zzh.zzd();
    }

    public final void zzN(View view) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgr)).booleanValue()) {
            zzdph zzdphVar = this.zze;
            if (zzdphVar.zzx() != 3) {
                zzcfk zzcfkVarZzY = zzdphVar.zzY();
                if (zzcfkVarZzY == null) {
                    return;
                }
                zzhbi.zzr(zzcfkVarZzY, new zzdot(this, view), this.zzd);
                return;
            }
        }
        zzY(view, this.zze.zzZ());
    }

    public final void zzO(View view) {
        zzelb zzelbVarZzZ = this.zze.zzZ();
        if (!this.zzh.zzd() || zzelbVarZzZ == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzg(zzelbVarZzZ.zza(), view);
    }

    public final zzdpe zzP() {
        return this.zzx;
    }

    public final synchronized void zzQ(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zzy.zza(zzdqVar);
    }

    public final void zzR(Bundle bundle) {
        final zzcki zzckiVarZzT = this.zze.zzT();
        if (zzckiVarZzT == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Video webview is null");
            return;
        }
        try {
            final JSONObject jSONObject = new JSONObject();
            for (String str : bundle.keySet()) {
                jSONObject.put(str, bundle.get(str));
            }
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdoz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzgvz zzgvzVar = zzdpc.zzc;
                    zzckiVarZzT.zzd("onVideoEvent", jSONObject);
                }
            });
        } catch (JSONException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error reading event signals", e);
        }
    }

    final /* synthetic */ void zzT() {
        this.zzf.zzA();
        this.zze.zzae();
    }

    final /* synthetic */ void zzW(boolean z) {
        zzdre zzdreVar = this.zzo;
        if (zzdreVar != null) {
            this.zzf.zzf(null, zzdreVar.zzdF(), this.zzo.zzi(), this.zzo.zzj(), z, zzah(), 0);
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        }
    }

    final /* synthetic */ void zzX(View view, boolean z, int i) {
        zzdre zzdreVar = this.zzo;
        if (zzdreVar != null) {
            this.zzf.zzf(view, zzdreVar.zzdF(), this.zzo.zzi(), this.zzo.zzj(), z, zzah(), i);
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling performClickForCustomGesture()");
        }
    }

    final /* synthetic */ zzdph zzZ() {
        return this.zze;
    }

    public final synchronized void zza(String str) {
        this.zzf.zzd(str);
    }

    final /* synthetic */ zzdre zzaa() {
        return this.zzo;
    }

    final /* synthetic */ Map zzab() {
        return this.zzz;
    }

    public final synchronized void zzb() {
        if (this.zzq) {
            return;
        }
        this.zzf.zzn();
    }

    public final synchronized void zzc(Bundle bundle) {
        this.zzf.zze(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final synchronized void zzd() {
        this.zzp = true;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdou
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzT();
            }
        });
        super.zzd();
    }

    public final synchronized boolean zze(Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zZzz = this.zzf.zzz(bundle);
        this.zzq = zZzz;
        return zZzz;
    }

    public final synchronized void zzf(Bundle bundle) {
        this.zzf.zzk(bundle);
    }

    public final synchronized void zzg(final zzdre zzdreVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzct)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdov
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzU(zzdreVar);
                }
            });
        } else {
            zzU(zzdreVar);
        }
    }

    public final synchronized void zzh(final zzdre zzdreVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzct)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdow
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzV(zzdreVar);
                }
            });
        } else {
            zzV(zzdreVar);
        }
    }

    public final synchronized void zzi(View view, View view2, Map map, Map map2, boolean z) {
        zzcki zzckiVarZzT;
        this.zzg.zzb(this.zzo);
        this.zzf.zzc(view, view2, map, map2, z, zzah());
        if (this.zzs) {
            zzdph zzdphVar = this.zze;
            if (zzdphVar.zzT() != null && (zzckiVarZzT = zzdphVar.zzT()) != null) {
                zzckiVarZzT.zze("onSdkAdUserInteractionClick", new ArrayMap());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzj() {
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpa
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzS();
            }
        };
        Executor executor = this.zzd;
        executor.execute(runnable);
        if (this.zze.zzx() != 7) {
            final zzdpp zzdppVar = this.zzf;
            Objects.requireNonNull(zzdppVar);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpb
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzdppVar.zzy();
                }
            });
        }
        super.zzj();
    }

    public final synchronized void zzk(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzj(view, motionEvent, view2);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[Catch: all -> 0x0092, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000a, B:10:0x001c, B:12:0x0022, B:13:0x002c, B:15:0x0032, B:19:0x0047, B:22:0x005b, B:23:0x0063, B:25:0x0069, B:27:0x007d, B:29:0x0083, B:34:0x008a), top: B:40:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0069 A[Catch: all -> 0x0092, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000a, B:10:0x001c, B:12:0x0022, B:13:0x002c, B:15:0x0032, B:19:0x0047, B:22:0x005b, B:23:0x0063, B:25:0x0069, B:27:0x007d, B:29:0x0083, B:34:0x008a), top: B:40:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x008a A[Catch: all -> 0x0092, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000a, B:10:0x001c, B:12:0x0022, B:13:0x002c, B:15:0x0032, B:19:0x0047, B:22:0x005b, B:23:0x0063, B:25:0x0069, B:27:0x007d, B:29:0x0083, B:34:0x008a), top: B:40:0x0001 }] */
    public final synchronized void zzu(View view, Map map, Map map2, boolean z) {
        Iterator it;
        View view2;
        if (this.zzq) {
            zzaf(view, map, map2);
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcv)).booleanValue() && this.zzb.zzak) {
            Map map3 = this.zzz;
            Iterator it2 = map3.keySet().iterator();
            while (it2.hasNext()) {
                if (!((Boolean) map3.get((String) it2.next())).booleanValue()) {
                }
            }
            if (!z) {
                zzae(view, map, map2);
                zzaf(view, map, map2);
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeM)).booleanValue()) {
                it = map.entrySet().iterator();
                while (it.hasNext()) {
                    view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                    if (view2 == null) {
                    }
                }
            }
        } else {
            if (!z) {
                zzae(view, map, map2);
                zzaf(view, map, map2);
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeM)).booleanValue() && map != null) {
                it = map.entrySet().iterator();
                while (it.hasNext()) {
                    view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                    if (view2 == null && zzI(view2)) {
                        zzae(view, map, map2);
                        return;
                    }
                }
            }
        }
    }

    public final synchronized JSONObject zzv(View view, Map map, Map map2) {
        return this.zzf.zzl(view, map, map2, zzah());
    }

    public final synchronized JSONObject zzw(View view, Map map, Map map2) {
        return this.zzf.zzm(view, map, map2, zzah());
    }

    public final synchronized void zzx(View view) {
        this.zzf.zzo(view);
    }

    public final synchronized void zzy(zzbng zzbngVar) {
        this.zzf.zzp(zzbngVar);
    }

    public final synchronized void zzz() {
        this.zzf.zzq();
    }

    final /* synthetic */ void zzS() {
        try {
            zzdph zzdphVar = this.zze;
            int iZzx = zzdphVar.zzx();
            if (iZzx == 1) {
                zzbmq zzbmqVarZza = this.zzi.zza();
                if (zzbmqVarZza != null) {
                    zzai("Google", true);
                    zzbmqVarZza.zze((zzbmg) this.zzj.zzb());
                    return;
                }
                return;
            }
            if (iZzx == 2) {
                zzbmn zzbmnVarZzb = this.zzi.zzb();
                if (zzbmnVarZzb != null) {
                    zzai("Google", true);
                    zzbmnVarZzb.zze((zzbme) this.zzk.zzb());
                    return;
                }
                return;
            }
            if (iZzx == 3) {
                zzbmw zzbmwVarZzf = this.zzi.zzf(zzdphVar.zzS());
                if (zzbmwVarZzf != null) {
                    if (zzdphVar.zzT() != null) {
                        zzL("Google", true);
                    }
                    zzbmwVarZzf.zze((zzbmj) this.zzn.zzb());
                    return;
                }
                return;
            }
            if (iZzx == 6) {
                zzbnd zzbndVarZzc = this.zzi.zzc();
                if (zzbndVarZzc != null) {
                    zzai("Google", true);
                    zzbndVarZzc.zze((zzbnj) this.zzl.zzb());
                    return;
                }
                return;
            }
            if (iZzx != 7) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Wrong native template id!");
            } else {
                zzbry zzbryVarZze = this.zzi.zze();
                if (zzbryVarZze != null) {
                    zzbryVarZze.zze((zzbrs) this.zzm.zzb());
                }
            }
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("RemoteException when notifyAdLoad is called", e);
        }
    }
}
