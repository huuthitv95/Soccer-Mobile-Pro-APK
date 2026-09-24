package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bf */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC6590bf implements View.OnClickListener {
    public final /* synthetic */ C6593bi A00;

    public ViewOnClickListenerC6590bf(C6593bi c6593bi) {
        this.A00 = c6593bi;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            this.A00.A05.AEm();
            if (this.A00.A00 != null) {
                AbstractC6374YB.A0L(this.A00.A00);
            }
            Iterator it = this.A00.A07.iterator();
            while (it.hasNext()) {
                AbstractC6374YB.A0O((View) it.next(), 0);
            }
            AbstractC6374YB.A0J(this.A00);
            if (this.A00.A06 == null) {
                return;
            }
            AbstractC6374YB.A0O(this.A00.A06, 0);
            this.A00.A06.A0e(EnumC6789et.A02, 14);
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
