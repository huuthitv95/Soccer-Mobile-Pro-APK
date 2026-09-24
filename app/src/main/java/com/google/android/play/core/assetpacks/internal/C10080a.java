package com.google.android.play.core.assetpacks.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.internal.a */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
public class C10080a implements IInterface {

    /* JADX INFO: renamed from: a */
    private final IBinder f22389a;

    /* JADX INFO: renamed from: b */
    private final String f22390b;

    protected C10080a(IBinder iBinder, String str) {
        this.f22389a = iBinder;
        this.f22390b = str;
    }

    /* JADX INFO: renamed from: a */
    protected final Parcel m22700a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f22390b);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f22389a;
    }

    /* JADX INFO: renamed from: b */
    protected final void m22701b(int i, Parcel parcel) throws RemoteException {
        try {
            this.f22389a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
