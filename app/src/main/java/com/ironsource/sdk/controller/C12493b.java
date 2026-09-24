package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.ironsource.sdk.utils.Logger;
import java.lang.reflect.Method;
import java.security.AccessControlException;

/* JADX INFO: renamed from: com.ironsource.sdk.controller.b */
/* JADX INFO: loaded from: classes6.dex */
class C12493b {

    /* JADX INFO: renamed from: b */
    private static final String f31991b = "b";

    /* JADX INFO: renamed from: a */
    private final C12513v.s f31992a;

    C12493b(C12513v.s sVar) {
        this.f31992a = sVar;
    }

    /* JADX INFO: renamed from: a */
    synchronized void m33358a(String str, String str2) throws Exception {
        if (this.f31992a == null) {
            Logger.m33640e(f31991b, "!!! nativeAPI == null !!!");
            return;
        }
        Method declaredMethod = C12513v.s.class.getDeclaredMethod(str, String.class);
        if (declaredMethod.isAnnotationPresent(JavascriptInterface.class)) {
            declaredMethod.invoke(this.f31992a, str2);
        } else {
            throw new AccessControlException("Trying to access a private function: " + str);
        }
    }

    /* JADX INFO: renamed from: b */
    void m33359b(String str) {
        C12513v.s sVar = this.f31992a;
        if (sVar != null) {
            sVar.m33628v(str);
        }
    }

    /* JADX INFO: renamed from: a */
    void m33357a(String str) {
        C12513v.s sVar = this.f31992a;
        if (sVar != null) {
            sVar.m33627u(str);
        }
    }
}
