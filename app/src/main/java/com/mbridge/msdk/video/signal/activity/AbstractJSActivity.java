package com.mbridge.msdk.video.signal.activity;

import android.content.res.Configuration;
import com.mbridge.msdk.activity.MBBaseActivity;
import com.mbridge.msdk.foundation.feedback.C13084b;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.video.signal.InterfaceC14079b;
import com.mbridge.msdk.video.signal.InterfaceC14080c;
import com.mbridge.msdk.video.signal.InterfaceC14173d;
import com.mbridge.msdk.video.signal.InterfaceC14175f;
import com.mbridge.msdk.video.signal.InterfaceC14178g;
import com.mbridge.msdk.video.signal.InterfaceC14180i;
import com.mbridge.msdk.video.signal.InterfaceC14199j;
import com.mbridge.msdk.video.signal.factory.C14176a;
import com.mbridge.msdk.video.signal.factory.IJSFactory;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractJSActivity extends MBBaseActivity implements IJSFactory {
    protected static final String TAG = "AbstractJSActivity";
    protected IJSFactory jsFactory = new C14176a();

    public boolean canBackPress() {
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public InterfaceC14079b getActivityProxy() {
        return this.jsFactory.getActivityProxy();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public InterfaceC14180i getIJSRewardVideoV1() {
        return this.jsFactory.getIJSRewardVideoV1();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public InterfaceC14080c getJSBTModule() {
        return this.jsFactory.getJSBTModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public InterfaceC14173d getJSCommon() {
        return this.jsFactory.getJSCommon();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public InterfaceC14175f getJSContainerModule() {
        return this.jsFactory.getJSContainerModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public InterfaceC14178g getJSNotifyProxy() {
        return this.jsFactory.getJSNotifyProxy();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public InterfaceC14199j getJSVideoModule() {
        return this.jsFactory.getJSVideoModule();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (getJSCommon().mo42212a()) {
            if (getJSContainerModule() == null || !getJSContainerModule().miniCardShowing()) {
                getActivityProxy().mo42234e();
                return;
            }
            return;
        }
        if (canBackPress()) {
            super.onBackPressed();
        } else {
            C13219q0.m37813a(TAG, "onBackPressed can't excute");
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (getJSCommon().mo42212a()) {
            getActivityProxy().mo42230a(configuration);
        }
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        if (getJSCommon().mo42212a()) {
            getActivityProxy().mo42236g();
        }
        getActivityProxy().mo42229a(1);
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (C13084b.f35793f) {
            return;
        }
        if (getJSCommon().mo42212a()) {
            getActivityProxy().mo42233d();
        }
        getActivityProxy().mo42229a(0);
    }

    public void registerJsFactory(IJSFactory iJSFactory) {
        this.jsFactory = iJSFactory;
    }
}
