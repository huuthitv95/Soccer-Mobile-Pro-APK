package com.mbridge.msdk.config.dynamic.baseview.video;

/* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.video.a */
/* JADX INFO: compiled from: ComponentPlayerEventListener.java */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC12886a {
    /* JADX INFO: renamed from: a */
    void mo35566a(long j);

    /* JADX INFO: renamed from: a */
    void mo35567a(long j, long j2);

    void onBufferingEnd();

    void onBufferingStart();

    void onBufferingTimeOut(String str);

    void onPlayCompleted();

    void onPlayError(String str);
}
