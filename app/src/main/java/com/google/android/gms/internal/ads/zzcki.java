package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
@ParametersAreNonnullByDefault
public interface zzcki extends com.google.android.gms.ads.internal.client.zza, zzdkm, zzcjz, zzbsa, zzclp, zzclu, zzbsm, zzbee, zzcly, com.google.android.gms.ads.internal.zzn, zzcmb, zzcmc, zzchb, zzcmd {
    boolean canGoBack();

    void destroy();

    @Override // com.google.android.gms.internal.ads.zzclu, com.google.android.gms.internal.ads.zzchb
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    boolean isAttachedToWindow();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i, int i2);

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzchb
    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    @Override // com.google.android.gms.internal.ads.zzcjz
    zzfjt zzC();

    WebView zzD();

    @Override // com.google.android.gms.internal.ads.zzcmd
    View zzE();

    List zzF();

    void zzG();

    void zzH(int i);

    void zzI();

    void zzJ();

    Context zzK();

    com.google.android.gms.ads.internal.overlay.zzm zzL();

    com.google.android.gms.ads.internal.overlay.zzm zzM();

    @Override // com.google.android.gms.internal.ads.zzcma
    zzcms zzN();

    String zzO();

    zzcmg zzP();

    WebViewClient zzQ();

    boolean zzR();

    @Override // com.google.android.gms.internal.ads.zzcmb
    zzbai zzS();

    zzfkq zzT();

    zzelb zzU();

    zzekz zzV();

    boolean zzW();

    boolean zzX();

    void zzY();

    boolean zzZ();

    boolean zzaA(boolean z, int i);

    boolean zzaB();

    @Override // com.google.android.gms.internal.ads.zzclp
    zzfjw zzaC();

    void zzaD(zzfjt zzfjtVar, zzfjw zzfjwVar);

    void zzaE(boolean z);

    ListenableFuture zzaF();

    void zzaG(boolean z);

    boolean zzaa();

    void zzab(String str, zzbpe zzbpeVar);

    void zzac(String str, zzbpe zzbpeVar);

    void zzad(String str, Predicate predicate);

    void zzae(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    void zzaf(zzcms zzcmsVar);

    void zzag(boolean z);

    void zzah();

    void zzai(Context context);

    void zzaj(boolean z);

    void zzak(zzelb zzelbVar);

    void zzal(zzekz zzekzVar);

    void zzam(int i);

    void zzan(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    void zzao(boolean z);

    void zzap();

    void zzaq(zzblf zzblfVar);

    zzblf zzar();

    void zzas(boolean z);

    void zzat();

    void zzau(String str, String str2, String str3);

    void zzav();

    void zzaw(boolean z);

    void zzax(zzblc zzblcVar);

    void zzay(zzbfr zzbfrVar);

    zzbfr zzaz();

    @Override // com.google.android.gms.internal.ads.zzchb
    zzclo zzh();

    @Override // com.google.android.gms.internal.ads.zzclu, com.google.android.gms.internal.ads.zzchb
    Activity zzj();

    @Override // com.google.android.gms.internal.ads.zzchb
    com.google.android.gms.ads.internal.zza zzk();

    @Override // com.google.android.gms.internal.ads.zzchb
    zzbir zzq();

    @Override // com.google.android.gms.internal.ads.zzcmc, com.google.android.gms.internal.ads.zzchb
    VersionInfoParcel zzs();

    @Override // com.google.android.gms.internal.ads.zzchb
    void zzt(String str, zzcio zzcioVar);

    @Override // com.google.android.gms.internal.ads.zzchb
    void zzw(zzclo zzcloVar);
}
