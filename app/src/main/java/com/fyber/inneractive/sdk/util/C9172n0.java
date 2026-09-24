package com.fyber.inneractive.sdk.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.n0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9172n0 {

    /* JADX INFO: renamed from: b */
    public final WeakHashMap f21467b = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    public final WeakHashMap f21466a = new WeakHashMap();

    /* JADX INFO: renamed from: c */
    public final C9159j f21468c = new C9159j(16, new C9157i0());

    /* JADX INFO: renamed from: d */
    public final C9159j f21469d = new C9159j(16, new C9160j0());

    /* JADX INFO: renamed from: a */
    public final void m21980a() {
        this.f21467b.clear();
        Iterator it = this.f21466a.keySet().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) this.f21466a.get((Context) it.next());
            if (pair != null && ((ViewTreeObserver) pair.first).isAlive()) {
                ((ViewTreeObserver) pair.first).removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) pair.second);
            }
        }
        this.f21466a.clear();
    }

    /* JADX INFO: renamed from: a */
    public final void m21981a(Context context) {
        Pair pair = (Pair) this.f21466a.get(context);
        if (pair != null) {
            if (((ViewTreeObserver) pair.first).isAlive()) {
                ((ViewTreeObserver) pair.first).removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) pair.second);
            }
            this.f21466a.remove(context);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0042  */
    /* JADX INFO: renamed from: a */
    public final void m21982a(Context context, View view, InterfaceC9169m0 interfaceC9169m0) {
        View rootView;
        IAlog.m21945a("%strackView called with context: %s view: %s", "IAVisibilityTracker: ", context, view);
        if (context == null) {
            throw new IllegalStateException("View must be attached to an Activity context");
        }
        Context applicationContext = context.getApplicationContext();
        WeakHashMap weakHashMap = (WeakHashMap) this.f21467b.get(applicationContext);
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            this.f21467b.put(applicationContext, weakHashMap);
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (activity.getWindow() != null) {
                    rootView = activity.getWindow().getDecorView();
                } else {
                    rootView = view.getRootView();
                }
            } else {
                rootView = view.getRootView();
            }
            ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                ViewTreeObserverOnPreDrawListenerC9163k0 viewTreeObserverOnPreDrawListenerC9163k0 = new ViewTreeObserverOnPreDrawListenerC9163k0(this, applicationContext);
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC9163k0);
                this.f21466a.put(applicationContext, new Pair(viewTreeObserver, viewTreeObserverOnPreDrawListenerC9163k0));
            }
        }
        weakHashMap.put(view, interfaceC9169m0);
        m21984b();
    }

    /* JADX INFO: renamed from: a */
    public final void m21983a(View view) {
        IAlog.m21945a("%sunTrackView called with view", "IAVisibilityTracker: ");
        if (view == null) {
            IAlog.m21945a("%sunTrackView called with a null view!", "IAVisibilityTracker: ");
            return;
        }
        Context context = view.getContext();
        if (context == null) {
            IAlog.m21945a("%sview.getContext() returned null!", "IAVisibilityTracker: ");
            return;
        }
        Map map = (Map) this.f21467b.get(context);
        if (map == null) {
            for (Context context2 : new HashSet(this.f21467b.keySet())) {
                WeakHashMap weakHashMap = (WeakHashMap) this.f21467b.get(context2);
                if (weakHashMap != null && weakHashMap.remove(view) != null) {
                    if (IAlog.f21426a <= 2) {
                        IAlog.m21949e("removeViewFromContext found view for removal!", new Object[0]);
                    }
                    if (weakHashMap.isEmpty()) {
                        this.f21467b.remove(context2);
                        m21981a(context2);
                    }
                }
            }
        } else if (map.remove(view) != null) {
            if (IAlog.f21426a <= 2) {
                IAlog.m21949e("removeViewFromContext found view for removal!", new Object[0]);
            }
            if (map.isEmpty()) {
                this.f21467b.remove(context);
                m21981a(context);
            }
        }
        m21984b();
    }

    /* JADX INFO: renamed from: b */
    public final void m21984b() {
        for (Context context : this.f21467b.keySet()) {
            IAlog.m21945a("%stracking context: %s", "IAVisibilityTracker: ", context);
            WeakHashMap weakHashMap = (WeakHashMap) this.f21467b.get(context);
            if (weakHashMap != null) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    IAlog.m21945a("%stracking view: %s", "IAVisibilityTracker: ", (View) it.next());
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m21985b(Context context) {
        WeakHashMap weakHashMap;
        if (context == null || (weakHashMap = (WeakHashMap) this.f21467b.get(context)) == null) {
            return;
        }
        C9159j c9159j = this.f21469d;
        Object objPoll = c9159j.f21456a.poll();
        if (objPoll == null) {
            objPoll = c9159j.f21457b.mo21857a();
        }
        HashSet<View> hashSet = (HashSet) objPoll;
        hashSet.addAll(weakHashMap.keySet());
        for (View view : hashSet) {
            InterfaceC9169m0 interfaceC9169m0 = (InterfaceC9169m0) weakHashMap.get(view);
            if (interfaceC9169m0 != null) {
                C9159j c9159j2 = this.f21468c;
                Object objPoll2 = c9159j2.f21456a.poll();
                if (objPoll2 == null) {
                    objPoll2 = c9159j2.f21457b.mo21857a();
                }
                Rect rect = (Rect) objPoll2;
                interfaceC9169m0.mo21858a((view == null || view.getParent() == null || !view.isShown() || !view.getGlobalVisibleRect(rect)) ? 0.0f : (rect.width() * rect.height()) / (view.getWidth() * view.getHeight()), rect);
                this.f21468c.f21456a.offer(rect);
            }
        }
        hashSet.clear();
        this.f21469d.f21456a.offer(hashSet);
    }
}
