package com.fyber.inneractive.sdk.flow;

import android.os.CountDownTimer;
import com.fyber.inneractive.sdk.interfaces.InterfaceC8264e;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.m0 */
/* JADX INFO: loaded from: classes4.dex */
public final class CountDownTimerC8134m0 extends CountDownTimer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC8170p0 f18107a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC8134m0(AbstractC8170p0 abstractC8170p0, long j) {
        super(j, 1000L);
        this.f18107a = abstractC8170p0;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        CountDownTimerC8134m0 countDownTimerC8134m0 = this.f18107a.f18204w;
        if (countDownTimerC8134m0 != null) {
            countDownTimerC8134m0.cancel();
        }
        this.f18107a.m20598e(false);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        int i = ((int) j) / 1000;
        InterfaceC8264e interfaceC8264e = this.f18107a.f18192k;
        if (interfaceC8264e != null) {
            interfaceC8264e.updateCloseCountdown(i);
        }
    }
}
