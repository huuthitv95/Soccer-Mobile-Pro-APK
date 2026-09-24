package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.p003pm.PackageManager$OnChecksumsReadyListener;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.material.chip.Chip$$ExternalSyntheticApiModelOutline0;
import java.security.cert.CertificateEncodingException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbdb {
    public static String zza(Context context, String str, List list, Executor executor) throws ExecutionException, InterruptedException, PackageManager.NameNotFoundException, CertificateEncodingException {
        if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals(ExifInterface.LATITUDE_SOUTH)) {
            return null;
        }
        final zzhcb zzhcbVarZze = zzhcb.zze();
        context.getPackageManager().requestChecksums(str, false, 8, list, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzbda
            public final /* synthetic */ void onChecksumsReady(List list2) {
                zzhcb zzhcbVar = zzhcbVarZze;
                if (list2 == null) {
                    zzhcbVar.zza((Object) null);
                    return;
                }
                try {
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        ApkChecksum apkChecksumM22324m = Chip$$ExternalSyntheticApiModelOutline0.m22324m(list2.get(i));
                        if (apkChecksumM22324m.getType() == 8) {
                            zzhcbVar.zza(zzbbo.zza(apkChecksumM22324m.getValue()));
                            return;
                        }
                    }
                    zzhcbVar.zza((Object) null);
                } catch (Throwable unused) {
                    zzhcbVar.zza((Object) null);
                }
            }
        });
        return (String) zzhcbVarZze.get();
    }
}
