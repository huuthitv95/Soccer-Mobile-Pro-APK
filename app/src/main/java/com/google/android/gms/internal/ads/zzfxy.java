package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C12460ra;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzfxy implements zzfwt {
    private final Object zza;
    private final zzfxz zzb;
    private final zzfyk zzc;
    private final zzfwq zzd;
    private final boolean zze;

    zzfxy(Object obj, zzfxz zzfxzVar, zzfyk zzfykVar, zzfwq zzfwqVar, boolean z) {
        this.zza = obj;
        this.zzb = zzfxzVar;
        this.zzc = zzfykVar;
        this.zzd = zzfwqVar;
        this.zze = z;
    }

    private static String zzi(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzayx zzayxVarZza = zzayy.zza();
        zzayxVarZza.zzd(5);
        zzayxVarZza.zza(zzicn.zzt(bArr, 0, bArr.length));
        return Base64.encodeToString(((zzayy) zzayxVarZza.zzbu()).zzaN(), 11);
    }

    private final synchronized byte[] zzj(Map map, Map map2) {
        Object obj;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            obj = this.zza;
        } catch (Exception e) {
            this.zzd.zzc(2007, System.currentTimeMillis() - jCurrentTimeMillis, e);
            return null;
        }
        return (byte[]) obj.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(obj, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzfwt
    public final synchronized String zza(Context context, String str) {
        byte[] bArrZzj;
        Map mapZzb = this.zzc.zzb();
        mapZzb.put(InneractiveMediationDefs.GENDER_FEMALE, CampaignEx.JSON_KEY_AD_Q);
        mapZzb.put("ctx", context);
        mapZzb.put(C12460ra.f31825b, null);
        bArrZzj = zzj(null, mapZzb);
        if (this.zze) {
            mapZzb.clear();
        }
        return zzi(bArrZzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfwt
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        byte[] bArrZzj;
        Map mapZzc = this.zzc.zzc();
        mapZzc.put(InneractiveMediationDefs.GENDER_FEMALE, "v");
        mapZzc.put("ctx", context);
        mapZzc.put(C12460ra.f31825b, null);
        mapZzc.put("view", view);
        mapZzc.put("act", activity);
        bArrZzj = zzj(null, mapZzc);
        if (this.zze) {
            mapZzc.clear();
        }
        return zzi(bArrZzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfwt
    public final synchronized String zzc(Context context, String str, String str2, View view, Activity activity) {
        byte[] bArrZzj;
        Map mapZzd = this.zzc.zzd();
        mapZzd.put(InneractiveMediationDefs.GENDER_FEMALE, "c");
        mapZzd.put("ctx", context);
        mapZzd.put("cs", str2);
        mapZzd.put(C12460ra.f31825b, null);
        mapZzd.put("view", view);
        mapZzd.put("act", activity);
        bArrZzj = zzj(null, mapZzd);
        if (this.zze) {
            mapZzd.clear();
        }
        return zzi(bArrZzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfwt
    public final synchronized void zzd(String str, MotionEvent motionEvent) throws zzfyi {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Map mapZze = this.zzc.zze();
            mapZze.put(C12460ra.f31825b, null);
            mapZze.put("evt", motionEvent);
            Object obj = this.zza;
            obj.getClass().getDeclaredMethod("he", Map.class).invoke(obj, mapZze);
            this.zzd.zzb(3003, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new zzfyi(2005, e);
        }
    }

    final zzfxz zze() {
        return this.zzb;
    }

    final synchronized boolean zzf() throws zzfyi {
        Object obj;
        try {
            obj = this.zza;
        } catch (Exception e) {
            throw new zzfyi(2001, e);
        }
        return ((Boolean) obj.getClass().getDeclaredMethod("init", null).invoke(obj, null)).booleanValue();
    }

    public final synchronized void zzg() throws zzfyi {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Object obj = this.zza;
            obj.getClass().getDeclaredMethod("close", null).invoke(obj, null);
            this.zzd.zzb(3001, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new zzfyi(2003, e);
        }
    }

    public final synchronized int zzh() throws zzfyi {
        Object obj;
        try {
            obj = this.zza;
        } catch (Exception e) {
            throw new zzfyi(2006, e);
        }
        return ((Integer) obj.getClass().getDeclaredMethod(CampaignEx.KEY_LOCAL_CHECK_STATE, null).invoke(obj, null)).intValue();
    }
}
