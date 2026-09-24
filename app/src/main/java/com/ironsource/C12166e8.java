package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.e8 */
/* JADX INFO: loaded from: classes6.dex */
public class C12166e8 extends FrameLayout implements InterfaceC11434F8 {

    /* JADX INFO: renamed from: b */
    private static final String f30296b = "IronSourceAdContainer";

    /* JADX INFO: renamed from: a */
    private C12264j8 f30297a;

    /* JADX INFO: renamed from: com.ironsource.e8$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f30298a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f30299b;

        a(String str, String str2) {
            this.f30298a = str;
            this.f30299b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12166e8 c12166e8 = C12166e8.this;
            c12166e8.removeView(c12166e8.f30297a.getPresentingView());
            C12166e8.this.f30297a.mo25784a(this.f30298a, this.f30299b);
            C12166e8.this.f30297a = null;
        }
    }

    public C12166e8(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    private void m31360b() throws Exception {
        JSONObject jSONObject;
        try {
            jSONObject = this.f30297a.m31865b().m31597a().getJSONObject(C12148d8.f30232p).getJSONObject(C12148d8.f30235s);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            jSONObject = new JSONObject();
        }
        jSONObject.put("adViewId", this.f30297a.m31864a());
        this.f30297a.m31865b().m31603a(C11744X3.h.f26277S, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public void m31361a() throws Exception {
        C12264j8 c12264j8 = this.f30297a;
        if (c12264j8 == null || c12264j8.m31865b() == null) {
            throw new Exception("mAdPresenter or mAdPresenter.getAdViewLogic() are null");
        }
        m31360b();
    }

    @Override // com.ironsource.InterfaceC11434F8
    /* JADX INFO: renamed from: c */
    public void mo25788c(JSONObject jSONObject, String str, String str2) throws JSONException {
        this.f30297a.mo25788c(jSONObject, str, str2);
    }

    @Override // com.ironsource.InterfaceC11434F8
    public WebView getPresentingView() {
        return this.f30297a.getPresentingView();
    }

    public C12130c8 getSize() {
        C12264j8 c12264j8 = this.f30297a;
        return c12264j8 != null ? c12264j8.m31867c() : new C12130c8();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        Logger.m33642i(f30296b, "onVisibilityChanged: " + i);
        C12264j8 c12264j8 = this.f30297a;
        if (c12264j8 == null) {
            return;
        }
        try {
            c12264j8.m31865b().m31600a(C12148d8.f30227k, i, isShown());
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        Logger.m33642i(f30296b, "onWindowVisibilityChanged: " + i);
        C12264j8 c12264j8 = this.f30297a;
        if (c12264j8 == null) {
            return;
        }
        try {
            c12264j8.m31865b().m31600a(C12148d8.f30228l, i, isShown());
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public C12166e8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C12166e8(C12264j8 c12264j8, Context context) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(c12264j8.m31867c().m31264c(), c12264j8.m31867c().m31262a()));
        this.f30297a = c12264j8;
        addView(c12264j8.getPresentingView());
    }

    @Override // com.ironsource.InterfaceC11434F8
    /* JADX INFO: renamed from: a */
    public void mo25786a(JSONObject jSONObject, String str, String str2) {
        this.f30297a.mo25786a(jSONObject, str, str2);
    }

    @Override // com.ironsource.InterfaceC11434F8
    /* JADX INFO: renamed from: a */
    public synchronized void mo25784a(String str, String str2) {
        C12264j8 c12264j8 = this.f30297a;
        if (c12264j8 != null && c12264j8.m31865b() != null && this.f30297a.getPresentingView() != null) {
            this.f30297a.m31865b().m31609e();
            C11613P7.f25510a.m27224d(new a(str, str2));
        }
    }

    @Override // com.ironsource.InterfaceC11434F8
    /* JADX INFO: renamed from: a */
    public void mo25785a(String str, String str2, String str3) {
        C12264j8 c12264j8 = this.f30297a;
        if (c12264j8 == null) {
            return;
        }
        c12264j8.mo25785a(str, str2, str3);
    }

    @Override // com.ironsource.InterfaceC11434F8
    /* JADX INFO: renamed from: b */
    public void mo25787b(JSONObject jSONObject, String str, String str2) {
        this.f30297a.mo25787b(jSONObject, str, str2);
    }
}
