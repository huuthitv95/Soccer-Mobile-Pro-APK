package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.p004os.OutcomeReceiver;
import com.chartboost.sdk.privacy.model.COPPA;
import com.ironsource.mediationsdk.metadata.C12364a;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.Bd */
/* JADX INFO: loaded from: classes6.dex */
public final class C11367Bd {

    /* JADX INFO: renamed from: a */
    private final InterfaceC11343A7 f23986a;

    /* JADX INFO: renamed from: b */
    private final Function0<Long> f23987b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC11451G7 f23988c;

    /* JADX INFO: renamed from: d */
    private final Executor f23989d;

    /* JADX INFO: renamed from: com.ironsource.Bd$a */
    /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Long> {

        /* JADX INFO: renamed from: a */
        public static final a f23990a = new a();

        a() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.Bd$b */
    public static final class b implements OutcomeReceiver<Object, Exception> {
        b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception error) {
            Intrinsics.checkNotNullParameter(error, "error");
            C11367Bd.this.m25503a(error.getMessage());
        }

        public void onResult(Object obj) {
            C11367Bd.this.m25506c();
        }
    }

    public C11367Bd() {
        this(null, null, null, null, 15, null);
    }

    /* JADX INFO: renamed from: b */
    private final boolean m25505b(Context context) {
        return IronSourceUtils.m32761c(context);
    }

    /* JADX INFO: renamed from: d */
    private final void m25507d() {
        this.f23986a.mo25281a(new C12580w5(EnumC12598x5.REGISTER_TRIGGER, (JSONObject) null));
    }

    /* JADX INFO: renamed from: c */
    public final void m25508c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        m25507d();
        try {
            MeasurementManager measurementManagerM31958a = C12292l0.m31958a(context);
            if (measurementManagerM31958a == null) {
                m25503a("could not obtain measurement manager");
            } else {
                measurementManagerM31958a.registerTrigger(m25499a(context), this.f23989d, m25500a());
            }
        } catch (Exception e) {
            m25503a(e.getMessage());
            C12317m4.m32153d().m32155a(e);
        }
    }

    public C11367Bd(InterfaceC11343A7 eventManager, Function0<Long> getTimeFunction, InterfaceC11451G7 serviceProvider, Executor executor) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(getTimeFunction, "getTimeFunction");
        Intrinsics.checkNotNullParameter(serviceProvider, "serviceProvider");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f23986a = eventManager;
        this.f23987b = getTimeFunction;
        this.f23988c = serviceProvider;
        this.f23989d = executor;
    }

    /* JADX INFO: renamed from: b */
    private final String m25504b() {
        ConcurrentHashMap<String, List<String>> concurrentHashMapM31877c = C12266ja.m31872b().m31877c();
        List<String> list = concurrentHashMapM31877c != null ? concurrentHashMapM31877c.get(C12364a.f31316b) : null;
        String str = list != null ? (String) CollectionsKt.first((List) list) : null;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: a */
    private final Uri m25499a(Context context) {
        InterfaceC12582w7 interfaceC12582w7Mo25842a = this.f23988c.mo25842a();
        String strM32733a = IronSourceUtils.m32733a(context);
        Uri uriBuild = new Uri.Builder().scheme("https").authority("android-att.ironsrc.mobi").path("register_trigger").appendQueryParameter("osVersion", Build.VERSION.RELEASE).appendQueryParameter("apiLevel", String.valueOf(Build.VERSION.SDK_INT)).appendQueryParameter("deviceModel", Build.MODEL).appendQueryParameter("sdkVersion", LevelPlay.getSdkVersion()).appendQueryParameter("bundleID", context.getPackageName()).appendQueryParameter(C11540L6.f24947V0, interfaceC12582w7Mo25842a.mo27878J(context)).appendQueryParameter(C11540L6.f24927L0, interfaceC12582w7Mo25842a.mo27934z(context)).appendQueryParameter("auid", interfaceC12582w7Mo25842a.mo27898e(context)).appendQueryParameter("isFirstSession", String.valueOf(m25505b(context))).appendQueryParameter(COPPA.COPPA_STANDARD, m25504b()).appendQueryParameter(C11540L6.f24984j0, String.valueOf(C12292l0.m31957a())).appendQueryParameter("origin", "1").appendQueryParameter("timestamp", String.valueOf(this.f23987b.invoke().longValue())).appendQueryParameter(C11744X3.j.f26475x, interfaceC12582w7Mo25842a.mo27896d(context)).appendQueryParameter("deviceCarrier", interfaceC12582w7Mo25842a.mo27930v(context)).appendQueryParameter("connectionType", strM32733a).appendQueryParameter(C11676T3.f25719b, String.valueOf(StringsKt.equals(strM32733a, C11676T3.f25719b, true))).build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "Builder()\n        .schem…arameter\n        .build()");
        return uriBuild;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C11367Bd(InterfaceC11343A7 interfaceC11343A7, Function0 function0, InterfaceC11451G7 interfaceC11451G7, Executor executor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        interfaceC11343A7 = (i & 1) != 0 ? C11455Gb.f24351s.m25905d().mo25850q() : interfaceC11343A7;
        function0 = (i & 2) != 0 ? a.f23990a : function0;
        interfaceC11451G7 = (i & 4) != 0 ? C11455Gb.f24351s.m25905d() : interfaceC11451G7;
        if ((i & 8) != 0) {
            executor = Executors.newSingleThreadExecutor();
            Intrinsics.checkNotNullExpressionValue(executor, "newSingleThreadExecutor()");
        }
        this(interfaceC11343A7, function0, interfaceC11451G7, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final void m25506c() {
        this.f23986a.mo25281a(new C12580w5(EnumC12598x5.REGISTER_TRIGGER_SUCCESS, (JSONObject) null));
    }

    /* JADX INFO: renamed from: a */
    private final OutcomeReceiver<Object, Exception> m25500a() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m25503a(String str) {
        this.f23986a.mo25281a(new C12580w5(EnumC12598x5.REGISTER_TRIGGER_FAIL, new JSONObject().put("reason", str)));
    }
}
