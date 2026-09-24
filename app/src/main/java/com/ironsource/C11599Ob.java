package com.ironsource;

import android.app.Activity;
import com.ironsource.sdk.controller.C12496e;
import com.ironsource.sdk.controller.InterfaceC12497f;
import com.ironsource.sdk.controller.InterfaceC12503l;
import com.ironsource.sdk.utils.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.Ob */
/* JADX INFO: loaded from: classes6.dex */
public final class C11599Ob implements InterfaceC11617Pb {

    /* JADX INFO: renamed from: a */
    private final String f25285a;

    /* JADX INFO: renamed from: b */
    private final C12496e f25286b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC11664S8 f25287c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC12141d1 f25288d;

    /* JADX INFO: renamed from: e */
    private final String f25289e;

    /* JADX INFO: renamed from: f */
    private InterfaceC11617Pb.a f25290f;

    /* JADX INFO: renamed from: com.ironsource.Ob$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f25291a = new a();

        /* JADX INFO: renamed from: b */
        public static final String f25292b = "nativeAd.load";

        /* JADX INFO: renamed from: c */
        public static final String f25293c = "nativeAd.loadReport";

        /* JADX INFO: renamed from: d */
        public static final String f25294d = "nativeAd.register";

        /* JADX INFO: renamed from: e */
        public static final String f25295e = "nativeAd.click";

        /* JADX INFO: renamed from: f */
        public static final String f25296f = "nativeAd.privacyClick";

        /* JADX INFO: renamed from: g */
        public static final String f25297g = "nativeAd.visibilityChanged";

        /* JADX INFO: renamed from: h */
        public static final String f25298h = "nativeAd.destroy";

