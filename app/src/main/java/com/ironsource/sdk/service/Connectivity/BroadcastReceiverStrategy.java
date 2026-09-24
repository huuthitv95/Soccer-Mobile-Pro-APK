package com.ironsource.sdk.service.Connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.ironsource.C11693U3;
import com.ironsource.C12317m4;
import com.ironsource.InterfaceC12439q7;
import com.ironsource.InterfaceC12457r7;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class BroadcastReceiverStrategy implements InterfaceC12439q7 {

    /* JADX INFO: renamed from: a */
    private final InterfaceC12457r7 f32390a;

    /* JADX INFO: renamed from: b */
    private BroadcastReceiver f32391b = new BroadcastReceiver() { // from class: com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String strM27576b = C11693U3.m27576b(context);
            if (strM27576b.equals("none")) {
                BroadcastReceiverStrategy.this.f32390a.mo27320a();
            } else {
                BroadcastReceiverStrategy.this.f32390a.mo27321a(strM27576b, new JSONObject());
            }
        }
    };

    public BroadcastReceiverStrategy(InterfaceC12457r7 interfaceC12457r7) {
        this.f32390a = interfaceC12457r7;
    }

    @Override // com.ironsource.InterfaceC12439q7
    /* JADX INFO: renamed from: a */
    public void mo31314a(Context context) {
        try {
            context.unregisterReceiver(this.f32391b);
        } catch (IllegalArgumentException e) {
            C12317m4.m32153d().m32155a(e);
        } catch (Exception e2) {
            C12317m4.m32153d().m32155a(e2);
            Log.e("ContentValues", "unregisterConnectionReceiver - " + e2);
        }
    }

    @Override // com.ironsource.InterfaceC12439q7
    /* JADX INFO: renamed from: b */
    public void mo31315b(Context context) {
        try {
            context.registerReceiver(this.f32391b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    @Override // com.ironsource.InterfaceC12439q7
    /* JADX INFO: renamed from: c */
    public JSONObject mo31316c(Context context) {
        return new JSONObject();
    }

    @Override // com.ironsource.InterfaceC12439q7
    /* JADX INFO: renamed from: a */
    public void mo31313a() {
        this.f32391b = null;
    }
}
