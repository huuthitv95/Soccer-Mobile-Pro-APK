package com.chartboost.sdk.internal.clickthrough;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.impl.AbstractC3738ei;
import com.chartboost.sdk.impl.AbstractC4142wh;
import com.chartboost.sdk.impl.C3796h7;
import com.chartboost.sdk.impl.C4048sb;
import com.chartboost.sdk.impl.InterfaceC3807hi;
import com.chartboost.sdk.impl.InterfaceC3911m7;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m43474d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0002\t\u000fB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001b\u0010\u0016\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\t\u0010\u0015R\u001b\u0010\u001a\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001e"}, m43475d2 = {"Lcom/chartboost/sdk/internal/clickthrough/EmbeddedBrowserActivity;", "Landroid/app/Activity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "t", "a", "(Ljava/lang/Throwable;)V", "Lcom/chartboost/sdk/impl/m7;", "Lcom/chartboost/sdk/impl/m7;", "eventTracker", "Landroid/view/View;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lkotlin/Lazy;", "()Landroid/view/View;", "view", "Landroid/widget/FrameLayout;", "c", "()Landroid/widget/FrameLayout;", "frameLayout", "Landroid/webkit/WebView;", "d", "()Landroid/webkit/WebView;", "webView", "<init>", "()V", "Companion", "ChartboostMonetization-9.11.1_productionRelease"}, m43476k = 1, m43477mv = {1, 9, 0})
public final class EmbeddedBrowserActivity extends Activity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public InterfaceC3911m7 eventTracker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Lazy view = LazyKt.lazy(new C4223d());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final Lazy frameLayout = LazyKt.lazy(new C4222c());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final Lazy webView = LazyKt.lazy(new C4224e());

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.clickthrough.EmbeddedBrowserActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Intent m20191a(Context context, String url) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(url, "url");
            Intent intentPutExtra = new Intent(context, (Class<?>) EmbeddedBrowserActivity.class).putExtra("KEY_INTENT_URL", url);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }

        /* JADX INFO: renamed from: a */
        public final String m20192a(Intent intent) {
            if (intent != null) {
                return intent.getStringExtra("KEY_INTENT_URL");
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.clickthrough.EmbeddedBrowserActivity$b */
    public final class C4221b extends WebViewClient {

        /* JADX INFO: renamed from: a */
        public final List f17214a = CollectionsKt.listOf((Object[]) new Integer[]{-1, -2, -3, -6, -9, -10, -11, -12});

        public C4221b() {
        }

        /* JADX INFO: renamed from: a */
        public final String m20193a(WebResourceError webResourceError) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            Intent intent = EmbeddedBrowserActivity.this.getIntent();
            jSONObject.put("url", intent != null ? EmbeddedBrowserActivity.INSTANCE.m20192a(intent) : null);
            CharSequence description = webResourceError != null ? webResourceError.getDescription() : null;
            if (description == null) {
                description = "";
            } else {
                Intrinsics.checkNotNull(description);
            }
            jSONObject.put("error", description);
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }

        /* JADX INFO: renamed from: a */
        public final String m20194a(WebResourceResponse webResourceResponse) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            Intent intent = EmbeddedBrowserActivity.this.getIntent();
            jSONObject.put("url", intent != null ? EmbeddedBrowserActivity.INSTANCE.m20192a(intent) : null);
            jSONObject.put("error", "HTTP status code: " + (webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null));
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }

        /* JADX INFO: renamed from: b */
        public final void m20195b(WebResourceResponse webResourceResponse) {
            InterfaceC3911m7 interfaceC3911m7 = EmbeddedBrowserActivity.this.eventTracker;
            if (interfaceC3911m7 == null || interfaceC3911m7.track((AbstractC3738ei) new C3796h7(InterfaceC3807hi.g.FAILURE, m20194a(webResourceResponse), null, null, null, 28, null)) == null) {
                C4048sb.m19411b("SDK is not initialized. Cannot track error: " + webResourceResponse, (Throwable) null, 2, (Object) null);
                Unit unit = Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: b */
        public final boolean m20196b(WebResourceError webResourceError) {
            List list = this.f17214a;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (webResourceError != null && iIntValue == webResourceError.getErrorCode()) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: c */
        public final void m20197c(WebResourceError webResourceError) {
            if (m20196b(webResourceError)) {
                InterfaceC3911m7 interfaceC3911m7 = EmbeddedBrowserActivity.this.eventTracker;
                if (interfaceC3911m7 == null || interfaceC3911m7.track((AbstractC3738ei) new C3796h7(InterfaceC3807hi.g.FAILURE, m20193a(webResourceError), null, null, null, 28, null)) == null) {
                    C4048sb.m19411b("SDK is not initialized. Cannot track error: " + webResourceError, (Throwable) null, 2, (Object) null);
                    Unit unit = Unit.INSTANCE;
                }
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            C4048sb.m19411b("onReceivedError: " + webResourceError, (Throwable) null, 2, (Object) null);
            m20197c(webResourceError);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            C4048sb.m19411b("onReceivedHttpError: " + webResourceResponse, (Throwable) null, 2, (Object) null);
            m20195b(webResourceResponse);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0037  */
        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            String str;
            InterfaceC3911m7 interfaceC3911m7 = EmbeddedBrowserActivity.this.eventTracker;
            if (interfaceC3911m7 != null) {
                InterfaceC3807hi.b bVar = InterfaceC3807hi.b.FAILURE;
                if (renderProcessGoneDetail == null || !renderProcessGoneDetail.didCrash()) {
                    str = "Webview killed, likely due to low memory";
                } else {
                    str = "Webview crashed " + renderProcessGoneDetail;
                }
                if (interfaceC3911m7.track((AbstractC3738ei) new C3796h7(bVar, str, null, null, null, 28, null)) == null) {
                    C4048sb.m19411b("SDK is not initialized. Cannot track render process gone event", (Throwable) null, 2, (Object) null);
                    Unit unit = Unit.INSTANCE;
                }
            } else {
                C4048sb.m19411b("SDK is not initialized. Cannot track render process gone event", (Throwable) null, 2, (Object) null);
                Unit unit2 = Unit.INSTANCE;
            }
            Context context = webView != null ? webView.getContext() : null;
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null) {
                activity.finish();
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.clickthrough.EmbeddedBrowserActivity$c */
    public static final class C4222c extends Lambda implements Function0 {
        public C4222c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FrameLayout invoke() {
            FrameLayout frameLayout = new FrameLayout(EmbeddedBrowserActivity.this);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return frameLayout;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.clickthrough.EmbeddedBrowserActivity$d */
    public static final class C4223d extends Lambda implements Function0 {
        public C4223d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FrameLayout invoke() {
            FrameLayout frameLayoutM20186a = EmbeddedBrowserActivity.this.m20186a();
            frameLayoutM20186a.addView(EmbeddedBrowserActivity.this.m20189c());
            return frameLayoutM20186a;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.clickthrough.EmbeddedBrowserActivity$e */
    public static final class C4224e extends Lambda implements Function0 {
        public C4224e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WebView invoke() {
            WebView webView = new WebView(EmbeddedBrowserActivity.this);
            EmbeddedBrowserActivity embeddedBrowserActivity = EmbeddedBrowserActivity.this;
            webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            webView.setWebViewClient(embeddedBrowserActivity.new C4221b());
            return webView;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m20185a(EmbeddedBrowserActivity embeddedBrowserActivity, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        embeddedBrowserActivity.m20187a(th);
    }

    /* JADX INFO: renamed from: a */
    public final FrameLayout m20186a() {
        return (FrameLayout) this.frameLayout.getValue();
    }

    /* JADX INFO: renamed from: a */
    public final void m20187a(Throwable t) {
        C4048sb.m19410b("Error loading URL into embedded browser", t);
        finish();
    }

    /* JADX INFO: renamed from: b */
    public final View m20188b() {
        return (View) this.view.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final WebView m20189c() {
        return (WebView) this.webView.getValue();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Object objM44946constructorimpl;
        Unit unit;
        try {
            Result.Companion companion = Result.INSTANCE;
            super.onCreate(savedInstanceState);
            if (Chartboost.isSdkStarted()) {
                this.eventTracker = AbstractC4142wh.m19810a();
            }
            setContentView(m20188b());
            String strM20192a = INSTANCE.m20192a(getIntent());
            if (strM20192a != null) {
                m20189c().loadUrl(strM20192a);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                m20185a(this, null, 1, null);
            }
            objM44946constructorimpl = Result.m44946constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
        if (thM44949exceptionOrNullimpl != null) {
            m20187a(thM44949exceptionOrNullimpl);
        }
    }
}
