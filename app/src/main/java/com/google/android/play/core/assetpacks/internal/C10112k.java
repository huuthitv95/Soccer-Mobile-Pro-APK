package com.google.android.play.core.assetpacks.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.internal.k */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10112k extends C10080a implements IInterface {
    C10112k(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    /* JADX INFO: renamed from: c */
    public final void m22738c(Bundle bundle) throws RemoteException {
        Parcel parcelM22700a = m22700a();
        C10104c.m22726c(parcelM22700a, bundle);
        m22701b(4, parcelM22700a);
    }

    /* JADX INFO: renamed from: d */
    public final void m22739d(Bundle bundle) throws RemoteException {
        Parcel parcelM22700a = m22700a();
        C10104c.m22726c(parcelM22700a, bundle);
        m22701b(3, parcelM22700a);
    }

    /* JADX INFO: renamed from: e */
    public final void m22740e(Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel parcelM22700a = m22700a();
        C10104c.m22726c(parcelM22700a, bundle);
        C10104c.m22726c(parcelM22700a, bundle2);
        m22701b(2, parcelM22700a);
    }
}
