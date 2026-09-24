package com.ironsource;

import android.util.Log;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p300io.FilesKt;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.j4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12260j4 implements InterfaceC12475s7 {

    /* JADX INFO: renamed from: a */
    private final C12206g4 f30646a;

    /* JADX INFO: renamed from: b */
    private final Function1<C12601x8, Object> f30647b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC12600x7 f30648c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC12400o4 f30649d;

    /* JADX INFO: renamed from: e */
    private final String f30650e;

    /* JADX INFO: renamed from: f */
    private C12601x8 f30651f;

    /* JADX INFO: renamed from: g */
    private long f30652g;

    /* JADX INFO: renamed from: h */
    private final C11770Yc f30653h;

    /* JADX INFO: renamed from: i */
    private String f30654i;

    /* JADX INFO: renamed from: com.ironsource.j4$a */
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Result<? extends C12601x8>, Unit> {
        a(Object obj) {
            super(1, obj, C12260j4.class, "onHtmlDownloadFinished", "onHtmlDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        /* JADX INFO: renamed from: a */
        public final void m31850a(Object obj) {
            ((C12260j4) this.receiver).m31844b(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Result<? extends C12601x8> result) {
            m31850a(result.getValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j4$b */
    /* synthetic */ class b extends FunctionReferenceImpl implements Function1<Result<? extends JSONObject>, Unit> {
        b(Object obj) {
            super(1, obj, C12260j4.class, "onAbTestDownloadFinished", "onAbTestDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        /* JADX INFO: renamed from: a */
        public final void m31851a(Object obj) throws JSONException {
            ((C12260j4) this.receiver).m31842a(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Result<? extends JSONObject> result) throws JSONException {
            m31851a(result.getValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12260j4(C12206g4 config, Function1<? super C12601x8, ? extends Object> onFinish, InterfaceC12600x7 downloadManager, InterfaceC12400o4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f30646a = config;
        this.f30647b = onFinish;
        this.f30648c = downloadManager;
        this.f30649d = currentTimeProvider;
        this.f30650e = "j4";
        this.f30651f = new C12601x8(config.mo31529d(), "mobileController_0.html");
        this.f30652g = currentTimeProvider.mo32926a();
        this.f30653h = new C11770Yc(config.mo31526a());
        this.f30654i = "";
    }

    @Override // com.ironsource.InterfaceC12475s7
    /* JADX INFO: renamed from: c */
    public C12601x8 mo31848c() {
        return this.f30651f;
    }

    /* JADX INFO: renamed from: d */
    public final Function1<C12601x8, Object> m31849d() {
        return this.f30647b;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC12400o4 m31845a() {
        return this.f30649d;
    }

    @Override // com.ironsource.InterfaceC12475s7
    /* JADX INFO: renamed from: b */
    public void mo31847b() {
        this.f30652g = this.f30649d.mo32926a();
        new C12121c(new C12139d(this.f30653h), this.f30646a.mo31529d() + "/temp", this.f30648c, new b(this)).mo31206m();
    }

    @Override // com.ironsource.InterfaceC12475s7
    /* JADX INFO: renamed from: a */
    public boolean mo31846a(C12601x8 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        return new Regex("mobileController(_\\d+)?\\.html").matches(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m31842a(Object obj) throws JSONException {
        if (Result.m44952isFailureimpl(obj)) {
            obj = null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null && !Intrinsics.areEqual(jSONObject.optString("htmlBuildNumber"), "")) {
            SDKUtils.updateControllerConfig("abTestMap", jSONObject);
            String string = jSONObject.getString("htmlBuildNumber");
            Intrinsics.checkNotNullExpressionValue(string, "abTestMapAsJson.getString(\"htmlBuildNumber\")");
            this.f30654i = string;
            C12242i4 c12242i4M31840a = m31840a(string);
            if (c12242i4M31840a.mo31203j()) {
                C12601x8 c12601x8Mo31204k = c12242i4M31840a.mo31204k();
                this.f30651f = c12601x8Mo31204k;
                this.f30647b.invoke(c12601x8Mo31204k);
                return;
            }
            c12242i4M31840a.mo31206m();
            return;
        }
        m31840a("0").mo31206m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final void m31844b(Object obj) {
        if (Result.m44953isSuccessimpl(obj)) {
            C12601x8 c12601x8 = (C12601x8) (Result.m44952isFailureimpl(obj) ? null : obj);
            if (!Intrinsics.areEqual(c12601x8 != null ? c12601x8.getAbsolutePath() : null, this.f30651f.getAbsolutePath())) {
                try {
                    IronSourceStorageUtils.deleteFile(this.f30651f);
                    Intrinsics.checkNotNull(c12601x8);
                    FilesKt.copyTo$default(c12601x8, this.f30651f, true, 0, 4, null);
                } catch (Exception e) {
                    C12317m4.m32153d().m32155a(e);
                    Log.e(this.f30650e, "Unable to copy downloaded mobileController.html to cache folder: " + e.getMessage());
                }
                Intrinsics.checkNotNull(c12601x8);
                this.f30651f = c12601x8;
            }
            new InterfaceC12224h4.b(this.f30646a.mo31527b(), this.f30652g, this.f30649d).mo31585a();
        } else {
            new InterfaceC12224h4.a(this.f30646a.mo31527b()).mo31585a();
        }
        Function1<C12601x8, Object> function1 = this.f30647b;
        if (Result.m44952isFailureimpl(obj)) {
            obj = null;
        }
        function1.invoke((C12601x8) obj);
    }

    /* JADX INFO: renamed from: a */
    private final C12242i4 m31840a(String str) {
        return new C12242i4(new C12272jg(this.f30653h, str), this.f30646a.mo31529d() + "/mobileController_" + str + ".html", this.f30648c, new a(this));
    }
}
