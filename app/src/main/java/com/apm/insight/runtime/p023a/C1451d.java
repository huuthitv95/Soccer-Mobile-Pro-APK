package com.apm.insight.runtime.p023a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.apm.insight.C1386c;
import com.apm.insight.runtime.C1468j;
import com.apm.insight.runtime.C1471m;

/* JADX INFO: renamed from: com.apm.insight.runtime.a.d */
/* JADX INFO: compiled from: BatteryWatcher.java */
/* JADX INFO: loaded from: classes3.dex */
final class C1451d {

    /* JADX INFO: renamed from: a */
    private int f829a;

    /* JADX INFO: renamed from: com.apm.insight.runtime.a.d$a */
    /* JADX INFO: compiled from: BatteryWatcher.java */
    class a extends BroadcastReceiver {
        private a() {
        }

        /* synthetic */ a(C1451d c1451d, byte b) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            try {
                if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                    C1451d.this.f829a = (int) ((intent.getIntExtra("level", 0) * 100.0f) / intent.getIntExtra("scale", 100));
                }
            } catch (Throwable unused) {
            }
        }
    }

    C1451d(final Context context) {
        C1471m.m1704a().m1735a(new Runnable() { // from class: com.apm.insight.runtime.a.d.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    context.registerReceiver(new a(C1451d.this, (byte) 0), new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                } catch (Throwable th) {
                    C1386c.m990a();
                    C1468j.m1652a(th, "NPTH_CATCH");
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final int m1606a() {
        return this.f829a;
    }
}
