package com.fyber.inneractive.sdk.flow.storepromo.p275ui;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.fyber.inneractive.sdk.flow.storepromo.C8178b;
import com.fyber.inneractive.sdk.flow.storepromo.controller.C8180b;
import com.fyber.inneractive.sdk.flow.storepromo.observer.C8214b;
import com.fyber.inneractive.sdk.flow.storepromo.observer.InterfaceC8213a;
import java.util.Iterator;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.storepromo.ui.a */
/* JADX INFO: loaded from: classes4.dex */
public final class AnimationAnimationListenerC8215a implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8217c f18309a;

    public AnimationAnimationListenerC8215a(C8217c c8217c) {
        this.f18309a = c8217c;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        C8217c c8217c;
        View view;
        C8217c c8217c2 = this.f18309a;
        ViewGroup viewGroup = c8217c2.f18312b;
        if (viewGroup != null) {
            viewGroup.removeView(c8217c2.f18311a);
            this.f18309a.f18312b.setAnimation(null);
            this.f18309a.f18312b.setVisibility(8);
        }
        C8178b c8178b = this.f18309a.f18316f;
        if (c8178b != null) {
            C8180b c8180b = c8178b.f18214d;
            C8214b c8214b = new C8214b((c8180b == null || (c8217c = c8180b.f18224d) == null || c8217c.f18312b == null || (view = c8217c.f18311a) == null || view.getParent() == null || c8217c.f18312b.getVisibility() != 0) ? false : true, c8178b.f18219i);
            Iterator it = c8178b.f18218h.iterator();
            while (it.hasNext()) {
                ((InterfaceC8213a) it.next()).mo20621a(c8214b);
            }
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
