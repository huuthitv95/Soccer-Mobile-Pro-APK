package com.fyber.inneractive.sdk.activities;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.fyber.inneractive.sdk.C7809R;
import com.fyber.inneractive.sdk.config.global.features.C7990r;
import com.fyber.inneractive.sdk.config.global.features.EnumC7989q;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.flow.AbstractC8076b0;
import com.fyber.inneractive.sdk.flow.C8222v;
import com.fyber.inneractive.sdk.ignite.EnumC8253m;
import com.fyber.inneractive.sdk.network.EnumC8424u;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C9270v0;
import com.fyber.inneractive.sdk.web.InterfaceC9266t0;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class InternalStoreWebpageActivity extends InneractiveBaseActivity {
    public static final String EXTRA_KEY_SPOT_ID = "spotId";

    /* JADX INFO: renamed from: b */
    public ViewGroup f17482b;

    /* JADX INFO: renamed from: c */
    public C9270v0 f17483c;

    /* JADX INFO: renamed from: d */
    public EnumC7989q f17484d = EnumC7989q.FullScreen;

    public static void startActivity(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) InternalStoreWebpageActivity.class);
        intent.putExtra("spotId", str);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        C9270v0 c9270v0 = this.f17483c;
        if (c9270v0 != null) {
            c9270v0.f21674C = false;
            InterfaceC9266t0 interfaceC9266t0 = c9270v0.f21685i;
            if (interfaceC9266t0 != null) {
                AbstractC8076b0 abstractC8076b0 = (AbstractC8076b0) interfaceC9266t0;
                IAlog.m21945a("onInternalStoreWebpageDismissed callback called", new Object[0]);
                if (abstractC8076b0.f17959c != null) {
                    IAlog.m21945a("%sCalling external interface onAdWillCloseInternalBrowser", IAlog.m21943a(abstractC8076b0));
                    abstractC8076b0.f17959c.onAdWillCloseInternalBrowser(abstractC8076b0.f17957a);
                }
            }
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        C9270v0 c9270v0 = this.f17483c;
        if (c9270v0 != null) {
            if (c9270v0.f21700x) {
                return;
            }
            if (c9270v0.f21699w) {
                c9270v0.m22091d("navigateBack();");
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (attributes.width == AbstractC9174o.m22004e() || this.f17484d != EnumC7989q.Modal) {
            return;
        }
        attributes.gravity = 83;
        attributes.height = (int) (AbstractC9174o.m22002d() * 0.8f);
        attributes.width = AbstractC9174o.m22004e();
        getWindow().setAttributes(attributes);
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        InneractiveAdSpot spot;
        String stringExtra = getIntent().getStringExtra("spotId");
        if (TextUtils.isEmpty(stringExtra)) {
            IAlog.m21950f("%sSpot id is empty", IAlog.m21943a(this));
            spot = null;
        } else {
            spot = InneractiveAdSpotManager.get().getSpot(stringExtra);
        }
        if (spot == null || spot.getAdContent() == null) {
            super.onCreate(bundle);
            finish();
            return;
        }
        C7990r c7990r = (C7990r) spot.getAdContent().f18375c.m20432a(C7990r.class);
        EnumC7989q enumC7989qM20426c = c7990r != null ? c7990r.m20426c() : EnumC7989q.FullScreen;
        this.f17484d = enumC7989qM20426c;
        if (enumC7989qM20426c == EnumC7989q.Modal) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.gravity = 83;
            attributes.height = (int) (AbstractC9174o.m22002d() * 0.8f);
            attributes.width = AbstractC9174o.m22004e();
            attributes.dimAmount = 0.3f;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setBackgroundColor(0);
            getWindow().addFlags(514);
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        } else {
            setTheme(R.style.Theme.NoTitleBar.Fullscreen);
        }
        super.onCreate(bundle);
        setContentView(C7809R.layout.ia_layout_activity_internal_store_webpage);
        this.f17482b = (ViewGroup) findViewById(C7809R.id.internal_store_content);
        C9270v0 c9270v0Mo20633a = spot.getAdContent().mo20633a();
        this.f17483c = c9270v0Mo20633a;
        if (c9270v0Mo20633a != null) {
            c9270v0Mo20633a.f21693q = new WeakReference(this);
            C9270v0 c9270v0 = this.f17483c;
            C8222v c8222v = c9270v0.f21684h;
            if (c8222v != null) {
                c8222v.m20627a(EnumC8424u.IGNITE_FLOW_STORE_PAGE_OPENED, c9270v0.f21673B ? EnumC8253m.TRUE_SINGLE_TAP : EnumC8253m.SINGLE_TAP);
            }
            this.f17483c.f21696t.set(0);
        }
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onDestroy() {
        InneractiveAdSpot spot;
        C9270v0 c9270v0;
        super.onDestroy();
        String stringExtra = getIntent().getStringExtra("spotId");
        if (TextUtils.isEmpty(stringExtra)) {
            IAlog.m21950f("%sSpot id is empty", IAlog.m21943a(this));
            spot = null;
        } else {
            spot = InneractiveAdSpotManager.get().getSpot(stringExtra);
        }
        if (spot == null || spot.getAdContent() == null || spot.getAdContent().mo20599b() || (c9270v0 = this.f17483c) == null) {
            return;
        }
        c9270v0.f21701y = true;
        c9270v0.f21675D = false;
        c9270v0.f21678b.f18414h.remove(c9270v0);
        c9270v0.f21685i = null;
        IAlog.m21945a("destroy internalStoreWebpageController", new Object[0]);
        this.f17483c = null;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        ViewGroup viewGroup = this.f17482b;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        C9270v0 c9270v0 = this.f17483c;
        if (c9270v0 != null) {
            this.f17482b.addView(c9270v0.f21677a, new ViewGroup.LayoutParams(-1, -1));
        }
    }
}
