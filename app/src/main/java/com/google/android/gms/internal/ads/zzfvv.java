package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfvv {
    private final HashMap zza = new HashMap();
    private final HashMap zzb = new HashMap();
    private final HashMap zzc = new HashMap();
    private final HashSet zzd = new HashSet();
    private final HashSet zze = new HashSet();
    private final HashSet zzf = new HashSet();
    private final HashMap zzg = new HashMap();
    private final HashSet zzh = new HashSet();
    private final Map zzi = new WeakHashMap();
    private boolean zzj;

    public final HashSet zza() {
        return this.zze;
    }

    public final HashSet zzb() {
        return this.zzf;
    }

    public final String zzc(String str) {
        return (String) this.zzg.get(str);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    public final void zzd() {
        boolean zIsInPictureInPictureMode;
        Boolean bool;
        Activity activity;
        zzfus zzfusVarZza = zzfus.zza();
        if (zzfusVarZza != null) {
            for (zzfty zzftyVar : zzfusVarZza.zzf()) {
                View viewZzi = zzftyVar.zzi();
                if (zzftyVar.zzj()) {
                    String strZzh = zzftyVar.zzh();
                    if (viewZzi != null) {
                        String str = null;
                        if (Build.VERSION.SDK_INT >= 24) {
                            Context context = viewZzi.getContext();
                            while (true) {
                                if (!(context instanceof ContextWrapper)) {
                                    activity = null;
                                    break;
                                } else {
                                    if (context instanceof Activity) {
                                        activity = (Activity) context;
                                        break;
                                    }
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
                            if (activity != null) {
                                zIsInPictureInPictureMode = activity.isInPictureInPictureMode();
                            } else {
                                zIsInPictureInPictureMode = false;
                            }
                        } else {
                            zIsInPictureInPictureMode = false;
                        }
                        if (zIsInPictureInPictureMode) {
                            this.zzh.add(strZzh);
                        }
                        if (viewZzi.isAttachedToWindow()) {
                            if (viewZzi.hasWindowFocus()) {
                                this.zzi.remove(viewZzi);
                                bool = false;
                            } else {
                                Map map = this.zzi;
                                if (map.containsKey(viewZzi)) {
                                    bool = (Boolean) map.get(viewZzi);
                                } else {
                                    map.put(viewZzi, false);
                                    bool = false;
                                }
                            }
                            if (!bool.booleanValue() || zIsInPictureInPictureMode) {
                                HashSet hashSet = new HashSet();
                                View view = viewZzi;
                                while (true) {
                                    if (view == null) {
                                        this.zzd.addAll(hashSet);
                                        break;
                                    }
                                    String strZza = zzfvt.zza(view);
                                    if (strZza != null) {
                                        str = strZza;
                                        break;
                                    } else {
                                        hashSet.add(view);
                                        Object parent = view.getParent();
                                        view = parent instanceof View ? (View) parent : null;
                                    }
                                }
                            } else {
                                str = "noWindowFocus";
                            }
                        } else {
                            str = "notAttached";
                        }
                        if (str == null) {
                            this.zze.add(strZzh);
                            this.zza.put(viewZzi, strZzh);
                            for (zzfuv zzfuvVar : zzftyVar.zzf()) {
                                View view2 = (View) zzfuvVar.zza().get();
                                if (view2 != null) {
                                    HashMap map2 = this.zzb;
                                    zzfvu zzfvuVar = (zzfvu) map2.get(view2);
                                    if (zzfvuVar != null) {
                                        zzfvuVar.zza(zzftyVar.zzh());
                                    } else {
                                        map2.put(view2, new zzfvu(zzfuvVar, zzftyVar.zzh()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.zzf.add(strZzh);
                            this.zzc.put(strZzh, viewZzi);
                            this.zzg.put(strZzh, str);
                        }
                    } else {
                        this.zzf.add(strZzh);
                        this.zzg.put(strZzh, "noAdView");
                    }
                }
            }
        }
    }

    public final void zze() {
        this.zza.clear();
        this.zzb.clear();
        this.zzc.clear();
        this.zzd.clear();
        this.zze.clear();
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
        this.zzh.clear();
    }

    public final void zzf() {
        this.zzj = true;
    }

    public final String zzg(View view) {
        HashMap map = this.zza;
        if (map.size() == 0) {
            return null;
        }
        String str = (String) map.get(view);
        if (str != null) {
            map.remove(view);
        }
        return str;
    }

    public final View zzh(String str) {
        return (View) this.zzc.get(str);
    }

    public final zzfvu zzi(View view) {
        HashMap map = this.zzb;
        zzfvu zzfvuVar = (zzfvu) map.get(view);
        if (zzfvuVar != null) {
            map.remove(view);
        }
        return zzfvuVar;
    }

    public final boolean zzj(View view) {
        Map map = this.zzi;
        if (!map.containsKey(view)) {
            return true;
        }
        map.put(view, true);
        return false;
    }

    public final boolean zzk(String str) {
        return this.zzh.contains(str);
    }

    public final int zzl(View view) {
        if (this.zzd.contains(view)) {
            return 1;
        }
        return this.zzj ? 2 : 3;
    }
}
