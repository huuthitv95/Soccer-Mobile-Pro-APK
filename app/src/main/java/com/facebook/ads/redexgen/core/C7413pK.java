package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pK */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7413pK implements InterfaceC45694W {
    public Message A00;
    public C7412pJ A01;

    public C7413pK() {
    }

    private void A00() {
        this.A00 = null;
        this.A01 = null;
        C7412pJ.A01(this);
    }

    public final C7413pK A01(Message message, C7412pJ c7412pJ) {
        this.A00 = message;
        this.A01 = c7412pJ;
        return this;
    }

    public final void A02() {
        ((Message) AbstractC45353y.A01(this.A00)).sendToTarget();
        A00();
    }

    public final boolean A03(Handler handler) {
        boolean success = handler.sendMessageAtFrontOfQueue((Message) AbstractC45353y.A01(this.A00));
        A00();
        return success;
    }
}
