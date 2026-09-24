package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.T8 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6067T8 extends ContextWrapper {
    public final InterfaceC6069TA A00;
    public final AtomicReference<String> A01;

    public C6067T8(Context context, InterfaceC6069TA interfaceC6069TA) {
        super(context.getApplicationContext());
        this.A01 = new AtomicReference<>();
        this.A00 = interfaceC6069TA;
    }

    public final InterfaceC5628Lx A00(C6067T8 c6067t8) {
        return this.A00.A8C(c6067t8);
    }

    public final InterfaceC6060T1 A01() {
        return this.A00.A7G();
    }

    public final C6898ge A02() {
        return this.A00.A8z(this);
    }

    public final InterfaceC6068T9 A03() {
        return this.A00.A74(this);
    }

    public final InterfaceC6070TB A04() {
        return this.A00.A7x(this);
    }

    public final InterfaceC6072TD A05() {
        return this.A00.A8y(this);
    }

    public final InterfaceC6073TE A06() {
        return this.A00.A9F();
    }

    public final InterfaceC6084TP A07() {
        return this.A00.A7l(this);
    }

    public final InterfaceC6097Tc A08() {
        return this.A00.A7n(this);
    }

    public final C6127U7 A09() {
        return this.A00.A96();
    }

    public final InterfaceC6192VA A0A() {
        return this.A00.A6n(A02());
    }

    public final InterfaceC6204VM A0B() {
        return this.A00.A90(A02());
    }

    public final String A0C() {
        return this.A01.get();
    }

    public final void A0D(String str) {
        this.A01.set(str);
    }
}
