package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
@ParametersAreNonnullByDefault
public final class zzdrj implements zzdpp, zzdhh {
    private final zzbvf zza;
    private final zzdcx zzb;
    private final zzdey zzc;
    private final zzdcd zzd;
    private final zzdkk zze;
    private final Context zzf;
    private final zzfjt zzg;
    private final VersionInfoParcel zzh;
    private final zzfkm zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private boolean zzl = true;
    private final zzbvb zzm;
    private final zzbvc zzn;

    public zzdrj(zzbvb zzbvbVar, zzbvc zzbvcVar, zzbvf zzbvfVar, zzdcx zzdcxVar, zzdey zzdeyVar, zzdcd zzdcdVar, zzdkk zzdkkVar, Context context, zzfjt zzfjtVar, VersionInfoParcel versionInfoParcel, zzfkm zzfkmVar) {
        this.zzm = zzbvbVar;
        this.zzn = zzbvcVar;
        this.zza = zzbvfVar;
        this.zzb = zzdcxVar;
        this.zzc = zzdeyVar;
        this.zzd = zzdcdVar;
        this.zze = zzdkkVar;
        this.zzf = context;
        this.zzg = zzfjtVar;
        this.zzh = versionInfoParcel;
        this.zzi = zzfkmVar;
    }

    private static final HashMap zzB(Map map) {
        HashMap map2 = new HashMap();
        if (map == null) {
            return map2;
        }
        synchronized (map) {
            for (Map.Entry entry : map.entrySet()) {
                View view = (View) ((WeakReference) entry.getValue()).get();
                if (view != null) {
                    map2.put((String) entry.getKey(), view);
                }
            }
        }
        return map2;
    }

