package com.mbridge.msdk.video.module.listener.impl;

import com.mbridge.msdk.video.module.listener.InterfaceC14058a;

/* JADX INFO: renamed from: com.mbridge.msdk.video.module.listener.impl.i */
/* JADX INFO: compiled from: ProxyOnNotifyListener.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14067i extends C14064f {

    /* JADX INFO: renamed from: a */
    protected InterfaceC14058a f40541a;

    public C14067i(InterfaceC14058a interfaceC14058a) {
        this.f40541a = interfaceC14058a;
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.C14064f, com.mbridge.msdk.video.module.listener.InterfaceC14058a
    /* JADX INFO: renamed from: a */
    public void mo41600a(int i, Object obj) {
        super.mo41600a(i, obj);
        InterfaceC14058a interfaceC14058a = this.f40541a;
        if (interfaceC14058a != null) {
            interfaceC14058a.mo41600a(i, obj);
        }
    }
}
