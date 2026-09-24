package com.mbridge.msdk.videocommon.download;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes7.dex */
public class NetStateOnReceive extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                    C14203b.getInstance().m42525b(false);
                } else if (activeNetworkInfo.getType() == 1) {
                    C14203b.getInstance().m42519a(true);
                } else if (activeNetworkInfo.getType() == 0) {
                    C14203b.getInstance().m42518a();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
