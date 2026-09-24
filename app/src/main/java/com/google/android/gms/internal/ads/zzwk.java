package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzwk extends zzwb {
    private final HashMap zza = new HashMap();
    private Handler zzb;
    private zzih zzc;

    protected zzwk() {
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    protected final void zzM() {
        for (zzwj zzwjVar : this.zza.values()) {
            zzwjVar.zza.zzq(zzwjVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    protected void zza(zzih zzihVar) {
        this.zzc = zzihVar;
        this.zzb = zzfk.zzd(null);
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    protected final void zzc() {
        for (zzwj zzwjVar : this.zza.values()) {
            zzwjVar.zza.zzr(zzwjVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    protected void zzd() {
        HashMap map = this.zza;
        for (zzwj zzwjVar : map.values()) {
            zzxe zzxeVar = zzwjVar.zza;
            zzxeVar.zzs(zzwjVar.zzb);
            zzwi zzwiVar = zzwjVar.zzc;
            zzxeVar.zzm(zzwiVar);
            zzxeVar.zzo(zzwiVar);
        }
        map.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public void zzt() throws IOException {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((zzwj) it.next()).zza.zzt();
        }
    }

    protected abstract void zzu(Object obj, zzxe zzxeVar, zzbf zzbfVar);

    protected final void zzv(final Object obj, zzxe zzxeVar) {
        HashMap map = this.zza;
        zzgsw.zza(!map.containsKey(obj));
        zzxd zzxdVar = new zzxd() { // from class: com.google.android.gms.internal.ads.zzwh
            @Override // com.google.android.gms.internal.ads.zzxd
            public final /* synthetic */ void zza(zzxe zzxeVar2, zzbf zzbfVar) {
                this.zza.zzu(obj, zzxeVar2, zzbfVar);
            }
        };
        zzwi zzwiVar = new zzwi(this, obj);
        map.put(obj, new zzwj(zzxeVar, zzxdVar, zzwiVar));
        Handler handler = this.zzb;
        handler.getClass();
        zzxeVar.zzl(handler, zzwiVar);
        Handler handler2 = this.zzb;
        handler2.getClass();
        zzxeVar.zzn(handler2, zzwiVar);
        zzxeVar.zzp(zzxdVar, this.zzc, zzk());
        if (zzj()) {
            return;
        }
        zzxeVar.zzr(zzxdVar);
    }

    protected int zzw(Object obj, int i) {
        return 0;
    }

    protected zzxc zzx(Object obj, zzxc zzxcVar) {
        throw null;
    }

    protected long zzy(Object obj, long j, zzxc zzxcVar) {
        return j;
    }
}
