package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.common.base.Ascii;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4d */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C45764d<T> {
    public static byte[] A09;
    public static String[] A0A = {"qNhODmuhOGTzTOdNu4k", "7K2GPWa5EHuyy4", "E4NOCJ5RL4hYeLNooPFdkLqGKDRv", "JwlW7s8WNTa19hdGL1amV", "YNjlntyRTdoFHiJHxz0qVC", "VcHvMaXHchlXNA9aE7EYkOxPZlMykCpc", "sHIyzZJD7qVKB1sd9lWDot", "2KMjU5K0FjJgBGqm2h4w3g2sgyG9pwrH"};
    public boolean A00;
    public boolean A01;
    public final InterfaceC454245 A02;
    public final InterfaceC45704X A03;
    public final InterfaceC45744b<T> A04;
    public final Object A05;
    public final ArrayDeque<Runnable> A06;
    public final ArrayDeque<Runnable> A07;
    public final CopyOnWriteArraySet<C45754c<T>> A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C45764d(CopyOnWriteArraySet<C45754c<T>> copyOnWriteArraySet, Looper looper, InterfaceC454245 interfaceC454245, InterfaceC45744b<T> interfaceC45744b) {
        this.A02 = interfaceC454245;
        this.A08 = copyOnWriteArraySet;
        this.A04 = interfaceC45744b;
        this.A05 = new Object();
        this.A06 = new ArrayDeque<>();
        this.A07 = new ArrayDeque<>();
        this.A03 = interfaceC454245.A5P(looper, new Handler.Callback() { // from class: com.facebook.ads.redexgen.X.4Z
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.A00.A05(message);
            }
        });
        this.A01 = true;
        this.A00 = MetaExoPlayerUpgradeConfig.A03(EnumC7071jX.A0E);
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 38);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A09 = new byte[]{41, 46, 54, 47, 43, 37, 33, 60, 45, 58, 41, 60, 33, 39, 38, Ascii.f22500SO, 33, 38, 33, 59, 32, 45, 44};
        if (A0A[0].length() == 4) {
            throw new RuntimeException();
        }
        A0A[3] = "KpT";
    }

    static {
        A03();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4b != com.facebook.ads.androidx.media3.common.util.ListenerSet$IterationFinishedEvent<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    public C45764d(Looper looper, InterfaceC454245 interfaceC454245, InterfaceC45744b<T> interfaceC45744b) {
        this(new CopyOnWriteArraySet(), looper, interfaceC454245, interfaceC45744b);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4b != com.facebook.ads.androidx.media3.common.util.ListenerSet$IterationFinishedEvent<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    private final C45764d<T> A00(Looper looper, InterfaceC454245 interfaceC454245, InterfaceC45744b<T> interfaceC45744b) {
        return new C45764d<>(this.A08, looper, interfaceC454245, interfaceC45744b);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    private void A02() {
        if (!this.A01) {
            return;
        }
        AbstractC45353y.A08(Thread.currentThread() == this.A03.A8R().getThread());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.androidx.media3.common.util.ListenerSet$ListenerHolder<T> */
    public static /* synthetic */ void A04(CopyOnWriteArraySet copyOnWriteArraySet, int i, InterfaceC45734a interfaceC45734a) {
        Iterator it = copyOnWriteArraySet.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A01(0, 6, 102));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.androidx.media3.common.util.ListenerSet$ListenerHolder<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    public boolean A05(Message message) {
        Iterator<C45754c<T>> it = this.A08.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A01(6, 17, 110));
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4b != com.facebook.ads.androidx.media3.common.util.ListenerSet$IterationFinishedEvent<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    public final C45764d<T> A07(Looper looper, InterfaceC45744b<T> interfaceC45744b) {
        return A00(looper, this.A02, interfaceC45744b);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    public final void A08() {
        A02();
        if (this.A07.isEmpty()) {
            return;
        }
        if (!this.A03.A9n(0)) {
            this.A03.AJD(this.A03.ACg(0));
        }
        boolean z = !this.A06.isEmpty();
        this.A06.addAll(this.A07);
        this.A07.clear();
        if (z) {
            return;
        }
        while (!recursiveFlushInProgress) {
            Runnable runnablePeekFirst = this.A06.peekFirst();
            String[] strArr = A0A;
            if (strArr[4].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[4] = "yEp1Grh3pDykJXHd8ndBtu";
            strArr2[6] = "iM1KUlOTpdsgtS4YknLkQB";
            runnablePeekFirst.run();
            this.A06.removeFirst();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4a != com.facebook.ads.androidx.media3.common.util.ListenerSet$Event<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.androidx.media3.common.util.ListenerSet$ListenerHolder<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    public final void A09(final int i, final InterfaceC45734a<T> interfaceC45734a) {
        A02();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.A08);
        if (this.A00) {
            Iterator it = copyOnWriteArraySet.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException(A01(0, 6, 102));
            }
            return;
        }
        this.A07.add(new Runnable() { // from class: com.facebook.ads.redexgen.X.4Y
            @Override // java.lang.Runnable
            public final void run() {
                C45764d.A04(copyOnWriteArraySet, i, interfaceC45734a);
            }
        });
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4a != com.facebook.ads.androidx.media3.common.util.ListenerSet$Event<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    public final void A0A(int i, InterfaceC45734a<T> interfaceC45734a) {
        A09(i, interfaceC45734a);
        A08();
    }
}
