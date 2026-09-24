package com.google.android.play.core.assetpacks.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.internal.d */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10105d extends C10080a implements InterfaceC10107f {
    C10105d(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.InterfaceC10107f
    /* JADX INFO: renamed from: c */
    public final void mo22727c(String str, List list, Bundle bundle, InterfaceC10109h interfaceC10109h) throws RemoteException {
        Parcel parcelM22700a = m22700a();
        parcelM22700a.writeString(str);
        parcelM22700a.writeTypedList(list);
        C10104c.m22726c(parcelM22700a, bundle);
        parcelM22700a.writeStrongBinder(interfaceC10109h);
        m22701b(14, parcelM22700a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.InterfaceC10107f
    /* JADX INFO: renamed from: d */
    public final void mo22728d(String str, Bundle bundle, Bundle bundle2, InterfaceC10109h interfaceC10109h) throws RemoteException {
        Parcel parcelM22700a = m22700a();
        parcelM22700a.writeString(str);
        C10104c.m22726c(parcelM22700a, bundle);
        C10104c.m22726c(parcelM22700a, bundle2);
        parcelM22700a.writeStrongBinder(interfaceC10109h);
        m22701b(11, parcelM22700a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.InterfaceC10107f
    /* JADX INFO: renamed from: e */
    public final void mo22729e(String str, Bundle bundle, InterfaceC10109h interfaceC10109h) throws RemoteException {
        Parcel parcelM22700a = m22700a();
        parcelM22700a.writeString(str);
        C10104c.m22726c(parcelM22700a, bundle);
        parcelM22700a.writeStrongBinder(interfaceC10109h);
        m22701b(5, parcelM22700a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.InterfaceC10107f
    /* JADX INFO: renamed from: f */
    public final void mo22730f(String str, Bundle bundle, InterfaceC10109h interfaceC10109h) throws RemoteException {
        Parcel parcelM22700a = m22700a();
        parcelM22700a.writeString(str);
        C10104c.m22726c(parcelM22700a, bundle);
        parcelM22700a.writeStrongBinder(interfaceC10109h);
        m22701b(10, parcelM22700a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.InterfaceC10107f
    /* JADX INFO: renamed from: g */
    public final void mo22731g(String str, Bundle bundle, Bundle bundle2, InterfaceC10109h interfaceC10109h) throws RemoteException {
        Parcel parcelM22700a = m22700a();
        parcelM22700a.writeString(str);
        C10104c.m22726c(parcelM22700a, bundle);
        C10104c.m22726c(parcelM22700a, bundle2);
        parcelM22700a.writeStrongBinder(interfaceC10109h);
        m22701b(6, parcelM22700a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.InterfaceC10107f
    /* JADX INFO: renamed from: h */
    public final void mo22732h(String str, Bundle bundle, Bundle bundle2, InterfaceC10109h interfaceC10109h) throws RemoteException {
        Parcel parcelM22700a = m22700a();
        parcelM22700a.writeString(str);
        C10104c.m22726c(parcelM22700a, bundle);
        C10104c.m22726c(parcelM22700a, bundle2);
        parcelM22700a.writeStrongBinder(interfaceC10109h);
        m22701b(7, parcelM22700a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.InterfaceC10107f
    /* JADX INFO: renamed from: i */
    public final void mo22733i(String str, Bundle bundle, Bundle bundle2, InterfaceC10109h interfaceC10109h) throws RemoteException {
        Parcel parcelM22700a = m22700a();
        parcelM22700a.writeString(str);
        C10104c.m22726c(parcelM22700a, bundle);
        C10104c.m22726c(parcelM22700a, bundle2);
        parcelM22700a.writeStrongBinder(interfaceC10109h);
        m22701b(9, parcelM22700a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.InterfaceC10107f
    /* JADX INFO: renamed from: j */
    public final void mo22734j(String str, Bundle bundle, Bundle bundle2, InterfaceC10109h interfaceC10109h) throws RemoteException {
        Parcel parcelM22700a = m22700a();
        parcelM22700a.writeString(str);
        C10104c.m22726c(parcelM22700a, bundle);
        C10104c.m22726c(parcelM22700a, bundle2);
        parcelM22700a.writeStrongBinder(interfaceC10109h);
        m22701b(13, parcelM22700a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.InterfaceC10107f
    /* JADX INFO: renamed from: k */
    public final void mo22735k(String str, List list, Bundle bundle, InterfaceC10109h interfaceC10109h) throws RemoteException {
        Parcel parcelM22700a = m22700a();
        parcelM22700a.writeString(str);
        parcelM22700a.writeTypedList(list);
        C10104c.m22726c(parcelM22700a, bundle);
        parcelM22700a.writeStrongBinder(interfaceC10109h);
        m22701b(12, parcelM22700a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.assetpacks.internal.InterfaceC10107f
    /* JADX INFO: renamed from: l */
    public final void mo22736l(String str, List list, Bundle bundle, InterfaceC10109h interfaceC10109h) throws RemoteException {
        Parcel parcelM22700a = m22700a();
        parcelM22700a.writeString(str);
        parcelM22700a.writeTypedList(list);
        C10104c.m22726c(parcelM22700a, bundle);
        parcelM22700a.writeStrongBinder(interfaceC10109h);
        m22701b(2, parcelM22700a);
    }
}
