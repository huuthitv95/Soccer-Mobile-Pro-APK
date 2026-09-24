package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzekv implements zzekw {
    static /* synthetic */ zzelb zzl(String str, String str2, String str3, zzekx zzekxVar, String str4, WebView webView, String str5, String str6, zzeky zzekyVar) {
        zzfui zzfuiVarZza = zzfui.zza("Google", str2);
        zzfuh zzfuhVarZzn = zzn("javascript");
        zzftz zzftzVarZzp = zzp(zzekxVar.toString());
        zzfuh zzfuhVar = zzfuh.NONE;
        if (zzfuhVarZzn == zzfuhVar) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzftzVarZzp == null) {
            String strValueOf = String.valueOf(zzekxVar);
            String.valueOf(strValueOf);
            String strValueOf2 = String.valueOf(strValueOf);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Unable to parse creative type: ".concat(strValueOf2));
            return null;
        }
        zzfuh zzfuhVarZzn2 = zzn(str4);
        if (zzftzVarZzp != zzftz.VIDEO || zzfuhVarZzn2 != zzfuhVar) {
            zzftw zzftwVarZza = zzftw.zza(zzfuiVarZza, webView, str5, "");
            return new zzelb(zzftu.zze(zzftv.zza(zzftzVarZzp, zzo(zzekyVar.toString()), zzfuhVarZzn, zzfuhVarZzn2, true), zzftwVarZza), zzftwVarZza);
        }
        String.valueOf(str4);
        String strValueOf3 = String.valueOf(str4);
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Video events owner unknown for video creative: ".concat(strValueOf3));
        return null;
    }

    static /* synthetic */ zzelb zzm(String str, String str2, String str3, String str4, zzekx zzekxVar, WebView webView, String str5, String str6, zzeky zzekyVar) {
        zzfui zzfuiVarZza = zzfui.zza(str, str2);
        zzfuh zzfuhVarZzn = zzn("javascript");
        zzfuh zzfuhVarZzn2 = zzn(str4);
        zzftz zzftzVarZzp = zzp(zzekxVar.toString());
        zzfuh zzfuhVar = zzfuh.NONE;
        if (zzfuhVarZzn == zzfuhVar) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzftzVarZzp == null) {
            String strValueOf = String.valueOf(zzekxVar);
            String.valueOf(strValueOf);
            String strValueOf2 = String.valueOf(strValueOf);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Unable to parse creative type: ".concat(strValueOf2));
            return null;
        }
        if (zzftzVarZzp != zzftz.VIDEO || zzfuhVarZzn2 != zzfuhVar) {
            zzftw zzftwVarZzb = zzftw.zzb(zzfuiVarZza, webView, str5, "");
            return new zzelb(zzftu.zze(zzftv.zza(zzftzVarZzp, zzo(zzekyVar.toString()), zzfuhVarZzn, zzfuhVarZzn2, true), zzftwVarZzb), zzftwVarZzb);
        }
        String.valueOf(str4);
        String strValueOf3 = String.valueOf(str4);
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Video events owner unknown for video creative: ".concat(strValueOf3));
        return null;
    }

    private static zzfuh zzn(String str) {
        if ("native".equals(str)) {
            return zzfuh.NATIVE;
        }
        return "javascript".equals(str) ? zzfuh.JAVASCRIPT : zzfuh.NONE;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    private static zzfuc zzo(String str) {
        byte b;
        int iHashCode = str.hashCode();
        if (iHashCode != -1104128070) {
            if (iHashCode != 1318088141) {
                if (iHashCode == 1988248512 && str.equals("onePixel")) {
                    b = 2;
                } else {
                    b = -1;
                }
            } else if (str.equals("definedByJavascript")) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str.equals("beginToRender")) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            return zzfuc.BEGIN_TO_RENDER;
        }
        if (b != 1) {
            return b != 2 ? zzfuc.UNSPECIFIED : zzfuc.ONE_PIXEL;
        }
        return zzfuc.DEFINED_BY_JAVASCRIPT;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    private static zzftz zzp(String str) {
        byte b;
        int iHashCode = str.hashCode();
        if (iHashCode != -382745961) {
            if (iHashCode != 112202875) {
                if (iHashCode == 714893483 && str.equals("nativeDisplay")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (str.equals("video")) {
                b = 2;
            } else {
                b = -1;
            }
        } else if (str.equals("htmlDisplay")) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            return zzftz.HTML_DISPLAY;
        }
        if (b == 1) {
            return zzftz.NATIVE_DISPLAY;
        }
        if (b != 2) {
            return null;
        }
        return zzftz.VIDEO;
    }

    private static final Object zzq(zzeku zzekuVar) {
        try {
            return zzekuVar.zza();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "omid exception");
            return null;
        }
    }

    private static final void zzr(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzekw
    public final boolean zza(final Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgk)).booleanValue()) {
            Boolean bool = (Boolean) zzq(new zzeku() { // from class: com.google.android.gms.internal.ads.zzekt
                @Override // com.google.android.gms.internal.ads.zzeku
                public final /* synthetic */ Object zza() {
                    if (zzfts.zzb()) {
                        return true;
                    }
                    zzfts.zza(context);
                    return Boolean.valueOf(zzfts.zzb());
                }
            });
            return bool != null && bool.booleanValue();
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid flag is disabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzekw
    public final String zzb(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgk)).booleanValue()) {
            return (String) zzq(zzekk.zza);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzekw
    public final zzelb zzc(final String str, final WebView webView, String str2, String str3, final String str4, final zzeky zzekyVar, final zzekx zzekxVar, final String str5) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgk)).booleanValue() || !zzfts.zzb()) {
            return null;
        }
        final String str6 = "javascript";
        final String str7 = "Google";
        final String str8 = "";
        return (zzelb) zzq(new zzeku(str7, str, str6, zzekxVar, str4, webView, str5, str8, zzekyVar) { // from class: com.google.android.gms.internal.ads.zzekl
            private final /* synthetic */ String zzb;
            private final /* synthetic */ zzekx zzd;
            private final /* synthetic */ String zze;
            private final /* synthetic */ WebView zzf;
            private final /* synthetic */ String zzg;
            private final /* synthetic */ zzeky zzi;
            private final /* synthetic */ String zza = "Google";
            private final /* synthetic */ String zzc = "javascript";
            private final /* synthetic */ String zzh = "";

            {
                this.zzb = str;
                this.zzd = zzekxVar;
                this.zze = str4;
                this.zzf = webView;
                this.zzg = str5;
                this.zzi = zzekyVar;
            }

            @Override // com.google.android.gms.internal.ads.zzeku
            public final /* synthetic */ Object zza() {
                return zzekv.zzl(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzekw
    public final zzelb zzd(final String str, final WebView webView, String str2, String str3, final String str4, final String str5, final zzeky zzekyVar, final zzekx zzekxVar, final String str6) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgk)).booleanValue() || !zzfts.zzb()) {
            return null;
        }
        final String str7 = "";
        final String str8 = "javascript";
        return (zzelb) zzq(new zzeku(str5, str, str8, str4, zzekxVar, webView, str6, str7, zzekyVar) { // from class: com.google.android.gms.internal.ads.zzekm
            private final /* synthetic */ String zza;
            private final /* synthetic */ String zzb;
            private final /* synthetic */ String zzd;
            private final /* synthetic */ zzekx zze;
            private final /* synthetic */ WebView zzf;
            private final /* synthetic */ String zzg;
            private final /* synthetic */ zzeky zzi;
            private final /* synthetic */ String zzc = "javascript";
            private final /* synthetic */ String zzh = "";

            {
                this.zzd = str4;
                this.zze = zzekxVar;
                this.zzf = webView;
                this.zzg = str6;
                this.zzi = zzekyVar;
            }

            @Override // com.google.android.gms.internal.ads.zzeku
            public final /* synthetic */ Object zza() {
                return zzekv.zzm(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzekw
    public final void zze(final zzftu zzftuVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgk)).booleanValue() && zzfts.zzb()) {
            Objects.requireNonNull(zzftuVar);
            zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzekj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzftuVar.zza();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzekw
    public final void zzf(final zzftu zzftuVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzekn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgk)).booleanValue() && zzfts.zzb()) {
                    zzftuVar.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzekw
    public final void zzg(final zzftu zzftuVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeko
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgk)).booleanValue() && zzfts.zzb()) {
                    zzftuVar.zzd(view, zzfub.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzekw
    public final void zzh(final zzftu zzftuVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzekp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgk)).booleanValue() && zzfts.zzb()) {
                    zzftuVar.zzb(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzekw
    public final zzfug zzi(final VersionInfoParcel versionInfoParcel, final WebView webView, boolean z) {
        final boolean z2 = true;
        return (zzfug) zzq(new zzeku(webView, z2) { // from class: com.google.android.gms.internal.ads.zzekq
            private final /* synthetic */ WebView zzb;

            @Override // com.google.android.gms.internal.ads.zzeku
            public final /* synthetic */ Object zza() {
                VersionInfoParcel versionInfoParcel2 = this.zza;
                int i = versionInfoParcel2.buddyApkVersion;
                int i2 = versionInfoParcel2.clientJarVersion;
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i2).length());
                sb.append(i);
                sb.append(".");
                sb.append(i2);
                return zzfug.zza(zzfui.zza("Google", sb.toString()), this.zzb, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzekw
    public final void zzj(final zzfug zzfugVar, final zzfuf zzfufVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzekr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfugVar.zzb(zzfufVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzekw
    public final void zzk(final zzfug zzfugVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeks
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfugVar.zzd(view, zzfub.NOT_VISIBLE, "Ad overlay");
            }
        });
    }
}
