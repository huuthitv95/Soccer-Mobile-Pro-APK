package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeca {
    private final zzebk zza;
    private final zzdwn zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    zzeca(zzebk zzebkVar, zzdwn zzdwnVar) {
        this.zza = zzebkVar;
        this.zzb = zzdwnVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zzc(List list) {
        zzdwm zzdwmVarZzc;
        zzdwm zzdwmVarZzc2;
        zzbxe zzbxeVar;
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbrd zzbrdVar = (zzbrd) it.next();
                String string = (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkI)).booleanValue() || (zzdwmVarZzc2 = this.zzb.zzc(zzbrdVar.zza)) == null || (zzbxeVar = zzdwmVarZzc2.zzc) == null) ? "" : zzbxeVar.toString();
                String str = string;
                boolean z = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkJ)).booleanValue() && (zzdwmVarZzc = this.zzb.zzc(zzbrdVar.zza)) != null && zzdwmVarZzc.zzd;
                List list2 = this.zzd;
                String str2 = zzbrdVar.zza;
                list2.add(new zzebz(str2, str, this.zzb.zzd(str2), zzbrdVar.zzb ? 1 : 0, zzbrdVar.zzd, zzbrdVar.zzc, z));
            }
            this.zze = true;
        }
    }

    public final void zza() {
        this.zza.zzb(new zzeby(this));
    }

    public final JSONArray zzb() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                zzebk zzebkVar = this.zza;
                if (!zzebkVar.zze()) {
                    zza();
                    return jSONArray;
                }
                zzc(zzebkVar.zzd());
            }
            Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                jSONArray.put(((zzebz) it.next()).zza());
            }
            return jSONArray;
        }
    }
}
