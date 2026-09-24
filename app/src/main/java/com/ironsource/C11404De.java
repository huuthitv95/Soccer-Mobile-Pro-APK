package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.internal.AnalyticsEvents;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.De */
/* JADX INFO: loaded from: classes6.dex */
public final class C11404De implements InterfaceC11422Ee {

    /* JADX INFO: renamed from: a */
    private final C12113b9 f24224a;

    /* JADX WARN: Multi-variable type inference failed */
    public C11404De() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: b */
    private final InterfaceC12392ne m25631b(Context context, InterfaceC12535te interfaceC12535te, C12252ie c12252ie) throws Throwable {
        InterfaceC12392ne interfaceC12392neM25629a = m25629a(context, interfaceC12535te, c12252ie);
        if (interfaceC12392neM25629a instanceof InterfaceC12392ne.a) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "Null or invalid response. Trying to get cached response", 0);
            C11494Ie c11494IeMo33649a = interfaceC12535te.mo33649a(context, c12252ie.m31766d());
            if (c11494IeMo33649a != null && c11494IeMo33649a.m26143q()) {
                InterfaceC12392ne.b bVar = new InterfaceC12392ne.b(new C12270je(c11494IeMo33649a), null);
                IronSourceError ironSourceErrorBuildUsingCachedConfigurationError = ErrorBuilder.buildUsingCachedConfigurationError(c12252ie.m31766d(), c12252ie.m31768f());
                IronSourceLoggerManager.getLogger().log(ironSourceTag, ironSourceErrorBuildUsingCachedConfigurationError + ": " + bVar.m32842d(), 1);
                interfaceC12535te.mo33661b();
                return bVar;
            }
        }
        return interfaceC12392neM25629a;
    }

    @Override // com.ironsource.InterfaceC11422Ee
    /* JADX INFO: renamed from: a */
    public void mo25632a(Context context, C12252ie request, InterfaceC12535te tools, InterfaceC12216ge listener) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String strM31768f = request.m31768f();
        if (strM31768f == null) {
            strM31768f = "";
        }
        tools.mo33660a("userId", strM31768f);
        tools.mo33660a("appKey", request.m31766d());
        tools.mo33672g().m27362i(request.m31768f());
        tools.mo33671f();
        InterfaceC12392ne interfaceC12392neM25631b = m25631b(context, tools, request);
        if (interfaceC12392neM25631b instanceof InterfaceC12392ne.b) {
            InterfaceC12392ne.b bVar = (InterfaceC12392ne.b) interfaceC12392neM25631b;
            listener.mo26373a(new C12100ae(bVar.m32842d(), null, bVar.m32841c()));
        } else if (interfaceC12392neM25631b instanceof InterfaceC12392ne.a) {
            InterfaceC12392ne.a aVar = (InterfaceC12392ne.a) interfaceC12392neM25631b;
            tools.mo33656a(aVar.m32833e(), aVar.m32836h(), aVar.m32834f());
            listener.mo26374a(aVar.m32833e(), aVar.m32835g());
        }
    }

    public C11404De(C12113b9 performanceMeasurer) {
        Intrinsics.checkNotNullParameter(performanceMeasurer, "performanceMeasurer");
        this.f24224a = performanceMeasurer;
    }

    public /* synthetic */ C11404De(C12113b9 c12113b9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C12113b9(null, 1, null) : c12113b9);
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC12392ne m25629a(Context context, InterfaceC12535te interfaceC12535te, C12252ie c12252ie) throws Throwable {
        C12136ce c12136ce;
        try {
            String strMo33665c = interfaceC12535te.mo33665c(context);
            if (TextUtils.isEmpty(strMo33665c)) {
                strMo33665c = interfaceC12535te.mo33651a(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str = strMo33665c;
            C11767Y9 c11767y9Mo33664c = interfaceC12535te.mo33664c();
            String strM26297a = C11530Ke.m26297a(context, c12252ie.m31766d(), c12252ie.m31768f(), str, null, true, c11767y9Mo33664c != null ? c11767y9Mo33664c.m28032f() : null, false);
            String string = C12149d9.m31304a().toString();
            Intrinsics.checkNotNullExpressionValue(string, "createRequestData().toString()");
            InterfaceC12191f7 serverResponse = C12147d7.m31295a(strM26297a, string);
            if (serverResponse instanceof InterfaceC12191f7.a) {
                IronLog.INTERNAL.warning("HTTP init request failed: " + ((InterfaceC12191f7.a) serverResponse).mo31451a());
                Intrinsics.checkNotNullExpressionValue(serverResponse, "serverResponse");
                return new InterfaceC12392ne.a(m25628a((InterfaceC12191f7.a) serverResponse), strM26297a, string, null, 8, null);
            }
            if (serverResponse instanceof InterfaceC12191f7.b) {
                String strM31466d = ((InterfaceC12191f7.b) serverResponse).m31466d();
                if (interfaceC12535te.mo33668d()) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("encrypt");
                    JSONObject jSONObject = new JSONObject(strM31466d);
                    String encryptedResponse = jSONObject.optString(C11494Ie.f24627n);
                    if (TextUtils.isEmpty(encryptedResponse)) {
                        ironLog.warning("encryptedResponse is empty - return null");
                        return new InterfaceC12392ne.a(new C12136ce(2100, C12198fe.f30415h), strM26297a, string, null, 8, null);
                    }
                    boolean zOptBoolean = jSONObject.optBoolean("compression", false);
                    Intrinsics.checkNotNullExpressionValue(encryptedResponse, "encryptedResponse");
                    strM31466d = m25630a(encryptedResponse, zOptBoolean);
                    if (TextUtils.isEmpty(strM31466d)) {
                        ironLog.warning("encoded response invalid - return null");
                        interfaceC12535te.mo33669e();
                        return new InterfaceC12392ne.a(new C12136ce(C12136ce.f30181f, C12198fe.f30414g), strM26297a, string, null, 8, null);
                    }
                }
                this.f24224a.m31185a(strM31466d);
                C11494Ie c11494Ie = new C11494Ie(context, c12252ie.m31766d(), c12252ie.m31768f(), strM31466d);
                c11494Ie.m26132a(C11494Ie.a.SERVER);
                if (!c11494Ie.m26143q()) {
                    IronLog.INTERNAL.warning("response invalid - return null");
                    String strM26134e = c11494Ie.m26134e();
                    if (strM26134e == null) {
                        strM26134e = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
                    }
                    return new InterfaceC12392ne.a(new C12136ce(C12136ce.f30180e, strM26134e), strM26297a, string, this.f24224a);
                }
                return new InterfaceC12392ne.b(new C12270je(c11494Ie), this.f24224a);
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.warning("exception = " + e);
            if (e instanceof JSONException) {
                c12136ce = new C12136ce(C12136ce.f30180e, "serverResponseIsNotValid");
            } else {
                c12136ce = new C12136ce(510, "internal error");
            }
            return new InterfaceC12392ne.a(c12136ce, null, null, null, 14, null);
        }
    }

    /* JADX INFO: renamed from: a */
    private final String m25630a(String str, boolean z) {
        if (z) {
            String strM25868d = C11453G9.m25868d(C12261j5.m31853b().m31855c(), str);
            Intrinsics.checkNotNullExpressionValue(strM25868d, "{\n      IronSourceAES.de… encryptedResponse)\n    }");
            return strM25868d;
        }
        String strM25865b = C11453G9.m25865b(C12261j5.m31853b().m31855c(), str);
        Intrinsics.checkNotNullExpressionValue(strM25865b, "{\n      IronSourceAES.de… encryptedResponse)\n    }");
        return strM25865b;
    }

    /* JADX INFO: renamed from: a */
    private final C12136ce m25628a(InterfaceC12191f7.a aVar) {
        return new C12136ce(aVar.mo31452b() ? C12136ce.f30179d : C12136ce.f30183h, aVar.mo31451a());
    }
}
