package com.chartboost.sdk.impl;

import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.i3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3815i3 extends WebChromeClient implements C3741el.a, InterfaceC4199z8 {

    /* JADX INFO: renamed from: a */
    public final View f14545a;

    /* JADX INFO: renamed from: b */
    public final C3848jd f14546b;

    /* JADX INFO: renamed from: c */
    public final C3741el f14547c;

    /* JADX INFO: renamed from: d */
    public boolean f14548d;

    /* JADX INFO: renamed from: e */
    public WebChromeClient.CustomViewCallback f14549e;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.i3$a */
    public static final class a extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f14550b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f14551c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ConsoleMessage f14552d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ConsoleMessage consoleMessage, Continuation continuation) {
            super(2, continuation);
            this.f14551c = str;
            this.f14552d = consoleMessage;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f14551c, this.f14552d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f14550b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C4048sb.m19408a("Chartboost Rich Webview: " + this.f14551c + " -- From line " + this.f14552d.lineNumber() + " of " + this.f14552d.sourceId(), (Throwable) null, 2, (Object) null);
            return Unit.INSTANCE;
        }
    }

    public C3815i3(View activityNonVideoView, C3848jd cmd, C3741el c3741el) {
        Intrinsics.checkNotNullParameter(activityNonVideoView, "activityNonVideoView");
        Intrinsics.checkNotNullParameter(cmd, "cmd");
        this.f14545a = activityNonVideoView;
        this.f14546b = cmd;
        this.f14547c = c3741el;
        cmd.m18228a(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m17955a(String str) {
        C3741el c3741el = this.f14547c;
        if (c3741el != null) {
            c3741el.m17594a(str, this);
        }
    }

    @Override // com.chartboost.sdk.impl.C3741el.a
    /* JADX INFO: renamed from: a */
    public void mo17596a(JSONObject jSONObject) {
        this.f14546b.m18225a(jSONObject, EnumC3871kd.ERROR.m18416c());
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage cm) {
        Intrinsics.checkNotNullParameter(cm, "cm");
        String strMessage = cm.message();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new a(strMessage, cm, null), 3, null);
        Intrinsics.checkNotNull(strMessage);
        m17955a(strMessage);
        return true;
    }

    @Override // android.webkit.WebChromeClient, com.chartboost.sdk.impl.InterfaceC4199z8
    public void onHideCustomView() {
        WebChromeClient.CustomViewCallback customViewCallback;
        if (this.f14548d) {
            this.f14545a.setVisibility(0);
            WebChromeClient.CustomViewCallback customViewCallback2 = this.f14549e;
            if (customViewCallback2 != null && !StringsKt.contains$default((CharSequence) customViewCallback2.getClass().getName(), (CharSequence) ".chromium.", false, 2, (Object) null) && (customViewCallback = this.f14549e) != null) {
                customViewCallback.onCustomViewHidden();
            }
            this.f14548d = false;
            this.f14549e = null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (str2 == null) {
            return true;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String string = jSONObject.getString("eventType");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            JSONObject jSONObject2 = jSONObject.getJSONObject("eventArgs");
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(...)");
            String strM18225a = this.f14546b.m18225a(jSONObject2, string);
            if (jsPromptResult != null) {
                jsPromptResult.confirm(strM18225a);
            }
            return true;
        } catch (JSONException unused) {
            C4048sb.m19411b("Exception caught parsing the function name from js to native", (Throwable) null, 2, (Object) null);
            return true;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, customViewCallback);
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        if (view instanceof FrameLayout) {
            this.f14548d = true;
            this.f14549e = customViewCallback;
            this.f14545a.setVisibility(4);
        }
    }
}
