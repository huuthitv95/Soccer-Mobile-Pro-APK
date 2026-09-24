package com.mbridge.msdk.mbnative.controller;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import com.mbridge.msdk.foundation.tools.C13194e1;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.c */
/* JADX INFO: compiled from: ImpressionTracker.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13333c {

    /* JADX INFO: renamed from: a */
    private WeakReference<ViewTreeObserver> f36947a;

    /* JADX INFO: renamed from: b */
    private List<View> f36948b;

    /* JADX INFO: renamed from: c */
    private ViewTreeObserver.OnPreDrawListener f36949c;

    /* JADX INFO: renamed from: d */
    private d f36950d;

    /* JADX INFO: renamed from: e */
    private Handler f36951e;

    /* JADX INFO: renamed from: f */
    private boolean f36952f;

    /* JADX INFO: renamed from: g */
    private int f36953g;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.c$a */
    /* JADX INFO: compiled from: ImpressionTracker.java */
    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            C13333c.this.m38497b();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.c$b */
    /* JADX INFO: compiled from: ImpressionTracker.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C13333c.this.m38502d();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.c$c */
    /* JADX INFO: compiled from: ImpressionTracker.java */
    class c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f36956a;

        c(View view) {
            this.f36956a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewTreeObserver viewTreeObserver = this.f36956a.getViewTreeObserver();
            if (viewTreeObserver == null || viewTreeObserver.isAlive()) {
                C13333c.this.f36947a = new WeakReference(viewTreeObserver);
                if (C13333c.this.f36949c != null) {
                    viewTreeObserver.addOnPreDrawListener(C13333c.this.f36949c);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.c$d */
    /* JADX INFO: compiled from: ImpressionTracker.java */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo38476a(ArrayList<View> arrayList, ArrayList<View> arrayList2);
    }

    public C13333c(List<View> list, d dVar, Handler handler, int i) {
        ArrayList arrayList = new ArrayList();
        this.f36948b = arrayList;
        this.f36949c = null;
        this.f36950d = dVar;
        this.f36951e = handler;
        this.f36953g = i;
        if (list != null) {
            this.f36948b = list;
        } else {
            arrayList.clear();
        }
        m38501c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m38502d() {
        try {
            this.f36952f = false;
            List<View> list = this.f36948b;
            if (list == null || list.size() <= 0) {
                return;
            }
            ArrayList<View> arrayList = new ArrayList<>();
            ArrayList<View> arrayList2 = new ArrayList<>();
            for (int i = 0; i < this.f36948b.size(); i++) {
                View view = this.f36948b.get(i);
                if (m38499b(view)) {
                    arrayList.add(view);
                } else {
                    arrayList2.add(view);
                }
            }
            d dVar = this.f36950d;
            if (dVar != null) {
                dVar.mo38476a(arrayList, arrayList2);
            }
            if (arrayList.size() > 0) {
                m38503a();
            }
            arrayList.clear();
            arrayList2.clear();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m38497b() {
        if (this.f36952f) {
            return;
        }
        Handler handler = this.f36951e;
        if (handler != null) {
            if (this.f36953g == 1) {
                m38502d();
            } else {
                handler.postDelayed(new b(), 100L);
            }
        }
        this.f36952f = true;
    }

    /* JADX INFO: renamed from: c */
    private void m38501c() {
        try {
            m38497b();
        } catch (Throwable th) {
            C13219q0.m37817b("ImpressionTracker", th.getMessage(), th);
        }
        try {
            this.f36949c = new a();
        } catch (Throwable th2) {
            C13219q0.m37817b("ImpressionTracker", th2.getMessage(), th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m38504a(View view) {
        View viewM38553a;
        View view2;
        if (view != null) {
            viewM38553a = C13336f.m38553a(view.getContext(), view);
            this.f36948b.add(view);
        } else {
            List<View> list = this.f36948b;
            viewM38553a = null;
            if (list != null && list.size() > 0) {
                for (int i = 0; i < this.f36948b.size() && ((view2 = this.f36948b.get(i)) == null || (viewM38553a = C13336f.m38553a(view2.getContext(), view2)) == null); i++) {
                }
            }
        }
        if (viewM38553a == null) {
            return;
        }
        viewM38553a.post(new c(viewM38553a));
    }

    /* JADX INFO: renamed from: b */
    private boolean m38499b(View view) {
        return !C13194e1.m37670a(view, this.f36953g);
    }

    /* JADX INFO: renamed from: a */
    public void m38503a() {
        try {
            this.f36952f = false;
            WeakReference<ViewTreeObserver> weakReference = this.f36947a;
            if (weakReference != null && weakReference.get() != null) {
                ViewTreeObserver viewTreeObserver = this.f36947a.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this.f36949c);
                }
                this.f36947a.clear();
            }
            this.f36950d = null;
            this.f36949c = null;
            List<View> list = this.f36948b;
            if (list != null) {
                list.clear();
            }
            this.f36948b = null;
        } catch (Throwable unused) {
        }
    }
}
