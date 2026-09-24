package com.facebook.ads.redexgen.core;

import com.google.common.base.ElementTypesAreNonnullByDefault;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kp */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public final class C7149kp {
    public final int A00;
    public final AbstractC5026CC A01;
    public final InterfaceC7148ko A02;
    public final boolean A03;

    public C7149kp(InterfaceC7148ko strategy) {
        this(strategy, false, AbstractC5026CC.A03(), Integer.MAX_VALUE);
    }

    public C7149kp(InterfaceC7148ko strategy, boolean omitEmptyStrings, AbstractC5026CC trimmer, int limit) {
        this.A02 = strategy;
        this.A03 = omitEmptyStrings;
        this.A01 = trimmer;
        this.A00 = limit;
    }

    public static C7149kp A02(char separator) {
        return A03(AbstractC5026CC.A02(separator));
    }

    public static C7149kp A03(final AbstractC5026CC separatorMatcher) {
        AbstractC7142ki.A04(separatorMatcher);
        return new C7149kp(new C5018C3(separatorMatcher));
    }

    private Iterator<String> A04(CharSequence sequence) {
        return this.A02.AAl(this, sequence);
    }

    public final List<String> A06(CharSequence sequence) {
        AbstractC7142ki.A04(sequence);
        Iterator<String> itA04 = A04(sequence);
        List<String> result = new ArrayList<>();
        while (itA04.hasNext()) {
            result.add(itA04.next());
        }
        return Collections.unmodifiableList(result);
    }
}
