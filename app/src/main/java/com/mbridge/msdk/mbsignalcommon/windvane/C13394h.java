package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.mbsignalcommon.base.C13352e;
import com.mbridge.msdk.mbsignalcommon.mapping.C13378a;
import com.mbridge.msdk.mbsignalcommon.mapping.C13379b;
import com.mbridge.msdk.mbsignalcommon.mraid.C13382c;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.windvane.h */
/* JADX INFO: compiled from: WindVaneSignalCommunication.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13394h implements InterfaceC13388b, Handler.Callback {

    /* JADX INFO: renamed from: a */
    protected Pattern f37182a;

    /* JADX INFO: renamed from: b */
    protected String f37183b;

    /* JADX INFO: renamed from: d */
    protected Context f37185d;

    /* JADX INFO: renamed from: e */
    protected WindVaneWebView f37186e;

    /* JADX INFO: renamed from: c */
    protected final int f37184c = 1;

    /* JADX INFO: renamed from: f */
    protected Handler f37187f = new Handler(Looper.getMainLooper(), this);

    public C13394h(Context context) {
        this.f37185d = context;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13388b
    /* JADX INFO: renamed from: a */
    public void mo38714a(WindVaneWebView windVaneWebView) {
        this.f37186e = windVaneWebView;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13388b
    /* JADX INFO: renamed from: b */
    public boolean mo38716b(String str) {
        if (!C13395i.m38742f(str)) {
            return false;
        }
        m38734a(C13395i.m38739c(str));
        m38736d(str);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public C13387a m38735c(String str) {
        if (str == null) {
            return null;
        }
        C13387a c13387aM38696a = C13382c.m38696a(this.f37186e, str);
        if (c13387aM38696a != null) {
            c13387aM38696a.f37156b = this.f37186e;
            return c13387aM38696a;
        }
        Matcher matcher = this.f37182a.matcher(str);
        if (matcher.matches()) {
            C13387a c13387a = new C13387a();
            int iGroupCount = matcher.groupCount();
            if (iGroupCount >= 5) {
                c13387a.f37160f = matcher.group(5);
            }
            if (iGroupCount >= 3) {
                c13387a.f37158d = matcher.group(1);
                c13387a.f37161g = matcher.group(2);
                String strGroup = matcher.group(3);
                c13387a.f37159e = strGroup;
                HashMap<String, String> map = C13352e.f37057k;
                if (map != null && map.containsKey(strGroup)) {
                    c13387a.f37159e = C13352e.f37057k.get(c13387a.f37159e);
                }
                c13387a.f37156b = this.f37186e;
                return c13387a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m38736d(String str) {
        this.f37183b = str;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        C13387a c13387a = (C13387a) message.obj;
        if (c13387a == null) {
            return false;
        }
        try {
            if (message.what == 1) {
                Object obj = c13387a.f37157c;
                C13379b.b bVar = c13387a.f37155a;
                if (bVar != null && obj != null) {
                    bVar.m38680a(obj, c13387a, TextUtils.isEmpty(c13387a.f37160f) ? JsonUtils.EMPTY_JSON : c13387a.f37160f);
                }
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13388b
    /* JADX INFO: renamed from: a */
    public void mo38715a(String str) {
        C13387a c13387aM38735c;
        if (TextUtils.isEmpty(str) || (c13387aM38735c = m38735c(str)) == null) {
            return;
        }
        m38733a(c13387aM38735c);
    }

    /* JADX INFO: renamed from: a */
    protected void m38733a(C13387a c13387a) {
        WindVaneWebView windVaneWebView = c13387a.f37156b;
        Object jsObject = windVaneWebView == null ? null : windVaneWebView.getJsObject(c13387a.f37158d);
        if (jsObject == null) {
            return;
        }
        try {
            C13379b.b bVarM38679a = C13379b.m38676a(this.f37185d.getClassLoader(), jsObject.getClass().getName()).m38679a(c13387a.f37159e, Object.class, String.class);
            bVarM38679a.m38681a();
            if (jsObject instanceof AbstractC13393g) {
                c13387a.f37155a = bVarM38679a;
                c13387a.f37157c = jsObject;
                m38732a(1, c13387a);
            }
        } catch (C13378a e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    protected void m38732a(int i, C13387a c13387a) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.obj = c13387a;
        this.f37187f.sendMessage(messageObtain);
    }

    /* JADX INFO: renamed from: a */
    public void m38734a(Pattern pattern) {
        this.f37182a = pattern;
    }
}
