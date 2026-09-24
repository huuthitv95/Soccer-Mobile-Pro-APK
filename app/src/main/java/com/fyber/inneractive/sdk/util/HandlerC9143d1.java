package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.AbstractC7945a;
import com.fyber.inneractive.sdk.config.AbstractC8013k;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.C8368e;
import com.fyber.inneractive.sdk.network.C8373f;
import com.fyber.inneractive.sdk.network.C8431x0;
import com.fyber.inneractive.sdk.network.RunnableC8362c;
import com.tiktok.util.UrlConst;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.d1 */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC9143d1 extends Handler {

    /* JADX INFO: renamed from: a */
    public final WeakReference f21445a;

    public HandlerC9143d1(Looper looper, C8373f c8373f) {
        super(looper);
        this.f21445a = new WeakReference(c8373f);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String strM20383a;
        String string;
        super.handleMessage(message);
        InterfaceC9146e1 interfaceC9146e1 = (InterfaceC9146e1) AbstractC9195v.m22024a(this.f21445a);
        if (interfaceC9146e1 != null) {
            C8373f c8373f = (C8373f) interfaceC9146e1;
            int i = message.what;
            if (i == 12312329 || i == 20150330) {
                if (c8373f.f18647f && c8373f.f18642a.size() > 0) {
                    while (true) {
                        JSONObject jSONObject = null;
                        string = null;
                        if (c8373f.f18642a.size() <= 0) {
                            break;
                        }
                        try {
                            jSONObject = (JSONObject) c8373f.f18642a.poll();
                        } catch (Throwable unused) {
                        }
                        if (jSONObject != null) {
                            c8373f.f18643b.put(jSONObject);
                        }
                    }
                    if (c8373f.f18643b.length() > 0) {
                        JSONArray jSONArray = c8373f.f18643b;
                        int i2 = AbstractC8013k.f17788a;
                        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
                        if (TextUtils.isEmpty(property)) {
                            strM20383a = UrlConst.HTTPS + IAConfigManager.f17654M.f17677i.f17794f;
                        } else {
                            strM20383a = AbstractC7945a.m20383a(property, "Event");
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        try {
                            string = jSONArray.toString();
                        } catch (Throwable unused2) {
                        }
                        if (string != null) {
                            IAConfigManager.f17654M.f17686r.m20768a(new C8431x0(new C8368e(strM20383a, jSONArray, jCurrentTimeMillis), strM20383a, string));
                        }
                        c8373f.f18643b = new JSONArray();
                    }
                }
                HandlerC9143d1 handlerC9143d1 = c8373f.f18645d;
                if (handlerC9143d1 != null) {
                    handlerC9143d1.removeMessages(12312329);
                    long j = c8373f.f18646e * 1000;
                    HandlerC9143d1 handlerC9143d2 = c8373f.f18645d;
                    if (handlerC9143d2 != null) {
                        handlerC9143d2.post(new RunnableC8362c(c8373f, 12312329, j));
                    }
                }
            }
        }
    }
}
