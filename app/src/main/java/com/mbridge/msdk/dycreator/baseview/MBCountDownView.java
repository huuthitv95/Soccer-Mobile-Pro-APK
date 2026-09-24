package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.util.timer.C13889b;
import com.mbridge.msdk.util.timer.InterfaceC13888a;

/* JADX INFO: loaded from: classes5.dex */
public class MBCountDownView extends MBTextView {

    /* JADX INFO: renamed from: f */
    private C13889b f34895f;

    /* JADX INFO: renamed from: g */
    private MBCountDownView f34896g;

    public MBCountDownView(Context context) {
        super(context);
        this.f34896g = this;
    }

    public void initView(final String str, final String str2, int i) {
        this.f34895f = new C13889b().m41430b(i * 1000).m41427a(1000L).m41428a(new InterfaceC13888a() { // from class: com.mbridge.msdk.dycreator.baseview.MBCountDownView.1
            @Override // com.mbridge.msdk.util.timer.InterfaceC13888a
            public void onFinish() {
                MBCountDownView.this.f34895f.m41429a();
                SplashResData splashResData = new SplashResData();
                splashResData.seteAction(EAction.CLOSE);
                EventBus.getDefault().post(splashResData);
            }

            @Override // com.mbridge.msdk.util.timer.InterfaceC13888a
            public void onTick(long j) {
                if (str2.startsWith("zh")) {
                    MBCountDownView.this.f34896g.setText((j / 1000) + CmcdData.Factory.STREAMING_FORMAT_SS + str);
                    return;
                }
                MBCountDownView.this.f34896g.setText(MBCountDownView.this.f34896g + " " + (j / 1000) + CmcdData.Factory.STREAMING_FORMAT_SS);
            }
        });
    }

    @Override // com.mbridge.msdk.dycreator.baseview.MBTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C13889b c13889b = this.f34895f;
        if (c13889b != null) {
            c13889b.m41432c();
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.MBTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C13889b c13889b = this.f34895f;
        if (c13889b != null) {
            c13889b.m41429a();
        }
    }

    public MBCountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34896g = this;
    }

    public MBCountDownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34896g = this;
    }
}
