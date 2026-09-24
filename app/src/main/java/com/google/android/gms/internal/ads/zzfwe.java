package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzfwe extends AsyncTask {
    private zzfwf zza;
    protected final zzfvw zzd;

    public zzfwe(zzfvw zzfvwVar) {
        this.zzd = zzfvwVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzfwf zzfwfVar = this.zza;
        if (zzfwfVar != null) {
            zzfwfVar.zzb(this);
        }
    }

    public final void zzb(zzfwf zzfwfVar) {
        this.zza = zzfwfVar;
    }
}
