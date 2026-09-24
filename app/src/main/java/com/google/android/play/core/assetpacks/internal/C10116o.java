package com.google.android.play.core.assetpacks.internal;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C11744X3;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.internal.o */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10116o {

    /* JADX INFO: renamed from: a */
    private final String f22413a;

    public C10116o(String str) {
        this.f22413a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    /* JADX INFO: renamed from: f */
    private static String m22748f(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(String.valueOf(str2)), e);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + C11744X3.j.f26440e;
            }
        }
        return str + " : " + str2;
    }

    /* JADX INFO: renamed from: a */
    public final int m22749a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", m22748f(this.f22413a, str, objArr));
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final int m22750b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m22748f(this.f22413a, str, objArr));
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m22751c(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m22748f(this.f22413a, str, objArr), th);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m22752d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", m22748f(this.f22413a, str, objArr));
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final int m22753e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", m22748f(this.f22413a, str, objArr));
        }
        return 0;
    }
}
