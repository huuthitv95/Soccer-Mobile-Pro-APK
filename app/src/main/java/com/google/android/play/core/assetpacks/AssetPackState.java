package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.model.C10133b;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AssetPackState {
    /* JADX INFO: renamed from: a */
    public static AssetPackState m22476a(String str, int i, int i2, long j, long j2, double d, int i3, String str2, String str3) {
        return new C9989bn(str, i, i2, j, j2, (int) Math.rint(100.0d * d), i3, str2, str3);
    }

    /* JADX INFO: renamed from: b */
    static AssetPackState m22477b(Bundle bundle, String str, C10017co c10017co, C10057ea c10057ea, InterfaceC9980be interfaceC9980be) {
        int iMo22535a = interfaceC9980be.mo22535a(bundle.getInt(C10133b.m22790a("status", str)), str);
        int i = bundle.getInt(C10133b.m22790a("error_code", str));
        long j = bundle.getLong(C10133b.m22790a("bytes_downloaded", str));
        long j2 = bundle.getLong(C10133b.m22790a("total_bytes_to_download", str));
        double dM22623a = c10017co.m22623a(str);
        long j3 = bundle.getLong(C10133b.m22790a("pack_version", str));
        long j4 = bundle.getLong(C10133b.m22790a("pack_base_version", str));
        int i2 = 1;
        if (iMo22535a == 4) {
            if (j4 != 0 && j4 != j3) {
                i2 = 2;
            }
            iMo22535a = 4;
        }
        return m22476a(str, iMo22535a, i, j, j2, dM22623a, i2, bundle.getString(C10133b.m22790a("pack_version_tag", str), String.valueOf(bundle.getInt("app_version_code"))), c10057ea.m22673a(str));
    }

    public abstract String availableVersionTag();

    public abstract long bytesDownloaded();

    public abstract int errorCode();

    public abstract String installedVersionTag();

    public abstract String name();

    public abstract int status();

    public abstract long totalBytesToDownload();

    public abstract int transferProgressPercentage();

    public abstract int updateAvailability();
}
