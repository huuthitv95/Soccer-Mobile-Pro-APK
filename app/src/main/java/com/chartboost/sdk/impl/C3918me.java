package com.chartboost.sdk.impl;

import android.os.Build;
import com.chartboost.sdk.internal.Model.CBError;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.me */
/* JADX INFO: loaded from: classes9.dex */
public final class C3918me implements InterfaceC4080u, InterfaceC3911m7 {

    /* JADX INFO: renamed from: a */
    public final AbstractC3628a0 f15349a;

    /* JADX INFO: renamed from: b */
    public final C4131w6 f15350b;

    /* JADX INFO: renamed from: c */
    public final C3757fe f15351c;

    /* JADX INFO: renamed from: d */
    public final Function1 f15352d;

    /* JADX INFO: renamed from: e */
    public final Function0 f15353e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC3911m7 f15354f;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.me$a */
    /* JADX INFO: loaded from: classes3.dex */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final a f15355b = new a();

        public a() {
            super(1, JSONObject.class, "<init>", "<init>(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject invoke(String str) {
            return new JSONObject(str);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.me$b */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final b f15356b = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
    }

    public C3918me(AbstractC3628a0 adType, C4131w6 downloader, C3757fe openRTBAdUnitParser, Function1 jsonFactory, Function0 androidVersion, InterfaceC3911m7 eventTracker) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(openRTBAdUnitParser, "openRTBAdUnitParser");
        Intrinsics.checkNotNullParameter(jsonFactory, "jsonFactory");
        Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f15349a = adType;
        this.f15350b = downloader;
        this.f15351c = openRTBAdUnitParser;
        this.f15352d = jsonFactory;
        this.f15353e = androidVersion;
        this.f15354f = eventTracker;
    }

