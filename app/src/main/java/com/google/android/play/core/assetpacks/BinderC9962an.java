package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.an */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class BinderC9962an extends BinderC9960al {
    BinderC9962an(C9971aw c9971aw, TaskCompletionSource taskCompletionSource) {
        super(c9971aw, taskCompletionSource);
    }

    @Override // com.google.android.play.core.assetpacks.BinderC9960al, com.google.android.play.core.assetpacks.internal.InterfaceC10109h
    /* JADX INFO: renamed from: e */
    public final void mo22486e(Bundle bundle, Bundle bundle2) throws RemoteException {
        super.mo22486e(bundle, bundle2);
        this.f22008a.trySetResult((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}
