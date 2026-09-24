package com.digitalturbine.ignite.authenticator.callbacks;

import android.text.TextUtils;
import com.digitalturbine.ignite.authenticator.C4237b;
import com.digitalturbine.ignite.authenticator.IgniteManager;
import com.digitalturbine.ignite.authenticator.decorator.C4248h;
import com.digitalturbine.ignite.authenticator.events.C4252b;
import com.digitalturbine.ignite.authenticator.events.EnumC4253c;
import com.digitalturbine.ignite.authenticator.events.EnumC4254d;
import com.digitalturbine.ignite.authenticator.handlers.C4255a;
import com.digitalturbine.ignite.authenticator.logger.C4259a;
import com.digitalturbine.ignite.authenticator.parsers.C4261b;
import com.digitalturbine.ignite.p270cl.aidl.IIgniteServiceCallback;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.digitalturbine.ignite.authenticator.callbacks.b */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC4240b extends IIgniteServiceCallback.Stub {

    /* JADX INFO: renamed from: a */
    public final ArrayList f17304a;

    public BinderC4240b(C4255a c4255a) {
        ArrayList arrayList = new ArrayList();
        this.f17304a = arrayList;
        arrayList.add(c4255a);
    }

    @Override // com.digitalturbine.ignite.p270cl.aidl.IIgniteServiceCallback
    public final void onError(String str) {
        C4259a.m20308a("%s : unable to retrieve property: %s", "IgnitePropertyCallback", str);
        Iterator it = this.f17304a.iterator();
        while (it.hasNext()) {
            C4248h c4248h = ((C4255a) it.next()).f17343a;
            if (c4248h != null) {
                C4259a.m20308a("%s : on one dt error", "OneDTAuthenticator");
                c4248h.f17338k.set(true);
                if (c4248h.f17331d != null) {
                    C4259a.m20309b("%s : on one dt error : %s", "IgniteManager", str);
                }
            }
        }
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
        C4259a.m20308a("%s : property retrieved", "IgnitePropertyCallback");
        Iterator it = this.f17304a.iterator();
        while (it.hasNext()) {
            C4248h c4248h = ((C4255a) it.next()).f17343a;
            if (c4248h != null) {
                if (TextUtils.isEmpty(str)) {
                    C4259a.m20308a("%s : on one dt error", "OneDTAuthenticator");
                    c4248h.f17338k.set(true);
                    if (c4248h.f17331d != null) {
                        C4259a.m20309b("%s : on one dt error : %s", "IgniteManager", "One DT is empty");
                    }
                    C4252b.m20298a(EnumC4254d.RAW_ONE_DT_ERROR, "error_code", EnumC4253c.ONE_DT_EMPTY_ENTITY.m20299a());
                } else {
                    c4248h.f17332e.m20321a(str);
                    c4248h.f17333f.getClass();
                    C4237b c4237bM20311a = C4261b.m20311a(str);
                    c4248h.f17334g = c4237bM20311a;
                    IgniteManager igniteManager = c4248h.f17331d;
                    if (igniteManager != null) {
                        C4259a.m20308a("%s : setting one dt entity", "IgniteManager");
                        igniteManager.f17295b = c4237bM20311a;
                    }
                }
            }
        }
    }
}
