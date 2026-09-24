package com.fyber.inneractive.sdk.player.p277ui;

import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.C7809R;
import com.fyber.inneractive.sdk.config.C8028r0;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.config.global.features.C7976d;
import com.fyber.inneractive.sdk.config.global.features.C7987o;
import com.fyber.inneractive.sdk.config.global.features.C7994v;
import com.fyber.inneractive.sdk.flow.C8121g;
import com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b;
import com.fyber.inneractive.sdk.model.vast.C8291a;
import com.fyber.inneractive.sdk.model.vast.EnumC8300i;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.util.C9155h1;
import com.fyber.inneractive.sdk.util.C9197v1;
import com.fyber.inneractive.sdk.util.HandlerC9191t1;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.ui.l */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8888l extends AbstractC8902s {

    /* JADX INFO: renamed from: J */
    public static final C9152g1 f20892J;

    /* JADX INFO: renamed from: A */
    public final LayoutInflater f20893A;

    /* JADX INFO: renamed from: B */
    public final C8121g f20894B;

    /* JADX INFO: renamed from: C */
    public boolean f20895C;

    /* JADX INFO: renamed from: D */
    public C9197v1 f20896D;

    /* JADX INFO: renamed from: E */
    public RunnableC8887k f20897E;

    /* JADX INFO: renamed from: F */
    public int f20898F;

    /* JADX INFO: renamed from: G */
    public int f20899G;

    /* JADX INFO: renamed from: H */
    public View f20900H;

    /* JADX INFO: renamed from: I */
    public boolean f20901I;

    /* JADX INFO: renamed from: z */
    public final InterfaceC8877a f20902z;

    static {
        C9152g1 c9152g1 = new C9152g1();
        c9152g1.f21452c = true;
        f20892J = c9152g1;
    }

    public AbstractC8888l(Context context, C8121g c8121g, InterfaceC8877a interfaceC8877a, C8006r c8006r, String str) {
        super(context, c8006r, str);
        this.f20895C = false;
        this.f20901I = true;
        this.f20894B = c8121g;
        this.f20893A = LayoutInflater.from(context);
        this.f20902z = interfaceC8877a;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo21455a(int i);

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: a */
    public void mo21432a(int i, int i2) {
        Runnable runnable = this.f20897E;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f20897E = null;
        }
        this.f20899G = getMaxTickFactor() + i2;
        int maxTickFactor = (getMaxTickFactor() / getTickFractions()) + i2;
        int i3 = this.f20899G;
        if (i3 <= 0 || i3 > i) {
            return;
        }
        int i4 = this.f20898F;
        if (maxTickFactor < i4 && i4 > 0) {
            mo21455a(i3);
            return;
        }
        this.f20898F = maxTickFactor;
        mo21455a(maxTickFactor);
        RunnableC8887k runnableC8887k = new RunnableC8887k(this);
        this.f20897E = runnableC8887k;
        postDelayed(runnableC8887k, this.f20956l);
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: a */
    public final void mo21433a(AbstractC8084b abstractC8084b, C8878b c8878b) {
        Integer num;
        this.f20900H = c8878b.f20860e;
        ViewGroup viewGroup = this.f20963s;
        if (viewGroup != null) {
            abstractC8084b.mo20503a(viewGroup, c8878b);
            this.f20963s.setVisibility(0);
            EnumC8300i enumC8300i = c8878b.f20861f;
            EnumC8300i enumC8300i2 = EnumC8300i.Static;
            if (enumC8300i2 == enumC8300i) {
                m21467a(getEndCardView(), 4);
            }
            if ((enumC8300i2 == enumC8300i || enumC8300i == EnumC8300i.FMP_End_Card) && (num = c8878b.f20859d) != null) {
                mo21456b(enumC8300i != enumC8300i2 ? 8 : 4, num.intValue());
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8881e
    /* JADX INFO: renamed from: a */
    public final void mo21426a(C9155h1 c9155h1, int i, int i2) {
        this.f20902z.mo21425a(this.f20879d, this.f20959o, this.f20960p, this.f20961q, c9155h1, i, i2, this.f20877b, ((C8028r0) this.f20878c).f17816f.f17872f.intValue());
    }

    /* JADX INFO: renamed from: b */
    public void mo21456b(int i, int i2) {
        if (this.f20895C || this.f20896D != null) {
            return;
        }
        IAlog.m21945a("Start Autoclick timer - %d seconds", Integer.valueOf(i2));
        C9197v1 c9197v1 = new C9197v1(TimeUnit.SECONDS, i2);
        this.f20896D = c9197v1;
        c9197v1.f21502e = new C8886j(this, i);
        c9197v1.f21501d = false;
        c9197v1.f21500c.sendEmptyMessage(1932593528);
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: g */
    public final void mo21445g() {
        m21458p();
        this.f20895C = true;
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    public View getEndCardView() {
        return this.f20900H;
    }

    public String getLocalizedCtaButtonText() {
        C8006r c8006r = this.f20967w;
        C7976d c7976d = c8006r != null ? (C7976d) c8006r.m20432a(C7976d.class) : null;
        if (c7976d != null) {
            c7976d.m20415d(IAConfigManager.f17654M.f17683o);
            C8291a c8291a = c7976d.f17756e;
            if (c8291a != null && c8291a.f18497d) {
                return c8291a.f18494a;
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    public int getMaxTickFactor() {
        return 1000;
    }

    public int getSingleTickTime() {
        return 1000 / getTickFraction();
    }

    public int getTickFraction() {
        return 5;
    }

    /* JADX INFO: renamed from: h */
    public void mo21457h(boolean z) {
        String string = getContext().getString(C7809R.string.ia_video_app_info_text);
        C8006r c8006r = this.f20967w;
        if (c8006r != null) {
            Boolean boolMo20420c = ((C7994v) c8006r.m20432a(C7994v.class)).mo20420c("show_ad_identifier_original_design");
            this.f20901I = boolMo20420c != null ? boolMo20420c.booleanValue() : true;
            string = ((C7987o) this.f20967w.m20432a(C7987o.class)).mo20417a("app_info_button_text", "App Info");
            if (string != null && string.length() > 30) {
                string = string.substring(0, 30);
            }
        }
        if (z && this.f20901I) {
            mo21440b(false);
            mo21438a(true, string);
            mo21441c(true);
        } else if (z) {
            mo21440b(false);
            mo21438a(true, string);
            mo21441c(false);
        } else if (!this.f20901I) {
            mo21440b(true);
            mo21441c(false);
        } else {
            mo21438a(false, (String) null);
            mo21440b(false);
            mo21441c(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: j */
    public final void mo21449j() {
        if (this.f20896D != null) {
            IAlog.m21945a("Autoclick paused", new Object[0]);
            C9197v1 c9197v1 = this.f20896D;
            c9197v1.f21501d = true;
            HandlerC9191t1 handlerC9191t1 = c9197v1.f21500c;
            if (handlerC9191t1 != null) {
                handlerC9191t1.removeMessages(1932593528);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: k */
    public final void mo21450k() {
        if (this.f20896D != null) {
            IAlog.m21945a("Autoclick resumed", new Object[0]);
            C9197v1 c9197v1 = this.f20896D;
            c9197v1.f21501d = false;
            c9197v1.m22035a(SystemClock.uptimeMillis());
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: o */
    public final void mo21454o() {
        this.f20965u = this.f20902z.mo21424a(this.f20879d, this.f20959o, this.f20960p, this.f20964t, this.f20877b, this.f20957m);
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8881e, android.view.View
    public final void onWindowFocusChanged(boolean z) {
    }

    /* JADX INFO: renamed from: p */
    public final void m21458p() {
        if (this.f20896D != null) {
            IAlog.m21945a("Autoclick is removed ", new Object[0]);
            this.f20896D.f21502e = null;
            this.f20896D = null;
        }
    }

    public void setEndCardView(View view) {
        this.f20900H = view;
    }
}
