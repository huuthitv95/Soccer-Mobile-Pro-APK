package com.fyber.inneractive.sdk.external;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.C8016l0;
import com.fyber.inneractive.sdk.config.C8028r0;
import com.fyber.inneractive.sdk.config.C8043t0;
import com.fyber.inneractive.sdk.config.InterfaceC8041s0;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.factories.AbstractC8069h;
import com.fyber.inneractive.sdk.factories.C8070i;
import com.fyber.inneractive.sdk.factories.InterfaceC8068g;
import com.fyber.inneractive.sdk.flow.AbstractC8176s0;
import com.fyber.inneractive.sdk.flow.AbstractC8236x;
import com.fyber.inneractive.sdk.flow.InterfaceC8126i0;
import com.fyber.inneractive.sdk.interfaces.InterfaceC8265f;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8424u;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public class InneractiveFullscreenUnitController extends AbstractC8176s0 implements InneractiveFullscreenAdActivity.FullScreenRendererProvider, InneractiveFullscreenAdActivity.OnInneractiveFullscreenAdDestroyListener {

    /* JADX INFO: renamed from: b */
    public InneractiveFullScreenAdRewardedListener f17923b;
    protected InterfaceC8265f mRenderer;

    /* JADX INFO: renamed from: a */
    public boolean f17922a = false;

    /* JADX INFO: renamed from: c */
    public final C8060g f17924c = new C8060g(this);

    public static class AdExpiredError extends InneractiveUnitController.AdDisplayError {
        public AdExpiredError() {
            super("Ad Expired");
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8176s0, com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void destroy() {
        InterfaceC8265f interfaceC8265f = this.mRenderer;
        if (interfaceC8265f != null) {
            interfaceC8265f.destroy();
            this.mRenderer = null;
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.FullScreenRendererProvider
    public InterfaceC8265f getFullscreenRenderer() {
        return this.mRenderer;
    }

    public InneractiveFullScreenAdRewardedListener getRewardedListener() {
        return this.f17923b;
    }

    public boolean isAvailable() {
        InterfaceC8126i0 interfaceC8126i0 = (InterfaceC8126i0) AbstractC9195v.m22024a(this.mAdSpot);
        return interfaceC8126i0 != null && interfaceC8126i0.isReady();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.OnInneractiveFullscreenAdDestroyListener
    public void onActivityDestroyed(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.f17922a = false;
    }

    public void setRewardedListener(InneractiveFullScreenAdRewardedListener inneractiveFullScreenAdRewardedListener) {
        this.f17923b = inneractiveFullScreenAdRewardedListener;
    }

    public void show(Activity activity) {
        if (activity == null) {
            IAlog.m21950f("show() called with a null activity", new Object[0]);
            return;
        }
        if (this.f17922a) {
            IAlog.m21950f("InneractiveFullscreenUnitController->show(android.content.Context) called while an ad is already showing", new Object[0]);
            return;
        }
        InneractiveAdSpot adSpot = getAdSpot();
        if (adSpot == null) {
            IAlog.m21950f("InneractiveFullscreenUnitController was not attached to an ad spot", new Object[0]);
            return;
        }
        AbstractC8236x adContent = adSpot.getAdContent();
        InterfaceC8265f interfaceC8265fMo20469b = null;
        if (adContent != null) {
            EnumC8424u enumC8424u = EnumC8424u.IA_PUBLISHER_REQUESTED_SHOW;
            InneractiveAdRequest inneractiveAdRequest = adContent.f18373a;
            AbstractC9087e abstractC9087e = adContent.f18374b;
            JSONArray jSONArrayM20435b = adContent.f18375c.m20435b();
            C8428w c8428w = new C8428w(abstractC9087e);
            c8428w.f18755c = enumC8424u;
            c8428w.f18753a = inneractiveAdRequest;
            c8428w.f18756d = jSONArrayM20435b;
            c8428w.m20808a((String) null);
        }
        if (!adSpot.isReady()) {
            InneractiveUnitController.EventsListener eventsListener = this.mEventsListener;
            if (eventsListener != null) {
                ((InneractiveFullscreenAdEventsListener) eventsListener).onAdEnteredErrorState(adSpot, new AdExpiredError());
                return;
            }
            return;
        }
        if (this.mRenderer == null) {
            C8070i c8070i = AbstractC8069h.f17951a;
            InneractiveAdSpot adSpot2 = getAdSpot();
            for (InterfaceC8068g interfaceC8068g : c8070i.f17952a) {
                if (interfaceC8068g.mo20468a(adSpot2)) {
                    interfaceC8265fMo20469b = interfaceC8068g.mo20469b(adSpot2);
                    break;
                }
            }
            this.mRenderer = interfaceC8265fMo20469b;
        }
        selectContentController();
        adSpot.getLocalUniqueId();
        Intent intent = new Intent(activity, (Class<?>) InneractiveFullscreenAdActivity.class);
        intent.putExtra("spotId", adSpot.getLocalUniqueId());
        try {
            IAlog.m21945a("%sIAInterstitialUtil: Opening interstitial for spot id: %s", IAlog.m21943a(activity), adSpot.getLocalUniqueId());
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            IAlog.m21947c("%sIAInterstitialUtil: InneractiveFullscreenAdActivity.class not found. Did you declare InneractiveFullscreenAdActivity in your manifest?", IAlog.m21943a(activity));
        }
        this.f17922a = true;
        InterfaceC8265f interfaceC8265f = this.mRenderer;
        if (interfaceC8265f != null) {
            interfaceC8265f.mo20667a(this.f17924c);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8176s0
    public boolean supports(InneractiveAdSpot inneractiveAdSpot) {
        InterfaceC8041s0 interfaceC8041s0 = inneractiveAdSpot.getAdContent().f18376d;
        if (interfaceC8041s0 != null) {
            C8028r0 c8028r0 = (C8028r0) interfaceC8041s0;
            if (c8028r0.f17815e == null) {
                C8016l0 c8016l0 = c8028r0.f17813c;
                if (c8016l0 != null && UnitDisplayType.INTERSTITIAL.equals(c8016l0.f17798b)) {
                    return true;
                }
                C8043t0 c8043t0 = c8028r0.f17816f;
                return c8043t0 != null && (UnitDisplayType.REWARDED.equals(c8043t0.f17876j) || UnitDisplayType.INTERSTITIAL.equals(c8043t0.f17876j) || UnitDisplayType.VERTICAL.equals(c8043t0.f17876j));
            }
        }
        IAlog.m21950f("%s : supports() called with unit config null", IAlog.m21943a(this));
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8176s0
    public boolean supportsRefresh() {
        return false;
    }
}
