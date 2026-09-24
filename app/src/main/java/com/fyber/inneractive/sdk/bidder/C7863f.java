package com.fyber.inneractive.sdk.bidder;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.serverapi.AbstractC9113b;
import com.fyber.inneractive.sdk.util.AbstractC9174o;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.bidder.f */
/* JADX INFO: loaded from: classes4.dex */
public final class C7863f extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7861e f17565a;

    public C7863f(InterfaceC7861e interfaceC7861e) {
        this.f17565a = interfaceC7861e;
    }

    /* JADX INFO: renamed from: a */
    public final void m20344a() {
        AbstractC9174o.f21470a.registerReceiver(this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        AbstractC9174o.f21470a.registerReceiver(this, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        AbstractC9174o.f21470a.registerReceiver(this, new IntentFilter("android.app.action.INTERRUPTION_FILTER_CHANGED"));
        AbstractC9174o.f21470a.registerReceiver(this, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
        AbstractC9174o.f21470a.registerReceiver(this, new IntentFilter("android.intent.action.AIRPLANE_MODE"));
        if (AbstractC9174o.m21996a("android.permission.BLUETOOTH")) {
            AbstractC9174o.f21470a.registerReceiver(this, new IntentFilter("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED"));
            AbstractC9174o.f21470a.registerReceiver(this, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z;
        if (intent == null || intent.getAction() == null) {
            return;
        }
        String action = intent.getAction();
        action.getClass();
        action.hashCode();
        switch (action) {
            case "android.intent.action.BATTERY_CHANGED":
                C7855b c7855b = (C7855b) this.f17565a;
                c7855b.f17520b.getClass();
                int intExtra = intent.getIntExtra("plugged", -1);
                z = intExtra == 1 || intExtra == 2 || intExtra == 4;
                Boolean bool = c7855b.f17521c.f17528B;
                if (bool == null || bool.booleanValue() != z) {
                    c7855b.f17521c.f17528B = Boolean.valueOf(z);
                    c7855b.m20342d();
                }
                c7855b.f17520b.getClass();
                if (!TextUtils.equals(c7855b.f17521c.f17529C, AbstractC9113b.m21907a((intent.getIntExtra("level", -1) * 100) / intent.getIntExtra("scale", -1)))) {
                    C7859d c7859d = c7855b.f17521c;
                    c7855b.f17520b.getClass();
                    c7859d.f17529C = AbstractC9113b.m21907a((intent.getIntExtra("level", -1) * 100) / intent.getIntExtra("scale", -1));
                    c7855b.m20342d();
                    break;
                }
                break;
            case "android.bluetooth.adapter.action.STATE_CHANGED":
            case "android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED":
                C7855b c7855b2 = (C7855b) this.f17565a;
                c7855b2.getClass();
                Boolean bool2 = intent.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", Integer.MIN_VALUE) == 2 ? Boolean.TRUE : null;
                C7859d c7859d2 = c7855b2.f17521c;
                if (c7859d2.f17558t != bool2) {
                    c7859d2.f17558t = bool2;
                    c7855b2.m20342d();
                    break;
                }
                break;
            case "android.intent.action.AIRPLANE_MODE":
                C7855b c7855b3 = (C7855b) this.f17565a;
                c7855b3.f17521c.f17561w = Boolean.valueOf(intent.getBooleanExtra("state", false));
                c7855b3.m20342d();
                break;
            case "android.os.action.POWER_SAVE_MODE_CHANGED":
                C7855b c7855b4 = (C7855b) this.f17565a;
                c7855b4.f17521c.f17559u = AbstractC9113b.m21920n();
                c7855b4.m20342d();
                break;
            case "android.media.RINGER_MODE_CHANGED":
                C7855b c7855b5 = (C7855b) this.f17565a;
                c7855b5.getClass();
                int intExtra2 = intent.getIntExtra("android.media.EXTRA_RINGER_MODE", -1);
                z = intExtra2 == 0 || intExtra2 == 1;
                Boolean bool3 = c7855b5.f17521c.f17563y;
                if (bool3 == null || bool3.booleanValue() != z) {
                    c7855b5.f17521c.f17563y = Boolean.valueOf(z);
                    c7855b5.m20342d();
                    break;
                }
                break;
            case "android.app.action.INTERRUPTION_FILTER_CHANGED":
                ((C7855b) this.f17565a).m20341c();
                break;
        }
    }
}
