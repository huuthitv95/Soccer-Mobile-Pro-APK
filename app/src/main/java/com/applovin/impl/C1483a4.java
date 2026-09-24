package com.applovin.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.a4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1483a4 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    private final List f1007a = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: com.applovin.impl.a4$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo1869a();

        /* JADX INFO: renamed from: b */
        void mo1870b();
    }

    public C1483a4(Context context) {
        context.getApplicationContext().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* JADX INFO: renamed from: a */
    private static boolean m1866a(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        Object obj = extras.get("networkInfo");
        if (obj instanceof NetworkInfo) {
            return ((NetworkInfo) obj).isConnected();
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m1867a(a aVar) {
        this.f1007a.add(aVar);
    }

    /* JADX INFO: renamed from: b */
    public void m1868b(a aVar) {
        this.f1007a.remove(aVar);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE") || isInitialStickyBroadcast()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f1007a);
        if (m1866a(intent)) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((a) it.next()).mo1869a();
            }
        } else {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((a) it2.next()).mo1870b();
            }
        }
    }
}
