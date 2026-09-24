package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts;

import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.e */
/* JADX INFO: loaded from: classes4.dex */
public final class C8638e {

    /* JADX INFO: renamed from: a */
    public final int f19931a;

    /* JADX INFO: renamed from: b */
    public final List f19932b;

    public C8638e(int i, List list) {
        this.f19931a = i;
        if (!m21173a(32) && list.isEmpty()) {
            list = Collections.singletonList(C8708o.m21265a(null, "application/cea-608", 0, null, -1, null, Long.MAX_VALUE, Collections.EMPTY_LIST));
        }
        this.f19932b = list;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC8641f0 m21171a(int i, C8637d0 c8637d0) {
        if (i == 2) {
            return new C8654s(new C8645j());
        }
        if (i == 3 || i == 4) {
            return new C8654s(new C8652q(c8637d0.f19928a));
        }
        if (i == 15) {
            if (m21173a(2)) {
                return null;
            }
            return new C8654s(new C8636d(false, c8637d0.f19928a));
        }
        if (i == 21) {
            return new C8654s(new C8651p());
        }
        if (i == 27) {
            if (m21173a(4)) {
                return null;
            }
            return new C8654s(new C8648m(m21172a(c8637d0), m21173a(1), m21173a(8)));
        }
        if (i == 36) {
            return new C8654s(new C8650o(m21172a(c8637d0)));
        }
        if (i == 89) {
            return new C8654s(new C8642g(c8637d0.f19929b));
        }
        if (i != 138) {
            if (i != 129) {
                if (i != 130) {
                    if (i == 134) {
                        if (m21173a(16)) {
                            return null;
                        }
                        return new C8658w(new C8660y());
                    }
                    if (i != 135) {
                        return null;
                    }
                }
            }
            return new C8654s(new C8632b(c8637d0.f19928a));
        }
        return new C8654s(new C8640f(c8637d0.f19928a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX INFO: renamed from: a */
    public final C8659x m21172a(C8637d0 c8637d0) {
        int i;
        String str;
        if (m21173a(32)) {
            return new C8659x(this.f19932b);
        }
        C8815n c8815n = new C8815n(c8637d0.f19930c);
        ArrayList arrayList = this.f19932b;
        while (c8815n.f20645c - c8815n.f20644b > 0) {
            int iM21352j = c8815n.m21352j();
            int iM21352j2 = c8815n.f20644b + c8815n.m21352j();
            if (iM21352j == 134) {
                arrayList = new ArrayList();
                int iM21352j3 = c8815n.m21352j() & 31;
                for (int i2 = 0; i2 < iM21352j3; i2++) {
                    String strM21341b = c8815n.m21341b(3);
                    int iM21352j4 = c8815n.m21352j();
                    if ((iM21352j4 & 128) != 0) {
                        i = iM21352j4 & 63;
                        str = "application/cea-708";
                    } else {
                        i = 1;
                        str = "application/cea-608";
                    }
                    arrayList.add(C8708o.m21265a(null, str, 0, strM21341b, i, null, Long.MAX_VALUE, Collections.EMPTY_LIST));
                    c8815n.m21347e(c8815n.f20644b + 2);
                }
            }
            c8815n.m21347e(iM21352j2);
            arrayList = arrayList;
        }
        return new C8659x(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21173a(int i) {
        return (i & this.f19931a) != 0;
    }
}
