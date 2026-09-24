package com.fyber.inneractive.sdk.cache.session;

import android.app.Application;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.Closeable;
import java.io.FileInputStream;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.cache.session.c */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC7914c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7916e f17591a;

    public RunnableC7914c(C7916e c7916e) {
        this.f17591a = c7916e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FileInputStream fileInputStreamOpenFileInput;
        String str;
        Application application = AbstractC9174o.f21470a;
        JSONObject jSONObject = null;
        try {
            fileInputStreamOpenFileInput = application.openFileInput("session_details.json");
            try {
                int iAvailable = fileInputStreamOpenFileInput.available();
                byte[] bArr = new byte[iAvailable];
                str = fileInputStreamOpenFileInput.read(bArr) == iAvailable ? new String(bArr, "UTF-8") : null;
                AbstractC9195v.m22028a((Closeable) fileInputStreamOpenFileInput);
            } catch (Throwable unused) {
                try {
                    IAlog.m21945a("readFileFromContext failed reading %s", "session_details.json");
                    AbstractC9195v.m22028a((Closeable) fileInputStreamOpenFileInput);
                    str = null;
                } catch (Throwable th) {
                    AbstractC9195v.m22028a((Closeable) fileInputStreamOpenFileInput);
                    throw th;
                }
            }
        } catch (Throwable unused2) {
            fileInputStreamOpenFileInput = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.f17591a.getClass();
            return;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (Throwable unused3) {
            IAlog.m21950f("Failed parsing SessionCache", new Object[0]);
        }
        if (jSONObject != null) {
            AbstractC9183r.f21478b.post(new RunnableC7913b(this, jSONObject));
        } else {
            application.deleteFile("session_details.json");
            this.f17591a.getClass();
        }
    }
}
