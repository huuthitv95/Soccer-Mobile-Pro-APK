package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest;
import com.facebook.ads.androidx.media3.exoplayer.scheduler.Requirements;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.C5 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5020C5 {
    public static byte[] A0G;
    public static String[] A0H = {"pVyOFxmsQ66MTtm1tfRFfgviAXYtJVde", "2uUwIcomsi7SFa7PXkK2f37odc1wLlYz", "QkwYj4Lqiyfn1sjUd74ET1yWKOC2yQQp", "dFCgemChCTNfDzsLBkcDawIxAoCNtdjt", "sEgyiM3VxaELP8J5ElL8PsjgrXzRWZa", "oraRcW9NweHiYSV9WAd4vPrbGQ1KpHw2", "RucdtTHsidUdQvrsj3emf0t2ky4JUHkt", "bkvUCljONwekC27QIXEAtZgyfnOfNHe"};
    public static final Requirements A0I;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C5046CX A05;
    public List<C4999Bk> A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final Context A0A;
    public final Handler A0B;
    public final HandlerC5017C2 A0C;
    public final InterfaceC7328nw A0D;
    public final InterfaceC5042CT A0E;
    public final CopyOnWriteArraySet<InterfaceC5019C4> A0F;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0H[0].charAt(31) != 'e') {
                throw new RuntimeException();
            }
            A0H[1] = "Q4q55Cq4Bi7IKuCSPoembBRK5ZQkCbyv";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE);
            i4++;
        }
    }

    public static void A03() {
        A0G = new byte[]{34, Ascii.f22502US, 8, 55, Ascii.f22503VT, 6, Ascii.f22498RS, 2, Ascii.NAK, 93, 35, 8, Ascii.DLE, 9, Ascii.f22503VT, 8, 6, 3, 42, 6, 9, 6, 0, 2, Ascii.NAK};
    }

    static {
        A03();
        A0I = new Requirements(1);
    }

    public C5020C5(Context context, InterfaceC46235O interfaceC46235O, InterfaceC5656MP interfaceC5656MP, InterfaceC46335Y interfaceC46335Y, Executor executor) {
        this(context, new C48879w(interfaceC46235O), new C7334o3(new C7128kT().A06(interfaceC5656MP).A05(interfaceC46335Y), executor));
    }

    public C5020C5(Context context, InterfaceC7328nw interfaceC7328nw, InterfaceC5033CJ interfaceC5033CJ) {
        this.A0A = context.getApplicationContext();
        this.A0D = interfaceC7328nw;
        this.A01 = 3;
        this.A02 = 5;
        this.A07 = true;
        this.A06 = Collections.emptyList();
        this.A0F = new CopyOnWriteArraySet<>();
        Handler handlerA0b = AbstractC46115C.A0b(new Handler.Callback() { // from class: com.facebook.ads.redexgen.X.By
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.A00.A0B(message);
            }
        });
        this.A0B = handlerA0b;
        HandlerThread handlerThread = new HandlerThread(A01(0, 25, 28));
        handlerThread.start();
        this.A0C = new HandlerC5017C2(handlerThread, interfaceC7328nw, interfaceC5033CJ, handlerA0b, this.A01, this.A02, this.A07);
        InterfaceC5042CT requirementsListener = new InterfaceC5042CT() { // from class: com.facebook.ads.redexgen.X.o2
            @Override // com.facebook.ads.redexgen.core.InterfaceC5042CT
            public final void AFh(C5046CX c5046cx, int i) {
                this.A00.A07(c5046cx, i);
            }
        };
        this.A0E = requirementsListener;
        this.A05 = new C5046CX(context, requirementsListener, A0I);
        this.A03 = this.A05.A09();
        this.A04 = 1;
        this.A0C.obtainMessage(0, this.A03, 0).sendToTarget();
    }

    public static C4999Bk A00(C4999Bk c4999Bk, DownloadRequest downloadRequest, int i, long j) {
        long j2;
        int i2;
        int i3 = c4999Bk.A02;
        if (i3 == 5 || c4999Bk.A02()) {
            j2 = j;
        } else {
            j2 = c4999Bk.A05;
        }
        if (i3 == 5 || i3 == 7) {
            i2 = 7;
        } else if (i != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        return new C4999Bk(c4999Bk.A07.A02(downloadRequest), i2, j2, j, -1L, i, 0);
    }

    private void A02() {
        Iterator<InterfaceC5019C4> it = this.A0F.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A0H[2].charAt(11) == 'k') {
                throw new RuntimeException();
            }
            String[] strArr = A0H;
            strArr[4] = "SmTtusU6hPZNCMRD5EytmTKQlQAuGgF";
            strArr[7] = "GYCdxmdyxLWQsNM7s6qdd5Bkhe8SJ7C";
            if (zHasNext) {
                InterfaceC5019C4 listener = it.next();
                listener.AGf(this, this.A09);
            } else {
                return;
            }
        }
    }

    private void A04(int i, int i2) {
        this.A04 -= i;
        this.A00 = i2;
        if (A0I()) {
            Iterator<InterfaceC5019C4> it = this.A0F.iterator();
            while (it.hasNext()) {
                it.next().AE6(this);
            }
        }
    }

    private void A05(C5015C0 c5015c0) {
        this.A06 = Collections.unmodifiableList(c5015c0.A02);
        C4999Bk c4999Bk = c5015c0.A00;
        boolean zA0A = A0A();
        if (c5015c0.A03) {
            Iterator<InterfaceC5019C4> it = this.A0F.iterator();
            while (it.hasNext()) {
                it.next().ADi(this, c4999Bk);
            }
        } else {
            Iterator<InterfaceC5019C4> it2 = this.A0F.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                if (A0H[5].charAt(25) == 'r') {
                    throw new RuntimeException();
                }
                A0H[5] = "ysMk9cu0SrkjVTb8eZ5DX1SyqV41ya5j";
                if (!zHasNext) {
                    break;
                } else {
                    it2.next().ADh(this, c4999Bk, c5015c0.A01);
                }
            }
        }
        if (zA0A) {
            A02();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(C5046CX c5046cx, int i) {
        Requirements requirementsA0A = c5046cx.A0A();
        if (this.A03 != i) {
            this.A03 = i;
            this.A04++;
            this.A0C.obtainMessage(2, i, 0).sendToTarget();
        }
        boolean zA0A = A0A();
        Iterator<InterfaceC5019C4> it = this.A0F.iterator();
        while (it.hasNext()) {
            it.next().AFg(this, requirementsA0A, i);
        }
        if (zA0A) {
            A02();
        }
    }

    private void A08(List<C4999Bk> list) {
        this.A08 = true;
        this.A06 = Collections.unmodifiableList(list);
        boolean zA0A = A0A();
        Iterator<InterfaceC5019C4> it = this.A0F.iterator();
        while (waitingForRequirementsChanged) {
            it.next().AEB(this);
        }
        if (zA0A) {
            A02();
        }
    }

    private void A09(boolean z) {
        if (this.A07 == z) {
            return;
        }
        this.A07 = z;
        this.A04++;
        this.A0C.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
        boolean zA0A = A0A();
        Iterator<InterfaceC5019C4> it = this.A0F.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (zA0A) {
            A02();
        }
    }

    private boolean A0A() {
        boolean z = false;
        boolean waitingForRequirements = this.A07;
        if (!waitingForRequirements && this.A03 != 0) {
            for (int i = 0; i < this.A06.size(); i++) {
                if (this.A06.get(i).A02 == 0) {
                    z = true;
                    break;
                }
            }
        }
        boolean waitingForRequirements2 = this.A09;
        boolean z2 = waitingForRequirements2 != z;
        this.A09 = z;
        String[] strArr = A0H;
        if (strArr[4].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0H;
        strArr2[4] = "HT4e9GATQ3DYWsFwZyJzXpwOkn6HfQP";
        strArr2[7] = "eDZDx6DsGZ1y85uRp2IzKIBDtNa9GCG";
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0B(Message message) {
        switch (message.what) {
            case 0:
                A08((List) message.obj);
                return true;
            case 1:
                int i = message.arg1;
                int i2 = message.arg2;
                if (A0H[2].charAt(11) == 'k') {
                    throw new RuntimeException();
                }
                String[] strArr = A0H;
                strArr[3] = "sxyw1qPQ7JLPTOY8e9sgs42WDZnpuN2t";
                strArr[6] = "KeBMIxstq15Te8zzUw5dJy9ueqCuctUt";
                A04(i, i2);
                return true;
            case 2:
                C5015C0 update = (C5015C0) message.obj;
                A05(update);
                return true;
            default:
                throw new IllegalStateException();
        }
    }

    public final List<C4999Bk> A0D() {
        return this.A06;
    }

    public final void A0E() {
        A09(false);
    }

    public final void A0F(InterfaceC5019C4 interfaceC5019C4) {
        AbstractC45353y.A01(interfaceC5019C4);
        this.A0F.add(interfaceC5019C4);
    }

    public final void A0G(DownloadRequest downloadRequest) {
        A0H(downloadRequest, 0);
    }

    public final void A0H(DownloadRequest downloadRequest, int i) {
        this.A04++;
        this.A0C.obtainMessage(6, i, 0, downloadRequest).sendToTarget();
    }

    public final boolean A0I() {
        return this.A00 == 0 && this.A04 == 0;
    }
}
