package com.fyber.inneractive.sdk.player.p277ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fyber.inneractive.sdk.flow.endcard.C8086d;
import com.fyber.inneractive.sdk.ignite.EnumC8253m;
import com.fyber.inneractive.sdk.player.p277ui.remote.C8898d;
import com.fyber.inneractive.sdk.player.p277ui.remote.C8899e;
import com.fyber.inneractive.sdk.player.p277ui.remote.C8900f;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Locale;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.ui.p */
/* JADX INFO: loaded from: classes4.dex */
public final class C8892p extends AbstractC8888l {

    /* JADX INFO: renamed from: K */
    public int f20914K;

    /* JADX INFO: renamed from: L */
    public C8900f f20915L;

    /* JADX INFO: renamed from: M */
    public final C8898d f20916M;

    public C8892p(Context context, InterfaceC8877a interfaceC8877a, C8898d c8898d, C8891o c8891o) {
        super(context, null, interfaceC8877a, null, null);
        this.f20914K = 0;
        C8900f c8900f = new C8900f(c8891o);
        this.f20915L = c8900f;
        this.f20916M = c8898d;
        c8898d.f20924a = c8900f;
        attachViewToParent(c8898d.f20925b, getChildCount() - 1, new RelativeLayout.LayoutParams(-1, -1));
        setBackgroundColor(0);
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8888l
    /* JADX INFO: renamed from: a */
    public final void mo21455a(int i) {
        int i2 = this.f20914K;
        C8898d c8898d = this.f20916M;
        c8898d.getClass();
        c8898d.f20927d.m21466a("FyberRemoteUiBridge.updateProgressBar(%d, %.2f)", String.format(Locale.US, "FyberRemoteUiBridge.updateProgressBar(%d, %.2f)", Integer.valueOf(i2), Float.valueOf((i / i2) * 100.0f)), c8898d.f20925b.f21662j);
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8888l, com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: a */
    public final void mo21432a(int i, int i2) {
        this.f20914K = i;
        super.mo21432a(i, i2);
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: a */
    public final void mo21434a(C8086d c8086d, C8878b c8878b) {
        super.mo21434a(c8086d, c8878b);
        ViewGroup viewGroup = this.f20962r;
        if (viewGroup == null || viewGroup.getVisibility() != 0) {
            return;
        }
        this.f20916M.m21462a();
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: a */
    public final void mo21435a(boolean z) {
        C8900f c8900f = this.f20915L;
        if (c8900f != null) {
            c8900f.f20944d = z;
        }
        C8898d c8898d = this.f20916M;
        c8898d.getClass();
        c8898d.f20927d.m21466a("FyberRemoteUiBridge.showBufferingOverlay(%s)", "FyberRemoteUiBridge.showBufferingOverlay(" + z + ")", c8898d.f20925b.f21662j);
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: a */
    public final void mo21437a(boolean z, EnumC8253m enumC8253m) {
        C8900f c8900f = this.f20915L;
        if (c8900f != null) {
            c8900f.f20945e = z;
            c8900f.f20951k = enumC8253m;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: a */
    public final void mo21438a(boolean z, String str) {
        C8900f c8900f = this.f20915L;
        if (c8900f != null) {
            c8900f.f20950j = z;
            c8900f.f20952l = str;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.InterfaceC8889m
    /* JADX INFO: renamed from: a */
    public final boolean mo21439a() {
        return this.f20916M.f20937n;
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: b */
    public final void mo21440b(boolean z) {
        C8900f c8900f = this.f20915L;
        if (c8900f != null) {
            c8900f.f20947g = z;
        }
        C8898d c8898d = this.f20916M;
        c8898d.getClass();
        c8898d.f20927d.m21466a("FyberRemoteUiBridge.showCountdownText(%s)", "FyberRemoteUiBridge.showCountdownText(" + z + ")", c8898d.f20925b.f21662j);
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8881e, com.fyber.inneractive.sdk.player.p277ui.InterfaceC8889m
    /* JADX INFO: renamed from: b */
    public final boolean mo21427b() {
        return this.f20916M.f20925b.f21662j;
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: c */
    public final void mo21441c(boolean z) {
        C8900f c8900f = this.f20915L;
        if (c8900f != null) {
            c8900f.f20948h = z;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: d */
    public final void mo21442d(boolean z) {
        C8900f c8900f = this.f20915L;
        if (c8900f != null) {
            c8900f.f20949i = z;
        }
        C8898d c8898d = this.f20916M;
        c8898d.getClass();
        String str = z ? "FyberRemoteUiBridge.showMuteButton()" : "FyberRemoteUiBridge.hideMuteButton()";
        c8898d.f20927d.m21466a(str, str, c8898d.f20925b.f21662j);
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s, com.fyber.inneractive.sdk.player.p277ui.InterfaceC8889m
    public final void destroy() {
        IAlog.m21945a("%s: destroy() : destroying remote UI", "IAVideoViewRemote");
        removeView(this.f20916M.f20925b);
        this.f20916M.m21462a();
        C8900f c8900f = this.f20915L;
        if (c8900f != null) {
            c8900f.f20941a = null;
            this.f20915L = null;
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: e */
    public final void mo21443e(boolean z) {
        C8900f c8900f = this.f20915L;
        if (c8900f != null) {
            c8900f.f20943c = z;
        }
        C8898d c8898d = this.f20916M;
        c8898d.getClass();
        c8898d.f20927d.m21466a("FyberRemoteUiBridge.showPlayOverlay(%s)", "FyberRemoteUiBridge.showPlayOverlay(" + z + ")", c8898d.f20925b.f21662j);
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: f */
    public final void mo21444f(boolean z) {
        C8900f c8900f = this.f20915L;
        if (c8900f != null) {
            c8900f.f20946f = z;
        }
        C8898d c8898d = this.f20916M;
        c8898d.getClass();
        c8898d.f20927d.m21466a("FyberRemoteUiBridge.showProgressBar(%s)", "FyberRemoteUiBridge.showProgressBar(" + z + ")", c8898d.f20925b.f21662j);
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: g */
    public final void mo21446g(boolean z) {
        C8900f c8900f = this.f20915L;
        if (c8900f != null) {
            c8900f.f20942b = z;
        }
        C8898d c8898d = this.f20916M;
        c8898d.getClass();
        c8898d.f20927d.m21466a("FyberRemoteUiBridge.showSkipLayout(%s)", "FyberRemoteUiBridge.showSkipLayout(" + z + ")", c8898d.f20925b.f21662j);
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    public int getTickFractions() {
        return 15;
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    public View[] getTrackingFriendlyView() {
        return new View[]{this.f20916M.f20925b};
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    public View[] getTrackingFriendlyViewObstructionPurposeOther() {
        return new View[0];
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: h */
    public final void mo21447h() {
        C8898d c8898d = this.f20916M;
        c8898d.f20927d.m21466a("FyberRemoteUiBridge.enableSkip()", "FyberRemoteUiBridge.enableSkip()", c8898d.f20925b.f21662j);
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: i */
    public final void mo21448i() {
        C8898d c8898d = this.f20916M;
        c8898d.f20927d.m21466a("FyberRemoteUiBridge.hideOverlays()", "FyberRemoteUiBridge.hideOverlays()", c8898d.f20925b.f21662j);
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: l */
    public final boolean mo21451l() {
        return this.f20916M.f20936m;
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: m */
    public final void mo21452m() {
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: n */
    public final void mo21453n() {
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    public void setAppInfoButtonRound(TextView textView) {
    }

    public void setIsSkipEnabled(boolean z) {
        this.f20916M.f20937n = z;
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8881e
    public void setListener(InterfaceC8890n interfaceC8890n) {
        super.setListener(interfaceC8890n);
        this.f20916M.f20928e = interfaceC8890n;
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    public void setMuteButtonState(boolean z) {
        C8898d c8898d = this.f20916M;
        c8898d.getClass();
        String str = z ? "FyberRemoteUiBridge.setMute()" : "FyberRemoteUiBridge.setUnmute()";
        C8899e c8899e = c8898d.f20927d;
        c8899e.f20940c = z;
        C8898d c8898d2 = c8899e.f20938a;
        if (c8898d2 != null) {
            c8898d2.f20925b.m22085a(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    public void setRemainingTime(String str) {
        C8898d c8898d = this.f20916M;
        c8898d.getClass();
        c8898d.f20927d.m21466a("FyberRemoteUiBridge.setRemainingTime(\"%s\")", "FyberRemoteUiBridge.setRemainingTime(\"" + str + "\")", c8898d.f20925b.f21662j);
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    public void setSkipText(String str) {
        C8898d c8898d = this.f20916M;
        c8898d.getClass();
        c8898d.f20927d.m21466a("FyberRemoteUiBridge.setSkipText(\"%s\")", "FyberRemoteUiBridge.setSkipText(\"" + str + "\")", c8898d.f20925b.f21662j);
    }
}
