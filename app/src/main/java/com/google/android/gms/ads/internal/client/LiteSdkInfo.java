package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbum;
import com.google.android.gms.internal.ads.zzbuq;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes4.dex */
public class LiteSdkInfo extends zzcu {
    public LiteSdkInfo(Context context) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public zzbuq getAdapterCreator() {
        return new zzbum();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public zzez getLiteSdkVersion() {
        return new zzez(ModuleDescriptor.MODULE_VERSION, ModuleDescriptor.MODULE_VERSION, "25.1.0");
    }
}
