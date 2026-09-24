package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import androidx.core.os.BuildCompat;
import com.google.android.material.chip.Chip$$ExternalSyntheticApiModelOutline0;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzars extends zzarq {
    private int zza = 0;
    private final Context zzb;
    private final String zzc;
    private zzbdx zzd;
    private ServiceConnection zze;

    public zzars(Context context) {
        this.zzb = context.getApplicationContext();
        String packageName = (BuildCompat.isAtLeastU() && SdkExtensions.getExtensionVersion(34) >= 8 && Process.isSdkSandbox()) ? Chip$$ExternalSyntheticApiModelOutline0.m22320m(context.getSystemService(Chip$$ExternalSyntheticApiModelOutline0.m22343m())).getClientPackageName() : context.getPackageName();
        this.zzc = packageName;
    }

    @Override // com.google.android.gms.internal.ads.zzarq
    public final boolean zza() {
        return (this.zza != 2 || this.zzd == null || this.zze == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzarq
    public final void zzb(zzart zzartVar) {
        if (zza()) {
            zzarv.zza("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            zzartVar.zza(0);
            return;
        }
        int i = this.zza;
        if (i == 1) {
            zzarv.zzb("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            zzartVar.zza(3);
            return;
        }
        if (i == 3) {
            zzarv.zzb("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            zzartVar.zza(3);
            return;
        }
        zzarv.zza("InstallReferrerClient", "Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        Context context = this.zzb;
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
            ResolveInfo resolveInfo = listQueryIntentServices.get(0);
            if (resolveInfo.serviceInfo != null) {
                String str = resolveInfo.serviceInfo.packageName;
                String str2 = resolveInfo.serviceInfo.name;
                if ("com.android.vending".equals(str) && str2 != null) {
                    try {
                        if (context.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                            Intent intent2 = new Intent(intent);
                            zzarr zzarrVar = new zzarr(this, zzartVar, null);
                            this.zze = zzarrVar;
                            try {
                                if (this.zzb.bindService(intent2, zzarrVar, 1)) {
                                    zzarv.zza("InstallReferrerClient", "Service was bonded successfully.");
                                    return;
                                }
                                zzarv.zzb("InstallReferrerClient", "Connection to service is blocked.");
                                this.zza = 0;
                                zzartVar.zza(1);
                                return;
                            } catch (SecurityException unused) {
                                zzarv.zzb("InstallReferrerClient", "No permission to connect to service.");
                                this.zza = 0;
                                zzartVar.zza(4);
                                return;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                    }
                }
                zzarv.zzb("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
                this.zza = 0;
                zzartVar.zza(2);
                return;
            }
        }
        this.zza = 0;
        zzarv.zza("InstallReferrerClient", "Install Referrer service unavailable on device.");
        zzartVar.zza(2);
    }

    @Override // com.google.android.gms.internal.ads.zzarq
    public final void zzc() {
        this.zza = 3;
        if (this.zze != null) {
            zzarv.zza("InstallReferrerClient", "Unbinding from service.");
            this.zzb.unbindService(this.zze);
            this.zze = null;
        }
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.ads.zzarq
    public final zzaru zzd() throws RemoteException {
        if (!zza()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.zzc);
        try {
            return new zzaru(this.zzd.zze(bundle));
        } catch (RemoteException e) {
            zzarv.zzb("InstallReferrerClient", "RemoteException getting install referrer information");
            this.zza = 0;
            throw e;
        }
    }

    final /* synthetic */ void zze(int i) {
        this.zza = i;
    }

    final /* synthetic */ void zzf(zzbdx zzbdxVar) {
        this.zzd = zzbdxVar;
    }
}
