package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgs extends zzg {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private final long zzg;
    private final long zzh;
    private List zzi;
    private String zzj;
    private int zzk;
    private String zzl;
    private String zzm;
    private String zzn;
    private long zzo;
    private String zzp;

    zzgs(zzio zzioVar, long j, long j2) {
        super(zzioVar);
        this.zzo = 0L;
        this.zzp = null;
        this.zzg = j;
        this.zzh = j2;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0253 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:45:0x0100  */
    /* JADX WARN: Code duplicated, block: B:47:0x0104  */
    /* JADX WARN: Code duplicated, block: B:48:0x011f  */
    /* JADX WARN: Code duplicated, block: B:49:0x012d  */
    /* JADX WARN: Code duplicated, block: B:50:0x013b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0149  */
    /* JADX WARN: Code duplicated, block: B:52:0x0157  */
    /* JADX WARN: Code duplicated, block: B:53:0x0165  */
    /* JADX WARN: Code duplicated, block: B:54:0x0173  */
    /* JADX WARN: Code duplicated, block: B:57:0x0189  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:69:0x01cf A[Catch: IllegalStateException -> 0x01fa, TryCatch #2 {IllegalStateException -> 0x01fa, blocks: (B:58:0x018f, B:62:0x01a5, B:64:0x01b3, B:66:0x01b9, B:70:0x01d3, B:69:0x01cf, B:72:0x01dd, B:74:0x01f1, B:76:0x01f6, B:75:0x01f4), top: B:102:0x018f }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01dd A[Catch: IllegalStateException -> 0x01fa, TryCatch #2 {IllegalStateException -> 0x01fa, blocks: (B:58:0x018f, B:62:0x01a5, B:64:0x01b3, B:66:0x01b9, B:70:0x01d3, B:69:0x01cf, B:72:0x01dd, B:74:0x01f1, B:76:0x01f6, B:75:0x01f4), top: B:102:0x018f }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01f1 A[Catch: IllegalStateException -> 0x01fa, TryCatch #2 {IllegalStateException -> 0x01fa, blocks: (B:58:0x018f, B:62:0x01a5, B:64:0x01b3, B:66:0x01b9, B:70:0x01d3, B:69:0x01cf, B:72:0x01dd, B:74:0x01f1, B:76:0x01f6, B:75:0x01f4), top: B:102:0x018f }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01f4 A[Catch: IllegalStateException -> 0x01fa, TryCatch #2 {IllegalStateException -> 0x01fa, blocks: (B:58:0x018f, B:62:0x01a5, B:64:0x01b3, B:66:0x01b9, B:70:0x01d3, B:69:0x01cf, B:72:0x01dd, B:74:0x01f1, B:76:0x01f6, B:75:0x01f4), top: B:102:0x018f }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0222  */
    /* JADX WARN: Code duplicated, block: B:85:0x0228  */
    /* JADX WARN: Code duplicated, block: B:86:0x0236  */
    /* JADX WARN: Code duplicated, block: B:89:0x0240  */
    /* JADX WARN: Code duplicated, block: B:92:0x0253 A[EDGE_INSN: B:92:0x0253->B:93:0x0255 BREAK  A[LOOP:0: B:87:0x023a->B:108:?]] */
    /* JADX WARN: Code duplicated, block: B:94:0x0257  */
    /* JADX WARN: Code duplicated, block: B:96:0x0262  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.measurement.internal.zzg
    @EnsuresNonNull({RemoteConfigConstants.RequestFieldKey.APP_ID, "appStore", "appName", "gmpAppId", "gaAppId"})
    protected final void zzd() {
        String str;
        String string;
        zzio zzioVar;
        Object[] objArr;
        zzio zzioVar2;
        int iZza;
        zzio zzioVar3;
        List listZzt;
        Iterator it;
        String strZzc;
        String str2;
        Context contextZzaT;
        String strZzA;
        zzio zzioVar4;
        zzio zzioVar5 = this.zzu;
        zzioVar5.zzaW().zzj().zzc("sdkVersion bundled with app, dynamiteVersion", Long.valueOf(this.zzh), Long.valueOf(this.zzg));
        String packageName = zzioVar5.zzaT().getPackageName();
        PackageManager packageManager = zzioVar5.zzaT().getPackageManager();
        int i = Integer.MIN_VALUE;
        String str3 = "";
        String str4 = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        String installerPackageName = "unknown";
        try {
            if (packageManager != null) {
                try {
                    installerPackageName = packageManager.getInstallerPackageName(packageName);
                } catch (IllegalArgumentException unused) {
                    this.zzu.zzaW().zze().zzb("Error retrieving app installer package name. appId", zzhe.zzn(packageName));
                }
                if (installerPackageName == null) {
                    installerPackageName = "manual_install";
                } else if ("com.android.vending".equals(installerPackageName)) {
                    installerPackageName = "";
                }
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(this.zzu.zzaT().getPackageName(), 0);
                    if (packageInfo != null) {
                        CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        string = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
                        try {
                            str4 = packageInfo.versionName;
                            i = packageInfo.versionCode;
                        } catch (PackageManager.NameNotFoundException unused2) {
                            str = str4;
                            str4 = string;
                            this.zzu.zzaW().zze().zzc("Error retrieving package info. appId, appName", zzhe.zzn(packageName), str4);
                            string = str4;
                            str4 = str;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                    str = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
                }
                this.zza = packageName;
                this.zzd = installerPackageName;
                this.zzb = str4;
                this.zzc = i;
                this.zze = string;
                this.zzf = 0L;
                zzioVar = this.zzu;
                if (zzioVar.zzf().zzx(null, zzgi.zzbp)) {
                    objArr = false;
                } else {
                    zzioVar4 = this.zzu;
                    if (TextUtils.isEmpty(zzioVar4.zzx()) && "am".equals(zzioVar4.zzy())) {
                        objArr = true;
                    } else {
                        objArr = false;
                    }
                }
                zzioVar2 = this.zzu;
                iZza = zzioVar2.zza();
                if (iZza != 0) {
                    zzioVar.zzaW().zzj().zza("App measurement collection enabled");
                } else if (iZza != 1) {
                    zzioVar.zzaW().zzi().zza("App measurement deactivated via the manifest");
                } else if (iZza != 3) {
                    zzioVar.zzaW().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (iZza != 4) {
                    zzioVar.zzaW().zzi().zza("App measurement disabled via the manifest");
                } else if (iZza != 6) {
                    zzioVar.zzaW().zzl().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (iZza != 7) {
                    zzioVar.zzaW().zzi().zza("App measurement disabled via the global data collection setting");
                } else if (iZza != 8) {
                    zzioVar.zzaW().zzi().zza("App measurement disabled");
                    zzioVar.zzaW().zzh().zza("Invalid scion state in identity");
                } else {
                    zzioVar.zzaW().zzi().zza("App measurement disabled due to denied storage consent");
                }
                this.zzl = "";
                this.zzm = "";
                zzioVar.zzaV();
                if (objArr != false) {
                    this.zzm = zzioVar2.zzx();
                }
                strZzc = zzmg.zzc(zzioVar.zzaT(), "google_app_id", zzioVar2.zzA());
                if (TextUtils.isEmpty(strZzc)) {
                    str3 = strZzc;
                }
                this.zzl = str3;
                if (!zzioVar.zzf().zzx(null, zzgi.zzbp) && !TextUtils.isEmpty(strZzc)) {
                    contextZzaT = zzioVar.zzaT();
                    strZzA = zzioVar2.zzA();
                    Preconditions.checkNotNull(contextZzaT);
                    Resources resources = contextZzaT.getResources();
                    if (!TextUtils.isEmpty(strZzA)) {
                        strZzA = zzig.zza(contextZzaT);
                    }
                    this.zzm = zzig.zzb("admob_app_id", resources, strZzA);
                }
                if (iZza == 0) {
                    zzhc zzhcVarZzj = zzioVar.zzaW().zzj();
                    String str5 = this.zza;
                    if (TextUtils.isEmpty(this.zzl)) {
                        str2 = this.zzm;
                    } else {
                        str2 = this.zzl;
                    }
                    zzhcVarZzj.zzc("App measurement enabled for app package, google app id", str5, str2);
                }
                this.zzi = null;
                zzioVar3 = this.zzu;
                zzioVar3.zzaV();
                listZzt = zzioVar3.zzf().zzt("analytics.safelisted_events");
                if (listZzt != null) {
                    this.zzi = listZzt;
                    break;
                } else if (listZzt.isEmpty()) {
                    it = listZzt.iterator();
                    do {
                        if (it.hasNext()) {
                            this.zzi = listZzt;
                            break;
                        }
                    } while (zzioVar3.zzw().zzag("safelisted event", (String) it.next()));
                } else {
                    zzioVar3.zzaW().zzl().zza("Safelisted event list is empty. Ignoring");
                }
                if (packageManager != null) {
                    this.zzk = InstantApps.isInstantApp(zzioVar3.zzaT()) ? 1 : 0;
                } else {
                    this.zzk = 0;
                }
            }
            zzioVar5.zzaW().zze().zzb("PackageManager is null, app identity information might be inaccurate. appId", zzhe.zzn(packageName));
            strZzc = zzmg.zzc(zzioVar.zzaT(), "google_app_id", zzioVar2.zzA());
            if (TextUtils.isEmpty(strZzc)) {
                str3 = strZzc;
            }
            this.zzl = str3;
            if (!zzioVar.zzf().zzx(null, zzgi.zzbp)) {
                contextZzaT = zzioVar.zzaT();
                strZzA = zzioVar2.zzA();
                Preconditions.checkNotNull(contextZzaT);
                Resources resources2 = contextZzaT.getResources();
                if (!TextUtils.isEmpty(strZzA)) {
                    strZzA = zzig.zza(contextZzaT);
                }
                this.zzm = zzig.zzb("admob_app_id", resources2, strZzA);
            }
            if (iZza == 0) {
                zzhc zzhcVarZzj2 = zzioVar.zzaW().zzj();
                String str6 = this.zza;
                if (TextUtils.isEmpty(this.zzl)) {
                    str2 = this.zzm;
                } else {
                    str2 = this.zzl;
                }
                zzhcVarZzj2.zzc("App measurement enabled for app package, google app id", str6, str2);
            }
        } catch (IllegalStateException e) {
            this.zzu.zzaW().zze().zzc("Fetching Google App Id failed with exception. appId", zzhe.zzn(packageName), e);
        }
        string = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        this.zza = packageName;
        this.zzd = installerPackageName;
        this.zzb = str4;
        this.zzc = i;
        this.zze = string;
        this.zzf = 0L;
        zzioVar = this.zzu;
        if (zzioVar.zzf().zzx(null, zzgi.zzbp)) {
            zzioVar4 = this.zzu;
            if (TextUtils.isEmpty(zzioVar4.zzx())) {
                objArr = false;
            } else {
                objArr = false;
            }
        } else {
            objArr = false;
        }
        zzioVar2 = this.zzu;
        iZza = zzioVar2.zza();
        if (iZza != 0) {
            zzioVar.zzaW().zzj().zza("App measurement collection enabled");
        } else if (iZza != 1) {
            zzioVar.zzaW().zzi().zza("App measurement deactivated via the manifest");
        } else if (iZza != 3) {
            zzioVar.zzaW().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
        } else if (iZza != 4) {
            zzioVar.zzaW().zzi().zza("App measurement disabled via the manifest");
        } else if (iZza != 6) {
            zzioVar.zzaW().zzl().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
        } else if (iZza != 7) {
            zzioVar.zzaW().zzi().zza("App measurement disabled via the global data collection setting");
        } else if (iZza != 8) {
            zzioVar.zzaW().zzi().zza("App measurement disabled");
            zzioVar.zzaW().zzh().zza("Invalid scion state in identity");
        } else {
            zzioVar.zzaW().zzi().zza("App measurement disabled due to denied storage consent");
        }
        this.zzl = "";
        this.zzm = "";
        zzioVar.zzaV();
        if (objArr != false) {
            this.zzm = zzioVar2.zzx();
        }
        this.zzi = null;
        zzioVar3 = this.zzu;
        zzioVar3.zzaV();
        listZzt = zzioVar3.zzf().zzt("analytics.safelisted_events");
        if (listZzt != null) {
            this.zzi = listZzt;
            break;
        } else if (listZzt.isEmpty()) {
            it = listZzt.iterator();
            do {
                if (it.hasNext()) {
                    this.zzi = listZzt;
                    break;
                }
            } while (zzioVar3.zzw().zzag("safelisted event", (String) it.next()));
        } else {
            zzioVar3.zzaW().zzl().zza("Safelisted event list is empty. Ignoring");
        }
        if (packageManager != null) {
            this.zzk = InstantApps.isInstantApp(zzioVar3.zzaT()) ? 1 : 0;
        } else {
            this.zzk = 0;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zzf() {
        return true;
    }

    final int zzh() {
        zza();
        return this.zzk;
    }

    final int zzi() {
        zza();
        return this.zzc;
    }

    final long zzj() {
        return this.zzh;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 com.google.android.gms.measurement.internal.zzr, still in use, count: 4, list:
          (r2v0 com.google.android.gms.measurement.internal.zzr) from 0x0183: MOVE (r21v0 com.google.android.gms.measurement.internal.zzr) = (r2v0 com.google.android.gms.measurement.internal.zzr)
          (r2v0 com.google.android.gms.measurement.internal.zzr) from 0x0171: MOVE (r21v2 com.google.android.gms.measurement.internal.zzr) = (r2v0 com.google.android.gms.measurement.internal.zzr)
          (r2v0 com.google.android.gms.measurement.internal.zzr) from 0x0144: MOVE (r21v4 com.google.android.gms.measurement.internal.zzr) = (r2v0 com.google.android.gms.measurement.internal.zzr)
          (r2v0 com.google.android.gms.measurement.internal.zzr) from 0x00fd: MOVE (r21v7 com.google.android.gms.measurement.internal.zzr) = (r2v0 com.google.android.gms.measurement.internal.zzr)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    final com.google.android.gms.measurement.internal.zzr zzk(java.lang.String r50) {
        /*
            Method dump skipped, instruction units count: 907
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgs.zzk(java.lang.String):com.google.android.gms.measurement.internal.zzr");
    }

    final String zzl() {
        zza();
        if (this.zzu.zzf().zzx(null, zzgi.zzbp)) {
            return null;
        }
        return this.zzm;
    }

    final String zzm() {
        zza();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    final String zzn() {
        zza();
        Preconditions.checkNotNull(this.zze);
        return this.zze;
    }

    final String zzo() {
        zzg();
        zza();
        Preconditions.checkNotNull(this.zzl);
        return this.zzl;
    }

    final List zzp() {
        return this.zzi;
    }

    final void zzq() {
        String str;
        zzg();
        zzio zzioVar = this.zzu;
        if (zzioVar.zzm().zzh().zzr(zzjw.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            zzioVar.zzw().zzJ().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            zzioVar.zzaW().zzd().zza("Analytics Storage consent is not granted");
            str = null;
        }
        zzioVar.zzaW().zzd().zza(String.format("Resetting session stitching token to %s", str == null ? AbstractJsonLexerKt.NULL : "not null"));
        this.zzn = str;
        this.zzo = zzioVar.zzaU().currentTimeMillis();
    }

    final boolean zzr(String str) {
        String str2 = this.zzp;
        boolean z = false;
        if (str2 != null && !str2.equals(str)) {
            z = true;
        }
        this.zzp = str;
        return z;
    }
}
