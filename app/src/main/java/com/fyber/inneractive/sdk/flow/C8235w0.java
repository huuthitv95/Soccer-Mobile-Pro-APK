package com.fyber.inneractive.sdk.flow;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.config.InterfaceC8041s0;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.MediaView;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.fyber.inneractive.sdk.flow.nativead.C8145i;
import com.fyber.inneractive.sdk.flow.nativead.C8146j;
import com.fyber.inneractive.sdk.flow.nativead.C8158p;
import com.fyber.inneractive.sdk.flow.nativead.InterfaceC8137a;
import com.fyber.inneractive.sdk.flow.nativead.InterfaceC8166u;
import com.fyber.inneractive.sdk.flow.nativead.RunnableC8149m;
import com.fyber.inneractive.sdk.flow.nativead.ViewOnTouchListenerC8160r;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.EnumC9150g;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.w0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8235w0 extends AbstractC8236x implements NativeAdContent, InterfaceC8166u {

    /* JADX INFO: renamed from: g */
    public String f18355g;

    /* JADX INFO: renamed from: h */
    public String f18356h;

    /* JADX INFO: renamed from: i */
    public String f18357i;

    /* JADX INFO: renamed from: j */
    public String f18358j;

    /* JADX INFO: renamed from: k */
    public String f18359k;

    /* JADX INFO: renamed from: l */
    public Uri f18360l;

    /* JADX INFO: renamed from: m */
    public Uri f18361m;

    /* JADX INFO: renamed from: n */
    public MediaView f18362n;

    /* JADX INFO: renamed from: o */
    public Float f18363o;

    /* JADX INFO: renamed from: p */
    public Float f18364p;

    /* JADX INFO: renamed from: q */
    public final ArrayList f18365q;

    /* JADX INFO: renamed from: r */
    public ViewOnTouchListenerC8160r f18366r;

    /* JADX INFO: renamed from: s */
    public C8219t0 f18367s;

    /* JADX INFO: renamed from: t */
    public final HashMap f18368t;

    /* JADX INFO: renamed from: u */
    public C8146j f18369u;

    /* JADX INFO: renamed from: v */
    public InterfaceC8137a f18370v;

    /* JADX INFO: renamed from: w */
    public final ArrayList f18371w;

    /* JADX INFO: renamed from: x */
    public final ArrayList f18372x;

    public C8235w0(InterfaceC8041s0 interfaceC8041s0, C8006r c8006r) {
        super(interfaceC8041s0, c8006r);
        this.f18365q = new ArrayList();
        this.f18368t = new HashMap();
        this.f18371w = new ArrayList();
        this.f18372x = new ArrayList();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    /* JADX INFO: renamed from: b */
    public final void m20638b(String str) {
        EnumC9150g enumC9150g;
        if (str == null || str.trim().isEmpty()) {
            str = NativeAdContent.ViewTag.OTHER;
        }
        IAlog.m21947c("%s : handleClick(): %s", "w0", str);
        if (this.f18369u != null) {
            switch (str) {
                case "CTA":
                    enumC9150g = EnumC9150g.NATIVE_CTA;
                    break;
                case "TITLE":
                    enumC9150g = EnumC9150g.NATIVE_AD_TITLE;
                    break;
                case "DESCRIPTION":
                    enumC9150g = EnumC9150g.NATIVE_AD_DESCRIPTION;
                    break;
                case "RATING":
                    enumC9150g = EnumC9150g.NATIVE_AD_RATING;
                    break;
                case "MEDIA_VIEW":
                    if (!isVideoAd()) {
                        enumC9150g = EnumC9150g.NATIVE_AD_IMAGE;
                        break;
                    } else {
                        enumC9150g = EnumC9150g.NATIVE_AD_VIDEO;
                        break;
                    }
                    break;
                case "ICON":
                    enumC9150g = EnumC9150g.NATIVE_AD_ICON;
                    break;
                case "ROOT":
                    enumC9150g = EnumC9150g.NATIVE_AD_ROOT;
                    break;
                case "OTHER":
                default:
                    enumC9150g = EnumC9150g.NATIVE;
                    break;
            }
            C8145i c8145i = (C8145i) this.f18368t.get(str);
            C8146j c8146j = this.f18369u;
            if (c8145i == null) {
                c8145i = c8146j.f18139a;
            }
            if (c8145i == null) {
                c8146j.getClass();
                IAlog.m21945a("%s : No active link (no root and object related links), origin: %s", C8146j.f18138d, enumC9150g);
            } else {
                C8158p c8158p = c8146j.f18141c;
                c8158p.getClass();
                AbstractC9183r.f21477a.execute(new RunnableC8149m(c8158p, c8145i, false, enumC9150g));
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final void bindMediaView(MediaView mediaView) {
        this.f18362n = mediaView;
        InterfaceC8137a interfaceC8137a = this.f18370v;
        if (interfaceC8137a != null) {
            interfaceC8137a.bind(mediaView);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8236x
    /* JADX INFO: renamed from: d */
    public final boolean mo20600d() {
        return (this.f18361m == null && this.f18362n == null) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8236x
    public final void destroy() {
        C8219t0 c8219t0 = this.f18367s;
        if (c8219t0 != null) {
            c8219t0.destroy();
            this.f18367s = null;
        }
        C8146j c8146j = this.f18369u;
        if (c8146j != null) {
            c8146j.f18140b = null;
            c8146j.f18141c.f18169a = null;
            this.f18369u = null;
        }
        if (this.f18370v != null) {
            this.f18370v = null;
        }
        for (View view : this.f18365q) {
            if (view != null) {
                view.setOnClickListener(null);
            }
        }
        for (View view2 : this.f18365q) {
            if (view2 != null) {
                view2.setOnTouchListener(null);
            }
        }
        this.f18366r = null;
        this.f18365q.clear();
        this.f18359k = null;
        this.f18363o = null;
        this.f18360l = null;
        this.f18355g = null;
        this.f18361m = null;
        this.f18362n = null;
        this.f18356h = null;
        this.f18358j = null;
        this.f18357i = null;
        this.f18364p = null;
        this.f18368t.clear();
        this.f18371w.clear();
        this.f18372x.clear();
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final String getAdCallToAction() {
        return this.f18357i;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final String getAdDescription() {
        return this.f18356h;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final String getAdTitle() {
        return this.f18355g;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final String getAdvertiserName() {
        return this.f18358j;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final Uri getAppIcon() {
        return this.f18360l;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final Float getMediaAspectRatio() {
        return this.f18364p;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final MediaView getMediaView() {
        return this.f18362n;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final String getPrice() {
        return this.f18359k;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final Float getRating() {
        return this.f18363o;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8236x
    public boolean isVideoAd() {
        return this.f18367s != null;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final void registerViewsForInteraction(ViewGroup viewGroup, MediaView mediaView, ImageView imageView, Collection collection) {
        this.f18365q.clear();
        if (collection != null) {
            this.f18365q.addAll(collection);
        }
        if (viewGroup != null && !this.f18365q.contains(viewGroup)) {
            this.f18365q.add(viewGroup);
        }
        if (mediaView != null && !this.f18365q.contains(mediaView)) {
            this.f18365q.add(mediaView);
        }
        if (imageView != null && !this.f18365q.contains(imageView)) {
            this.f18365q.add(imageView);
        }
        MediaView mediaView2 = this.f18362n;
        if (mediaView2 == null || mediaView2.getContext() == null) {
            IAlog.m21946b("%sCould not attach NativeAdViewGestureDetector, MediaView or its context are null", "w0");
            return;
        }
        this.f18366r = new ViewOnTouchListenerC8160r(this.f18362n.getContext(), this);
        for (View view : this.f18365q) {
            if (view != null) {
                view.setOnTouchListener(this.f18366r);
            }
        }
    }
}
