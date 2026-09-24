package com.ironsource;

import android.content.Context;
import android.os.Handler;
import android.view.Choreographer;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.C14640a;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.rb */
/* JADX INFO: loaded from: classes6.dex */
public class C12461rb {

    /* JADX INFO: renamed from: a */
    private final C12423p9 f31829a = new C12423p9(null, 1, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: com.ironsource.rb$a */
    public static final class a extends AbstractRunnableC11754Xd {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Runnable f31830b;

        a(Runnable runnable) {
            this.f31830b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC11754Xd
        /* JADX INFO: renamed from: a */
        public void mo25366a() {
            this.f31830b.run();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.rb$b */
    public static final class b extends AbstractRunnableC11754Xd {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Function0<Unit> f31831b;

        b(Function0<Unit> function0) {
            this.f31831b = function0;
        }

        @Override // com.ironsource.AbstractRunnableC11754Xd
        /* JADX INFO: renamed from: a */
        public void mo25366a() {
            this.f31831b.invoke();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m33230a(AbstractRunnableC11754Xd safeRunnable) {
        Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        m33218a(this, safeRunnable, 0L, 2, (Object) null);
    }

    /* JADX INFO: renamed from: b */
    public final void m33242b(final Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        m33222a(this, new Runnable() { // from class: com.ironsource.rb$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C12461rb.m33220a(this.f$0, runnable);
            }
        }, 0L, 2, (Object) null);
    }

    /* JADX INFO: renamed from: c */
    public final void m33244c(final Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        m33222a(this, new Runnable() { // from class: com.ironsource.rb$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C12461rb.m33224b(this.f$0, runnable);
            }
        }, 0L, 2, (Object) null);
    }

    /* JADX INFO: renamed from: d */
    public final void m33245d(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f31829a.m33069b(runnable);
    }

    /* JADX INFO: renamed from: e */
    public final void m33246e(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, callback, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m33220a(C12461rb this$0, Runnable runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        this$0.f31829a.m33069b(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m33224b(final C12461rb this$0, final Runnable runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: com.ironsource.rb$$ExternalSyntheticLambda0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                C12461rb.m33221a(this.f$0, runnable, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m33221a(C12461rb this$0, Runnable runnable, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        this$0.m33242b(runnable);
    }

    /* JADX INFO: renamed from: b */
    public final void m33241b(AbstractRunnableC11754Xd safeRunnable) {
        Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        this.f31829a.m33066a(safeRunnable);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m33222a(C12461rb c12461rb, Runnable runnable, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postOnUIThread");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        c12461rb.m33234a(runnable, j);
    }

    /* JADX INFO: renamed from: b */
    public final C12136ce m33240b(C12136ce error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return error.m31274c() == 2080 ? new C12136ce(error.m31274c(), "serverResponseIsNotValid") : error;
    }

    /* JADX INFO: renamed from: a */
    public final void m33234a(Runnable runnable, long j) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(runnable), j);
    }

    /* JADX INFO: renamed from: a */
    public final void m33233a(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f31829a.m33068a(callback);
    }

    /* JADX INFO: renamed from: a */
    public final void m33231a(AbstractRunnableC11754Xd safeRunnable, long j) {
        Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        this.f31829a.m33067a(safeRunnable, j);
    }

    /* JADX INFO: renamed from: b */
    public final void m33243b(String adUnitId, int i, String str) throws JSONException {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorCode", i);
        jSONObject.putOpt("reason", str);
        jSONObject.put("mediationAdUnitId", adUnitId);
        jSONObject.put("isMultipleAdUnits", 1);
        C12518sf.m33678a(EnumC12598x5.TROUBLESHOOTING_AD_UNIT_REWARD_PARSE_ERROR, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m33218a(C12461rb c12461rb, AbstractRunnableC11754Xd abstractRunnableC11754Xd, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postTask");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        c12461rb.m33231a(abstractRunnableC11754Xd, j);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m33223a(C12461rb c12461rb, Function0 function0, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postTask");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        c12461rb.m33237a((Function0<Unit>) function0, j);
    }

    /* JADX INFO: renamed from: a */
    public final void m33237a(Function0<Unit> action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        m33231a((AbstractRunnableC11754Xd) new b(action), j);
    }

    /* JADX INFO: renamed from: a */
    public final Handler m33225a() {
        return this.f31829a.m33065a();
    }

    /* JADX INFO: renamed from: a */
    public final void m33229a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C12387n9.a aVar = C12387n9.f31560a;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        aVar.m32822a(applicationContext);
    }

    /* JADX INFO: renamed from: a */
    public final IronSource.EnumC12328a[] m33239a(LevelPlay.AdFormat... adFormats) {
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        ArrayList arrayList = new ArrayList();
        for (LevelPlay.AdFormat adFormat : adFormats) {
            arrayList.add(m33227a(adFormat));
        }
        return (IronSource.EnumC12328a[]) arrayList.toArray(new IronSource.EnumC12328a[0]);
    }

    /* JADX INFO: renamed from: a */
    public final IronSource.EnumC12328a m33227a(LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        return C14640a.m43197a(adFormat);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m33238a(AdapterBaseInterface networkAdapter, IronSource.EnumC12328a adFormat, String providerName) {
        Intrinsics.checkNotNullParameter(networkAdapter, "networkAdapter");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        return C12518sf.m33681a(networkAdapter, adFormat, providerName);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m33217a(C12461rb c12461rb, long j, C11494Ie.a aVar, long j2, JSONObject jSONObject, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendInitSuccessEvent");
        }
        if ((i & 8) != 0) {
            jSONObject = new JSONObject();
        }
        c12461rb.m33228a(j, aVar, j2, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public final void m33228a(long j, C11494Ie.a responseOrigin, long j2, JSONObject data) {
        Intrinsics.checkNotNullParameter(responseOrigin, "responseOrigin");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            data.put("isMultipleAdUnits", 1);
            data.put("duration", j);
            String strM26145b = responseOrigin.m26145b();
            Intrinsics.checkNotNullExpressionValue(strM26145b, "responseOrigin.value");
            data.put(IronSourceConstants.EVENTS_EXT1, m33216a(strM26145b, j2));
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        C12518sf.m33678a(EnumC12598x5.SDK_INIT_SUCCESS, data);
    }

    /* JADX INFO: renamed from: a */
    public final C12136ce m33226a(C12136ce error) {
        Intrinsics.checkNotNullParameter(error, "error");
        int iM31274c = error.m31274c();
        if (iM31274c != 2070) {
            return iM31274c != 2110 ? error : new C12136ce(error.m31274c(), IronSourceConstants.FALSE_AVAILABILITY_REASON_BAD_REQUEST);
        }
        return new C12136ce(error.m31274c(), "noServerResponse");
    }

    /* JADX INFO: renamed from: a */
    private final String m33216a(String str, long j) {
        return "responseOrigin=" + str + ";delayTimeAfterInitProcess=" + j;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m33219a(C12461rb c12461rb, C12136ce c12136ce, long j, JSONObject jSONObject, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendInitFailedEvent");
        }
        if ((i & 4) != 0) {
            jSONObject = new JSONObject();
        }
        c12461rb.m33232a(c12136ce, j, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public final void m33232a(C12136ce error, long j, JSONObject data) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            data.put("errorCode", error.m31274c());
            data.put("reason", error.m31275d());
            data.put("isMultipleAdUnits", 1);
            data.put("duration", j);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        C12518sf.m33678a(EnumC12598x5.SDK_INIT_FAILED, data);
    }

    /* JADX INFO: renamed from: a */
    public final void m33236a(String placementName, LevelPlay.AdFormat adFormat, int i, String str) throws JSONException {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorCode", i);
        jSONObject.putOpt("reason", str);
        jSONObject.put("placement", placementName);
        jSONObject.put(C11683Ta.f25793f, adFormat.getValue());
        jSONObject.put("adf", C12518sf.m33684c(C14640a.m43197a(adFormat)));
        jSONObject.put("isMultipleAdUnits", 1);
        C12518sf.m33678a(EnumC12598x5.TROUBLESHOOTING_PLACEMENT_CAPPING_PARSE_ERROR, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public final void m33235a(String adUnitId, int i, String str) throws JSONException {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorCode", i);
        jSONObject.putOpt("reason", str);
        jSONObject.put("mediationAdUnitId", adUnitId);
        jSONObject.put("isMultipleAdUnits", 1);
        C12518sf.m33678a(EnumC12598x5.TROUBLESHOOTING_AD_UNIT_CAPPING_PARSE_ERROR, jSONObject);
    }
}
