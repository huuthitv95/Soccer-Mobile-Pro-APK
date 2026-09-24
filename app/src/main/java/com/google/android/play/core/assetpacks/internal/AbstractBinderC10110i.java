package com.google.android.play.core.assetpacks.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.internal.i */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractBinderC10110i extends BinderC10103b implements InterfaceC10111j {
    public AbstractBinderC10110i() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    @Override // com.google.android.play.core.assetpacks.internal.BinderC10103b
    /* JADX INFO: renamed from: a */
    protected final boolean mo22723a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        C10112k c10112k = null;
        if (i == 2) {
            Bundle bundle = (Bundle) C10104c.m22724a(parcel, Bundle.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                c10112k = iInterfaceQueryLocalInterface instanceof C10112k ? (C10112k) iInterfaceQueryLocalInterface : new C10112k(strongBinder);
            }
            C10104c.m22725b(parcel);
            mo22530c(bundle, c10112k);
            return true;
        }
        if (i != 3) {
            return false;
        }
        Bundle bundle2 = (Bundle) C10104c.m22724a(parcel, Bundle.CREATOR);
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
            c10112k = iInterfaceQueryLocalInterface2 instanceof C10112k ? (C10112k) iInterfaceQueryLocalInterface2 : new C10112k(strongBinder2);
        }
        C10104c.m22725b(parcel);
        mo22529b(bundle2, c10112k);
        return true;
    }
}
