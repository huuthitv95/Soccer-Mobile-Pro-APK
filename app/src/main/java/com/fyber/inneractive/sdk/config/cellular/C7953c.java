package com.fyber.inneractive.sdk.config.cellular;

import android.content.Context;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.cellular.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C7953c extends AbstractC7954d {

    /* JADX INFO: renamed from: d */
    public final C7952b f17707d;

    public C7953c(Context context) {
        super(context);
        this.f17707d = new C7952b(this.f17708a, this);
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.AbstractC7954d
    /* JADX INFO: renamed from: a */
    public final void mo20387a() {
        this.f17707d.m20384a();
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
        this.f17707d.m20385b();
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
        this.f17707d.m20386c();
    }
}
