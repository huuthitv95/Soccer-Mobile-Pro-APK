package com.google.android.play.core.assetpacks;

import android.R;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.activity.ComponentDialog$$ExternalSyntheticApiModelOutline0;
import androidx.media3.common.util.Util$$ExternalSyntheticApiModelOutline0;
import com.facebook.share.internal.ShareConstants;
import com.google.android.play.core.assetpacks.internal.AbstractBinderC10110i;
import com.google.android.play.core.assetpacks.internal.C10089ai;
import com.google.android.play.core.assetpacks.internal.C10112k;
import com.google.android.play.core.assetpacks.internal.C10116o;
import com.pgl.ssdk.ab$$ExternalSyntheticApiModelOutline0;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.b */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class BinderC9975b extends AbstractBinderC10110i {

    /* JADX INFO: renamed from: a */
    final NotificationManager f22037a;

    /* JADX INFO: renamed from: b */
    private final C10116o f22038b = new C10116o("AssetPackExtractionService");

    /* JADX INFO: renamed from: c */
    private final Context f22039c;

    /* JADX INFO: renamed from: d */
    private final C9983bh f22040d;

    /* JADX INFO: renamed from: e */
    private final C10130l f22041e;

    /* JADX INFO: renamed from: f */
    private final ServiceConnectionC10011ci f22042f;

    BinderC9975b(Context context, C9983bh c9983bh, C10130l c10130l, ServiceConnectionC10011ci serviceConnectionC10011ci) {
        this.f22039c = context;
        this.f22040d = c9983bh;
        this.f22041e = c10130l;
        this.f22042f = serviceConnectionC10011ci;
        this.f22037a = (NotificationManager) context.getSystemService("notification");
    }

    /* JADX INFO: renamed from: d */
    private final synchronized void m22527d(String str) {
        if (str == null) {
            str = "File downloads by Play";
        }
        Util$$ExternalSyntheticApiModelOutline0.m355m();
        this.f22037a.createNotificationChannel(ComponentDialog$$ExternalSyntheticApiModelOutline0.m15m("playcore-assetpacks-service-notification-channel", str, 2));
    }

    /* JADX INFO: renamed from: e */
    private final synchronized void m22528e(Bundle bundle, C10112k c10112k) throws RemoteException {
        Notification.Builder priority;
        this.f22038b.m22749a("updateServiceState AIDL call", new Object[0]);
        if (C10089ai.m22709b(this.f22039c) && C10089ai.m22708a(this.f22039c)) {
            int i = bundle.getInt(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE);
            this.f22042f.m22620c(c10112k);
            if (i != 1) {
                if (i == 2) {
                    this.f22041e.m22788g(false);
                    this.f22042f.m22619b();
                    return;
                } else {
                    this.f22038b.m22750b("Unknown action type received: %d", Integer.valueOf(i));
                    c10112k.m22739d(new Bundle());
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 26) {
                m22527d(bundle.getString("notification_channel_name"));
            }
            this.f22041e.m22788g(true);
            ServiceConnectionC10011ci serviceConnectionC10011ci = this.f22042f;
            String string = bundle.getString("notification_title");
            String string2 = bundle.getString("notification_subtext");
            long j = bundle.getLong("notification_timeout", 600000L);
            Parcelable parcelable = bundle.getParcelable("notification_on_click_intent");
            if (Build.VERSION.SDK_INT >= 26) {
                Context context = this.f22039c;
                ab$$ExternalSyntheticApiModelOutline0.m44660m$1();
                priority = ab$$ExternalSyntheticApiModelOutline0.m42835m(context, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(j);
            } else {
                priority = new Notification.Builder(this.f22039c).setPriority(-2);
            }
            if (parcelable instanceof PendingIntent) {
                priority.setContentIntent((PendingIntent) parcelable);
            }
            Notification.Builder ongoing = priority.setSmallIcon(R.drawable.stat_sys_download).setOngoing(false);
            if (string == null) {
                string = "Downloading additional file";
            }
            Notification.Builder contentTitle = ongoing.setContentTitle(string);
            if (string2 == null) {
                string2 = "Transferring";
            }
            contentTitle.setSubText(string2);
            int i2 = bundle.getInt("notification_color");
            if (i2 != 0) {
                priority.setColor(i2).setVisibility(-1);
            }
            serviceConnectionC10011ci.m22618a(priority.build());
            this.f22039c.bindService(new Intent(this.f22039c, (Class<?>) ExtractionForegroundService.class), this.f22042f, 1);
            return;
        }
        c10112k.m22739d(new Bundle());
    }

    @Override // com.google.android.play.core.assetpacks.internal.InterfaceC10111j
    /* JADX INFO: renamed from: b */
    public final void mo22529b(Bundle bundle, C10112k c10112k) throws RemoteException {
        this.f22038b.m22749a("clearAssetPackStorage AIDL call", new Object[0]);
        if (!C10089ai.m22709b(this.f22039c) || !C10089ai.m22708a(this.f22039c)) {
            c10112k.m22739d(new Bundle());
        } else {
            this.f22040d.m22582z();
            c10112k.m22738c(new Bundle());
        }
    }

    @Override // com.google.android.play.core.assetpacks.internal.InterfaceC10111j
    /* JADX INFO: renamed from: c */
    public final void mo22530c(Bundle bundle, C10112k c10112k) throws RemoteException {
        m22528e(bundle, c10112k);
    }
}
