package com.unity3d.player;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes7.dex */
public class HFPStatus {

    /* JADX INFO: renamed from: a */
    private Context f41516a;

    /* JADX INFO: renamed from: e */
    private AudioManager f41520e;

    /* JADX INFO: renamed from: b */
    private BroadcastReceiver f41517b = null;

    /* JADX INFO: renamed from: c */
    private Intent f41518c = null;

    /* JADX INFO: renamed from: d */
    private boolean f41519d = false;

    /* JADX INFO: renamed from: f */
    private boolean f41521f = false;

    /* JADX INFO: renamed from: g */
    private int f41522g = EnumC14644a.f41524a;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: com.unity3d.player.HFPStatus$a */
    static final class EnumC14644a {

        /* JADX INFO: renamed from: a */
        public static final int f41524a = 1;

        /* JADX INFO: renamed from: b */
        public static final int f41525b = 2;

        /* JADX INFO: renamed from: c */
        private static final /* synthetic */ int[] f41526c = {1, 2};
    }

    public HFPStatus(Context context) {
        this.f41520e = null;
        this.f41516a = context;
        this.f41520e = (AudioManager) context.getSystemService("audio");
        initHFPStatusJni();
    }

    /* JADX INFO: renamed from: b */
    private void m43209b() {
        BroadcastReceiver broadcastReceiver = this.f41517b;
        if (broadcastReceiver != null) {
            this.f41516a.unregisterReceiver(broadcastReceiver);
            this.f41517b = null;
            this.f41518c = null;
        }
        this.f41522g = EnumC14644a.f41524a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m43212c() {
        if (this.f41521f) {
            this.f41521f = false;
            this.f41520e.stopBluetoothSco();
        }
    }

    private final native void deinitHFPStatusJni();

    private final native void initHFPStatusJni();

    /* JADX INFO: renamed from: a */
    public final void m43213a() {
        clearHFPStat();
        deinitHFPStatusJni();
    }

    protected void clearHFPStat() {
        m43209b();
        m43212c();
    }

    protected boolean getHFPStat() {
        return this.f41522g == EnumC14644a.f41525b;
    }

    protected void requestHFPStat() {
        clearHFPStat();
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.unity3d.player.HFPStatus.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1) != 1) {
                    return;
                }
                HFPStatus.this.f41522g = EnumC14644a.f41525b;
                HFPStatus.this.m43212c();
                if (HFPStatus.this.f41519d) {
                    HFPStatus.this.f41520e.setMode(3);
                }
            }
        };
        this.f41517b = broadcastReceiver;
        this.f41518c = this.f41516a.registerReceiver(broadcastReceiver, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
        try {
            this.f41521f = true;
            this.f41520e.startBluetoothSco();
        } catch (NullPointerException unused) {
            C14685f.Log(5, "startBluetoothSco() failed. no bluetooth device connected.");
        }
    }

    protected void setHFPRecordingStat(boolean z) {
        this.f41519d = z;
        if (z) {
            return;
        }
        this.f41520e.setMode(0);
    }
}
