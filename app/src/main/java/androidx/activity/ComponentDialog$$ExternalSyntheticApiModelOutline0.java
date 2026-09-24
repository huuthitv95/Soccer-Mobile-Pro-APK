package androidx.activity;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.Person;
import android.app.job.JobWorkItem;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ComponentDialog$$ExternalSyntheticApiModelOutline0 {
    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ Notification.MessagingStyle m12m(Object obj) {
        return (Notification.MessagingStyle) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ NotificationChannel m14m(Object obj) {
        return (NotificationChannel) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ NotificationChannel m15m(String str, CharSequence charSequence, int i) {
        return new NotificationChannel(str, charSequence, i);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ NotificationChannelGroup m16m(Object obj) {
        return (NotificationChannelGroup) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ Person m17m(Object obj) {
        return (Person) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ JobWorkItem m19m(Intent intent) {
        return new JobWorkItem(intent);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ ShortcutInfo.Builder m24m(Context context, String str) {
        return new ShortcutInfo.Builder(context, str);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ ShortcutInfo m36m(Object obj) {
        return (ShortcutInfo) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ ShortcutManager m37m(Object obj) {
        return (ShortcutManager) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ MediaSession m39m(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str, bundle);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ OnBackInvokedCallback m47m(Object obj) {
        return (OnBackInvokedCallback) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher m50m(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ Class m52m() {
        return Notification.MessagingStyle.class;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m56m() {
    }

    public static /* bridge */ /* synthetic */ Class m$1() {
        return Notification.DecoratedCustomViewStyle.class;
    }

    public static /* bridge */ /* synthetic */ Class m$2() {
        return ShortcutManager.class;
    }
}