    private final void zzi(View view) {
        try {
            zzbvf zzbvfVar = this.zza;
            if (zzbvfVar != null && !zzbvfVar.zzu()) {
                zzbvfVar.zzw(ObjectWrapper.wrap(view));
                this.zzd.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmf)).booleanValue()) {
                    this.zze.zzdu();
                    return;
                }
                return;
            }
            zzbvb zzbvbVar = this.zzm;
            if (zzbvbVar != null && !zzbvbVar.zzq()) {
                zzbvbVar.zzn(ObjectWrapper.wrap(view));
                this.zzd.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmf)).booleanValue()) {
                    this.zze.zzdu();
                    return;
                }
                return;
            }
            zzbvc zzbvcVar = this.zzn;
            if (zzbvcVar == null || zzbvcVar.zzo()) {
                return;
            }
            zzbvcVar.zzl(ObjectWrapper.wrap(view));
            this.zzd.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmf)).booleanValue()) {
                this.zze.zzdu();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call handleClick", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzA() {
        try {
            zzbvf zzbvfVar = this.zza;
            if (zzbvfVar != null) {
                zzbvfVar.zzC();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call destroy", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00cc A[Catch: JSONException -> 0x0044, RemoteException -> 0x011e, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0044, blocks: (B:47:0x00b1, B:48:0x00c6, B:50:0x00cc), top: B:70:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00c6 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zza(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        ClassLoader classLoader;
        Iterator it;
        IObjectWrapper iObjectWrapperZzq;
        try {
            IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(view);
            JSONObject jSONObject = this.zzg.zzaj;
            boolean z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzci)).booleanValue() && jSONObject.length() != 0) {
                Map map3 = map == null ? new HashMap() : map;
                Map map4 = map2 == null ? new HashMap() : map2;
                HashMap map5 = new HashMap();
                map5.putAll(map3);
                map5.putAll(map4);
                Iterator<String> itKeys = jSONObject.keys();
                loop0: while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                    if (jSONArrayOptJSONArray != null) {
                        WeakReference weakReference = (WeakReference) map5.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcj)).booleanValue() && next.equals("3010")) {
                                zzbvf zzbvfVar = this.zza;
                                Object objUnwrap = null;
                                if (zzbvfVar != null) {
                                    try {
                                        iObjectWrapperZzq = zzbvfVar.zzq();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzbvb zzbvbVar = this.zzm;
                                    if (zzbvbVar != null) {
                                        iObjectWrapperZzq = zzbvbVar.zzw();
                                    } else {
                                        zzbvc zzbvcVar = this.zzn;
                                        iObjectWrapperZzq = zzbvcVar != null ? zzbvcVar.zzu() : null;
                                    }
                                }
                                if (iObjectWrapperZzq != null) {
                                    objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZzq);
                                }
                                if (objUnwrap != null) {
                                    cls = objUnwrap.getClass();
                                    ArrayList arrayList = new ArrayList();
                                    com.google.android.gms.ads.internal.util.zzbp.zza(jSONArrayOptJSONArray, arrayList);
                                    com.google.android.gms.ads.internal.zzt.zzc();
                                    classLoader = this.zzf.getClassLoader();
                                    it = arrayList.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                try {
                                    ArrayList arrayList2 = new ArrayList();
                                    com.google.android.gms.ads.internal.util.zzbp.zza(jSONArrayOptJSONArray, arrayList2);
                                    com.google.android.gms.ads.internal.zzt.zzc();
                                    classLoader = this.zzf.getClassLoader();
                                    it = arrayList2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                } catch (JSONException unused2) {
                                    continue;
                                }
                            }
                        }
                        z = false;
                        break;
                    }
                }
            }
            this.zzl = z;
            HashMap mapZzB = zzB(map);
            HashMap mapZzB2 = zzB(map2);
            zzbvf zzbvfVar2 = this.zza;
            if (zzbvfVar2 != null) {
                zzbvfVar2.zzx(iObjectWrapperWrap, ObjectWrapper.wrap(mapZzB), ObjectWrapper.wrap(mapZzB2));
                return;
            }
            zzbvb zzbvbVar2 = this.zzm;
            if (zzbvbVar2 != null) {
                zzbvbVar2.zzy(iObjectWrapperWrap, ObjectWrapper.wrap(mapZzB), ObjectWrapper.wrap(mapZzB2));
                zzbvbVar2.zzo(iObjectWrapperWrap);
                return;
            }
            zzbvc zzbvcVar2 = this.zzn;
            if (zzbvcVar2 != null) {
                zzbvcVar2.zzw(iObjectWrapperWrap, ObjectWrapper.wrap(mapZzB), ObjectWrapper.wrap(mapZzB2));
                zzbvcVar2.zzm(iObjectWrapperWrap);
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call trackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzb(View view, Map map) {
        try {
            IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(view);
            zzbvf zzbvfVar = this.zza;
            if (zzbvfVar != null) {
                zzbvfVar.zzy(iObjectWrapperWrap);
                return;
            }
            zzbvb zzbvbVar = this.zzm;
            if (zzbvbVar != null) {
                zzbvbVar.zzs(iObjectWrapperWrap);
                return;
            }
            zzbvc zzbvcVar = this.zzn;
            if (zzbvcVar != null) {
                zzbvcVar.zzq(iObjectWrapperWrap);
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call untrackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzc(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        if (this.zzk && this.zzg.zzL) {
            return;
        }
        zzi(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzd(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzdH() {
        try {
            zzbvf zzbvfVar = this.zza;
            if (zzbvfVar == null || !zzbvfVar.zzt()) {
                return;
            }
            zzfjt zzfjtVar = this.zzg;
            if (zzfjtVar.zze == 4 || zzfjtVar.zzaD) {
                zzbvfVar.zzv();
                this.zzb.zza();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to report impression from an adapter", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzdI() {
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zze(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzf(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        if (!this.zzk) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.zzg.zzL) {
            zzi(view2);
        } else {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzg() {
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final boolean zzh() {
        return this.zzg.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzj(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzk(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final JSONObject zzl(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final JSONObject zzm(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzn() {
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzo(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzp(zzbng zzbngVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzr(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzs(com.google.android.gms.ads.internal.client.zzdc zzdcVar) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzt() {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final int zzu() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final boolean zzv() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzw(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.zzj) {
                this.zzj = com.google.android.gms.ads.internal.zzt.zzo().zzg(this.zzf, this.zzh.afmaVersion, this.zzg.zzC.toString(), this.zzi.zzg);
            }
            if (this.zzl) {
                zzbvf zzbvfVar = this.zza;
                if (zzbvfVar == null) {
                    zzbvb zzbvbVar = this.zzm;
                    if (zzbvbVar != null && !zzbvbVar.zzp()) {
                        zzbvbVar.zzm();
                        this.zzb.zza();
                        return;
                    }
                    zzbvc zzbvcVar = this.zzn;
                    if (zzbvcVar == null || zzbvcVar.zzn()) {
                        return;
                    }
                    zzbvcVar.zzk();
                    this.zzb.zza();
                    return;
                }
                zzfjt zzfjtVar = this.zzg;
                if (zzfjtVar.zzaD) {
                    if (zzbvfVar.zzt()) {
                        return;
                    }
                    zzbvfVar.zzv();
                    this.zzb.zza();
                    return;
                }
                if (zzbvfVar.zzt() && zzfjtVar.zze == 4) {
                    this.zzc.zza();
                } else {
                    zzbvfVar.zzv();
                    this.zzb.zza();
                }
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call recordImpression", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzx(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final void zzy() {
    }

    @Override // com.google.android.gms.internal.ads.zzdpp
    public final boolean zzz(Bundle bundle) {
        return false;
    }
}
