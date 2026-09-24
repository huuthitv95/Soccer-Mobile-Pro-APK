package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfwc implements zzfvd {
    private static final zzfwc zza = new zzfwc();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzk = new zzfvy();
    private static final Runnable zzl = new zzfvz();
    private int zze;
    private long zzj;
    private final List zzd = new ArrayList();
    private final List zzf = new ArrayList();
    private final zzfvv zzh = new zzfvv();
    private final zzfvf zzg = new zzfvf();
    private final zzfvw zzi = new zzfvw(new zzfwf());

    zzfwc() {
    }

    public static zzfwc zzb() {
        return zza;
    }

    private final void zzk(View view, zzfve zzfveVar, JSONObject jSONObject, int i, boolean z) {
        zzfveVar.zzb(view, jSONObject, this, i == 1, z);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zzl);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvd
    public final void zza(View view, zzfve zzfveVar, JSONObject jSONObject, boolean z) {
        zzfvv zzfvvVar;
        int iZzl;
        boolean z2;
        if (zzfvt.zza(view) != null || (iZzl = (zzfvvVar = this.zzh).zzl(view)) == 3) {
            return;
        }
        JSONObject jSONObjectZza = zzfveVar.zza(view);
        zzfvo.zze(jSONObject, jSONObjectZza);
        String strZzg = zzfvvVar.zzg(view);
        if (strZzg != null) {
            zzfvo.zzd(jSONObjectZza, strZzg);
            try {
                jSONObjectZza.put("hasWindowFocus", Boolean.valueOf(this.zzh.zzj(view)));
            } catch (JSONException e) {
                zzfvp.zza("Error with setting has window focus", e);
            }
            boolean zZzk = this.zzh.zzk(strZzg);
            Boolean boolValueOf = Boolean.valueOf(zZzk);
            boolValueOf.getClass();
            if (zZzk) {
                try {
                    jSONObjectZza.put("isPipActive", boolValueOf);
                } catch (JSONException e2) {
                    zzfvp.zza("Error with setting is picture-in-picture active", e2);
                }
            }
            this.zzh.zzf();
            this = this;
        } else {
            zzfvu zzfvuVarZzi = zzfvvVar.zzi(view);
            if (zzfvuVarZzi != null) {
                zzfuv zzfuvVarZzb = zzfvuVarZzi.zzb();
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayListZzc = zzfvuVarZzi.zzc();
                int size = arrayListZzc.size();
                for (int i = 0; i < size; i++) {
                    jSONArray.put((String) arrayListZzc.get(i));
                }
                try {
                    jSONObjectZza.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectZza.put("friendlyObstructionClass", zzfuvVarZzb.zzb());
                    jSONObjectZza.put("friendlyObstructionPurpose", zzfuvVarZzb.zzc());
                    jSONObjectZza.put("friendlyObstructionReason", zzfuvVarZzb.zzd());
                } catch (JSONException e3) {
                    zzfvp.zza("Error with setting friendly obstruction", e3);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            zzk(view, zzfveVar, jSONObjectZza, iZzl, z || z2);
        }
        this.zze++;
    }

    public final void zzc() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzk);
            zzc.postDelayed(zzl, 200L);
        }
    }

    public final void zzd() {
        zzl();
        this.zzd.clear();
        zzb.post(new zzfvx(this));
    }

    public final void zze() {
        zzl();
    }

    final /* synthetic */ void zzf() {
        zzfwc zzfwcVar;
        this.zze = 0;
        this.zzf.clear();
        for (zzfty zzftyVar : zzfus.zza().zzf()) {
        }
        this.zzj = System.nanoTime();
        zzfvv zzfvvVar = this.zzh;
        zzfvvVar.zzd();
        zzfvf zzfvfVar = this.zzg;
        long jNanoTime = System.nanoTime();
        zzfve zzfveVarZza = zzfvfVar.zza();
        if (zzfvvVar.zzb().size() > 0) {
            for (String str : zzfvvVar.zzb()) {
                JSONObject jSONObjectZza = zzfveVarZza.zza(null);
                View viewZzh = zzfvvVar.zzh(str);
                zzfve zzfveVarZzb = zzfvfVar.zzb();
                String strZzc = zzfvvVar.zzc(str);
                if (strZzc != null) {
                    JSONObject jSONObjectZza2 = zzfveVarZzb.zza(viewZzh);
                    zzfvo.zzd(jSONObjectZza2, str);
                    try {
                        jSONObjectZza2.put("notVisibleReason", strZzc);
                    } catch (JSONException e) {
                        zzfvp.zza("Error with setting not visible reason", e);
                    }
                    zzfvo.zze(jSONObjectZza, jSONObjectZza2);
                }
                zzfvo.zzf(jSONObjectZza);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                this.zzi.zzb(jSONObjectZza, hashSet, jNanoTime);
            }
        }
        zzfvv zzfvvVar2 = this.zzh;
        if (zzfvvVar2.zza().size() > 0) {
            JSONObject jSONObjectZza3 = zzfveVarZza.zza(null);
            zzfwcVar = this;
            zzfwcVar.zzk(null, zzfveVarZza, jSONObjectZza3, 1, false);
            zzfvo.zzf(jSONObjectZza3);
            zzfwcVar.zzi.zza(jSONObjectZza3, zzfvvVar2.zza(), jNanoTime);
        } else {
            zzfwcVar = this;
            zzfwcVar.zzi.zzc();
        }
        zzfvvVar2.zze();
        long jNanoTime2 = System.nanoTime() - zzfwcVar.zzj;
        List<zzfwb> list = zzfwcVar.zzd;
        if (list.size() > 0) {
            for (zzfwb zzfwbVar : list) {
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                zzfwbVar.zzb();
                if (zzfwbVar instanceof zzfwa) {
                    ((zzfwa) zzfwbVar).zza();
                }
            }
        }
        zzfvc.zza().zzc();
    }

    final /* synthetic */ zzfvw zzh() {
        return this.zzi;
    }
}