        private a() {
        }
    }

    public C11599Ob(String id, C12496e controllerManager, InterfaceC11664S8 imageLoader, InterfaceC12141d1 adViewManagement) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(controllerManager, "controllerManager");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(adViewManagement, "adViewManagement");
        this.f25285a = id;
        this.f25286b = controllerManager;
        this.f25287c = imageLoader;
        this.f25288d = adViewManagement;
        this.f25289e = "Ob";
        controllerManager.m33410a(id, m26755d());
    }

    /* JADX INFO: renamed from: d */
    private final InterfaceC12503l.b m26755d() {
        return new InterfaceC12503l.b() { // from class: com.ironsource.Ob$$ExternalSyntheticLambda3
            @Override // com.ironsource.sdk.controller.InterfaceC12503l.b
            /* JADX INFO: renamed from: a */
            public final void mo26766a(C11491Ib c11491Ib) {
                C11599Ob.m26750a(this.f$0, c11491Ib);
            }
        };
    }

    /* JADX INFO: renamed from: e */
    private final JSONObject m26756e() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(InterfaceC12497f.b.f32093g, a.f25295e).put("sdkCallback", C11744X3.h.f26279U);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "JSONObject()\n        .pu…hods.ON_RECEIVED_MESSAGE)");
        return jSONObjectPut;
    }

    @Override // com.ironsource.InterfaceC11617Pb
    /* JADX INFO: renamed from: a */
    public void mo26760a(InterfaceC11617Pb.a aVar) {
        this.f25290f = aVar;
    }

    @Override // com.ironsource.InterfaceC11617Pb
    /* JADX INFO: renamed from: b */
    public InterfaceC11617Pb.a mo26763b() {
        return this.f25290f;
    }

    @Override // com.ironsource.InterfaceC11617Pb
    /* JADX INFO: renamed from: c */
    public void mo26764c() {
        this.f25286b.mo33407a(new InterfaceC12497f.c(this.f25285a, a.f25296f, new JSONObject()), (InterfaceC12503l.a) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m26753b(C11599Ob this$0, InterfaceC12497f.a it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.m26754b(it);
    }

    @Override // com.ironsource.InterfaceC11617Pb
    /* JADX INFO: renamed from: a */
    public void mo26758a(final Activity activity, JSONObject loadParams) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        this.f25286b.mo33402a(activity);
        this.f25286b.mo33407a(new InterfaceC12497f.c(this.f25285a, a.f25292b, loadParams), new InterfaceC12503l.a() { // from class: com.ironsource.Ob$$ExternalSyntheticLambda4
            @Override // com.ironsource.sdk.controller.InterfaceC12503l.a
            /* JADX INFO: renamed from: a */
            public final void mo26765a(InterfaceC12497f.a aVar) {
                C11599Ob.m26748a(this.f$0, activity, aVar);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    private final void m26754b(InterfaceC12497f.a aVar) {
        if (aVar.m33435d() == null) {
            Logger.m33642i(this.f25289e, "failed to handle show on native ad: missing params");
            return;
        }
        if (!aVar.m33435d().optBoolean("success", false)) {
            String strOptString = aVar.m33435d().optString("reason", "unexpected error");
            Logger.m33642i(this.f25289e, "failed to handle show on native ad: " + strOptString);
            return;
        }
        InterfaceC11617Pb.a aVarMo26763b = mo26763b();
        if (aVarMo26763b != null) {
            aVarMo26763b.mo27244a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m26748a(C11599Ob this$0, Activity activity, InterfaceC12497f.a it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.m26744a(activity, it);
    }

    /* JADX INFO: renamed from: a */
    private final void m26744a(Activity activity, InterfaceC12497f.a aVar) {
        if (aVar.m33435d() == null) {
            InterfaceC11617Pb.a aVarMo26763b = mo26763b();
            if (aVarMo26763b != null) {
                aVarMo26763b.mo27246a("failed to load native ad: missing params");
                return;
            }
            return;
        }
        if (!aVar.m33435d().optBoolean("success", false)) {
            String reason = aVar.m33435d().optString("reason", "failed to load native ad: unexpected error");
            InterfaceC11617Pb.a aVarMo26763b2 = mo26763b();
            if (aVarMo26763b2 != null) {
                Intrinsics.checkNotNullExpressionValue(reason, "reason");
                aVarMo26763b2.mo27246a(reason);
                return;
            }
            return;
        }
        C11362B8.b bVarM25440a = new C11362B8.a(this.f25287c, this.f25288d).m25440a(activity, aVar.m33435d());
        m26745a(bVarM25440a, bVarM25440a.m25443a().m25454h());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C11599Ob(String str, C12496e c12496e, InterfaceC11664S8 interfaceC11664S8, InterfaceC12141d1 interfaceC12141d1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        interfaceC11664S8 = (i & 4) != 0 ? new C11647R8(null, 1, null) : interfaceC11664S8;
        if ((i & 8) != 0) {
            interfaceC12141d1 = C12282k8.m31929a();
            Intrinsics.checkNotNullExpressionValue(interfaceC12141d1, "getInstance()");
        }
        this(str, c12496e, interfaceC11664S8, interfaceC12141d1);
    }

    /* JADX INFO: renamed from: a */
    private final void m26745a(C11362B8.b bVar, final C11362B8 c11362b8) {
        this.f25286b.mo33407a(new InterfaceC12497f.c(this.f25285a, "nativeAd.loadReport." + this.f25285a, bVar.m25444b()), new InterfaceC12503l.a() { // from class: com.ironsource.Ob$$ExternalSyntheticLambda2
            @Override // com.ironsource.sdk.controller.InterfaceC12503l.a
            /* JADX INFO: renamed from: a */
            public final void mo26765a(InterfaceC12497f.a aVar) {
                C11599Ob.m26749a(this.f$0, c11362b8, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m26749a(C11599Ob this$0, C11362B8 adData, InterfaceC12497f.a it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adData, "$adData");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.m26746a(adData, it);
    }

    /* JADX INFO: renamed from: a */
    private final void m26746a(C11362B8 c11362b8, InterfaceC12497f.a aVar) {
        if (aVar.m33435d() == null) {
            InterfaceC11617Pb.a aVarMo26763b = mo26763b();
            if (aVarMo26763b != null) {
                aVarMo26763b.mo27246a("failed to load native ad: missing report params");
                return;
            }
            return;
        }
        if (!aVar.m33435d().optBoolean("success", false)) {
            String reason = aVar.m33435d().optString("reason", "failed to load native ad: unexpected error");
            InterfaceC11617Pb.a aVarMo26763b2 = mo26763b();
            if (aVarMo26763b2 != null) {
                Intrinsics.checkNotNullExpressionValue(reason, "reason");
                aVarMo26763b2.mo27246a(reason);
                return;
            }
            return;
        }
        InterfaceC11617Pb.a aVarMo26763b3 = mo26763b();
        if (aVarMo26763b3 != null) {
            aVarMo26763b3.mo27245a(c11362b8);
        }
    }

    @Override // com.ironsource.InterfaceC11617Pb
    /* JADX INFO: renamed from: a */
    public void mo26757a() {
        this.f25286b.mo33407a(new InterfaceC12497f.c(this.f25285a, a.f25298h, new JSONObject()), (InterfaceC12503l.a) null);
    }

    @Override // com.ironsource.InterfaceC11617Pb
    /* JADX INFO: renamed from: a */
    public void mo26759a(C11416E8 viewHolder) throws JSONException {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        JSONObject params = new JSONObject().put("assetViews", viewHolder.m25695t()).put("adViewClickCommand", m26756e());
        String str = this.f25285a;
        Intrinsics.checkNotNullExpressionValue(params, "params");
        this.f25286b.mo33407a(new InterfaceC12497f.c(str, a.f25294d, params), (InterfaceC12503l.a) null);
    }

    @Override // com.ironsource.InterfaceC11617Pb
    /* JADX INFO: renamed from: a */
    public void mo26761a(C12394ng viewVisibilityParams) {
        Intrinsics.checkNotNullParameter(viewVisibilityParams, "viewVisibilityParams");
        this.f25286b.mo33407a(new InterfaceC12497f.c(this.f25285a, a.f25297g, viewVisibilityParams.m32853g()), new InterfaceC12503l.a() { // from class: com.ironsource.Ob$$ExternalSyntheticLambda0
            @Override // com.ironsource.sdk.controller.InterfaceC12503l.a
            /* JADX INFO: renamed from: a */
            public final void mo26765a(InterfaceC12497f.a aVar) {
                C11599Ob.m26753b(this.f$0, aVar);
            }
        });
    }

    @Override // com.ironsource.InterfaceC11617Pb
    /* JADX INFO: renamed from: a */
    public void mo26762a(JSONObject clickParams) {
        Intrinsics.checkNotNullParameter(clickParams, "clickParams");
        this.f25286b.mo33407a(new InterfaceC12497f.c(this.f25285a, a.f25295e, clickParams), new InterfaceC12503l.a() { // from class: com.ironsource.Ob$$ExternalSyntheticLambda1
            @Override // com.ironsource.sdk.controller.InterfaceC12503l.a
            /* JADX INFO: renamed from: a */
            public final void mo26765a(InterfaceC12497f.a aVar) {
                C11599Ob.m26751a(this.f$0, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m26751a(C11599Ob this$0, InterfaceC12497f.a it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.m26752a(it);
    }

    /* JADX INFO: renamed from: a */
    private final void m26752a(InterfaceC12497f.a aVar) {
        if (aVar.m33435d() == null) {
            Logger.m33642i(this.f25289e, "failed to handle click on native ad: missing params");
            return;
        }
        if (!aVar.m33435d().optBoolean("success", false)) {
            String strOptString = aVar.m33435d().optString("reason", "unexpected error");
            Logger.m33642i(this.f25289e, "failed to handle click on native ad: " + strOptString);
            return;
        }
        InterfaceC11617Pb.a aVarMo26763b = mo26763b();
        if (aVarMo26763b != null) {
            aVarMo26763b.mo27247e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m26750a(C11599Ob this$0, C11491Ib msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (Intrinsics.areEqual(msg.m26098e(), a.f25295e)) {
            this$0.m26747a(msg);
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m26747a(C11491Ib c11491Ib) {
        if (c11491Ib.m26099f() == null) {
            Logger.m33642i(this.f25289e, "failed to handle click on native ad: missing params");
            return;
        }
        if (!c11491Ib.m26099f().optBoolean("success", false)) {
            String strOptString = c11491Ib.m26099f().optString("reason", "unexpected error");
            Logger.m33642i(this.f25289e, "failed to handle click on native ad: " + strOptString);
            return;
        }
        InterfaceC11617Pb.a aVarMo26763b = mo26763b();
        if (aVarMo26763b != null) {
            aVarMo26763b.mo27247e();
        }
    }
}
