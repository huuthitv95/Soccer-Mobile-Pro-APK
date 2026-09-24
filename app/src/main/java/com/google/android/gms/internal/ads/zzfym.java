package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfym {
    final zzfyp zza;
    final boolean zzb;

    private zzfym(zzfyp zzfypVar) {
        this.zza = zzfypVar;
        this.zzb = zzfypVar != null;
    }

    public static zzfym zzb(Context context, String str, String str2) {
        zzfyp zzfynVar;
        try {
            try {
                try {
                    IBinder iBinderInstantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    IBinder iBinder = iBinderInstantiate;
                    if (iBinderInstantiate == null) {
                        zzfynVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderInstantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzfynVar = iInterfaceQueryLocalInterface instanceof zzfyp ? (zzfyp) iInterfaceQueryLocalInterface : new zzfyn(iBinderInstantiate);
                    }
                    zzfyp zzfypVar = zzfynVar;
                    zzfynVar.zzj(ObjectWrapper.wrap(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzfym(zzfynVar);
                } catch (RemoteException | zzfxp | NullPointerException | SecurityException unused) {
                    Log.d("GASS", "Cannot dynamite load clearcut");
                    return new zzfym(new zzfyq());
                }
            } catch (Exception e) {
                throw new zzfxp(e);
            }
        } catch (Exception e2) {
            throw new zzfxp(e2);
        }
    }

    public static zzfym zzc() {
        zzfyq zzfyqVar = new zzfyq();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfym(zzfyqVar);
    }

    public final zzfyl zza(byte[] bArr) {
        return new zzfyl(this, bArr, null);
    }
}
