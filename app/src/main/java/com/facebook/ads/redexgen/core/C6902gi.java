package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.facebook.ads.internal.context.Repairable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gi */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6902gi extends C6067T8 {
    public static String[] A06 = {"4Fl94EIzOk67aYUPduHJ8UazEL", "sAhktSZOOrm35xxj8Imdq8RPkj", "oRYwVa3KjTvntAfrBK1sqTqE8vcnrhu1", "DAigVkrFkMuOUy14T2FK5zmWgvJcIn3a", "an5oIaHMQLp81wCZBnKMJTBSx7KtQFJf", "wEWpxEoKGSO43ttKCSegU3t35jPnkl3s", "WpWdxAQuBweGThqHfmbUTgqTG7", "dWX8I2VlCkDjmK6jHvJYkvPP690yaesv"};
    public WeakReference<Activity> A00;
    public WeakHashMap<Repairable, Boolean> A01;
    public final C6065T6 A02;
    public final AtomicReference<InterfaceC6064T5> A03;
    public final AtomicReference<Object> A04;
    public final AtomicReference<InterfaceC5624Lt> A05;

    public C6902gi(Activity activity, InterfaceC6069TA interfaceC6069TA, InterfaceC5624Lt interfaceC5624Lt) {
        super(activity.getApplicationContext(), interfaceC6069TA);
        this.A01 = new WeakHashMap<>();
        this.A05 = new AtomicReference<>();
        this.A03 = new AtomicReference<>();
        this.A02 = new C6065T6();
        this.A04 = new AtomicReference<>();
        this.A05.set(interfaceC5624Lt);
        this.A00 = new WeakReference<>(activity);
    }

    public C6902gi(Context context, InterfaceC6069TA interfaceC6069TA, InterfaceC5624Lt interfaceC5624Lt) {
        super(context.getApplicationContext(), interfaceC6069TA);
        this.A01 = new WeakHashMap<>();
        this.A05 = new AtomicReference<>();
        this.A03 = new AtomicReference<>();
        this.A02 = new C6065T6();
        this.A04 = new AtomicReference<>();
        this.A05.set(interfaceC5624Lt);
        Activity activityA00 = A00(context);
        if (activityA00 != null) {
            this.A00 = new WeakReference<>(activityA00);
        } else {
            this.A00 = new WeakReference<>(null);
        }
    }

    public static Activity A00(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if ((context instanceof C6902gi) && ((C6902gi) context).A0E() != null) {
                return ((C6902gi) context).A0E();
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public final Activity A0E() {
        return this.A00.get();
    }

    public InterfaceC5624Lt A0F() {
        InterfaceC5624Lt funnel = this.A05.get();
        if (funnel == null) {
            return new C7132kX();
        }
        return funnel;
    }

    public final InterfaceC6064T5 A0G() {
        return this.A03.get();
    }

    public final C6065T6 A0H() {
        return this.A02;
    }

    public final Object A0I() {
        return this.A04.get();
    }

    public final void A0J(Activity activity) {
        this.A00 = new WeakReference<>(activity);
    }

    public final void A0K(InterfaceC5624Lt interfaceC5624Lt) {
        this.A05.set(interfaceC5624Lt);
    }

    public final void A0L(C6902gi c6902gi) {
        c6902gi.A01.putAll(this.A01);
        this.A01 = c6902gi.A01;
    }

    public final void A0M(C6902gi c6902gi) {
        A0K(c6902gi.A0F());
        A0D(c6902gi.A0C());
        A0N(c6902gi.A0G());
    }

    public final void A0N(InterfaceC6064T5 interfaceC6064T5) {
        this.A03.set(interfaceC6064T5);
    }

    public final void A0O(Repairable repairable) {
        this.A01.put(repairable, true);
    }

    public final void A0P(Object obj) {
        this.A04.set(obj);
    }

    public final void A0Q(Throwable th) {
        Iterator<Map.Entry<Repairable, Boolean>> it = this.A01.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String[] strArr = A06;
            if (strArr[4].charAt(18) == strArr[2].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[0] = "cq4W2mN05Su2gaFDi5CYFjM7nJ";
            strArr2[6] = "g7MgkZWMqMCaiMVBRzNoHUUy7c";
            if (zHasNext) {
                it.next().getKey().repair(th);
            } else {
                return;
            }
        }
    }
}
