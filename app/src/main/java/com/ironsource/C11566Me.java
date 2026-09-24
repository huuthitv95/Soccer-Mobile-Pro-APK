package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.Me */
/* JADX INFO: loaded from: classes6.dex */
public final class C11566Me {

    /* JADX INFO: renamed from: a */
    private C11746X5 f25168a;

    /* JADX INFO: renamed from: com.ironsource.Me$a */
    private final class a extends RunnableC11548Le {
        public a() {
        }

        @Override // com.ironsource.RunnableC11548Le, java.lang.Runnable
        public void run() {
            JSONObject jSONObjectM32751b = IronSourceUtils.m32751b(false);
            try {
                jSONObjectM32751b.put("duration", m26433a());
            } catch (JSONException e) {
                C12317m4.m32153d().m32155a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            C11787Zc.f26696P.mo25281a(new C12580w5(EnumC12598x5.APP_ENTER_BACKGROUND, jSONObjectM32751b));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m26558a(InterfaceC12263j7 applicationLifecycleService) {
        Intrinsics.checkNotNullParameter(applicationLifecycleService, "applicationLifecycleService");
        this.f25168a = new C11746X5(applicationLifecycleService, new a());
    }
}
