package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Looper;
import android.view.View;
import androidx.media3.common.MimeTypes;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
@ParametersAreNonnullByDefault
public final class zzccw implements zzcdb {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzihx zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzccy zzi;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzccw(Context context, VersionInfoParcel versionInfoParcel, zzccy zzccyVar, String str, zzccx zzccxVar) {
        Preconditions.checkNotNull(zzccyVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzi = zzccyVar;
        Iterator it = zzccyVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzihx zzihxVarZzg = zzikb.zzg();
        zzihxVarZzg.zzn(9);
        if (str != null) {
            zzihxVarZzg.zzb(str);
            zzihxVarZzg.zzc(str);
        }
        zzihy zzihyVarZzc = zzihz.zzc();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zzihyVarZzc.zza(str2);
        }
        zzihxVarZzg.zzd((zzihz) zzihyVarZzc.zzbu());
        zzijn zzijnVarZzc = zzijo.zzc();
        zzijnVarZzc.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str3 = versionInfoParcel.afmaVersion;
        if (str3 != null) {
            zzijnVarZzc.zza(str3);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zzijnVarZzc.zzb(apkVersion);
        }
        zzihxVarZzg.zzk((zzijo) zzijnVarZzc.zzbu());
        this.zzd = zzihxVarZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzcdb
    public final zzccy zza() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzcdb
    public final void zzb(String str) {
        synchronized (this.zzj) {
            try {
                if (str == null) {
                    this.zzd.zzi();
                } else {
                    this.zzd.zzh(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdb
    public final boolean zzc() {
        return this.zzi.zzc && !this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcdb
    public final void zzd(View view) {
        Bitmap bitmapCreateBitmap;
        if (this.zzi.zzc && !this.zzl) {
            com.google.android.gms.ads.internal.zzt.zzc();
            final Bitmap bitmap = null;
            if (view != null) {
                try {
                    boolean zIsDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmapCreateBitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                    try {
                        view.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
                    } catch (RuntimeException e) {
                        e = e;
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to capture the web view", e);
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    bitmapCreateBitmap = null;
                }
                if (bitmapCreateBitmap == null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width == 0 || height == 0) {
                            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Width or height of view is zero");
                        } else {
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(bitmapCreateBitmap2);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap = bitmapCreateBitmap2;
                        }
                    } catch (RuntimeException e3) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to capture the webview", e3);
                    }
                } else {
                    bitmap = bitmapCreateBitmap;
                }
            }
            if (bitmap == null) {
                zzcda.zza("Failed to capture the webview bitmap.");
                return;
            }
            this.zzl = true;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzccv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzg(bitmap);
                }
            };
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                runnable.run();
            } else {
                zzcff.zza.execute(runnable);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdb
    public final void zze(String str, Map map, int i) {
        synchronized (this.zzj) {
            if (i == 3) {
                this.zzm = true;
            }
            LinkedHashMap linkedHashMap = this.zze;
            if (linkedHashMap.containsKey(str)) {
                if (i == 3) {
                    ((zzijl) linkedHashMap.get(str)).zze(4);
                }
                return;
            }
            zzijl zzijlVarZze = zzijm.zze();
            int iZza = zzijk.zza(i);
            if (iZza != 0) {
                zzijlVarZze.zze(iZza);
            }
            zzijlVarZze.zza(linkedHashMap.size());
            zzijlVarZze.zzb(str);
            zziik zziikVarZzc = zziin.zzc();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zziii zziiiVarZzc = zziij.zzc();
                        zziiiVarZzc.zza(zzicn.zzx(str2));
                        zziiiVarZzc.zzb(zzicn.zzx(str3));
                        zziikVarZzc.zza((zziij) zziiiVarZzc.zzbu());
                    }
                }
            }
            zzijlVarZze.zzc((zziin) zziikVarZzc.zzbu());
            linkedHashMap.put(str, zzijlVarZze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdb
    public final void zzf() {
        synchronized (this.zzj) {
            this.zze.keySet();
            ListenableFuture listenableFutureZza = zzhbi.zza(Collections.EMPTY_MAP);
            zzhaq zzhaqVar = new zzhaq() { // from class: com.google.android.gms.internal.ads.zzccs
                @Override // com.google.android.gms.internal.ads.zzhaq
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return this.zza.zzh((Map) obj);
                }
            };
            zzhbs zzhbsVar = zzcff.zzh;
            ListenableFuture listenableFutureZzj = zzhbi.zzj(listenableFutureZza, zzhaqVar, zzhbsVar);
            ListenableFuture listenableFutureZzi = zzhbi.zzi(listenableFutureZzj, 10L, TimeUnit.SECONDS, zzcff.zzd);
            zzhbi.zzr(listenableFutureZzj, new zzccr(this, listenableFutureZzi), zzhbsVar);
            zzc.add(listenableFutureZzi);
        }
    }

    final /* synthetic */ void zzg(Bitmap bitmap) {
        zzicm zzicmVarZzC = zzicn.zzC();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzicmVarZzC);
        synchronized (this.zzj) {
            zzihx zzihxVar = this.zzd;
            zzijf zzijfVarZzc = zzijh.zzc();
            zzijfVarZzc.zzb(zzicmVarZzC.zza());
            zzijfVarZzc.zza(MimeTypes.IMAGE_PNG);
            zzijfVarZzc.zzc(2);
            zzihxVar.zzj((zzijh) zzijfVarZzc.zzbu());
        }
    }

    final /* synthetic */ ListenableFuture zzh(Map map) {
        int length;
        zzijl zzijlVar;
        ListenableFuture listenableFutureZzk;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        Object obj = this.zzj;
                        synchronized (obj) {
                            length = jSONArrayOptJSONArray.length();
                            synchronized (obj) {
                                zzijlVar = (zzijl) this.zze.get(str);
                            }
                        }
                        if (zzijlVar == null) {
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
                            sb.append("Cannot find the corresponding resource object for ");
                            sb.append(str);
                            zzcda.zza(sb.toString());
                        } else {
                            for (int i = 0; i < length; i++) {
                                zzijlVar.zzd(jSONArrayOptJSONArray.getJSONObject(i).getString("threat_type"));
                            }
                            this.zza = (length > 0) | this.zza;
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) zzbkm.zza.zze()).booleanValue()) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get SafeBrowsing metadata", e);
                }
                return zzhbi.zzc(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z = this.zza;
        if (!(z && this.zzi.zzg) && (!(this.zzm && this.zzi.zzf) && (z || !this.zzi.zzd))) {
            return zzhbi.zza(null);
        }
        synchronized (this.zzj) {
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                this.zzd.zzf((zzijm) ((zzijl) it.next()).zzbu());
            }
            zzihx zzihxVar = this.zzd;
            zzihxVar.zzl(this.zzf);
            zzihxVar.zzm(this.zzg);
            if (zzcda.zzb()) {
                String strZza = zzihxVar.zza();
                String strZzg = zzihxVar.zzg();
                StringBuilder sb2 = new StringBuilder(String.valueOf(strZza).length() + 38 + String.valueOf(strZzg).length() + 15);
                sb2.append("Sending SB report\n  url: ");
                sb2.append(strZza);
                sb2.append("\n  clickUrl: ");
                sb2.append(strZzg);
                sb2.append("\n  resources: \n");
                StringBuilder sb3 = new StringBuilder(sb2.toString());
                for (zzijm zzijmVar : zzihxVar.zze()) {
                    sb3.append("    [");
                    sb3.append(zzijmVar.zzd());
                    sb3.append("] ");
                    sb3.append(zzijmVar.zzc());
                }
                zzcda.zza(sb3.toString());
            }
            ListenableFuture listenableFutureZzb = new com.google.android.gms.ads.internal.util.zzbl(this.zzh).zzb(1, this.zzi.zzb, null, ((zzikb) zzihxVar.zzbu()).zzaN());
            if (zzcda.zzb()) {
                listenableFutureZzb.addListener(zzccu.zza, zzcff.zza);
            }
            listenableFutureZzk = zzhbi.zzk(listenableFutureZzb, zzcct.zza, zzcff.zzh);
        }
        return listenableFutureZzk;
    }
}
