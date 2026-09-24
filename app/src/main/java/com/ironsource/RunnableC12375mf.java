package com.ironsource;

import android.os.Handler;
import android.os.Message;
import com.ironsource.sdk.utils.IronSourceStorageUtils;

/* JADX INFO: renamed from: com.ironsource.mf */
/* JADX INFO: loaded from: classes6.dex */
class RunnableC12375mf implements Runnable {

    /* JADX INFO: renamed from: a */
    private final Handler f31505a;

    /* JADX INFO: renamed from: b */
    private final C11797a5 f31506b;

    RunnableC12375mf(C11797a5 c11797a5, Handler handler) {
        this.f31506b = c11797a5;
        this.f31505a = handler;
    }

    /* JADX INFO: renamed from: a */
    CallableC11729W5 m32786a(C11797a5 c11797a5, String str, long j) {
        return new CallableC11729W5(c11797a5, str, j);
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        C12601x8 c12601x8 = new C12601x8(this.f31506b.m28109b().getParent(), this.f31506b.m28109b().getName());
        Message messageM32785a = m32785a();
        messageM32785a.obj = c12601x8;
        String strM32787a = m32787a(c12601x8.getParent());
        if (strM32787a == null) {
            messageM32785a.what = 1020;
            this.f31505a.sendMessage(messageM32785a);
        } else {
            C12109b5 c12109b5Call = m32786a(new C11797a5(c12601x8, this.f31506b.m28112e(), this.f31506b.m28108a(), this.f31506b.m28110c(), this.f31506b.m28113f(), this.f31506b.m28111d()), strM32787a, 3L).call();
            messageM32785a.what = c12109b5Call.m31135b() == 200 ? 1016 : c12109b5Call.m31135b();
            this.f31505a.sendMessage(messageM32785a);
        }
    }

    /* JADX INFO: renamed from: a */
    Message m32785a() {
        return new Message();
    }

    /* JADX INFO: renamed from: a */
    String m32787a(String str) {
        return IronSourceStorageUtils.makeDir(str);
    }
}
