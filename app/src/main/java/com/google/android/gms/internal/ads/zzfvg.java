package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfvg implements zzfve {
    private final zzfve zza;

    public zzfvg(zzfve zzfveVar) {
        this.zza = zzfveVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfve
    public final JSONObject zza(View view) {
        JSONObject jSONObjectZzb = zzfvo.zzb(0, 0, 0, 0);
        int iZzb = zzfvr.zzb();
        int i = iZzb - 1;
        if (iZzb == 0) {
            throw null;
        }
        try {
            jSONObjectZzb.put("noOutputDevice", i == 0);
            return jSONObjectZzb;
        } catch (JSONException e) {
            zzfvp.zza("Error with setting output device status", e);
            return jSONObjectZzb;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfve
    public final void zzb(View view, JSONObject jSONObject, zzfvd zzfvdVar, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        zzfus zzfusVarZza = zzfus.zza();
        if (zzfusVarZza != null) {
            Collection collectionZzf = zzfusVarZza.zzf();
            int size = collectionZzf.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = collectionZzf.iterator();
            while (it.hasNext()) {
                View viewZzi = ((zzfty) it.next()).zzi();
                if (viewZzi != null && viewZzi.isAttachedToWindow() && viewZzi.isShown()) {
                    View view2 = viewZzi;
                    while (true) {
                        if (view2 == null) {
                            View rootView = viewZzi.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z3 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i = size2 - 1;
                                    if (((View) arrayList.get(i)).getZ() <= z3) {
                                        break;
                                    } else {
                                        size2 = i;
                                    }
                                }
                                arrayList.add(size2, rootView);
                                break;
                            }
                            break;
                        }
                        if (view2.getAlpha() == 0.0f) {
                            break;
                        }
                        Object parent = view2.getParent();
                        view2 = parent instanceof View ? (View) parent : null;
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            zzfvdVar.zza((View) arrayList.get(i2), this.zza, jSONObject, z2);
        }
    }
}
