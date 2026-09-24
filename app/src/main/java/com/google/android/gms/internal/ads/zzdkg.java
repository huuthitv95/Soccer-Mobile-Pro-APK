package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdkg extends zzdid implements zzbee {
    private final Map zzb;
    private final Context zzc;
    private final zzfjt zzd;

    public zzdkg(Context context, Set set, zzfjt zzfjtVar) {
        super(set);
        this.zzb = new WeakHashMap(1);
        this.zzc = context;
        this.zzd = zzfjtVar;
    }

    public final synchronized void zza(View view) {
        Map map = this.zzb;
        zzbeg zzbegVar = (zzbeg) map.get(view);
        if (zzbegVar == null) {
            zzbeg zzbegVar2 = new zzbeg(this.zzc, view);
            zzbegVar2.zza(this);
            map.put(view, zzbegVar2);
            zzbegVar = zzbegVar2;
        }
        if (this.zzd.zzX) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzca)).booleanValue()) {
                zzbegVar.zzd(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzbZ)).longValue());
                return;
            }
        }
        zzbegVar.zze();
    }

    public final synchronized void zzb(View view) {
        Map map = this.zzb;
        if (map.containsKey(view)) {
            ((zzbeg) map.get(view)).zzb(this);
            map.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbee
    public final synchronized void zzdj(final zzbed zzbedVar) {
        zzs(new zzdic() { // from class: com.google.android.gms.internal.ads.zzdkf
            @Override // com.google.android.gms.internal.ads.zzdic
            public final /* synthetic */ void zza(Object obj) {
                ((zzbee) obj).zzdj(zzbedVar);
            }
        });
    }
}
