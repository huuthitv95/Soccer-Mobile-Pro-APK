package com.google.android.p279a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.a.a */
/* JADX INFO: compiled from: BaseProxy.java */
/* JADX INFO: loaded from: classes4.dex */
public class C9390a implements IInterface {

    /* JADX INFO: renamed from: a */
    private final IBinder f21839a;

    /* JADX INFO: renamed from: b */
    private final String f21840b = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    protected C9390a(IBinder iBinder) {
        this.f21839a = iBinder;
    }

    /* JADX INFO: renamed from: a */
    protected final Parcel m22114a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f21840b);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f21839a;
    }

    /* JADX INFO: renamed from: b */
    protected final Parcel m22115b(Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f21839a.transact(1, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }
}
