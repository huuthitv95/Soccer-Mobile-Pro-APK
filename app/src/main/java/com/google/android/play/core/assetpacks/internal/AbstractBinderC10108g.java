package com.google.android.play.core.assetpacks.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.internal.g */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractBinderC10108g extends BinderC10103b implements InterfaceC10109h {
    public AbstractBinderC10108g() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    @Override // com.google.android.play.core.assetpacks.internal.BinderC10103b
    /* JADX INFO: renamed from: a */
    protected final boolean mo22723a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                int i3 = parcel.readInt();
                Bundle bundle = (Bundle) C10104c.m22724a(parcel, Bundle.CREATOR);
                C10104c.m22725b(parcel);
                mo22495n(i3, bundle);
                return true;
            case 3:
                int i4 = parcel.readInt();
                Bundle bundle2 = (Bundle) C10104c.m22724a(parcel, Bundle.CREATOR);
                C10104c.m22725b(parcel);
                mo22483b(i4, bundle2);
                return true;
            case 4:
                int i5 = parcel.readInt();
                Bundle bundle3 = (Bundle) C10104c.m22724a(parcel, Bundle.CREATOR);
                C10104c.m22725b(parcel);
                mo22487f(i5, bundle3);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                C10104c.m22725b(parcel);
                mo22488g(arrayListCreateTypedArrayList);
                return true;
            case 6:
                Bundle bundle4 = (Bundle) C10104c.m22724a(parcel, Bundle.CREATOR);
                Bundle bundle5 = (Bundle) C10104c.m22724a(parcel, Bundle.CREATOR);
                C10104c.m22725b(parcel);
                mo22490i(bundle4, bundle5);
                return true;
            case 7:
                Bundle bundle6 = (Bundle) C10104c.m22724a(parcel, Bundle.CREATOR);
                C10104c.m22725b(parcel);
                mo22485d(bundle6);
                return true;
            case 8:
                Bundle bundle7 = (Bundle) C10104c.m22724a(parcel, Bundle.CREATOR);
                Bundle bundle8 = (Bundle) C10104c.m22724a(parcel, Bundle.CREATOR);
                C10104c.m22725b(parcel);
                mo22491j(bundle7, bundle8);
                return true;
            case 9:
            default:
                return false;
            case 10:
                Bundle bundle9 = (Bundle) C10104c.m22724a(parcel, Bundle.CREATOR);
                Bundle bundle10 = (Bundle) C10104c.m22724a(parcel, Bundle.CREATOR);
                C10104c.m22725b(parcel);
                mo22492k(bundle9, bundle10);
                return true;
            case 11:
                Bundle bundle11 = (Bundle) C10104c.m22724a(parcel, Bundle.CREATOR);
                Bundle bundle12 = (Bundle) C10104c.m22724a(parcel, Bundle.CREATOR);
                C10104c.m22725b(parcel);
                mo22489h(bundle11, bundle12);
                return true;
            case 12:
                Bundle bundle13 = (Bundle) C10104c.m22724a(parcel, Bundle.CREATOR);
                Bundle bundle14 = (Bundle) C10104c.m22724a(parcel, Bundle.CREATOR);
                C10104c.m22725b(parcel);
                mo22486e(bundle13, bundle14);
                return true;
            case 13:
                Bundle bundle15 = (Bundle) C10104c.m22724a(parcel, Bundle.CREATOR);
                Bundle bundle16 = (Bundle) C10104c.m22724a(parcel, Bundle.CREATOR);
                C10104c.m22725b(parcel);
                mo22494m(bundle15, bundle16);
                return true;
            case 14:
                Bundle bundle17 = (Bundle) C10104c.m22724a(parcel, Bundle.CREATOR);
                Bundle bundle18 = (Bundle) C10104c.m22724a(parcel, Bundle.CREATOR);
                C10104c.m22725b(parcel);
                mo22493l(bundle17, bundle18);
                return true;
            case 15:
                Bundle bundle19 = (Bundle) C10104c.m22724a(parcel, Bundle.CREATOR);
                C10104c.m22725b(parcel);
                mo22484c(bundle19);
                return true;
        }
    }
}
