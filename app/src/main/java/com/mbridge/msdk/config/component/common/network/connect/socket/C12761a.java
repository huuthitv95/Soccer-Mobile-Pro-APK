package com.mbridge.msdk.config.component.common.network.connect.socket;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.network.InterfaceC12757a;
import com.mbridge.msdk.config.component.common.network.result.C12764a;
import com.mbridge.msdk.config.component.common.network.retry.InterfaceC12765a;
import com.mbridge.msdk.config.component.nori.model.C12831a;
import com.mbridge.msdk.config.component.nori.monitor.C12832a;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.network.connect.socket.a */
/* JADX INFO: compiled from: ConnectionJavaSocket.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12761a {

    /* JADX INFO: renamed from: a */
    private C12831a f33950a;

    /* JADX INFO: renamed from: b */
    private C12764a f33951b;

    /* JADX INFO: renamed from: c */
    private InterfaceC12757a f33952c;

    /* JADX INFO: renamed from: d */
    private InterfaceC12765a f33953d;

    /* JADX INFO: renamed from: e */
    private RunnableC12762b f33954e;

    /* JADX INFO: renamed from: f */
    private C12832a f33955f;

    public C12761a(C12831a c12831a, C12764a c12764a, InterfaceC12757a interfaceC12757a) {
        this.f33950a = c12831a;
        this.f33951b = c12764a;
        this.f33952c = interfaceC12757a;
        this.f33955f = c12764a.m35157b();
    }

    /* JADX INFO: renamed from: a */
    public C12764a m35127a(String str) {
        if (TextUtils.isEmpty(str)) {
            return m35126a(1008, 1008, "URL cannot be empty");
        }
        RunnableC12762b runnableC12762b = new RunnableC12762b(this.f33950a, this.f33951b, this.f33952c);
        this.f33954e = runnableC12762b;
        runnableC12762b.m35143c(str);
        this.f33954e.m35142a(this.f33953d);
        C12763c.m35145a().m35150a(this.f33954e, this.f33955f);
        return this.f33951b;
    }

    /* JADX INFO: renamed from: a */
    public void m35128a() {
        RunnableC12762b runnableC12762b = this.f33954e;
        if (runnableC12762b != null) {
            runnableC12762b.m35141a();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m35129a(InterfaceC12765a interfaceC12765a) {
        this.f33953d = interfaceC12765a;
    }

    /* JADX INFO: renamed from: a */
    private C12764a m35126a(int i, int i2, String str) {
        this.f33951b.m35155a(str);
        this.f33951b.m35161c(i);
        this.f33951b.m35152a(i2);
        this.f33951b.m35158b(2);
        return this.f33951b;
    }
}
