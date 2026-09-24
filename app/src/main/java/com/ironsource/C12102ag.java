package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.ironsource.ag */
/* JADX INFO: loaded from: classes6.dex */
public final class C12102ag implements InterfaceC11773Yf {

    /* JADX INFO: renamed from: a */
    public static final C12102ag f30052a = new C12102ag();

    /* JADX INFO: renamed from: b */
    private static final Lazy f30053b = LazyKt.lazy(a.f30054a);

    /* JADX INFO: renamed from: com.ironsource.ag$a */
    static final class a extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: a */
        public static final a f30054a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            try {
                Object objInvoke = Class.forName(C11790Zf.f26700a).getMethod("getVersion", null).invoke(null, null);
                if (objInvoke instanceof String) {
                    return (String) objInvoke;
                }
                return null;
            } catch (Throwable th) {
                C12317m4.m32153d().m32155a(th);
                IronLog.INTERNAL.warning(th.getMessage());
                return null;
            }
        }
    }

    private C12102ag() {
    }

    @Override // com.ironsource.InterfaceC11773Yf
    /* JADX INFO: renamed from: a */
    public String mo28057a() {
        return (String) f30053b.getValue();
    }
}
