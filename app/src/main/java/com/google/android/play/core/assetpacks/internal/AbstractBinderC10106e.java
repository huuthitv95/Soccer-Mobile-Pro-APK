package com.google.android.play.core.assetpacks.internal;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.internal.e */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractBinderC10106e extends BinderC10103b implements InterfaceC10107f {
    /* JADX INFO: renamed from: b */
    public static InterfaceC10107f m22737b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC10107f ? (InterfaceC10107f) iInterfaceQueryLocalInterface : new C10105d(iBinder);
    }
}
