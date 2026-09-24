package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;
import com.facebook.ads.AdClosedListener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zd */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC6464Zd extends FrameLayout {
    public static String[] A0E = {"5RNIIKEidNz4CxH4JgV5654XoKm2WCRJ", "1p9zA", "TyFhTVOKfwCiarLUW0", "qGg1KSsP6zNQFhXHIMmjZGXDOHal5qmq", "ysvkaelauuCqE6L7ICudiIGq1Ejo0wOd", "BlsqFJOSCgQfST", "dpiEaUs9Aor9er1WGZ", "tfv9H94"};
    public int A00;
    public AdClosedListener A01;
    public EnumC5798Oi A02;
    public C5799Oj A03;
    public C5800Ok A04;
    public InterfaceC6463Zc A05;
    public final C5796Og A06;
    public final C6902gi A07;
    public final InterfaceC6192VA A08;
    public final InterfaceC6406Yh A09;
    public final InterfaceC6407Yi A0A;
    public final String A0B;
    public final C5740Nm A0C;
    public final InterfaceC6466Zf A0D;

    public abstract void A0O();

    public abstract void A0P();

    public abstract void A0R(C5800Ok c5800Ok, EnumC5798Oi enumC5798Oi);

    public abstract boolean A0S();

    public AbstractC6464Zd(C6902gi c6902gi, InterfaceC6192VA interfaceC6192VA, String str) {
        this(c6902gi, interfaceC6192VA, str, null, null, null);
    }

    public AbstractC6464Zd(C6902gi c6902gi, InterfaceC6192VA interfaceC6192VA, String str, C5740Nm c5740Nm, InterfaceC6407Yi interfaceC6407Yi, InterfaceC6406Yh interfaceC6406Yh) {
        super(c6902gi);
        this.A00 = 0;
        this.A02 = EnumC5798Oi.A05;
        this.A04 = null;
        this.A0D = new C5646MF(this);
        this.A07 = c6902gi;
        this.A08 = interfaceC6192VA;
        this.A0A = interfaceC6407Yi;
        this.A09 = interfaceC6406Yh;
        this.A0B = str;
        this.A0C = c5740Nm;
        this.A06 = AbstractC5797Oh.A00(this.A07.A02());
    }

    public static /* synthetic */ int A02(AbstractC6464Zd abstractC6464Zd) {
        int i = abstractC6464Zd.A00;
        abstractC6464Zd.A00 = i + 1;
        return i;
    }

    public static /* synthetic */ int A03(AbstractC6464Zd abstractC6464Zd) {
        int i = abstractC6464Zd.A00;
        abstractC6464Zd.A00 = i - 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E() {
        if (this.A03.A0A()) {
            this.A08.AB3(this.A0B, this.A03.A02());
            this.A03.A03();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F() {
        this.A04 = null;
        this.A03.A05();
        A0O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(C5800Ok c5800Ok) {
        this.A03.A08(this.A02);
        A0Q(c5800Ok, this.A02);
        C5700N8.A01(this.A07).A0L();
        if (A0S()) {
            A0E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(C5800Ok c5800Ok) {
        this.A04 = c5800Ok;
        this.A03.A09(this.A02, this.A00);
        A0R(c5800Ok, this.A02);
    }

    public final void A0M() {
        A0E();
    }

    public final void A0N() {
        this.A03 = new C5799Oj(new C6200VI(this.A0B, this.A08));
        if (this.A0A != null) {
            InterfaceC6407Yi interfaceC6407Yi = this.A0A;
            if (A0E[0].charAt(22) == 'O') {
                throw new RuntimeException();
            }
            A0E[7] = "FLAi4P2";
            interfaceC6407Yi.AFA(true);
        }
        if (this.A05 != null) {
            this.A05.ACs();
        }
        A0F();
    }

    public void A0Q(C5800Ok c5800Ok, EnumC5798Oi enumC5798Oi) {
        if (this.A01 != null) {
            this.A07.A0F().ABV();
            this.A01.onAdClosed();
        }
    }

    public void setAdReportingCallbackListener(InterfaceC6463Zc interfaceC6463Zc) {
        this.A05 = interfaceC6463Zc;
    }

    public void setOnAdClosedListener(AdClosedListener adClosedListener) {
        this.A01 = adClosedListener;
    }
}
