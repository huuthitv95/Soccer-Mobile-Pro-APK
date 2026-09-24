package com.digitalturbine.ignite.authenticator.callbacks;

import com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a;
import com.digitalturbine.ignite.authenticator.events.C4252b;
import com.digitalturbine.ignite.authenticator.events.EnumC4254d;
import com.digitalturbine.ignite.authenticator.logger.C4259a;
import com.digitalturbine.ignite.p270cl.aidl.IIgniteServiceCallback;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.digitalturbine.ignite.authenticator.callbacks.a */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC4239a extends IIgniteServiceCallback.Stub {

    /* JADX INFO: renamed from: a */
    public final InterfaceServiceConnectionC4241a f17303a;

    public BinderC4239a(InterfaceServiceConnectionC4241a interfaceServiceConnectionC4241a) {
        this.f17303a = interfaceServiceConnectionC4241a;
    }

    @Override // com.digitalturbine.ignite.p270cl.aidl.IIgniteServiceCallback
    public final void onError(String str) {
        this.f17303a.mo20279a(str);
    }

    @Override // com.digitalturbine.ignite.p270cl.aidl.IIgniteServiceCallback
    public final void onProgress(String str) {
    }

    @Override // com.digitalturbine.ignite.p270cl.aidl.IIgniteServiceCallback
    public final void onScheduled(String str) {
    }

    @Override // com.digitalturbine.ignite.p270cl.aidl.IIgniteServiceCallback
    public final void onStart(String str) {
    }

    @Override // com.digitalturbine.ignite.p270cl.aidl.IIgniteServiceCallback
    public final void onSuccess(String str) {
        String string;
        try {
            string = new JSONObject(str).getJSONObject("data").getString("token");
        } catch (Exception e) {
            C4252b.m20297a(EnumC4254d.ONE_DT_GENERAL_ERROR, e);
            C4259a.m20309b("%s : resolveClientToken : %s", "IgniteAuthenticationCallback", e.toString());
            string = null;
        }
        this.f17303a.mo20284c(string);
    }
}
