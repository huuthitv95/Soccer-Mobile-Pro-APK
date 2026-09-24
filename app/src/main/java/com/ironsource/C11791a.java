package com.ironsource;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

/* JADX INFO: renamed from: com.ironsource.a */
/* JADX INFO: loaded from: classes6.dex */
public class C11791a extends Thread {

    /* JADX INFO: renamed from: l */
    private static final int f26702l = 1;

    /* JADX INFO: renamed from: m */
    private static final InterfaceC12103b f26703m = new a();

    /* JADX INFO: renamed from: n */
    private static final InterfaceC12441q9 f26704n = new b();

    /* JADX INFO: renamed from: d */
    private final int f26708d;

    /* JADX INFO: renamed from: a */
    private InterfaceC12103b f26705a = f26703m;

    /* JADX INFO: renamed from: b */
    private InterfaceC12441q9 f26706b = f26704n;

    /* JADX INFO: renamed from: c */
    private final Handler f26707c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e */
    private String f26709e = "";

    /* JADX INFO: renamed from: f */
    private boolean f26710f = false;

    /* JADX INFO: renamed from: g */
    private boolean f26711g = false;

    /* JADX INFO: renamed from: h */
    private volatile int f26712h = 0;

    /* JADX INFO: renamed from: i */
    private int f26713i = 1;

    /* JADX INFO: renamed from: j */
    private int f26714j = 0;

    /* JADX INFO: renamed from: k */
    private final Runnable f26715k = new c();

    /* JADX INFO: renamed from: com.ironsource.a$a */
    class a implements InterfaceC12103b {
        a() {
        }

        @Override // com.ironsource.InterfaceC12103b
        /* JADX INFO: renamed from: a */
        public void mo28091a() {
        }

        @Override // com.ironsource.InterfaceC12103b
        /* JADX INFO: renamed from: b */
        public void mo28092b() {
            throw new RuntimeException("ANRHandler has given up");
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a$b */
    class b implements InterfaceC12441q9 {
        b() {
        }

        @Override // com.ironsource.InterfaceC12441q9
        /* JADX INFO: renamed from: a */
        public void mo28093a(InterruptedException interruptedException) {
            Log.w("ANRHandler", "Interrupted: " + interruptedException.getMessage());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a$c */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C11791a c11791a = C11791a.this;
            c11791a.f26712h = (c11791a.f26712h + 1) % Integer.MAX_VALUE;
        }
    }

    public C11791a(int i) {
        this.f26708d = i;
    }

    /* JADX INFO: renamed from: a */
    public void m28087a(int i) {
        this.f26713i = i;
    }

    /* JADX INFO: renamed from: b */
    public int m28088b() {
        return this.f26713i;
    }

    /* JADX INFO: renamed from: c */
    public C11791a m28090c() {
        this.f26709e = null;
        return this;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        setName("|ANR-ANRHandler|");
        int i = -1;
        while (!isInterrupted() && this.f26714j < this.f26713i) {
            int i2 = this.f26712h;
            this.f26707c.post(this.f26715k);
            try {
                Thread.sleep(this.f26708d);
                if (this.f26712h != i2) {
                    this.f26714j = 0;
                } else if (this.f26711g || !Debug.isDebuggerConnected()) {
                    this.f26714j++;
                    this.f26705a.mo28091a();
                    String str = C12317m4.f30921l;
                    if (str != null && !str.trim().isEmpty()) {
                        new C11503J5(C12317m4.f30921l, String.valueOf(System.currentTimeMillis()), "ANR").m26176a();
                    }
                } else {
                    if (this.f26712h != i) {
                        Log.w("ANRHandler", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                    }
                    i = this.f26712h;
                }
            } catch (InterruptedException e) {
                this.f26706b.mo28093a(e);
                return;
            }
        }
        if (this.f26714j >= this.f26713i) {
            this.f26705a.mo28092b();
        }
    }

    /* JADX INFO: renamed from: a */
    public int m28082a() {
        return this.f26714j;
    }

    /* JADX INFO: renamed from: b */
    public C11791a m28089b(boolean z) {
        this.f26710f = z;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C11791a m28083a(InterfaceC12103b interfaceC12103b) {
        if (interfaceC12103b == null) {
            this.f26705a = f26703m;
            return this;
        }
        this.f26705a = interfaceC12103b;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C11791a m28084a(InterfaceC12441q9 interfaceC12441q9) {
        if (interfaceC12441q9 == null) {
            this.f26706b = f26704n;
            return this;
        }
        this.f26706b = interfaceC12441q9;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C11791a m28085a(String str) {
        if (str == null) {
            str = "";
        }
        this.f26709e = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C11791a m28086a(boolean z) {
        this.f26711g = z;
        return this;
    }

    /* JADX INFO: renamed from: a */
    private String m28081a(StackTraceElement[] stackTraceElementArr) {
        String str = "";
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                if (stackTraceElement != null) {
                    str = str + stackTraceElement.toString() + ";\n";
                }
            }
        }
        return str;
    }
}
