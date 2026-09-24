package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgre {
    public static final /* synthetic */ int zzb = 0;
    private static final zzgrw zzc = new zzgrw("OverlayDisplayService");
    private static final Intent zzd = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    final zzgrv zza;
    private final String zze;

    zzgre(Context context) {
        if (zzgry.zza(context)) {
            this.zza = new zzgrv(context.getApplicationContext(), zzc, "OverlayDisplayService", zzd, zzgqp.zza);
        } else {
            this.zza = null;
        }
        this.zze = context.getPackageName();
    }

    private static boolean zzh(String str) {
        return zzgtn.zza(str).trim().isEmpty();
    }

    private static void zzi(String str, zzgrd zzgrdVar) {
        if (zzh(str)) {
            return;
        }
        str.getClass();
        zzgrdVar.zza(str.trim());
    }

    private static boolean zzj(zzgrj zzgrjVar, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!zzh((String) it.next())) {
                return true;
            }
        }
        zzc.zzc(str, new Object[0]);
        zzgrh zzgrhVarZzd = zzgri.zzd();
        zzgrhVarZzd.zzc(0);
        zzgrhVarZzd.zza(8160);
        zzgrjVar.zza(zzgrhVarZzd.zzd());
        return false;
    }

    final void zza(final zzgrg zzgrgVar, final zzgrj zzgrjVar) {
        zzgrv zzgrvVar = this.zza;
        if (zzgrvVar == null) {
            zzc.zzc("error: %s", "Play Store not found.");
        } else if (zzj(zzgrjVar, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(null, zzgrgVar.zzb()))) {
            zzgrvVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgrb
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zze(zzgrgVar, zzgrjVar);
                }
            });
        }
    }

    final void zzb(final zzgql zzgqlVar, final zzgrj zzgrjVar) {
        zzgrv zzgrvVar = this.zza;
        if (zzgrvVar == null) {
            zzc.zzc("error: %s", "Play Store not found.");
        } else if (zzj(zzgrjVar, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", Arrays.asList(zzgqlVar.zza(), zzgqlVar.zzb()))) {
            zzgrvVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgqq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzf(zzgqlVar, zzgrjVar);
                }
            });
        }
    }

    final void zzc(final zzgrl zzgrlVar, final zzgrj zzgrjVar, final int i) {
        zzgrv zzgrvVar = this.zza;
        if (zzgrvVar == null) {
            zzc.zzc("error: %s", "Play Store not found.");
        } else if (zzj(zzgrjVar, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(zzgrlVar.zza(), zzgrlVar.zzb()))) {
            zzgrvVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgqs
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzg(zzgrlVar, i, zzgrjVar);
                }
            });
        }
    }

    final void zzd() {
        zzgrv zzgrvVar = this.zza;
        if (zzgrvVar == null) {
            return;
        }
        zzc.zza("unbind LMD display overlay service", new Object[0]);
        zzgrvVar.zzb();
    }

    final /* synthetic */ void zze(zzgrg zzgrgVar, zzgrj zzgrjVar) {
        try {
            zzgrv zzgrvVar = this.zza;
            if (zzgrvVar == null) {
                throw null;
            }
            zzgpz zzgpzVar = (zzgpz) zzgrvVar.zzc();
            if (zzgpzVar == null) {
                return;
            }
            String str = this.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putBinder("windowToken", zzgrgVar.zza());
            zzi(zzgrgVar.zzj(), new zzgrd() { // from class: com.google.android.gms.internal.ads.zzgqt
                @Override // com.google.android.gms.internal.ads.zzgrd
                public final /* synthetic */ void zza(String str2) {
                    int i = zzgre.zzb;
                    bundle.putString("adFieldEnifd", str2);
                }
            });
            bundle.putInt("layoutGravity", zzgrgVar.zzc());
            bundle.putFloat("layoutVerticalMargin", zzgrgVar.zzd());
            bundle.putInt("displayMode", 0);
            bundle.putInt("triggerMode", 0);
            bundle.putInt("windowWidthPx", zzgrgVar.zzh());
            zzi(null, new zzgrd() { // from class: com.google.android.gms.internal.ads.zzgqu
                @Override // com.google.android.gms.internal.ads.zzgrd
                public final /* synthetic */ void zza(String str2) {
                    int i = zzgre.zzb;
                    bundle.putString("deeplinkUrl", str2);
                }
            });
            zzi(null, new zzgrd() { // from class: com.google.android.gms.internal.ads.zzgqv
                @Override // com.google.android.gms.internal.ads.zzgrd
                public final /* synthetic */ void zza(String str2) {
                    int i = zzgre.zzb;
                    bundle.putString("sessionToken", str2);
                }
            });
            zzi(zzgrgVar.zzb(), new zzgrd() { // from class: com.google.android.gms.internal.ads.zzgqw
                @Override // com.google.android.gms.internal.ads.zzgrd
                public final /* synthetic */ void zza(String str2) {
                    int i = zzgre.zzb;
                    bundle.putString(RemoteConfigConstants.RequestFieldKey.APP_ID, str2);
                }
            });
            zzi(null, new zzgrd() { // from class: com.google.android.gms.internal.ads.zzgqx
                @Override // com.google.android.gms.internal.ads.zzgrd
                public final /* synthetic */ void zza(String str2) {
                    int i = zzgre.zzb;
                    bundle.putString("thirdPartyAuthCallerId", str2);
                }
            });
            bundle.putBoolean("stableSessionToken", true);
            zzgpzVar.zze(str, bundle, new zzgrc(this, zzgrjVar));
        } catch (RemoteException e) {
            zzc.zzd(e, "show overlay display from: %s", this.zze);
        }
    }

    final /* synthetic */ void zzf(zzgql zzgqlVar, zzgrj zzgrjVar) {
        try {
            zzgrv zzgrvVar = this.zza;
            if (zzgrvVar == null) {
                throw null;
            }
            zzgpz zzgpzVar = (zzgpz) zzgrvVar.zzc();
            if (zzgpzVar == null) {
                return;
            }
            String str = this.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            zzi(zzgqlVar.zza(), new zzgrd() { // from class: com.google.android.gms.internal.ads.zzgqy
                @Override // com.google.android.gms.internal.ads.zzgrd
                public final /* synthetic */ void zza(String str2) {
                    int i = zzgre.zzb;
                    bundle.putString("sessionToken", str2);
                }
            });
            zzi(zzgqlVar.zzb(), new zzgrd() { // from class: com.google.android.gms.internal.ads.zzgqz
                @Override // com.google.android.gms.internal.ads.zzgrd
                public final /* synthetic */ void zza(String str2) {
                    int i = zzgre.zzb;
                    bundle.putString(RemoteConfigConstants.RequestFieldKey.APP_ID, str2);
                }
            });
            zzgpzVar.zzf(bundle, new zzgrc(this, zzgrjVar));
        } catch (RemoteException e) {
            zzc.zzd(e, "dismiss overlay display from: %s", this.zze);
        }
    }

    final /* synthetic */ void zzg(zzgrl zzgrlVar, int i, zzgrj zzgrjVar) {
        try {
            zzgrv zzgrvVar = this.zza;
            if (zzgrvVar == null) {
                throw null;
            }
            zzgpz zzgpzVar = (zzgpz) zzgrvVar.zzc();
            if (zzgpzVar == null) {
                return;
            }
            String str = this.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putInt("displayMode", i);
            zzi(zzgrlVar.zza(), new zzgrd() { // from class: com.google.android.gms.internal.ads.zzgra
                @Override // com.google.android.gms.internal.ads.zzgrd
                public final /* synthetic */ void zza(String str2) {
                    int i2 = zzgre.zzb;
                    bundle.putString("sessionToken", str2);
                }
            });
            zzi(zzgrlVar.zzb(), new zzgrd() { // from class: com.google.android.gms.internal.ads.zzgqr
                @Override // com.google.android.gms.internal.ads.zzgrd
                public final /* synthetic */ void zza(String str2) {
                    int i2 = zzgre.zzb;
                    bundle.putString(RemoteConfigConstants.RequestFieldKey.APP_ID, str2);
                }
            });
            zzgpzVar.zzg(bundle, new zzgrc(this, zzgrjVar));
        } catch (RemoteException e) {
            zzc.zzd(e, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i), this.zze);
        }
    }
}
