package com.bytedance.sdk.openadsdk.component.p181di;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.openadsdk.component.p186mj.C2981ri;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.di.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2959lr implements Handler.Callback {

    /* JADX INFO: renamed from: co */
    private boolean f8939co;

    /* JADX INFO: renamed from: ik */
    private InterfaceC2960ri f8942ik;

    /* JADX INFO: renamed from: lr */
    private final C2981ri f8944lr;

    /* JADX INFO: renamed from: qt */
    private long f8946qt;

    /* JADX INFO: renamed from: sf */
    private long f8948sf;
    private boolean xha;

    /* JADX INFO: renamed from: ri */
    private Handler f8947ri = new Handler(Looper.myLooper(), this);

    /* JADX INFO: renamed from: ka */
    private int f8943ka = 0;

    /* JADX INFO: renamed from: fi */
    private int f8941fi = 5;

    /* JADX INFO: renamed from: di */
    private int f8940di = 0;

    /* JADX INFO: renamed from: mj */
    private final int f8945mj = 1000;
    private int jbs = 1000;

    public C2959lr(C2981ri c2981ri) {
        this.f8944lr = c2981ri;
    }

    /* JADX INFO: renamed from: fi */
    public void m11478fi() {
        this.f8947ri.removeCallbacksAndMessages(null);
        this.f8947ri = null;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 100 && this.f8947ri != null) {
            int i = message.arg1;
            m11485ri(i);
            if (i > 0) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 100;
                messageObtain.arg1 = i - 1;
                this.f8947ri.sendMessageDelayed(messageObtain, this.jbs);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ik */
    public void m11479ik() {
        if (this.f8947ri != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            messageObtain.arg1 = this.f8943ka;
            this.f8947ri.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: renamed from: ka */
    public void m11480ka() {
        Handler handler = this.f8947ri;
        if (handler != null) {
            handler.removeMessages(100);
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m11481lr() {
        Handler handler = this.f8947ri;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(100, this.f8941fi, 0));
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m11482lr(int i) {
        this.f8940di = Math.min(i, this.f8941fi);
    }

    /* JADX INFO: renamed from: ri */
    public int m11483ri() {
        return this.f8940di;
    }

    /* JADX INFO: renamed from: ri */
    public void m11484ri(float f) {
        int i = (int) f;
        this.f8941fi = i;
        if (i <= 0) {
            this.f8941fi = 5;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11485ri(int i) {
        this.f8943ka = i;
        int i2 = this.f8941fi - i;
        this.f8944lr.m11609lr(((long) i2) * 1000);
        boolean z = true;
        if (i <= 0) {
            InterfaceC2960ri interfaceC2960ri = this.f8942ik;
            if (interfaceC2960ri != null && !this.xha) {
                interfaceC2960ri.mo10542lr();
                this.xha = true;
            }
            i = 0;
        }
        InterfaceC2960ri interfaceC2960ri2 = this.f8942ik;
        if (interfaceC2960ri2 != null) {
            int iMax = Math.max(this.f8940di - i2, 0);
            if (i != 0 && i2 < this.f8940di) {
                z = false;
            }
            interfaceC2960ri2.mo10544ri(iMax, z);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11486ri(int i, float f, boolean z) {
        C2981ri c2981ri;
        if ((i == 1 || i == 2) && this.f8939co != z) {
            this.f8939co = z;
            if (i == 1 && (c2981ri = this.f8944lr) != null) {
                c2981ri.m11613ri(z);
            }
            if (z) {
                try {
                    this.jbs = (int) (1000.0f / f);
                    this.f8948sf = System.currentTimeMillis();
                    return;
                } catch (Throwable unused) {
                }
            } else {
                long jCurrentTimeMillis = this.f8946qt + (System.currentTimeMillis() - this.f8948sf);
                this.f8946qt = jCurrentTimeMillis;
                C2981ri c2981ri2 = this.f8944lr;
                if (c2981ri2 != null) {
                    c2981ri2.m11612ri(jCurrentTimeMillis);
                }
            }
            this.jbs = 1000;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11487ri(InterfaceC2960ri interfaceC2960ri) {
        this.f8942ik = interfaceC2960ri;
    }
}
