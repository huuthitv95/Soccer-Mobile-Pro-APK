package com.digitalturbine.ignite.authenticator.decorator;

import com.digitalturbine.ignite.authenticator.entities.C4250a;
import com.digitalturbine.ignite.authenticator.events.C4252b;
import com.digitalturbine.ignite.authenticator.events.EnumC4254d;
import com.digitalturbine.ignite.authenticator.logger.C4259a;
import com.digitalturbine.ignite.authenticator.parsers.AbstractC4260a;
import com.digitalturbine.ignite.authenticator.utils.concurency.AbstractC4265c;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.digitalturbine.ignite.authenticator.decorator.c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC4243c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Runnable f17306a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C4245e f17307b;

    public RunnableC4243c(C4245e c4245e, RunnableC4244d runnableC4244d) {
        this.f17307b = c4245e;
        this.f17306a = runnableC4244d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4250a c4250aM20310a;
        C4245e c4245e = this.f17307b;
        if (c4245e.mo20280a()) {
            try {
                c4250aM20310a = AbstractC4260a.m20310a(new JSONObject(c4245e.f17320j.version()));
            } catch (Exception e) {
                C4252b.m20297a(EnumC4254d.ONE_DT_GENERAL_ERROR, e);
                C4259a.m20309b("%s: resolveIgniteServiceVersion : unable to resolve version : %s", "IgniteAuthenticationComponent", e.toString());
                c4250aM20310a = new C4250a(false, "");
            }
        } else {
            c4250aM20310a = new C4250a(false, "");
        }
        c4245e.f17319i = c4250aM20310a;
        AbstractC4265c.f17352b.post(this.f17306a);
    }
}
