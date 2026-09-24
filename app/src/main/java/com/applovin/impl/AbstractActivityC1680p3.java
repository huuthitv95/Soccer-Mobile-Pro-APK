package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.C1748l;
import com.applovin.sdk.C1846R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.p3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractActivityC1680p3 extends Activity implements AppLovinCommunicatorSubscriber {
    protected List<String> communicatorTopics = new ArrayList();

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return getClass().getSimpleName();
    }

    protected abstract C1748l getSdk();

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getSdk() != null && !AbstractC1701q7.m4092c(getSdk())) {
            setTheme(C1846R.style.com_applovin_mediation_MaxDebuggerActivity_Theme_Live);
        }
        AbstractC1564g8.m2754a(findViewById(R.id.content), getSdk());
        List<String> list = this.communicatorTopics;
        if (list == null || list.size() <= 0) {
            return;
        }
        AppLovinCommunicator.getInstance(this).subscribe(this, this.communicatorTopics);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        List<String> list = this.communicatorTopics;
        if (list == null || list.size() <= 0) {
            return;
        }
        AppLovinCommunicator.getInstance(this).unsubscribe(this, this.communicatorTopics);
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
    }
}
