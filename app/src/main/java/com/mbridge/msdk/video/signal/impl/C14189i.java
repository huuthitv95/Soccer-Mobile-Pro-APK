package com.mbridge.msdk.video.signal.impl;

import android.content.res.Configuration;
import android.util.Base64;
import android.webkit.WebView;
import com.ironsource.C11744X3;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.video.signal.impl.i */
/* JADX INFO: compiled from: JSActivityProxy.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14189i extends C14182b {

    /* JADX INFO: renamed from: a */
    private WebView f40928a;

    /* JADX INFO: renamed from: b */
    private int f40929b = 0;

    public C14189i(WebView webView) {
        this.f40928a = webView;
    }

    @Override // com.mbridge.msdk.video.signal.impl.C14182b, com.mbridge.msdk.video.signal.InterfaceC14079b
    /* JADX INFO: renamed from: a */
    public int mo42228a() {
        return this.f40929b;
    }

    @Override // com.mbridge.msdk.video.signal.impl.C14182b, com.mbridge.msdk.video.signal.InterfaceC14079b
    /* JADX INFO: renamed from: a */
    public void mo42229a(int i) {
        super.mo42229a(i);
        this.f40929b = i;
    }

    @Override // com.mbridge.msdk.video.signal.impl.C14182b, com.mbridge.msdk.video.signal.InterfaceC14079b
    /* JADX INFO: renamed from: a */
    public void mo42230a(Configuration configuration) {
        super.mo42230a(configuration);
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put("orientation", C11744X3.i.f26320C);
            } else {
                jSONObject.put("orientation", C11744X3.i.f26322D);
            }
            C13392f.m38726a().m38728a(this.f40928a, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.C14182b, com.mbridge.msdk.video.signal.InterfaceC14079b
    /* JADX INFO: renamed from: b */
    public void mo42231b() {
        super.mo42231b();
        C13392f.m38726a().m38728a(this.f40928a, "onSystemDestory", "");
    }

    @Override // com.mbridge.msdk.video.signal.impl.C14182b, com.mbridge.msdk.video.signal.InterfaceC14079b
    /* JADX INFO: renamed from: d */
    public void mo42233d() {
        super.mo42233d();
        this.f40929b = 0;
        C13392f.m38726a().m38728a(this.f40928a, "onSystemResume", "");
    }

    @Override // com.mbridge.msdk.video.signal.impl.C14182b, com.mbridge.msdk.video.signal.InterfaceC14079b
    /* JADX INFO: renamed from: e */
    public void mo42234e() {
        super.mo42234e();
        C13392f.m38726a().m38728a(this.f40928a, "onSystemBackPressed", "");
    }

    @Override // com.mbridge.msdk.video.signal.impl.C14182b, com.mbridge.msdk.video.signal.InterfaceC14079b
    /* JADX INFO: renamed from: g */
    public void mo42236g() {
        super.mo42236g();
        this.f40929b = 1;
        C13392f.m38726a().m38728a(this.f40928a, "onSystemPause", "");
    }
}
