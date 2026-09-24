package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.C12367p;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.se */
/* JADX INFO: loaded from: classes6.dex */
public final class C12517se implements InterfaceC12535te {

    /* JADX INFO: renamed from: a */
    private final C11648R9 f32409a = new C11648R9();

    /* JADX INFO: renamed from: b */
    private final C12423p9 f32410b = new C12423p9(IronSourceThreadManager.INSTANCE.getInitHandler());

    /* JADX INFO: renamed from: c */
    private final InterfaceC12582w7 f32411c = C11455Gb.f24351s.m25905d().mo25842a();

    /* JADX INFO: renamed from: com.ironsource.se$a */
    public static final class a extends AbstractRunnableC11754Xd {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Runnable f32412b;

        a(Runnable runnable) {
            this.f32412b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC11754Xd
        /* JADX INFO: renamed from: a */
        public void mo25366a() {
            this.f32412b.run();
        }
    }

    @Override // com.ironsource.InterfaceC12535te
    /* JADX INFO: renamed from: a */
    public InterfaceC12582w7 mo33650a() {
        return this.f32411c;
    }

    @Override // com.ironsource.InterfaceC12535te
    /* JADX INFO: renamed from: b */
    public void mo33662b(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, callback, 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC12535te
    /* JADX INFO: renamed from: c */
    public void mo33666c(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f32410b.m33068a(callback);
    }

    @Override // com.ironsource.InterfaceC12535te
    /* JADX INFO: renamed from: d */
    public void mo33667d(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f32410b.m33069b(runnable);
    }

    @Override // com.ironsource.InterfaceC12535te
    /* JADX INFO: renamed from: e */
    public void mo33670e(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC12535te
    /* JADX INFO: renamed from: f */
    public void mo33671f() {
        C12624yd.m34235c().m34237a();
    }

    @Override // com.ironsource.InterfaceC12535te
    /* JADX INFO: renamed from: g */
    public C11648R9 mo33672g() {
        return this.f32409a;
    }

    @Override // com.ironsource.InterfaceC12535te
    /* JADX INFO: renamed from: a */
    public void mo33659a(Runnable runnable, long j) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(runnable, j);
    }

    @Override // com.ironsource.InterfaceC12535te
    /* JADX INFO: renamed from: b */
    public boolean mo33663b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return IronSourceUtils.m32780g(context);
    }

    @Override // com.ironsource.InterfaceC12535te
    /* JADX INFO: renamed from: c */
    public String mo33665c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String strMo27297b = C12367p.m32628h().mo27297b(context);
        Intrinsics.checkNotNullExpressionValue(strMo27297b, "getInstance().getAdvertiserId(context)");
        return strMo27297b;
    }

    @Override // com.ironsource.InterfaceC12535te
    /* JADX INFO: renamed from: d */
    public boolean mo33668d() {
        return IronSourceUtils.m32779g();
    }

    @Override // com.ironsource.InterfaceC12535te
    /* JADX INFO: renamed from: e */
    public void mo33669e() {
        C12367p.m32628h().m32644I();
    }

    @Override // com.ironsource.InterfaceC12535te
    /* JADX INFO: renamed from: a */
    public void mo33655a(AbstractRunnableC11754Xd safeRunnable, long j) {
        Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        this.f32410b.m33067a(safeRunnable, j);
    }

    @Override // com.ironsource.InterfaceC12535te
    /* JADX INFO: renamed from: b */
    public void mo33661b() {
        C11455Gb.f24351s.m25905d().mo25850q().mo25281a(new C12580w5(EnumC12598x5.USING_CACHE_FOR_INIT_EVENT, IronSourceUtils.m32751b(false)));
    }

    @Override // com.ironsource.InterfaceC12535te
    /* JADX INFO: renamed from: c */
    public C11767Y9 mo33664c() {
        return C12367p.m32628h().m32673n();
    }

    @Override // com.ironsource.InterfaceC12535te
    /* JADX INFO: renamed from: a */
    public void mo33654a(AbstractRunnableC11754Xd safeRunnable) {
        Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        this.f32410b.m33066a(safeRunnable);
    }

    @Override // com.ironsource.InterfaceC12535te
    /* JADX INFO: renamed from: a */
    public void mo33658a(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new a(callback), 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC12535te
    /* JADX INFO: renamed from: a */
    public void mo33660a(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (TextUtils.isEmpty(value)) {
            return;
        }
        C11486I6.m26069a().m26071a(key, value);
    }

    @Override // com.ironsource.InterfaceC12535te
    /* JADX INFO: renamed from: a */
    public void mo33652a(long j, C11494Ie.a responseOrigin) {
        Intrinsics.checkNotNullParameter(responseOrigin, "responseOrigin");
        C12367p.m32628h().m32649a(j, responseOrigin);
    }

    @Override // com.ironsource.InterfaceC12535te
    /* JADX INFO: renamed from: a */
    public C11494Ie mo33649a(Context context, String appKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        return C12367p.m32628h().m32645a(context, appKey);
    }

    @Override // com.ironsource.InterfaceC12535te
    /* JADX INFO: renamed from: a */
    public String mo33651a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String strMo27886a = mo33650a().mo27886a(context);
        Intrinsics.checkNotNullExpressionValue(strMo27886a, "deviceInfoService.getOrG…UniqueIdentifier(context)");
        return strMo27886a;
    }

    @Override // com.ironsource.InterfaceC12535te
    /* JADX INFO: renamed from: a */
    public void mo33653a(C11427F1 reporterSettings) {
        Intrinsics.checkNotNullParameter(reporterSettings, "reporterSettings");
        C12317m4.m32153d().m32156a(reporterSettings.m25757b(), reporterSettings.m25759d(), reporterSettings.m25758c(), reporterSettings.m25760e(), IronSourceUtils.m32764d(), reporterSettings.m25756a(), reporterSettings.m25762g());
    }

    @Override // com.ironsource.InterfaceC12535te
    /* JADX INFO: renamed from: a */
    public void mo33657a(EnumC12446qe initStatus) {
        Intrinsics.checkNotNullParameter(initStatus, "initStatus");
        C12464re.f31842a.m33249a(initStatus);
    }

    @Override // com.ironsource.InterfaceC12535te
    /* JADX INFO: renamed from: a */
    public void mo33656a(C12136ce error, String str, String str2) {
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject jSONObjectM32751b = IronSourceUtils.m32751b(false);
        try {
            jSONObjectM32751b.put("errorCode", error.m31274c());
            jSONObjectM32751b.put("reason", error.m31275d());
            String str3 = "";
            if (!TextUtils.isEmpty(str)) {
                str3 = "request=" + str + ";";
            }
            if (!TextUtils.isEmpty(str2)) {
                str3 = str3 + "body=" + str2;
            }
            if (str3.length() > 0) {
                jSONObjectM32751b.put(IronSourceConstants.EVENTS_EXT1, str3);
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.getMessage());
        }
        C11455Gb.f24351s.m25905d().mo25850q().mo25281a(new C12580w5(EnumC12598x5.TROUBLESHOOTING_SERVER_INIT_FAILED, jSONObjectM32751b));
    }
}
