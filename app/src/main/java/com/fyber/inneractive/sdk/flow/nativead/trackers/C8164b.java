package com.fyber.inneractive.sdk.flow.nativead.trackers;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.network.AbstractC8434z;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C9248m;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.nativead.trackers.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C8164b extends WebViewClient implements Handler.Callback {

    /* JADX INFO: renamed from: e */
    public static final String f18179e = IAlog.m21942a(C8164b.class);

    /* JADX INFO: renamed from: a */
    public final ConcurrentLinkedQueue f18180a;

    /* JADX INFO: renamed from: b */
    public InterfaceC8165c f18181b;

    /* JADX INFO: renamed from: c */
    public C9248m f18182c;

    /* JADX INFO: renamed from: d */
    public Handler f18183d = new Handler(Looper.getMainLooper(), this);

    public C8164b(ArrayList arrayList, InterfaceC8165c interfaceC8165c) {
        this.f18180a = new ConcurrentLinkedQueue(arrayList);
        this.f18181b = interfaceC8165c;
        C9248m c9248m = new C9248m();
        c9248m.setWebViewClient(this);
        c9248m.setVisibility(8);
        c9248m.getSettings().setJavaScriptEnabled(true);
        this.f18182c = c9248m;
    }

    /* JADX INFO: renamed from: a */
    public final void m20576a() {
        String str;
        Handler handler = this.f18183d;
        if (handler != null) {
            handler.removeMessages(13);
        }
        if (this.f18180a.isEmpty() || this.f18183d == null || this.f18182c == null || (str = (String) this.f18180a.poll()) == null) {
            Handler handler2 = this.f18183d;
            if (handler2 != null) {
                handler2.sendEmptyMessage(12);
                return;
            }
            return;
        }
        if (this.f18183d != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 14;
            messageObtain.obj = str;
            this.f18183d.sendMessage(messageObtain);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 12:
                InterfaceC8165c interfaceC8165c = this.f18181b;
                if (interfaceC8165c != null) {
                    interfaceC8165c.mo20577b();
                }
                return true;
            case 13:
                Object obj = message.obj;
                IAlog.m21946b("%sTimeout reached for tracker: %s", f18179e, obj != null ? obj.toString() : "unknown");
                m20576a();
                return true;
            case 14:
                Object obj2 = message.obj;
                if (obj2 != null) {
                    String str = f18179e;
                    IAlog.m21945a("%sLoading tracker %s", str, obj2);
                    String string = message.obj.toString();
                    Handler handler = this.f18183d;
                    if (handler == null || this.f18182c == null) {
                        IAlog.m21946b("%sWas destroyed. Unable to load JS tracker %s", str, string);
                    } else {
                        if (handler != null) {
                            Message messageObtain = Message.obtain();
                            messageObtain.what = 13;
                            messageObtain.obj = string;
                            this.f18183d.sendMessageDelayed(messageObtain, 5000L);
                        }
                        this.f18182c.loadDataWithBaseURL(null, string, "text/html", "UTF-8", null);
                    }
                }
                return true;
            default:
                return true;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC8434z.m20811a("WebViewRendererProcessGone", "Encountered WebViewRendererProcessGone while executing native JS tracking", null, null);
        Handler handler = this.f18183d;
        if (handler == null) {
            return true;
        }
        handler.sendEmptyMessage(12);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (TextUtils.isEmpty(str) || !str.contains("iaadfinishedloading")) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        IAlog.m21945a("%sTracker finished", f18179e);
        m20576a();
        return true;
    }
}
