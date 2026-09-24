package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.CollectionUtils;
import com.ironsource.C11744X3;
import com.unity3d.ads.BuildConfig;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbxo extends zzbxu {
    private String zza;
    private boolean zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final Object zzi;
    private final zzcki zzj;
    private final Activity zzk;
    private zzcms zzl;
    private ImageView zzm;
    private LinearLayout zzn;
    private final zzbxv zzo;
    private PopupWindow zzp;
    private RelativeLayout zzq;
    private ViewGroup zzr;

    static {
        CollectionUtils.setOf(C11744X3.e.f26238c, C11744X3.e.f26237b, "top-center", "center", C11744X3.e.f26240e, C11744X3.e.f26239d, "bottom-center");
    }

    public zzbxo(zzcki zzckiVar, zzbxv zzbxvVar) {
        super(zzckiVar, "resize");
        this.zza = C11744X3.e.f26237b;
        this.zzb = true;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = -1;
        this.zzi = new Object();
        this.zzj = zzckiVar;
        this.zzk = zzckiVar.zzj();
        this.zzo = zzbxvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzf(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmj)).booleanValue()) {
            this.zzq.removeView((View) this.zzj);
            this.zzp.dismiss();
        } else {
            this.zzp.dismiss();
            this.zzq.removeView((View) this.zzj);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmk)).booleanValue()) {
            View view = (View) this.zzj;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.zzr;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzm);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzml)).booleanValue()) {
                try {
                    ViewGroup viewGroup2 = this.zzr;
                    zzcki zzckiVar = this.zzj;
                    viewGroup2.addView((View) zzckiVar);
                    zzckiVar.zzaf(this.zzl);
                } catch (IllegalStateException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to add webview back to view hierarchy.", e);
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "MraidCallResizeHandler.collapseInternal");
                }
            } else {
                ViewGroup viewGroup3 = this.zzr;
                zzcki zzckiVar2 = this.zzj;
                viewGroup3.addView((View) zzckiVar2);
                zzckiVar2.zzaf(this.zzl);
            }
        }
        if (z) {
            zzk(BuildConfig.FLAVOR);
            zzbxv zzbxvVar = this.zzo;
            if (zzbxvVar != null) {
                zzbxvVar.zzb();
            }
        }
        this.zzp = null;
        this.zzq = null;
        this.zzr = null;
        this.zzn = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:85:0x0187  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zza(Map map) {
        int i;
        int i2;
        byte b;
        int i3;
        int i4;
        int i5;
        int i6;
        synchronized (this.zzi) {
            Activity activity = this.zzk;
            if (activity == null) {
                zzg("Not an activity context. Cannot resize.");
                return;
            }
            zzcki zzckiVar = this.zzj;
            if (zzckiVar.zzN() == null) {
                zzg("Webview is not yet available, size is not set.");
                return;
            }
            if (zzckiVar.zzN().zzg()) {
                zzg("Is interstitial. Cannot resize an interstitial.");
                return;
            }
            if (zzckiVar.zzW()) {
                zzg("Cannot resize an expanded banner.");
                return;
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                com.google.android.gms.ads.internal.zzt.zzc();
                this.zzh = com.google.android.gms.ads.internal.util.zzs.zzS((String) map.get("width"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                com.google.android.gms.ads.internal.zzt.zzc();
                this.zze = com.google.android.gms.ads.internal.util.zzs.zzS((String) map.get("height"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                com.google.android.gms.ads.internal.zzt.zzc();
                this.zzf = com.google.android.gms.ads.internal.util.zzs.zzS((String) map.get("offsetX"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                com.google.android.gms.ads.internal.zzt.zzc();
                this.zzg = com.google.android.gms.ads.internal.util.zzs.zzS((String) map.get("offsetY"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                this.zzb = Boolean.parseBoolean((String) map.get("allowOffscreen"));
            }
            String str = (String) map.get("customClosePosition");
            if (!TextUtils.isEmpty(str)) {
                this.zza = str;
            }
            if (this.zzh < 0 || this.zze < 0) {
                zzg("Invalid width and height options. Cannot resize.");
                return;
            }
            Window window = activity.getWindow();
            if (window != null && window.getDecorView() != null) {
                com.google.android.gms.ads.internal.zzt.zzc();
                int[] iArrZzaa = com.google.android.gms.ads.internal.util.zzs.zzaa(activity);
                com.google.android.gms.ads.internal.zzt.zzc();
                int[] iArrZzW = com.google.android.gms.ads.internal.util.zzs.zzW(activity);
                int i7 = iArrZzaa[0];
                int i8 = iArrZzaa[1];
                int i9 = this.zzh;
                int[] iArr = null;
                if (i9 < 50 || i9 > i7) {
                    i = 50;
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Width is too small or too large.");
                } else {
                    int i11 = this.zze;
                    if (i11 < 50 || i11 > i8) {
                        i = 50;
                        int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Height is too small or too large.");
                    } else if (i11 == i8 && i9 == i7) {
                        int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot resize to a full-screen ad.");
                        i = 50;
                    } else {
                        boolean z = this.zzb;
                        if (z) {
                            i = 50;
                            switch (this.zza) {
                                case "center":
                                    b = 2;
                                    break;
                                case "top-left":
                                    b = 0;
                                    break;
                                case "bottom-left":
                                    b = 3;
                                    break;
                                case "bottom-right":
                                    b = 5;
                                    break;
                                case "bottom-center":
                                    b = 4;
                                    break;
                                case "top-center":
                                    b = 1;
                                    break;
                                default:
                                    b = -1;
                                    break;
                            }
                            if (b == 0) {
                                i3 = this.zzc + this.zzf;
                                i4 = this.zzd;
                            } else if (b != 1) {
                                if (b != 2) {
                                    if (b == 3) {
                                        i3 = this.zzc + this.zzf;
                                        i6 = this.zzd;
                                    } else if (b == 4) {
                                        i3 = ((this.zzc + this.zzf) + (i9 >> 1)) - 25;
                                        i6 = this.zzd;
                                    } else if (b != 5) {
                                        i3 = ((this.zzc + this.zzf) + i9) - 50;
                                        i4 = this.zzd;
                                    } else {
                                        i3 = ((this.zzc + this.zzf) + i9) - 50;
                                        i6 = this.zzd;
                                    }
                                    i5 = ((i6 + this.zzg) + i11) - 50;
                                } else {
                                    i3 = ((this.zzc + this.zzf) + (i9 >> 1)) - 25;
                                    i5 = ((this.zzd + this.zzg) + (i11 >> 1)) - 25;
                                }
                                if (i3 >= 0 && i3 + 50 <= i7 && i5 >= iArrZzW[0] && i5 + 50 <= iArrZzW[1]) {
                                }
                            } else {
                                i3 = ((this.zzc + this.zzf) + (i9 >> 1)) - 25;
                                i4 = this.zzd;
                            }
                            i5 = i4 + this.zzg;
                            if (i3 >= 0) {
                            }
                        } else {
                            i = 50;
                        }
                        if (z) {
                            iArr = new int[]{this.zzc + this.zzf, this.zzd + this.zzg};
                        } else {
                            com.google.android.gms.ads.internal.zzt.zzc();
                            int[] iArrZzaa2 = com.google.android.gms.ads.internal.util.zzs.zzaa(activity);
                            com.google.android.gms.ads.internal.zzt.zzc();
                            int[] iArrZzW2 = com.google.android.gms.ads.internal.util.zzs.zzW(activity);
                            int i14 = iArrZzaa2[0];
                            int i15 = this.zzc + this.zzf;
                            int i16 = this.zzd + this.zzg;
                            if (i15 < 0) {
                                i2 = 0;
                            } else {
                                int i17 = this.zzh;
                                i2 = i15 + i17 > i14 ? i14 - i17 : i15;
                            }
                            int i18 = iArrZzW2[0];
                            if (i16 < i18) {
                                i16 = i18;
                            } else {
                                int i19 = this.zze;
                                int i20 = i16 + i19;
                                int i21 = iArrZzW2[1];
                                if (i20 > i21) {
                                    i16 = i21 - i19;
                                }
                            }
                            iArr = new int[]{i2, i16};
                        }
                    }
                }
                if (iArr == null) {
                    zzg("Resize location out of screen or close button is not visible.");
                    return;
                }
                com.google.android.gms.ads.internal.client.zzay.zza();
                int iZzE = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, this.zzh);
                com.google.android.gms.ads.internal.client.zzay.zza();
                int iZzE2 = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, this.zze);
                ViewParent parent = ((View) zzckiVar).getParent();
                if (!(parent instanceof ViewGroup)) {
                    zzg("Webview is detached, probably in the middle of a resize or expand.");
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                viewGroup.removeView((View) zzckiVar);
                PopupWindow popupWindow = this.zzp;
                if (popupWindow == null) {
                    this.zzr = viewGroup;
                    com.google.android.gms.ads.internal.zzt.zzc();
                    ((View) zzckiVar).setDrawingCacheEnabled(true);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((View) zzckiVar).getDrawingCache());
                    ((View) zzckiVar).setDrawingCacheEnabled(false);
                    ImageView imageView = new ImageView(activity);
                    this.zzm = imageView;
                    imageView.setImageBitmap(bitmapCreateBitmap);
                    this.zzl = zzckiVar.zzN();
                    this.zzr.addView(this.zzm);
                } else {
                    popupWindow.dismiss();
                }
                RelativeLayout relativeLayout = new RelativeLayout(activity);
                this.zzq = relativeLayout;
                relativeLayout.setBackgroundColor(0);
                this.zzq.setLayoutParams(new ViewGroup.LayoutParams(iZzE, iZzE2));
                com.google.android.gms.ads.internal.zzt.zzc();
                PopupWindow popupWindow2 = new PopupWindow((View) this.zzq, iZzE, iZzE2, false);
                this.zzp = popupWindow2;
                popupWindow2.setOutsideTouchable(false);
                this.zzp.setTouchable(true);
                this.zzp.setClippingEnabled(!this.zzb);
                byte b2 = -1;
                this.zzq.addView((View) zzckiVar, -1, -1);
                this.zzn = new LinearLayout(activity);
                com.google.android.gms.ads.internal.client.zzay.zza();
                int i22 = i;
                int iZzE3 = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, i22);
                com.google.android.gms.ads.internal.client.zzay.zza();
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iZzE3, com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, i22));
                String str2 = this.zza;
                switch (str2.hashCode()) {
                    case -1364013995:
                        if (str2.equals("center")) {
                            b2 = 2;
                        }
                        break;
                    case -1012429441:
                        if (str2.equals(C11744X3.e.f26238c)) {
                            b2 = 0;
                        }
                        break;
                    case -655373719:
                        if (str2.equals(C11744X3.e.f26240e)) {
                            b2 = 3;
                        }
                        break;
                    case 1163912186:
                        if (str2.equals(C11744X3.e.f26239d)) {
                            b2 = 5;
                        }
                        break;
                    case 1288627767:
                        if (str2.equals("bottom-center")) {
                            b2 = 4;
                        }
                        break;
                    case 1755462605:
                        if (str2.equals("top-center")) {
                            b2 = 1;
                        }
                        break;
                }
                if (b2 == 0) {
                    layoutParams.addRule(10);
                    layoutParams.addRule(9);
                } else if (b2 == 1) {
                    layoutParams.addRule(10);
                    layoutParams.addRule(14);
                } else if (b2 == 2) {
                    layoutParams.addRule(13);
                } else if (b2 == 3) {
                    layoutParams.addRule(12);
                    layoutParams.addRule(9);
                } else if (b2 == 4) {
                    layoutParams.addRule(12);
                    layoutParams.addRule(14);
                } else if (b2 != 5) {
                    layoutParams.addRule(10);
                    layoutParams.addRule(11);
                } else {
                    layoutParams.addRule(12);
                    layoutParams.addRule(11);
                }
                this.zzn.setOnClickListener(new zzbxm(this));
                this.zzn.setContentDescription("Close button");
                this.zzq.addView(this.zzn, layoutParams);
                try {
                    PopupWindow popupWindow3 = this.zzp;
                    View decorView = window.getDecorView();
                    com.google.android.gms.ads.internal.client.zzay.zza();
                    int iZzE4 = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, iArr[0]);
                    com.google.android.gms.ads.internal.client.zzay.zza();
                    popupWindow3.showAtLocation(decorView, 0, iZzE4, com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, iArr[1]));
                    int i23 = iArr[0];
                    int i24 = iArr[1];
                    zzbxv zzbxvVar = this.zzo;
                    if (zzbxvVar != null) {
                        zzbxvVar.zza(i23, i24, this.zzh, this.zze);
                    }
                    this.zzj.zzaf(zzcms.zzc(iZzE, iZzE2));
                    int i25 = iArr[0];
                    int i26 = iArr[1];
                    com.google.android.gms.ads.internal.zzt.zzc();
                    zzi(i25, i26 - com.google.android.gms.ads.internal.util.zzs.zzW(this.zzk)[0], this.zzh, this.zze);
                    zzk("resized");
                    return;
                } catch (RuntimeException e) {
                    String message = e.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 26);
                    sb.append("Cannot show popup window: ");
                    sb.append(message);
                    zzg(sb.toString());
                    RelativeLayout relativeLayout2 = this.zzq;
                    zzcki zzckiVar2 = this.zzj;
                    relativeLayout2.removeView((View) zzckiVar2);
                    ViewGroup viewGroup2 = this.zzr;
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(this.zzm);
                        this.zzr.addView((View) zzckiVar2);
                        zzckiVar2.zzaf(this.zzl);
                    }
                    return;
                }
            }
            zzg("Activity context is not ready, cannot get window or decor view.");
        }
    }

    public final void zzb(final boolean z) {
        synchronized (this.zzi) {
            if (this.zzp != null) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmi)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    zzf(z);
                } else {
                    zzcff.zzf.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbxn
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzf(z);
                        }
                    });
                }
            }
        }
    }

    public final void zzc(int i, int i2, boolean z) {
        synchronized (this.zzi) {
            this.zzc = i;
            this.zzd = i2;
        }
    }

    public final boolean zzd() {
        boolean z;
        synchronized (this.zzi) {
            z = this.zzp != null;
        }
        return z;
    }

    public final void zze(int i, int i2) {
        this.zzc = i;
        this.zzd = i2;
    }
}
