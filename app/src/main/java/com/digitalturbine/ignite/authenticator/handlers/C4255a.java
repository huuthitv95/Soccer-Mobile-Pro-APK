package com.digitalturbine.ignite.authenticator.handlers;

import com.digitalturbine.ignite.authenticator.callbacks.BinderC4240b;
import com.digitalturbine.ignite.authenticator.decorator.C4248h;
import com.digitalturbine.ignite.p270cl.aidl.IIgniteServiceAPI;

/* JADX INFO: renamed from: com.digitalturbine.ignite.authenticator.handlers.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C4255a {

    /* JADX INFO: renamed from: a */
    public C4248h f17343a;

    /* JADX INFO: renamed from: b */
    public BinderC4240b f17344b = new BinderC4240b(this);

    /* JADX INFO: renamed from: c */
    public IIgniteServiceAPI f17345c;

    public C4255a(IIgniteServiceAPI iIgniteServiceAPI, C4248h c4248h) {
        this.f17343a = c4248h;
        this.f17345c = iIgniteServiceAPI;
    }
}
