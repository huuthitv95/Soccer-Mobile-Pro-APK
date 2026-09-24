package com.mbridge.msdk.mbsignalcommon.communication;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.click.C12684c;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.mbsignalcommon.windvane.C13387a;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.communication.a */
/* JADX INFO: compiled from: BaseCommonBannerSignalCommunicationImp.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC13371a implements InterfaceC13375e {

    /* JADX INFO: renamed from: a */
    public static final String f37109a = "a";

    @Override // com.mbridge.msdk.mbsignalcommon.communication.InterfaceC13372b
    /* JADX INFO: renamed from: a */
    public void mo34582a(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.InterfaceC13372b
    /* JADX INFO: renamed from: b */
    public void mo38662b(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (TextUtils.isEmpty(str)) {
            C13374d.m38666a(obj, "params is null");
            return;
        }
        Context contextM36542d = C13008c.m36588n().m36542d();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (contextM36542d == null) {
            try {
                if ((obj instanceof C13387a) && (windVaneWebView = ((C13387a) obj).f37156b) != null) {
                    contextM36542d = windVaneWebView.getContext();
                }
            } catch (Exception unused) {
            }
        }
        if (contextM36542d == null) {
            C13392f.m38726a().m38731b(obj, C13374d.m38664a(1));
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("netstat", C13211m0.m37770s(contextM36542d));
            String string = jSONObject.toString();
            if (!TextUtils.isEmpty(string)) {
                string = Base64.encodeToString(string.getBytes(), 2);
            }
            C13392f.m38726a().m38731b(obj, string);
        } catch (Throwable unused2) {
            C13392f.m38726a().m38731b(obj, C13374d.m38664a(1));
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.InterfaceC13372b
    /* JADX INFO: renamed from: c */
    public void mo34585c(Object obj, String str) {
        try {
            if (obj instanceof C13387a) {
                C13392f.m38726a().m38727a(((C13387a) obj).f37156b);
            }
        } catch (Throwable th) {
            C13219q0.m37817b(f37109a, "onSignalCommunication", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.InterfaceC13372b
    public void handlerH5Exception(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.InterfaceC13372b
    public void increaseOfferFrequence(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            C13374d.m38666a(obj, "params is null");
        } else {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                C13374d.m38667a(obj, new JSONObject(str));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.InterfaceC13372b
    public void install(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.InterfaceC13372b
    public void openURL(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (TextUtils.isEmpty(str)) {
            C13374d.m38666a(obj, "params is null");
            return;
        }
        Context contextM36542d = C13008c.m36588n().m36542d();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (contextM36542d == null) {
            try {
                if ((obj instanceof C13387a) && (windVaneWebView = ((C13387a) obj).f37156b) != null) {
                    contextM36542d = windVaneWebView.getContext();
                }
            } catch (Exception unused) {
            }
        }
        if (contextM36542d == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url");
            int iOptInt = jSONObject.optInt("type");
            if (iOptInt == 1) {
                C12684c.m34659c(contextM36542d, strOptString);
            } else if (iOptInt == 2) {
                C12684c.m34661e(contextM36542d, strOptString);
            }
        } catch (Throwable unused2) {
        }
    }
}
