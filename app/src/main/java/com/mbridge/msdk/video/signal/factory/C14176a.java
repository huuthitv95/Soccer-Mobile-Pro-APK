package com.mbridge.msdk.video.signal.factory;

import com.mbridge.msdk.video.signal.InterfaceC14079b;
import com.mbridge.msdk.video.signal.InterfaceC14080c;
import com.mbridge.msdk.video.signal.InterfaceC14173d;
import com.mbridge.msdk.video.signal.InterfaceC14175f;
import com.mbridge.msdk.video.signal.InterfaceC14178g;
import com.mbridge.msdk.video.signal.InterfaceC14180i;
import com.mbridge.msdk.video.signal.InterfaceC14199j;
import com.mbridge.msdk.video.signal.impl.C14182b;
import com.mbridge.msdk.video.signal.impl.C14183c;
import com.mbridge.msdk.video.signal.impl.C14184d;
import com.mbridge.msdk.video.signal.impl.C14185e;
import com.mbridge.msdk.video.signal.impl.C14186f;
import com.mbridge.msdk.video.signal.impl.C14187g;
import com.mbridge.msdk.video.signal.impl.C14188h;

/* JADX INFO: renamed from: com.mbridge.msdk.video.signal.factory.a */
/* JADX INFO: compiled from: DefaultJSFactory.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14176a implements IJSFactory {

    /* JADX INFO: renamed from: a */
    protected InterfaceC14079b f40891a;

    /* JADX INFO: renamed from: b */
    protected InterfaceC14173d f40892b;

    /* JADX INFO: renamed from: c */
    protected InterfaceC14199j f40893c;

    /* JADX INFO: renamed from: d */
    protected InterfaceC14178g f40894d;

    /* JADX INFO: renamed from: e */
    protected InterfaceC14175f f40895e;

    /* JADX INFO: renamed from: f */
    protected InterfaceC14180i f40896f;

    /* JADX INFO: renamed from: g */
    protected InterfaceC14080c f40897g;

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public InterfaceC14079b getActivityProxy() {
        if (this.f40891a == null) {
            this.f40891a = new C14182b();
        }
        return this.f40891a;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public InterfaceC14180i getIJSRewardVideoV1() {
        if (this.f40896f == null) {
            this.f40896f = new C14187g();
        }
        return this.f40896f;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public InterfaceC14080c getJSBTModule() {
        if (this.f40897g == null) {
            this.f40897g = new C14183c();
        }
        return this.f40897g;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public InterfaceC14173d getJSCommon() {
        if (this.f40892b == null) {
            this.f40892b = new C14184d();
        }
        return this.f40892b;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public InterfaceC14175f getJSContainerModule() {
        if (this.f40895e == null) {
            this.f40895e = new C14185e();
        }
        return this.f40895e;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public InterfaceC14178g getJSNotifyProxy() {
        if (this.f40894d == null) {
            this.f40894d = new C14186f();
        }
        return this.f40894d;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public InterfaceC14199j getJSVideoModule() {
        if (this.f40893c == null) {
            this.f40893c = new C14188h();
        }
        return this.f40893c;
    }
}
