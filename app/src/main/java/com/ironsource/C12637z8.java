package com.ironsource;

import android.app.Activity;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.controller.C12496e;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.z8 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12637z8 implements InterfaceC11398D8 {

    /* JADX INFO: renamed from: j */
    public static final a f33244j = new a(null);

    /* JADX INFO: renamed from: a */
    private final String f33245a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC11617Pb f33246b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC12440q8 f33247c;

    /* JADX INFO: renamed from: d */
    private C11362B8 f33248d;

    /* JADX INFO: renamed from: e */
    private String f33249e;

    /* JADX INFO: renamed from: f */
    private String f33250f;

    /* JADX INFO: renamed from: g */
    private Long f33251g;

    /* JADX INFO: renamed from: h */
    private InterfaceC11398D8.a f33252h;

    /* JADX INFO: renamed from: i */
    private C11416E8 f33253i;

    /* JADX INFO: renamed from: com.ironsource.z8$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final C12637z8 m34269a() {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
            C12496e controllerManager = IronSourceNetwork.getControllerManager();
            Intrinsics.checkNotNullExpressionValue(controllerManager, "controllerManager");
            return new C12637z8(string, new C11599Ob(string, controllerManager, null, null, 12, null), new C12458r8());
        }

        private a() {
        }
    }

    public C12637z8(String id, InterfaceC11617Pb controller, InterfaceC12440q8 eventTracker) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f33245a = id;
        this.f33246b = controller;
        this.f33247c = eventTracker;
        controller.mo26760a(m34264f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final C12422p8 m34262d() {
        C12422p8 c12422p8M33061a = new C12422p8().m33061a(C11341A5.f23833x, this.f33250f).m33061a(C11341A5.f23831v, this.f33249e).m33061a(C11341A5.f23832w, C12386n8.e.NativeAd.toString()).m33061a(C11341A5.f23796I, Long.valueOf(m34266j()));
        Intrinsics.checkNotNullExpressionValue(c12422p8M33061a, "ISNEventParams()\n       …CUSTOM_C, loadDuration())");
        return c12422p8M33061a;
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final C12637z8 m34263e() {
        return f33244j.m34269a();
    }

    /* JADX INFO: renamed from: f */
    private final b m34264f() {
        return new b();
    }

    /* JADX INFO: renamed from: g */
    private final c m34265g() {
        return new c();
    }

    /* JADX INFO: renamed from: j */
    private final long m34266j() {
        Long l = this.f33251g;
        if (l == null) {
            return -1L;
        }
        return Calendar.getInstance().getTimeInMillis() - l.longValue();
    }

    /* JADX INFO: renamed from: h */
    public final String m34267h() {
        return this.f33249e;
    }

    /* JADX INFO: renamed from: i */
    public final String m34268i() {
        return this.f33250f;
    }

    @Override // com.ironsource.InterfaceC11398D8
    /* JADX INFO: renamed from: b */
    public InterfaceC11398D8.a mo25611b() {
        return this.f33252h;
    }

    @Override // com.ironsource.InterfaceC11398D8
    /* JADX INFO: renamed from: c */
    public C11362B8 mo25612c() {
        return this.f33248d;
    }

    /* JADX INFO: renamed from: com.ironsource.z8$b */
    public static final class b implements InterfaceC11617Pb.a {
        b() {
        }

        @Override // com.ironsource.InterfaceC11617Pb.a
        /* JADX INFO: renamed from: a */
        public void mo27245a(C11362B8 adData) {
            Intrinsics.checkNotNullParameter(adData, "adData");
            C12637z8.this.f33248d = adData;
            InterfaceC12440q8 interfaceC12440q8 = C12637z8.this.f33247c;
            C11703Ud.a loadAdSuccess = C11703Ud.f25973l;
            Intrinsics.checkNotNullExpressionValue(loadAdSuccess, "loadAdSuccess");
            HashMap<String, Object> mapM33062a = C12637z8.this.m34262d().m33062a();
            Intrinsics.checkNotNullExpressionValue(mapM33062a, "baseEventParams().data");
            interfaceC12440q8.mo33161a(loadAdSuccess, mapM33062a);
            InterfaceC11398D8.a aVarMo25611b = C12637z8.this.mo25611b();
            if (aVarMo25611b != null) {
                aVarMo25611b.onNativeAdLoadSuccess(adData);
            }
        }

        @Override // com.ironsource.InterfaceC11617Pb.a
        /* JADX INFO: renamed from: e */
        public void mo27247e() {
            InterfaceC11398D8.a aVarMo25611b = C12637z8.this.mo25611b();
            if (aVarMo25611b != null) {
                aVarMo25611b.onNativeAdClicked();
            }
        }

        @Override // com.ironsource.InterfaceC11617Pb.a
        /* JADX INFO: renamed from: a */
        public void mo27246a(String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            C12422p8 c12422p8M33061a = C12637z8.this.m34262d().m33061a(C11341A5.f23788A, reason);
            InterfaceC12440q8 interfaceC12440q8 = C12637z8.this.f33247c;
            C11703Ud.a loadAdFailed = C11703Ud.f25968g;
            Intrinsics.checkNotNullExpressionValue(loadAdFailed, "loadAdFailed");
            HashMap<String, Object> mapM33062a = c12422p8M33061a.m33062a();
            Intrinsics.checkNotNullExpressionValue(mapM33062a, "eventParams.data");
            interfaceC12440q8.mo33161a(loadAdFailed, mapM33062a);
            InterfaceC11398D8.a aVarMo25611b = C12637z8.this.mo25611b();
            if (aVarMo25611b != null) {
                aVarMo25611b.onNativeAdLoadFailed(reason);
            }
        }

        @Override // com.ironsource.InterfaceC11617Pb.a
        /* JADX INFO: renamed from: a */
        public void mo27244a() {
            InterfaceC11398D8.a aVarMo25611b = C12637z8.this.mo25611b();
            if (aVarMo25611b != null) {
                aVarMo25611b.onNativeAdShown();
            }
        }
    }

    @Override // com.ironsource.InterfaceC11398D8
    /* JADX INFO: renamed from: a */
    public void mo25609a(InterfaceC11398D8.a aVar) {
        this.f33252h = aVar;
    }

    @Override // com.ironsource.InterfaceC11398D8
    /* JADX INFO: renamed from: a */
    public void mo25608a(Activity activity, JSONObject loadParams) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        this.f33251g = Long.valueOf(Calendar.getInstance().getTimeInMillis());
        this.f33249e = loadParams.optString("demandSourceName");
        this.f33250f = loadParams.optString("inAppBidding");
        InterfaceC12440q8 interfaceC12440q8 = this.f33247c;
        C11703Ud.a loadAd = C11703Ud.f25967f;
        Intrinsics.checkNotNullExpressionValue(loadAd, "loadAd");
        HashMap<String, Object> mapM33062a = m34262d().m33062a();
        Intrinsics.checkNotNullExpressionValue(mapM33062a, "baseEventParams().data");
        interfaceC12440q8.mo33161a(loadAd, mapM33062a);
        JSONObject jSONObject = new JSONObject(loadParams.toString());
        jSONObject.put(C11744X3.i.f26403y0, String.valueOf(this.f33251g));
        this.f33246b.mo26758a(activity, jSONObject);
    }

    /* JADX INFO: renamed from: com.ironsource.z8$c */
    public static final class c implements C11416E8.a {

        /* JADX INFO: renamed from: com.ironsource.z8$c$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f33256a;

            static {
                int[] iArr = new int[C11416E8.b.values().length];
                try {
                    iArr[C11416E8.b.PrivacyIcon.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f33256a = iArr;
            }
        }

        c() {
        }

        @Override // com.ironsource.C11416E8.a
        /* JADX INFO: renamed from: a */
        public void mo25696a(C11416E8.b viewName) throws JSONException {
            Intrinsics.checkNotNullParameter(viewName, "viewName");
            if (a.f33256a[viewName.ordinal()] == 1) {
                C12637z8.this.f33246b.mo26764c();
                return;
            }
            JSONObject clickParams = new JSONObject().put("viewName", viewName.m25699b());
            InterfaceC11617Pb interfaceC11617Pb = C12637z8.this.f33246b;
            Intrinsics.checkNotNullExpressionValue(clickParams, "clickParams");
            interfaceC11617Pb.mo26762a(clickParams);
        }

        @Override // com.ironsource.C11416E8.a
        /* JADX INFO: renamed from: a */
        public void mo25697a(C12394ng viewVisibilityParams) {
            Intrinsics.checkNotNullParameter(viewVisibilityParams, "viewVisibilityParams");
            C12637z8.this.f33246b.mo26761a(viewVisibilityParams);
        }
    }

    @Override // com.ironsource.InterfaceC11398D8
    /* JADX INFO: renamed from: a */
    public void mo25610a(C11416E8 viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap<String, Object> mapM33062a = m34262d().m33062a();
        Intrinsics.checkNotNullExpressionValue(mapM33062a, "baseEventParams().data");
        linkedHashMap.putAll(mapM33062a);
        String string = viewHolder.m25695t().toString();
        Intrinsics.checkNotNullExpressionValue(string, "viewHolder.viewsStatus().toString()");
        linkedHashMap.put(C11341A5.f23834y, string);
        InterfaceC12440q8 interfaceC12440q8 = this.f33247c;
        C11703Ud.a registerAd = C11703Ud.f25975n;
        Intrinsics.checkNotNullExpressionValue(registerAd, "registerAd");
        interfaceC12440q8.mo33161a(registerAd, linkedHashMap);
        this.f33253i = viewHolder;
        viewHolder.m25672a(m34265g());
        this.f33246b.mo26759a(viewHolder);
    }

    @Override // com.ironsource.InterfaceC11398D8
    /* JADX INFO: renamed from: a */
    public void mo25607a() {
        C11416E8 c11416e8 = this.f33253i;
        if (c11416e8 != null) {
            c11416e8.m25672a((C11416E8.a) null);
        }
        this.f33246b.mo26757a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C12637z8(String str, InterfaceC11617Pb interfaceC11617Pb, InterfaceC12440q8 interfaceC12440q8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        this(str, interfaceC11617Pb, interfaceC12440q8);
    }
}
