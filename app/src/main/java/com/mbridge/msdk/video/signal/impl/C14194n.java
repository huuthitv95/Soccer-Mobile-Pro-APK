package com.mbridge.msdk.video.signal.impl;

import android.util.Base64;
import android.webkit.WebView;
import com.ironsource.C11744X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.video.signal.impl.n */
/* JADX INFO: compiled from: JSNotifyProxy.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14194n extends C14186f {

    /* JADX INFO: renamed from: a */
    private WebView f40951a;

    public C14194n(WebView webView) {
        this.f40951a = webView;
    }

    /* JADX INFO: renamed from: a */
    private String m42389a(int i, int i2) {
        if (i2 != 0) {
            try {
                return C13229v0.m37873a(Double.valueOf(i / i2)) + "";
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return i2 + "";
    }

    @Override // com.mbridge.msdk.video.signal.impl.C14186f, com.mbridge.msdk.video.signal.InterfaceC14178g
    /* JADX INFO: renamed from: a */
    public void mo42344a(int i) {
        super.mo42344a(i);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", i);
            C13392f.m38726a().m38728a(this.f40951a, "onVideoStatusNotify", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.C14186f, com.mbridge.msdk.video.signal.InterfaceC14178g
    /* JADX INFO: renamed from: a */
    public void mo42345a(int i, int i2, int i3, int i4) {
        super.mo42345a(i, i2, i3, i4);
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String str = C11744X3.i.f26320C;
            if (i != 2 ? i2 != 2 : i2 == 1) {
                str = C11744X3.i.f26322D;
            }
            jSONObject2.put("orientation", str);
            jSONObject2.put("screen_width", i3);
            jSONObject2.put("screen_height", i4);
            jSONObject.put("data", jSONObject2);
            C13392f.m38726a().m38728a(this.f40951a, "showDataInfo", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.C14186f, com.mbridge.msdk.video.signal.InterfaceC14178g
    /* JADX INFO: renamed from: a */
    public void mo42346a(int i, String str) {
        super.mo42346a(i, str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", i);
            jSONObject.put("pt", str);
            C13392f.m38726a().m38728a(this.f40951a, "onJSClick", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.C14186f, com.mbridge.msdk.video.signal.InterfaceC14178g
    /* JADX INFO: renamed from: a */
    public void mo42347a(MBridgeVideoView.C14056v c14056v) {
        super.mo42347a(c14056v);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("progress", m42389a(c14056v.f40511a, c14056v.f40512b));
            jSONObject.put("time", String.valueOf(c14056v.f40511a));
            jSONObject.put("duration", String.valueOf(c14056v.f40512b));
            C13392f.m38726a().m38728a(this.f40951a, "onVideoProgressNotify", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.C14186f, com.mbridge.msdk.video.signal.InterfaceC14178g
    /* JADX INFO: renamed from: a */
    public void mo42348a(Object obj) {
        super.mo42348a(obj);
        C13392f.m38726a().m38728a(this.f40951a, "webviewshow", (obj == null || !(obj instanceof String)) ? "" : Base64.encodeToString(obj.toString().getBytes(), 2));
    }
}
