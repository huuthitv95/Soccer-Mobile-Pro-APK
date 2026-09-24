package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdqc extends zzblv implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdre {
    public static final zzgvz zza = zzgvz.zzl("2011", "1009", "3010");
    private final String zzb;
    private FrameLayout zzd;
    private FrameLayout zze;
    private final zzhbs zzf;
    private View zzg;
    private zzdpc zzi;
    private zzbeg zzj;
    private zzblp zzl;
    private boolean zzm;
    private GestureDetector zzo;
    private Map zzc = new HashMap();
    private IObjectWrapper zzk = null;
    private boolean zzn = false;
    private final int zzh = ModuleDescriptor.MODULE_VERSION;

    public zzdqc(FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        String str;
        this.zzd = frameLayout;
        this.zze = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.zzb = str;
        com.google.android.gms.ads.internal.zzt.zzC();
        zzcfs.zza(frameLayout, this);
        com.google.android.gms.ads.internal.zzt.zzC();
        zzcfs.zzb(frameLayout, this);
        this.zzf = zzcff.zzf;
        this.zzj = new zzbeg(this.zzd.getContext(), this.zzd);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void zzs() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmW)).booleanValue() || this.zzi.zzG() == 0) {
            return;
        }
        this.zzo = new GestureDetector(this.zzd.getContext(), new zzdqk(this.zzi, this));
    }

    private final synchronized void zzt() {
        this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzr();
            }
        });
    }

    private final synchronized void zzu(String str) {
        DisplayMetrics displayMetrics;
        FrameLayout frameLayout = new FrameLayout(this.zze.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = this.zze.getContext();
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        if (!TextUtils.isEmpty(str)) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            Resources resources = context.getResources();
            if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                try {
                    byte[] bArrDecode = Base64.decode(str, 0);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
                    bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                    bitmapDrawable.setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
                    frameLayout.setBackground(bitmapDrawable);
                } catch (IllegalArgumentException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Encountered invalid base64 watermark.", e);
                }
            }
        }
        this.zze.addView(frameLayout);
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdpc zzdpcVar = this.zzi;
        if (zzdpcVar == null || !zzdpcVar.zzH()) {
            return;
        }
        this.zzi.zzz();
        this.zzi.zzi(view, this.zzd, zzi(), zzj(), false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdpc zzdpcVar = this.zzi;
        if (zzdpcVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdpcVar.zzu(frameLayout, zzi(), zzj(), zzdpc.zzI(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdpc zzdpcVar = this.zzi;
        if (zzdpcVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdpcVar.zzu(frameLayout, zzi(), zzj(), zzdpc.zzI(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdpc zzdpcVar = this.zzi;
        if (zzdpcVar != null) {
            zzdpcVar.zzk(view, motionEvent, this.zzd);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmW)).booleanValue() && this.zzo != null && this.zzi.zzG() != 0) {
                this.zzo.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzblw
    public final synchronized void zzb(String str, IObjectWrapper iObjectWrapper) {
        zzh(str, (View) ObjectWrapper.unwrap(iObjectWrapper), true);
    }

    @Override // com.google.android.gms.internal.ads.zzblw
    public final synchronized IObjectWrapper zzc(String str) {
        return ObjectWrapper.wrap(zzl(str));
    }

    @Override // com.google.android.gms.internal.ads.zzblw
    public final synchronized void zzd(IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof zzdpc)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        zzdpc zzdpcVar = this.zzi;
        if (zzdpcVar != null) {
            zzdpcVar.zzh(this);
        }
        zzt();
        zzdpc zzdpcVar2 = (zzdpc) objUnwrap;
        this.zzi = zzdpcVar2;
        zzdpcVar2.zzg(this);
        this.zzi.zzN(this.zzd);
        this.zzi.zzO(this.zze);
        if (this.zzm) {
            this.zzi.zzP().zzb(this.zzl);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeN)).booleanValue() && !TextUtils.isEmpty(this.zzi.zzK())) {
            zzu(this.zzi.zzK());
        }
        zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    public final FrameLayout zzdA() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzblw
    public final synchronized void zzdB(IObjectWrapper iObjectWrapper) {
        this.zzi.zzx((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzblw
    public final synchronized void zzdC(IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        this.zzk = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzblw
    public final void zzdD(IObjectWrapper iObjectWrapper) {
        onTouch(this.zzd, (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzblw
    public final synchronized void zzdE(zzblp zzblpVar) {
        if (!this.zzn) {
            this.zzm = true;
            this.zzl = zzblpVar;
            zzdpc zzdpcVar = this.zzi;
            if (zzdpcVar != null) {
                zzdpcVar.zzP().zzb(zzblpVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    public final /* synthetic */ View zzdF() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzblw
    public final synchronized void zze() {
        if (this.zzn) {
            return;
        }
        zzdpc zzdpcVar = this.zzi;
        if (zzdpcVar != null) {
            zzdpcVar.zzh(this);
            this.zzi = null;
        }
        this.zzc.clear();
        this.zzd.removeAllViews();
        this.zze.removeAllViews();
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzg = null;
        this.zzj = null;
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzblw
    public final synchronized void zzf(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    public final zzbeg zzg() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    public final synchronized void zzh(String str, View view, boolean z) {
        if (!this.zzn) {
            if (view == null) {
                this.zzc.remove(str);
                return;
            }
            this.zzc.put(str, new WeakReference(view));
            if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
                if (com.google.android.gms.ads.internal.util.zzbs.zza(this.zzh)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    public final synchronized Map zzi() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    public final synchronized Map zzj() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    public final synchronized Map zzk() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    public final synchronized View zzl(String str) {
        WeakReference weakReference;
        if (!this.zzn && (weakReference = (WeakReference) this.zzc.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    public final synchronized String zzm() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    public final IObjectWrapper zzn() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    public final synchronized JSONObject zzo() {
        zzdpc zzdpcVar = this.zzi;
        if (zzdpcVar == null) {
            return null;
        }
        return zzdpcVar.zzv(this.zzd, zzi(), zzj());
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    public final synchronized JSONObject zzp() {
        zzdpc zzdpcVar = this.zzi;
        if (zzdpcVar == null) {
            return null;
        }
        return zzdpcVar.zzw(this.zzd, zzi(), zzj());
    }

    public final FrameLayout zzq() {
        return this.zzd;
    }

    final /* synthetic */ void zzr() {
        if (this.zzg == null) {
            View view = new View(this.zzd.getContext());
            this.zzg = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.zzd != this.zzg.getParent()) {
            this.zzd.addView(this.zzg);
        }
    }
}
