package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcle extends FrameLayout implements zzcki {
    private final zzcki zza;
    private final zzcgq zzb;
    private final AtomicBoolean zzc;

    /* JADX WARN: Multi-variable type inference failed */
    public zzcle(zzcki zzckiVar, zzdyz zzdyzVar) {
        super(zzckiVar.getContext());
        this.zzc = new AtomicBoolean();
        this.zza = zzckiVar;
        this.zzb = new zzcgq(zzckiVar.zzK(), this, this, zzdyzVar);
        addView((View) zzckiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final boolean canGoBack() {
        return this.zza.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void destroy() {
        final zzekz zzekzVarZzV;
        final zzelb zzelbVarZzU = zzU();
        if (zzelbVarZzU != null) {
            zzfzw zzfzwVar = com.google.android.gms.ads.internal.util.zzs.zza;
            zzfzwVar.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcld
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.ads.internal.zzt.zzu().zzf(zzelbVarZzU.zza());
                }
            });
            final zzcki zzckiVar = this.zza;
            Objects.requireNonNull(zzckiVar);
            zzfzwVar.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcla
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzckiVar.destroy();
                }
            }, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgl)).intValue());
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgn)).booleanValue() || (zzekzVarZzV = zzV()) == null) {
            this.zza.destroy();
        } else {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclb
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    final zzcle zzcleVar = this.zza;
                    zzekzVarZzV.zze(new zzfuf() { // from class: com.google.android.gms.internal.ads.zzclc
                        @Override // com.google.android.gms.internal.ads.zzfuf
                        public final /* synthetic */ void zza(boolean z) {
                            zzcleVar.zzaM(true);
                        }
                    });
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void goBack() {
        this.zza.goBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void loadData(String str, String str2, String str3) {
        this.zza.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zza.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void loadUrl(String str) {
        this.zza.loadUrl(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcki zzckiVar = this.zza;
        if (zzckiVar != null) {
            zzckiVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void onPause() {
        this.zzb.zze();
        this.zza.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void onResume() {
        this.zza.onResume();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcki
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zza.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcki
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zza.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zza.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zza.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzchb
    public final void zzA(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzchb
    public final void zzB(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcki, com.google.android.gms.internal.ads.zzcjz
    public final zzfjt zzC() {
        return this.zza.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final WebView zzD() {
        return (WebView) this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcki, com.google.android.gms.internal.ads.zzcmd
    public final View zzE() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final List zzF() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != this.zza) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void zzG() {
        this.zza.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void zzH(int i) {
        this.zza.zzH(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void zzI() {
        this.zza.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void zzJ() {
        this.zza.zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final Context zzK() {
        return this.zza.zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final com.google.android.gms.ads.internal.overlay.zzm zzL() {
        return this.zza.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final com.google.android.gms.ads.internal.overlay.zzm zzM() {
        return this.zza.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzcki, com.google.android.gms.internal.ads.zzcma
    public final zzcms zzN() {
        return this.zza.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final String zzO() {
        return this.zza.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final zzcmg zzP() {
        return ((zzcll) this.zza).zzaS();
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final WebViewClient zzQ() {
        return this.zza.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final boolean zzR() {
        return this.zza.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzcki, com.google.android.gms.internal.ads.zzcmb
    public final zzbai zzS() {
        return this.zza.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final zzfkq zzT() {
        return this.zza.zzT();
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final zzelb zzU() {
        return this.zza.zzU();
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final zzekz zzV() {
        return this.zza.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final boolean zzW() {
        return this.zza.zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final boolean zzX() {
        return this.zza.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void zzY() {
        this.zzb.zzf();
        this.zza.zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final boolean zzZ() {
        return this.zza.zzZ();
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void zza(String str) {
        ((zzcll) this.zza).zzaP(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzcki
    public final boolean zzaA(boolean z, int i) {
        if (!this.zzc.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzbx)).booleanValue()) {
            return false;
        }
        zzcki zzckiVar = this.zza;
        if (zzckiVar.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzckiVar.getParent()).removeView((View) zzckiVar);
        }
        zzckiVar.zzaA(z, i);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final boolean zzaB() {
        return this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcki, com.google.android.gms.internal.ads.zzclp
    public final zzfjw zzaC() {
        return this.zza.zzaC();
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void zzaD(zzfjt zzfjtVar, zzfjw zzfjwVar) {
        this.zza.zzaD(zzfjtVar, zzfjwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void zzaE(boolean z) {
        this.zza.zzaE(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final ListenableFuture zzaF() {
        return this.zza.zzaF();
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void zzaG(boolean z) {
        this.zza.zzaG(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcly
    public final void zzaH(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z, boolean z2, String str) {
        this.zza.zzaH(zzcVar, z, z2, str);
    }

    @Override // com.google.android.gms.internal.ads.zzcly
    public final void zzaI(boolean z, int i, boolean z2) {
        this.zza.zzaI(z, i, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcly
    public final void zzaJ(boolean z, int i, String str, boolean z2, boolean z3) {
        this.zza.zzaJ(z, i, str, z2, z3);
    }

    @Override // com.google.android.gms.internal.ads.zzcly
    public final void zzaK(boolean z, int i, String str, String str2, boolean z2) {
        this.zza.zzaK(z, i, str, str2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcly
    public final void zzaL(String str, String str2, int i) {
        this.zza.zzaL(str, str2, 14);
    }

    final /* synthetic */ void zzaM(boolean z) {
        final zzcki zzckiVar = this.zza;
        zzfzw zzfzwVar = com.google.android.gms.ads.internal.util.zzs.zza;
        Objects.requireNonNull(zzckiVar);
        zzfzwVar.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzckiVar.destroy();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final boolean zzaa() {
        return this.zza.zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void zzab(String str, zzbpe zzbpeVar) {
        this.zza.zzab(str, zzbpeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void zzac(String str, zzbpe zzbpeVar) {
        this.zza.zzac(str, zzbpeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void zzad(String str, Predicate predicate) {
        this.zza.zzad(str, predicate);
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void zzae(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zza.zzae(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void zzaf(zzcms zzcmsVar) {
        this.zza.zzaf(zzcmsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void zzag(boolean z) {
        this.zza.zzag(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void zzah() {
        this.zza.zzah();
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void zzai(Context context) {
        this.zza.zzai(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void zzaj(boolean z) {
        this.zza.zzaj(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void zzak(zzelb zzelbVar) {
        this.zza.zzak(zzelbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void zzal(zzekz zzekzVar) {
        this.zza.zzal(zzekzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void zzam(int i) {
        this.zza.zzam(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void zzan(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zza.zzan(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void zzao(boolean z) {
        this.zza.zzao(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void zzap() {
        this.zza.zzap();
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void zzaq(zzblf zzblfVar) {
        this.zza.zzaq(zzblfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final zzblf zzar() {
        return this.zza.zzar();
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void zzas(boolean z) {
        this.zza.zzas(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void zzat() {
        setBackgroundColor(0);
        this.zza.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void zzau(String str, String str2, String str3) {
        this.zza.zzau(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void zzav() {
        zzelb zzelbVarZzU;
        zzekz zzekzVarZzV;
        TextView textView = new TextView(getContext());
        com.google.android.gms.ads.internal.zzt.zzc();
        textView.setText(com.google.android.gms.ads.internal.util.zzs.zzB());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgn)).booleanValue() && (zzekzVarZzV = zzV()) != null) {
            zzekzVarZzV.zzf(textView);
        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgm)).booleanValue() && (zzelbVarZzU = zzU()) != null && zzelbVarZzU.zzb()) {
            com.google.android.gms.ads.internal.zzt.zzu().zzg(zzelbVarZzU.zza(), textView);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void zzaw(boolean z) {
        this.zza.zzaw(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void zzax(zzblc zzblcVar) {
        this.zza.zzax(zzblcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final void zzay(zzbfr zzbfrVar) {
        this.zza.zzay(zzbfrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcki
    public final zzbfr zzaz() {
        return this.zza.zzaz();
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void zzb(String str, JSONObject jSONObject) {
        ((zzcll) this.zza).zzc(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void zzc(String str, String str2) {
        this.zza.zzc("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbsa
    public final void zzd(String str, JSONObject jSONObject) {
        this.zza.zzd(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    public final void zzdR() {
        zzcki zzckiVar = this.zza;
        if (zzckiVar != null) {
            zzckiVar.zzdR();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbee
    public final void zzdj(zzbed zzbedVar) {
        this.zza.zzdj(zzbedVar);
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzdk() {
        this.zza.zzdk();
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzdl() {
        this.zza.zzdl();
    }

    @Override // com.google.android.gms.internal.ads.zzchb
    public final zzcgq zzdm() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzchb
    public final void zzdn(boolean z) {
        this.zza.zzdn(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    public final void zzdu() {
        zzcki zzckiVar = this.zza;
        if (zzckiVar != null) {
            zzckiVar.zzdu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsa
    public final void zze(String str, Map map) {
        this.zza.zze(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzcki, com.google.android.gms.internal.ads.zzchb
    public final zzclo zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzchb
    public final zzbiq zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcki, com.google.android.gms.internal.ads.zzclu, com.google.android.gms.internal.ads.zzchb
    public final Activity zzj() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzcki, com.google.android.gms.internal.ads.zzchb
    public final com.google.android.gms.ads.internal.zza zzk() {
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzchb
    public final void zzl() {
        this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzchb
    public final String zzm() {
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzchb
    public final String zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzchb
    public final void zzo(int i) {
        this.zza.zzo(i);
    }

    @Override // com.google.android.gms.internal.ads.zzchb
    public final int zzp() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzcki, com.google.android.gms.internal.ads.zzchb
    public final zzbir zzq() {
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzchb
    public final zzcio zzr(String str) {
        return this.zza.zzr(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcki, com.google.android.gms.internal.ads.zzcmc, com.google.android.gms.internal.ads.zzchb
    public final VersionInfoParcel zzs() {
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzcki, com.google.android.gms.internal.ads.zzchb
    public final void zzt(String str, zzcio zzcioVar) {
        this.zza.zzt(str, zzcioVar);
    }

    @Override // com.google.android.gms.internal.ads.zzchb
    public final void zzu(boolean z, long j) {
        this.zza.zzu(z, j);
    }

    @Override // com.google.android.gms.internal.ads.zzchb
    public final void zzv(int i) {
        this.zzb.zzg(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcki, com.google.android.gms.internal.ads.zzchb
    public final void zzw(zzclo zzcloVar) {
        this.zza.zzw(zzcloVar);
    }

    @Override // com.google.android.gms.internal.ads.zzchb
    public final int zzx() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeL)).booleanValue() ? this.zza.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzchb
    public final int zzy() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeL)).booleanValue() ? this.zza.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzchb
    public final void zzz() {
        this.zza.zzz();
    }
}
