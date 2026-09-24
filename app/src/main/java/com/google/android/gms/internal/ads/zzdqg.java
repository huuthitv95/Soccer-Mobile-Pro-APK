package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdqg {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzfkm zzc;
    private final zzdpm zzd;
    private final zzdph zze;
    private final zzdqu zzf;
    private final zzdrc zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzblh zzj;
    private final zzdpe zzk;

    public zzdqg(com.google.android.gms.ads.internal.util.zzg zzgVar, zzfkm zzfkmVar, zzdpm zzdpmVar, zzdph zzdphVar, zzdqu zzdquVar, zzdrc zzdrcVar, Executor executor, Executor executor2, zzdpe zzdpeVar) {
        this.zzb = zzgVar;
        this.zzc = zzfkmVar;
        this.zzj = zzfkmVar.zzj;
        this.zzd = zzdpmVar;
        this.zze = zzdphVar;
        this.zzf = zzdquVar;
        this.zzg = zzdrcVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdpeVar;
    }

    private final boolean zzi(ViewGroup viewGroup, boolean z) {
        View viewZzJ = z ? this.zze.zzJ() : this.zze.zzK();
        if (viewZzJ == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (viewZzJ.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewZzJ.getParent()).removeView(viewZzJ);
        }
        viewGroup.addView(viewZzJ, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeK)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    public final void zza(final zzdre zzdreVar) {
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf(zzdreVar);
            }
        });
    }

    public final void zzb(zzdre zzdreVar) {
        zzdqu zzdquVar;
        if (zzdreVar == null || (zzdquVar = this.zzf) == null || zzdreVar.zzdA() == null || !this.zzd.zzb()) {
            return;
        }
        try {
            zzdreVar.zzdA().addView(zzdquVar.zza());
        } catch (zzckx e) {
            com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
        }
    }

    public final void zzc(zzdre zzdreVar) {
        if (zzdreVar == null) {
            return;
        }
        Context context = zzdreVar.zzdF().getContext();
        if (com.google.android.gms.ads.internal.util.zzbs.zzi(context, this.zzd.zza)) {
            if (!(context instanceof Activity)) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Activity context is needed for policy validator.");
                return;
            }
            zzdrc zzdrcVar = this.zzg;
            if (zzdrcVar == null || zzdreVar.zzdA() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(zzdrcVar.zza(zzdreVar.zzdA(), windowManager), com.google.android.gms.ads.internal.util.zzbs.zzk());
            } catch (zzckx e) {
                com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
            }
        }
    }

    public final boolean zzd(ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }

    public final boolean zze(ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    /* JADX WARN: Code duplicated, block: B:80:0x018f  */
    final /* synthetic */ void zzf(zzdre zzdreVar) {
        ViewGroup viewGroup;
        View viewZzA;
        final ViewGroup viewGroup2;
        zzblp zzblpVarZza;
        Drawable drawable;
        zzdpm zzdpmVar = this.zzd;
        if (!zzdpmVar.zze() && !zzdpmVar.zzc()) {
            viewGroup = null;
            break;
        }
        String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
        int i = 0;
        while (true) {
            if (i >= 2) {
                viewGroup = null;
                break;
            }
            View viewZzl = zzdreVar.zzl(strArr[i]);
            if (viewZzl instanceof ViewGroup) {
                viewGroup = (ViewGroup) viewZzl;
                break;
            }
            i++;
        }
        Context context = zzdreVar.zzdF().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdph zzdphVar = this.zze;
        if (zzdphVar.zzA() != null) {
            viewZzA = zzdphVar.zzA();
            zzblh zzblhVar = this.zzj;
            if (zzblhVar != null && viewGroup == null) {
                zzh(layoutParams, zzblhVar.zze);
                viewZzA.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (zzdphVar.zzz() instanceof zzbla) {
            zzbla zzblaVar = (zzbla) zzdphVar.zzz();
            if (viewGroup == null) {
                zzh(layoutParams, zzblaVar.zzi());
                viewGroup = null;
            }
            View zzblbVar = new zzblb(context, zzblaVar, layoutParams);
            zzblbVar.setContentDescription((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeI));
            viewZzA = zzblbVar;
        } else {
            viewZzA = null;
        }
        if (viewZzA != null) {
            if (viewZzA.getParent() instanceof ViewGroup) {
                ((ViewGroup) viewZzA.getParent()).removeView(viewZzA);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(viewZzA);
            } else {
                com.google.android.gms.ads.formats.zza zzaVar = new com.google.android.gms.ads.formats.zza(zzdreVar.zzdF().getContext());
                zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(viewZzA);
                FrameLayout frameLayoutZzdA = zzdreVar.zzdA();
                if (frameLayoutZzdA != null) {
                    frameLayoutZzdA.addView(zzaVar);
                }
            }
            zzdreVar.zzh(zzdreVar.zzm(), viewZzA, true);
        }
        zzgvz zzgvzVar = zzdqc.zza;
        int size = zzgvzVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewGroup2 = null;
                break;
            }
            View viewZzl2 = zzdreVar.zzl((String) zzgvzVar.get(i2));
            i2++;
            if (viewZzl2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) viewZzl2;
                break;
            }
        }
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqe
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzg(viewGroup2);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (zzi(viewGroup2, true)) {
            if (zzdphVar.zzT() != null) {
                zzdphVar.zzT().zzaq(new zzdqd(zzdreVar, viewGroup2));
                return;
            }
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlt)).booleanValue() && zzi(viewGroup2, false)) {
            if (zzdphVar.zzU() != null) {
                zzdphVar.zzU().zzaq(new zzdqd(zzdreVar, viewGroup2));
                return;
            }
            return;
        }
        viewGroup2.removeAllViews();
        View viewZzdF = zzdreVar.zzdF();
        Context context2 = viewZzdF != null ? viewZzdF.getContext() : null;
        if (context2 == null || (zzblpVarZza = this.zzk.zza()) == null) {
            return;
        }
        try {
            IObjectWrapper iObjectWrapperZzg = zzblpVarZza.zzg();
            if (iObjectWrapperZzg == null || (drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapperZzg)) == null) {
                return;
            }
            ImageView imageView = new ImageView(context2);
            imageView.setImageDrawable(drawable);
            IObjectWrapper iObjectWrapperZzn = zzdreVar.zzn();
            if (iObjectWrapperZzn == null) {
                imageView.setScaleType(zza);
            } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhg)).booleanValue()) {
                imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.unwrap(iObjectWrapperZzn));
            } else {
                imageView.setScaleType(zza);
            }
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup2.addView(imageView);
        } catch (RemoteException unused) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not get main image drawable");
        }
    }

    final /* synthetic */ void zzg(ViewGroup viewGroup) {
        zzdph zzdphVar = this.zze;
        if (zzdphVar.zzJ() != null) {
            boolean z = viewGroup != null;
            if (zzdphVar.zzx() == 2 || zzdphVar.zzx() == 1) {
                this.zzb.zzr(this.zzc.zzg, String.valueOf(zzdphVar.zzx()), z);
            } else if (zzdphVar.zzx() == 6) {
                com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzb;
                String str = this.zzc.zzg;
                zzgVar.zzr(str, "2", z);
                zzgVar.zzr(str, "1", z);
            }
        }
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }
}
