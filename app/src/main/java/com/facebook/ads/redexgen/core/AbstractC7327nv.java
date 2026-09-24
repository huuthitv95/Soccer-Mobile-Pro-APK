package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nv */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC7327nv implements InterfaceC5072Cx {
    public static String[] A07 = {"KBisateWM8YQ4arKDgRYpdTDxezzMkCv", "VJ2uSooodcJBZOLyoDYKaqw5tYDrMz4W", "bemaZsDF2tY6J54Bg3tOUH55klLpC", "LnVxhCvG0lD6F7ZPu", "7ofy39p1yDzqV7NnIWFVVnn8VzEJdml2", "3pklWVRHTZe0TjeZrFE3TnxhkITdP", "TfKHOeXRiNIOMg3PDS", "WMeybOD3P6lu5fyh7Idh"};
    public Looper A00;
    public Timeline A01;
    public C48098O A02;
    public final ArrayList<InterfaceC5071Cw> A05 = new ArrayList<>(1);
    public final HashSet<InterfaceC5071Cw> A06 = new HashSet<>(1);
    public final C5083D8 A04 = new C5083D8();
    public final C4892A1 A03 = new C4892A1();

    public abstract void A09();

    public abstract void A0A(InterfaceC46545t interfaceC46545t);

    public final C48098O A00() {
        return (C48098O) AbstractC45353y.A02(this.A02);
    }

    public final C4892A1 A01(C7320no c7320no) {
        return this.A03.A00(0, c7320no);
    }

    public final C5083D8 A02(C7320no c7320no) {
        return this.A04.A02(0, c7320no, 0L);
    }

    public void A03() {
    }

    public void A04() {
    }

    public final void A05(Timeline timeline) {
        this.A01 = timeline;
        Iterator<InterfaceC5071Cw> it = this.A05.iterator();
        while (it.hasNext()) {
            it.next().AG1(this, timeline);
        }
    }

    public final void A06(InterfaceC5071Cw interfaceC5071Cw) {
        boolean z = !this.A06.isEmpty();
        this.A06.remove(interfaceC5071Cw);
        if (z) {
            boolean wasEnabled = this.A06.isEmpty();
            if (wasEnabled) {
                A03();
            }
        }
    }

    public final void A07(InterfaceC5071Cw interfaceC5071Cw) {
        AbstractC45353y.A01(this.A00);
        boolean zIsEmpty = this.A06.isEmpty();
        this.A06.add(interfaceC5071Cw);
        if (zIsEmpty) {
            A04();
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    public final void A08(InterfaceC5071Cw interfaceC5071Cw, InterfaceC46545t interfaceC46545t, C48098O c48098o) {
        boolean z;
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.A00;
        if (looper != null) {
            Looper looper2 = this.A00;
            if (looper2 == looperMyLooper) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        AbstractC45353y.A07(z);
        this.A02 = c48098o;
        Timeline timeline = this.A01;
        this.A05.add(interfaceC5071Cw);
        Looper looper3 = this.A00;
        if (looper3 == null) {
            this.A00 = looperMyLooper;
            this.A06.add(interfaceC5071Cw);
            A0A(interfaceC46545t);
        } else {
            if (timeline == null) {
                return;
            }
            A07(interfaceC5071Cw);
            interfaceC5071Cw.AG1(this, timeline);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5072Cx
    public final void A3z(Handler handler, InterfaceC5084D9 interfaceC5084D9) {
        AbstractC45353y.A01(handler);
        AbstractC45353y.A01(interfaceC5084D9);
        this.A04.A04(handler, interfaceC5084D9);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5072Cx
    public final void AH7(InterfaceC5071Cw interfaceC5071Cw, InterfaceC46545t interfaceC46545t) {
        A08(interfaceC5071Cw, interfaceC46545t, C48098O.A03);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5072Cx
    public final void AHl(InterfaceC5071Cw interfaceC5071Cw) {
        this.A05.remove(interfaceC5071Cw);
        if (this.A05.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            this.A02 = null;
            this.A06.clear();
            String[] strArr = A07;
            if (strArr[2].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[3] = "pnZ7WVnnf2PAl7J7h";
            strArr2[6] = "ddcJoNElLz9Uvwup8w";
            A09();
            return;
        }
        A06(interfaceC5071Cw);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5072Cx
    public final void AIS(InterfaceC5084D9 interfaceC5084D9) {
        this.A04.A0D(interfaceC5084D9);
    }
}