    public /* synthetic */ C3918me(AbstractC3628a0 abstractC3628a0, C4131w6 c4131w6, C3757fe c3757fe, Function1 function1, Function0 function0, InterfaceC3911m7 interfaceC3911m7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC3628a0, c4131w6, c3757fe, (i & 8) != 0 ? a.f15355b : function1, (i & 16) != 0 ? b.f15356b : function0, interfaceC3911m7);
    }

    /* JADX INFO: renamed from: a */
    public static final void m18646a(C3918me this$0, Function1 callback, C3982pb loaderParams, C3651b0 openRTBAdUnit, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(loaderParams, "$loaderParams");
        Intrinsics.checkNotNullParameter(openRTBAdUnit, "$openRTBAdUnit");
        if (z) {
            this$0.m18653a(callback, loaderParams, openRTBAdUnit);
        } else {
            this$0.m18652a(callback, loaderParams);
        }
    }

    /* JADX INFO: renamed from: a */
    public String m18647a(JSONObject jSONObject, String str, String str2) {
        return InterfaceC4080u.a.m19513a(this, jSONObject, str, str2);
    }

    /* JADX INFO: renamed from: a */
    public final void m18648a(InterfaceC3807hi interfaceC3807hi, String str, String str2, String str3) {
        track((AbstractC3738ei) new C3954o5(interfaceC3807hi, m18647a(new JSONObject(), str3, str2), this.f15349a.m16771b(), str, null, null, 48, null));
    }

    /* JADX INFO: renamed from: a */
    public final void m18649a(final C3982pb c3982pb, final C3651b0 c3651b0, final Function1 function1) {
        m18651a(this.f15350b, c3651b0, new InterfaceC4060t1() { // from class: com.chartboost.sdk.impl.me$$ExternalSyntheticLambda0
            @Override // com.chartboost.sdk.impl.InterfaceC4060t1
            /* JADX INFO: renamed from: a */
            public final void mo16798a(boolean z) {
                C3918me.m18646a(this.f$0, function1, c3982pb, c3651b0, z);
            }
        });
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4080u
    /* JADX INFO: renamed from: a */
    public void mo18650a(C3982pb params, Function1 callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (((Number) this.f15353e.invoke()).intValue() < 21) {
            m18657c(callback, params);
            return;
        }
        if (!m18655a(params)) {
            m18656b(callback, params);
            return;
        }
        try {
            String strM18864c = params.m19055a().m18864c();
            m18649a(params, this.f15351c.m17694a(this.f15349a, strM18864c != null ? (JSONObject) this.f15352d.invoke(strM18864c) : null), callback);
        } catch (JSONException e) {
            m18654a(callback, params, e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m18651a(C4131w6 c4131w6, C3651b0 c3651b0, InterfaceC4060t1 interfaceC4060t1) {
        Map mapM16862d = c3651b0.m16862d();
        AtomicInteger atomicInteger = new AtomicInteger();
        c4131w6.m19755c();
        c4131w6.m19751a(EnumC4095ue.HIGH, mapM16862d, atomicInteger, interfaceC4060t1, this.f15349a.m16771b());
    }

    /* JADX INFO: renamed from: a */
    public final void m18652a(Function1 function1, C3982pb c3982pb) {
        InterfaceC3807hi.a aVar = InterfaceC3807hi.a.ASSET_DOWNLOAD_ERROR;
        String strM18865d = c3982pb.m19055a().m18865d();
        String strM18864c = c3982pb.m19055a().m18864c();
        if (strM18864c == null) {
            strM18864c = "";
        }
        m18648a(aVar, strM18865d, strM18864c, "ASSETS_DOWNLOAD_FAILURE");
        function1.invoke(new C4004qb(c3982pb.m19055a(), null, new CBError(CBError.Internal.INVALID_RESPONSE, "Error parsing response"), 0L, 0L, 26, null));
    }

    /* JADX INFO: renamed from: a */
    public final void m18653a(Function1 function1, C3982pb c3982pb, C3651b0 c3651b0) {
        function1.invoke(new C4004qb(c3982pb.m19055a(), c3651b0, null, 0L, 0L, 24, null));
    }

    /* JADX INFO: renamed from: a */
    public final void m18654a(Function1 function1, C3982pb c3982pb, Exception exc) {
        InterfaceC3807hi.a aVar = InterfaceC3807hi.a.BID_RESPONSE_PARSING_ERROR;
        String strM18865d = c3982pb.m19055a().m18865d();
        String strM18864c = c3982pb.m19055a().m18864c();
        if (strM18864c == null) {
            strM18864c = "";
        }
        m18648a(aVar, strM18865d, strM18864c, exc.toString());
        function1.invoke(new C4004qb(c3982pb.m19055a(), null, new CBError(CBError.Internal.INVALID_RESPONSE, "Error parsing response"), 0L, 0L, 26, null));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m18655a(C3982pb c3982pb) {
        String strM18864c;
        return c3982pb.m19055a().m18865d().length() > 0 && (strM18864c = c3982pb.m19055a().m18864c()) != null && strM18864c.length() > 0;
    }

    /* JADX INFO: renamed from: b */
    public final void m18656b(Function1 function1, C3982pb c3982pb) {
        InterfaceC3807hi.a aVar = InterfaceC3807hi.a.BID_RESPONSE_PARSING_ERROR;
        String strM18865d = c3982pb.m19055a().m18865d();
        String strM18864c = c3982pb.m19055a().m18864c();
        if (strM18864c == null) {
            strM18864c = "";
        }
        m18648a(aVar, strM18865d, strM18864c, "Invalid bid response");
        function1.invoke(new C4004qb(c3982pb.m19055a(), null, new CBError(CBError.Internal.UNEXPECTED_RESPONSE, "Error parsing response"), 0L, 0L, 26, null));
    }

    /* JADX INFO: renamed from: c */
    public final void m18657c(Function1 function1, C3982pb c3982pb) {
        function1.invoke(new C4004qb(c3982pb.m19055a(), null, new CBError(CBError.Internal.UNSUPPORTED_OS_VERSION, "Unsupported Android version " + Build.VERSION.SDK_INT), 0L, 0L, 26, null));
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f15354f.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei clearFromStorage(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f15354f.clearFromStorage(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo43985clearFromStorage(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f15354f.mo43985clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei persist(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f15354f.persist(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: persist */
    public void mo43986persist(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f15354f.mo43986persist(event);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C3692ci refresh(C3692ci c3692ci) {
        Intrinsics.checkNotNullParameter(c3692ci, "<this>");
        return this.f15354f.refresh(c3692ci);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: refresh */
    public void mo43987refresh(C3692ci config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f15354f.mo43987refresh(config);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C4076th store(C4076th c4076th) {
        Intrinsics.checkNotNullParameter(c4076th, "<this>");
        return this.f15354f.store(c4076th);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: store */
    public void mo43988store(C4076th ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f15354f.mo43988store(ad);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei track(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f15354f.track(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: track */
    public void mo43989track(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f15354f.mo43989track(event);
    }
}
