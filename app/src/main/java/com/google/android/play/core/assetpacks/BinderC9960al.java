package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.internal.AbstractBinderC10108g;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.al */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
class BinderC9960al extends AbstractBinderC10108g {

    /* JADX INFO: renamed from: a */
    final TaskCompletionSource f22008a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C9971aw f22009b;

    BinderC9960al(C9971aw c9971aw, TaskCompletionSource taskCompletionSource) {
        this.f22009b = c9971aw;
        this.f22008a = taskCompletionSource;
    }

    @Override // com.google.android.play.core.assetpacks.internal.InterfaceC10109h
    /* JADX INFO: renamed from: b */
    public final void mo22483b(int i, Bundle bundle) {
        this.f22009b.f22026f.m22779u(this.f22008a);
        C9971aw.f22021a.m22752d("onCancelDownload(%d)", Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.assetpacks.internal.InterfaceC10109h
    /* JADX INFO: renamed from: c */
    public final void mo22484c(Bundle bundle) {
        this.f22009b.f22026f.m22779u(this.f22008a);
        C9971aw.f22021a.m22752d("onCancelDownloads()", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.internal.InterfaceC10109h
    /* JADX INFO: renamed from: d */
    public void mo22485d(Bundle bundle) {
        this.f22009b.f22026f.m22779u(this.f22008a);
        int i = bundle.getInt("error_code");
        C9971aw.f22021a.m22750b("onError(%d)", Integer.valueOf(i));
        this.f22008a.trySetException(new AssetPackException(i));
    }

    @Override // com.google.android.play.core.assetpacks.internal.InterfaceC10109h
    /* JADX INFO: renamed from: e */
    public void mo22486e(Bundle bundle, Bundle bundle2) throws RemoteException {
        this.f22009b.f22026f.m22779u(this.f22008a);
        C9971aw.f22021a.m22752d("onGetChunkFileDescriptor", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.internal.InterfaceC10109h
    /* JADX INFO: renamed from: f */
    public final void mo22487f(int i, Bundle bundle) {
        this.f22009b.f22026f.m22779u(this.f22008a);
        C9971aw.f22021a.m22752d("onGetSession(%d)", Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.assetpacks.internal.InterfaceC10109h
    /* JADX INFO: renamed from: g */
    public void mo22488g(List list) {
        this.f22009b.f22026f.m22779u(this.f22008a);
        C9971aw.f22021a.m22752d("onGetSessionStates", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.internal.InterfaceC10109h
    /* JADX INFO: renamed from: h */
    public void mo22489h(Bundle bundle, Bundle bundle2) {
        this.f22009b.f22027g.m22779u(this.f22008a);
        C9971aw.f22021a.m22752d("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    @Override // com.google.android.play.core.assetpacks.internal.InterfaceC10109h
    /* JADX INFO: renamed from: i */
    public final void mo22490i(Bundle bundle, Bundle bundle2) {
        this.f22009b.f22026f.m22779u(this.f22008a);
        C9971aw.f22021a.m22752d("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt(SDKAnalyticsEvents.PARAMETER_SESSION_ID)));
    }

    @Override // com.google.android.play.core.assetpacks.internal.InterfaceC10109h
    /* JADX INFO: renamed from: j */
    public final void mo22491j(Bundle bundle, Bundle bundle2) {
        this.f22009b.f22026f.m22779u(this.f22008a);
        C9971aw.f22021a.m22752d("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt(SDKAnalyticsEvents.PARAMETER_SESSION_ID)));
    }

    @Override // com.google.android.play.core.assetpacks.internal.InterfaceC10109h
    /* JADX INFO: renamed from: k */
    public final void mo22492k(Bundle bundle, Bundle bundle2) {
        this.f22009b.f22026f.m22779u(this.f22008a);
        C9971aw.f22021a.m22752d("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt(SDKAnalyticsEvents.PARAMETER_SESSION_ID)));
    }

    @Override // com.google.android.play.core.assetpacks.internal.InterfaceC10109h
    /* JADX INFO: renamed from: l */
    public final void mo22493l(Bundle bundle, Bundle bundle2) {
        this.f22009b.f22026f.m22779u(this.f22008a);
        C9971aw.f22021a.m22752d("onRemoveModule()", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.internal.InterfaceC10109h
    /* JADX INFO: renamed from: m */
    public void mo22494m(Bundle bundle, Bundle bundle2) {
        this.f22009b.f22026f.m22779u(this.f22008a);
        C9971aw.f22021a.m22752d("onRequestDownloadInfo()", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.internal.InterfaceC10109h
    /* JADX INFO: renamed from: n */
    public void mo22495n(int i, Bundle bundle) {
        this.f22009b.f22026f.m22779u(this.f22008a);
        C9971aw.f22021a.m22752d("onStartDownload(%d)", Integer.valueOf(i));
    }
}
