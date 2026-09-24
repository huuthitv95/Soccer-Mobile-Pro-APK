package com.fyber.inneractive.sdk.activities;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.fyber.inneractive.sdk.C7809R;
import com.fyber.inneractive.sdk.config.C8028r0;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.AbstractC8076b0;
import com.fyber.inneractive.sdk.flow.AbstractC8170p0;
import com.fyber.inneractive.sdk.flow.C8124h0;
import com.fyber.inneractive.sdk.interfaces.InterfaceC8264e;
import com.fyber.inneractive.sdk.interfaces.InterfaceC8265f;
import com.fyber.inneractive.sdk.network.AbstractC8434z;
import com.fyber.inneractive.sdk.p278ui.CloseButtonConfiguration;
import com.fyber.inneractive.sdk.p278ui.CloseButtonFlowManager;
import com.fyber.inneractive.sdk.renderers.C9078v;
import com.fyber.inneractive.sdk.rtb.watermark.C9111b;
import com.fyber.inneractive.sdk.rtb.watermark.InterfaceC9110a;
import com.fyber.inneractive.sdk.util.AbstractC9166l0;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.C9172n0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class InneractiveFullscreenAdActivity extends InneractiveBaseActivity implements InterfaceC8264e {
    public static final String EXTRA_KEY_SPOT_ID = "spotId";

    /* JADX INFO: renamed from: b */
    public ViewGroup f17461b;

    /* JADX INFO: renamed from: c */
    public InneractiveAdSpot f17462c;

    /* JADX INFO: renamed from: d */
    public InterfaceC8265f f17463d;

    /* JADX INFO: renamed from: i */
    public CloseButtonFlowManager f17468i;

    /* JADX INFO: renamed from: e */
    public int f17464e = 0;

    /* JADX INFO: renamed from: f */
    public int f17465f = 0;

    /* JADX INFO: renamed from: g */
    public int f17466g = 0;

    /* JADX INFO: renamed from: h */
    public boolean f17467h = false;
    protected final Runnable mHideNavigationBarTask = new RunnableC7813c(this);

    public interface FullScreenRendererProvider {
        InterfaceC8265f getFullscreenRenderer();
    }

    public interface OnInneractiveFullscreenAdDestroyListener {
        void onActivityDestroyed(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity);
    }

    public void cancelHideNavigationBarTask() {
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(null);
        AbstractC9183r.f21478b.removeCallbacks(this.mHideNavigationBarTask);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8264e
    public void destroy() {
        if (isFinishing() || this.f17461b == null) {
            return;
        }
        finish();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8264e
    public void disableCloseButton() {
        CloseButtonFlowManager closeButtonFlowManager = this.f17468i;
        if (closeButtonFlowManager == null) {
            return;
        }
        closeButtonFlowManager.f21385c.setVisibility(8);
        closeButtonFlowManager.f21383a.setVisibility(8);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8264e
    public void dismissAd(boolean z) {
        this.f17467h = z;
        cancelHideNavigationBarTask();
        InterfaceC8265f interfaceC8265f = this.f17463d;
        if (interfaceC8265f != null) {
            interfaceC8265f.mo20594b(z);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8264e
    public View getCloseButton() {
        CloseButtonFlowManager closeButtonFlowManager = this.f17468i;
        if (closeButtonFlowManager != null) {
            return closeButtonFlowManager.f21387e;
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8264e
    public ViewGroup getLayout() {
        return this.f17461b;
    }

    public void hideNavigationBar() {
        View decorView = getWindow().getDecorView();
        if ((decorView.getSystemUiVisibility() & 2) == 0) {
            decorView.setSystemUiVisibility(2818);
        }
        decorView.setOnSystemUiVisibilityChangeListener(new ViewOnSystemUiVisibilityChangeListenerC7815e(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initWindowFeatures(InterfaceC8265f interfaceC8265f) {
        requestWindowFeature(1);
        getWindow().addFlags(1024);
        getWindow().addFlags(128);
        if (Build.VERSION.SDK_INT >= 28) {
            getWindow().addFlags(2);
        }
        if (interfaceC8265f != 0 && (((AbstractC8076b0) interfaceC8265f) instanceof C9078v)) {
            setTheme(R.style.Theme.NoTitleBar.Fullscreen);
            requestWindowFeature(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            requestWindowFeature(134217728);
            requestWindowFeature(Integer.MIN_VALUE);
        }
        hideNavigationBar();
        C8028r0 c8028r0 = (C8028r0) this.f17462c.getAdContent().f18376d;
        if (c8028r0.f17816f != null) {
            Orientation orientation = c8028r0.f17816f.f17871e;
            setActivityOrientation(orientation.allowOrientationChange, orientation);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8264e
    public boolean isCloseButtonDisplay() {
        CloseButtonFlowManager closeButtonFlowManager = this.f17468i;
        return closeButtonFlowManager != null && closeButtonFlowManager.f21386d.getVisibility() == 0;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        InterfaceC8265f interfaceC8265f = this.f17463d;
        if (interfaceC8265f == null || !interfaceC8265f.mo20671u()) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        InterfaceC8265f interfaceC8265f = this.f17463d;
        if (interfaceC8265f != null) {
            int i = configuration.orientation;
            if (i != this.f17464e) {
                this.f17464e = i;
                interfaceC8265f.mo20666a();
                return;
            }
            int i2 = this.f17465f;
            int i3 = configuration.screenHeightDp;
            if (i2 == i3 && this.f17466g == configuration.screenWidthDp) {
                return;
            }
            this.f17465f = i3;
            this.f17466g = configuration.screenWidthDp;
            interfaceC8265f.mo20666a();
        }
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        String stringExtra = getIntent().getStringExtra("spotId");
        InneractiveAdSpot inneractiveAdSpot = null;
        if (TextUtils.isEmpty(stringExtra)) {
            IAlog.m21950f("%sSpot id must be provided as an extra before calling createActivity with InneractiveInterstitialAdActivty", IAlog.m21943a(this));
        } else {
            InneractiveAdSpot spot = InneractiveAdSpotManager.get().getSpot(stringExtra);
            if (spot == null) {
                IAlog.m21946b("%sSpot id %s cannot be found in spot manager!", IAlog.m21943a(this), stringExtra);
            }
            if (spot != null && spot.getAdContent() == null) {
                IAlog.m21945a("%sSpot does not have a content. Cannot start activity", IAlog.m21943a(this));
            }
            if (spot != null && spot.getAdContent() != null) {
                inneractiveAdSpot = spot;
            }
        }
        this.f17462c = inneractiveAdSpot;
        if (inneractiveAdSpot == null || inneractiveAdSpot.getAdContent() == null || this.f17462c.getAdContent().f18376d == null) {
            super.onCreate(bundle);
            finish();
            return;
        }
        InneractiveUnitController selectedUnitController = this.f17462c.getSelectedUnitController();
        if (selectedUnitController == null || !(selectedUnitController instanceof FullScreenRendererProvider)) {
            IAlog.m21950f("%sno appropriate unit controller found for full screen ad. Aborting", IAlog.m21943a(this));
            super.onCreate(bundle);
            finish();
            return;
        }
        InterfaceC8265f fullscreenRenderer = ((FullScreenRendererProvider) selectedUnitController).getFullscreenRenderer();
        this.f17463d = fullscreenRenderer;
        initWindowFeatures(fullscreenRenderer);
        super.onCreate(bundle);
        IAlog.m21945a("%sInterstitial for spot id %s created", IAlog.m21943a(this), this.f17462c.getLocalUniqueId());
        this.f17464e = getResources().getConfiguration().orientation;
        this.f17465f = getResources().getConfiguration().screenHeightDp;
        this.f17466g = getResources().getConfiguration().screenWidthDp;
        if (this.f17463d == null) {
            IAlog.m21950f("Interstitial Activity: Could not find an appropriate full screen ad renderer for content!", new Object[0]);
            finish();
            return;
        }
        try {
            setContentView(C7809R.layout.ia_layout_fullscreen_activity);
            this.f17461b = (ViewGroup) findViewById(C7809R.id.ia_ad_content);
            this.f17468i = new CloseButtonFlowManager(this, new ViewOnClickListenerC7814d(this));
            ((AbstractC8170p0) this.f17463d).initialize(this.f17462c);
            try {
                this.f17463d.mo20593a(this, this);
                CloseButtonFlowManager closeButtonFlowManager = this.f17468i;
                if (closeButtonFlowManager != null) {
                    this.f17463d.mo20595b(closeButtonFlowManager);
                }
                this.f17462c.getAdContent().f18377e = true;
                InneractiveAdSpot inneractiveAdSpot2 = this.f17462c;
                if (inneractiveAdSpot2 != null && (inneractiveAdSpot2 instanceof C8124h0) && (this.f17463d instanceof InterfaceC9110a)) {
                    C9111b c9111b = ((C8124h0) inneractiveAdSpot2).f18085m;
                    if (c9111b == null || c9111b.f21362a == null || this.f17461b == null) {
                        String strM21943a = IAlog.m21943a(this);
                        if (c9111b == null) {
                            str = "Watermark";
                        } else {
                            str = c9111b.f21362a == null ? "Watermark ImageView" : "mContentLayout";
                        }
                        IAlog.m21945a("%sCouldn't add watermark. %s is null", strM21943a, str);
                        return;
                    }
                    FrameLayout frameLayout = new FrameLayout(this);
                    frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    frameLayout.setClickable(false);
                    frameLayout.addView(c9111b.f21362a);
                    this.f17461b.addView(frameLayout);
                    ((InterfaceC9110a) this.f17463d).mo21880a(frameLayout);
                }
            } catch (Resources.NotFoundException e) {
                IAlog.m21950f("Interstitial Activity: %s", e.getMessage());
                finish();
            } catch (InneractiveUnitController.AdDisplayError e2) {
                IAlog.m21950f("Interstitial Activity: %s", e2.getMessage());
                finish();
            }
        } catch (Throwable th) {
            AbstractC8434z.m20812a(th, this.f17462c.getAdContent().f18373a, this.f17462c.getAdContent().f18374b);
            finish();
        }
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onDestroy() {
        InterfaceC8265f interfaceC8265f;
        C9172n0 c9172n0 = AbstractC9166l0.f21461a;
        c9172n0.getClass();
        IAlog.m21945a("%scleanupForDestroyedActivity called for: %s", "IAVisibilityTracker: ", this);
        Context applicationContext = getApplicationContext();
        WeakHashMap weakHashMap = (WeakHashMap) c9172n0.f21467b.remove(applicationContext);
        if (weakHashMap != null) {
            IAlog.m21945a("%sRemoved tracking entries for destroyed activity", "IAVisibilityTracker: ");
            weakHashMap.clear();
        }
        c9172n0.m21981a(applicationContext);
        CloseButtonFlowManager closeButtonFlowManager = this.f17468i;
        if (closeButtonFlowManager != null) {
            closeButtonFlowManager.f21385c.setOnClickListener(null);
            this.f17468i = null;
        }
        ViewGroup viewGroup = this.f17461b;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f17461b = null;
        }
        InneractiveAdSpot inneractiveAdSpot = this.f17462c;
        InneractiveUnitController selectedUnitController = inneractiveAdSpot == null ? null : inneractiveAdSpot.getSelectedUnitController();
        if (selectedUnitController != null && (selectedUnitController instanceof OnInneractiveFullscreenAdDestroyListener)) {
            ((OnInneractiveFullscreenAdDestroyListener) selectedUnitController).onActivityDestroyed(this);
        }
        if (!isFinishing() && (interfaceC8265f = this.f17463d) != null) {
            CloseButtonFlowManager closeButtonFlowManager2 = this.f17468i;
            if (closeButtonFlowManager2 != null) {
                interfaceC8265f.mo20592a(closeButtonFlowManager2);
            }
            this.f17463d.mo20668k();
            this.f17463d.destroy();
            this.f17463d = null;
        }
        super.onDestroy();
        InneractiveAdSpot inneractiveAdSpot2 = this.f17462c;
        if (inneractiveAdSpot2 != null) {
            inneractiveAdSpot2.destroy();
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        if (!isFinishing()) {
            InterfaceC8265f interfaceC8265f = this.f17463d;
            if (interfaceC8265f != null) {
                interfaceC8265f.mo20670r();
                return;
            }
            return;
        }
        InterfaceC8265f interfaceC8265f2 = this.f17463d;
        if (interfaceC8265f2 != null) {
            CloseButtonFlowManager closeButtonFlowManager = this.f17468i;
            if (closeButtonFlowManager != null) {
                interfaceC8265f2.mo20592a(closeButtonFlowManager);
            }
            this.f17463d.mo20668k();
            this.f17463d.destroy();
            this.f17463d = null;
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        InterfaceC8265f interfaceC8265f = this.f17463d;
        if (interfaceC8265f != null) {
            interfaceC8265f.mo20669m();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (!z) {
            InterfaceC8265f interfaceC8265f = this.f17463d;
            if (interfaceC8265f != null) {
                interfaceC8265f.mo20670r();
                return;
            }
            return;
        }
        hideNavigationBar();
        InterfaceC8265f interfaceC8265f2 = this.f17463d;
        if (interfaceC8265f2 != null) {
            interfaceC8265f2.mo20669m();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8264e
    public void secondEndCardWasDisplayed() {
        CloseButtonFlowManager closeButtonFlowManager = this.f17468i;
        if (closeButtonFlowManager == null) {
            return;
        }
        closeButtonFlowManager.f21388f = true;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8264e
    public void setActivityOrientation(boolean z, Orientation orientation) {
        if (z && orientation.equals(Orientation.USER)) {
            setRequestedOrientation(13);
            return;
        }
        if (z && orientation.equals(Orientation.NONE)) {
            setRequestedOrientation(getRequestedOrientation());
            return;
        }
        if (orientation.equals(Orientation.LANDSCAPE)) {
            setRequestedOrientation(6);
            return;
        }
        if (orientation.equals(Orientation.PORTRAIT)) {
            setRequestedOrientation(7);
            return;
        }
        int i = getResources().getConfiguration().orientation;
        if (i == 1) {
            setRequestedOrientation(7);
        } else if (i == 2) {
            setRequestedOrientation(6);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8264e
    public void showCloseButton(boolean z, int i, int i2) {
        CloseButtonFlowManager closeButtonFlowManager = this.f17468i;
        if (closeButtonFlowManager == null) {
            return;
        }
        CloseButtonConfiguration closeButtonConfiguration = closeButtonFlowManager.f21389g;
        closeButtonConfiguration.f21378c = z;
        closeButtonConfiguration.f21379d = i;
        closeButtonConfiguration.f21380e = i2;
        closeButtonConfiguration.f21377b = true;
        closeButtonConfiguration.f21376a = false;
        closeButtonConfiguration.f21382g.mo21929a(closeButtonConfiguration);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8264e
    public void showCloseCountdown() {
        CloseButtonFlowManager closeButtonFlowManager = this.f17468i;
        if (closeButtonFlowManager == null) {
            return;
        }
        closeButtonFlowManager.f21384b.setBackgroundResource(C7809R.drawable.ia_round_overlay_bg);
        CloseButtonConfiguration closeButtonConfiguration = closeButtonFlowManager.f21389g;
        closeButtonConfiguration.f21376a = true;
        closeButtonConfiguration.f21377b = false;
        closeButtonConfiguration.f21382g.mo21929a(closeButtonConfiguration);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8264e
    public void updateCloseCountdown(int i) {
        CloseButtonFlowManager closeButtonFlowManager = this.f17468i;
        if (closeButtonFlowManager == null) {
            return;
        }
        if (i > 0) {
            closeButtonFlowManager.f21384b.setText(Integer.toString(i));
        } else {
            closeButtonFlowManager.getClass();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8264e
    public boolean wasDismissedByUser() {
        return this.f17467h;
    }
}
