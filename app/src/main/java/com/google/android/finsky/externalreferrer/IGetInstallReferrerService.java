package com.google.android.finsky.externalreferrer;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.p279a.BinderC9391b;
import com.google.android.p279a.C9390a;
import com.google.android.p279a.C9392c;

/* JADX INFO: loaded from: classes4.dex */
public interface IGetInstallReferrerService extends IInterface {

    public static abstract class Stub extends BinderC9391b implements IGetInstallReferrerService {

        public static class Proxy extends C9390a implements IGetInstallReferrerService {
            Proxy(IBinder iBinder) {
                super(iBinder);
            }

            @Override // com.google.android.finsky.externalreferrer.IGetInstallReferrerService
            /* JADX INFO: renamed from: c */
            public final Bundle mo22260c(Bundle bundle) throws RemoteException {
                Parcel parcelM22114a = m22114a();
                C9392c.m22118b(parcelM22114a, bundle);
                Parcel parcelM22115b = m22115b(parcelM22114a);
                Bundle bundle2 = (Bundle) C9392c.m22117a(parcelM22115b, Bundle.CREATOR);
                parcelM22115b.recycle();
                return bundle2;
            }
        }

        /* JADX INFO: renamed from: b */
        public static IGetInstallReferrerService m22261b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return iInterfaceQueryLocalInterface instanceof IGetInstallReferrerService ? (IGetInstallReferrerService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.p279a.BinderC9391b
        /* JADX INFO: renamed from: a */
        protected final boolean mo22116a(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
            if (i != 1) {
                return false;
            }
            Bundle bundleC = mo22260c((Bundle) C9392c.m22117a(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            C9392c.m22119c(parcel2, bundleC);
            return true;
        }
    }

    /* JADX INFO: renamed from: c */
    Bundle mo22260c(Bundle bundle) throws RemoteException;
}
