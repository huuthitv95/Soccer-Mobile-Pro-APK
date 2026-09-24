package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.player.enums.EnumC8489b;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.controller.m */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8472m implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ EnumC8489b f18864a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC8476q f18865b;

    public RunnableC8472m(AbstractC8476q abstractC8476q, EnumC8489b enumC8489b) {
        this.f18865b = abstractC8476q;
        this.f18864a = enumC8489b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC8476q abstractC8476q;
        try {
            try {
                Iterator it = this.f18865b.f18868b.iterator();
                while (it.hasNext()) {
                    ((InterfaceC8475p) it.next()).mo20901a(this.f18864a);
                }
                EnumC8489b enumC8489b = this.f18864a;
                if (enumC8489b == EnumC8489b.Idle || enumC8489b == EnumC8489b.Error) {
                    AbstractC9195v.m22027a(this.f18865b.f18876j);
                    abstractC8476q = this.f18865b;
                    abstractC8476q.f18876j = null;
                    abstractC8476q.f18877k = null;
                }
            } catch (Exception e) {
                if (IAlog.f21426a <= 3) {
                    AbstractC8476q abstractC8476q2 = this.f18865b;
                    abstractC8476q2.getClass();
                    IAlog.m21944a("%sonPlayerStateChanged callback threw an exception!", e, IAlog.m21943a(abstractC8476q2));
                }
                EnumC8489b enumC8489b2 = this.f18864a;
                if (enumC8489b2 != EnumC8489b.Idle && enumC8489b2 != EnumC8489b.Error) {
                    return;
                }
                AbstractC9195v.m22027a(this.f18865b.f18876j);
                abstractC8476q = this.f18865b;
                abstractC8476q.f18876j = null;
            }
        } catch (Throwable th) {
            EnumC8489b enumC8489b3 = this.f18864a;
            if (enumC8489b3 == EnumC8489b.Idle || enumC8489b3 == EnumC8489b.Error) {
                AbstractC9195v.m22027a(this.f18865b.f18876j);
                AbstractC8476q abstractC8476q3 = this.f18865b;
                abstractC8476q3.f18876j = null;
                abstractC8476q3.f18877k = null;
            }
            throw th;
        }
    }
}
