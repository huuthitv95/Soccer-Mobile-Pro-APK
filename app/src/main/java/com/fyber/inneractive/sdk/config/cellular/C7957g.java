package com.fyber.inneractive.sdk.config.cellular;

import android.content.Context;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.cellular.g */
/* JADX INFO: loaded from: classes4.dex */
public final class C7957g extends AbstractC7954d {

    /* JADX INFO: renamed from: d */
    public final C7956f f17713d;

    public C7957g(Context context) {
        super(context);
        this.f17713d = new C7956f(this.f17709b, this);
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.AbstractC7954d
    /* JADX INFO: renamed from: a */
    public final void mo20387a() {
        this.f17713d.m20391a();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f17710c;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
            this.f17710c = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.AbstractC7954d
    /* JADX INFO: renamed from: a */
    public final void mo20388a(C7951a c7951a) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f17710c;
        if (copyOnWriteArrayList != null) {
            try {
                copyOnWriteArrayList.add(c7951a);
            } catch (Throwable th) {
                IAlog.m21944a("failed to add networkUpdateListener", th, new Object[0]);
            }
        }
        this.f17713d.m20392b();
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.AbstractC7954d
    /* JADX INFO: renamed from: a */
    public final void mo20389a(InterfaceC7958h interfaceC7958h) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f17710c;
        if (copyOnWriteArrayList != null) {
            try {
                copyOnWriteArrayList.remove(interfaceC7958h);
            } catch (Throwable th) {
                IAlog.m21944a("failed to remove networkUpdateListener", th, new Object[0]);
            }
        }
        this.f17713d.m20393c();
    }
}
