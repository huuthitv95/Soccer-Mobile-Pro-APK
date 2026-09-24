package com.bykv.p028vk.openvk.preload.geckox.logger;

import android.util.Log;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
class DefaultLogger implements Logger {
    DefaultLogger() {
    }

    private static String formatMsgs(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            if (obj != null) {
                sb.append(obj.toString());
            } else {
                sb.append(" null ");
            }
            sb.append(" ");
        }
        return sb.toString();
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.logger.Logger
    /* JADX INFO: renamed from: d */
    public void mo6036d(String str, Object... objArr) {
        if (objArr == null) {
            Log.d(str, AbstractJsonLexerKt.NULL);
        } else {
            try {
                Log.d(str, formatMsgs(objArr));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.logger.Logger
    /* JADX INFO: renamed from: e */
    public void mo6037e(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.logger.Logger
    /* JADX INFO: renamed from: w */
    public void mo6038w(String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        Log.w(str, str2);
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.logger.Logger
    /* JADX INFO: renamed from: w */
    public void mo6039w(String str, String str2, Throwable th) {
        Log.w(str, str2, th);
    }
}
