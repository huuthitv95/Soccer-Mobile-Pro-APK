package com.unity3d.player;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;

/* JADX INFO: renamed from: com.unity3d.player.k */
/* JADX INFO: loaded from: classes7.dex */
final class C14690k {

    /* JADX INFO: renamed from: a */
    private Context f41756a;

    /* JADX INFO: renamed from: b */
    private b f41757b;

    /* JADX INFO: renamed from: com.unity3d.player.k$a */
    public interface a {
        /* JADX INFO: renamed from: b */
        void mo43218b();
    }

    /* JADX INFO: renamed from: com.unity3d.player.k$b */
    private class b extends ContentObserver {

        /* JADX INFO: renamed from: b */
        private a f41759b;

        public b(Handler handler, a aVar) {
            super(handler);
            this.f41759b = aVar;
        }

        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return super.deliverSelfNotifications();
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            a aVar = this.f41759b;
            if (aVar != null) {
                aVar.mo43218b();
            }
        }
    }

    public C14690k(Context context) {
        this.f41756a = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m43411a() {
        if (this.f41757b != null) {
            this.f41756a.getContentResolver().unregisterContentObserver(this.f41757b);
            this.f41757b = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m43412a(a aVar, String str) {
        this.f41757b = new b(new Handler(Looper.getMainLooper()), aVar);
        this.f41756a.getContentResolver().registerContentObserver(Settings.System.getUriFor(str), true, this.f41757b);
    }
}
