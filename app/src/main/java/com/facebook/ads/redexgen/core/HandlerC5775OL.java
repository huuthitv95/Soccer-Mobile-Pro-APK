package com.facebook.ads.redexgen.core;

import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.ironsource.C12136ce;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.OL */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class HandlerC5775OL extends Handler {
    public static byte[] A0A;
    public static String[] A0B = {"XpTFDRYls00C", "vck7ifrHAA2V1iiiFUM31a68qMrbz65A", "7kp6PJRyhpiDK2W7qsF8Tl5UxrhGPWlx", "kdOcXot4hr7W5LaxQbiu9WGktsRnBt7r", "NVDD45FTbKQ7iY36httqcibFke2pUkbB", "Eok23iuk6Oafvplk2kJb6Rczje1W7ylG", "EhR8LI8Shp7o1jykQx", "UYPguptf9M8vyKCeT3Zah9qOVZaP16c1"};
    public Messenger A00;
    public boolean A01;
    public boolean A02;
    public final ServiceConnection A03;
    public final Handler A04;
    public final Messenger A05;
    public final AbstractC7024ik A06;
    public final C6902gi A07;
    public final C6898ge A08;
    public final AbstractRunnableC6279Wc A09;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 86);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0A = new byte[]{-30, -17, -25, -37, -63, -64, -59, -53, -42, -55, -51, -42, -72, -57, -57, -42, -58, -55, -64, -68, -59, -53, -72, -53, -64, -58, -59, -42, -62, -68, -48, -54, -35, -27, -25, -20, -35, -104, -21, -35, -22, -18, -31, -37, -35, -104, -35, -22, -22, -25, -22, -90, -84, -83, -85, -72, -102, -99, -72, -94, -99, -72, -92, -98, -78, 71, 58, 54, 72, 37, 74, 65, 54};
    }

    static {
        A07();
    }

    public HandlerC5775OL(C6902gi c6902gi, AbstractC7024ik abstractC7024ik) {
        super(Looper.getMainLooper());
        this.A04 = new Handler(Looper.getMainLooper());
        this.A03 = new ServiceConnectionC5774OK(this);
        this.A07 = c6902gi;
        this.A08 = c6902gi.A02();
        this.A05 = new Messenger(this);
        this.A06 = abstractC7024ik;
        this.A09 = new C7004iQ(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A01) {
            A0C();
            this.A00 = null;
        }
        this.A06.A09();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06() {
        this.A00 = null;
        A0C();
        if (this.A06.A03().A6p() == EnumC5767OD.A06) {
            this.A07.A0F().AHx();
            this.A06.A0B(10, AdErrorType.INTERNAL_ERROR, null);
            return;
        }
        if (this.A06.A03().A6q() == EnumC5767OD.A07) {
            if (AbstractC6174Us.A08(this.A07)) {
                this.A07.A0F().AHn();
                if (this.A06 instanceof C47577Y) {
                    this.A06.AEs(1022, this.A06.A04(), null);
                    return;
                } else {
                    if (this.A06 instanceof C47567X) {
                        this.A06.AEs(3000, this.A06.A04(), null);
                        if (((C47567X) this.A06).A0E().A03 != null) {
                            this.A06.AEs(3002, this.A06.A04(), null);
                        }
                        this.A06.AEs(C12136ce.f30183h, this.A06.A04(), null);
                        return;
                    }
                    return;
                }
            }
            C6902gi c6902gi = this.A07;
            String[] strArr = A0B;
            if (strArr[1].charAt(8) == strArr[2].charAt(8)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[3] = "cr4Q9HMWLwUnqKkNe0JHYa6bJM3GW5OO";
            strArr2[4] = "PiN7IKeRutrD0cCtifS7cTLBqsuq3alq";
            c6902gi.A0F().AHx();
            this.A06.A0B(10, AdErrorType.INTERNAL_ERROR, null);
            return;
        }
        if (this.A06.A03().A6p() != EnumC5767OD.A05) {
            return;
        }
        if (AbstractC6174Us.A0C(this.A07)) {
            this.A07.A0F().AI4();
            this.A06.A03().AAw();
            this.A06.A0D(true);
            this.A06.A09();
            return;
        }
        this.A07.A0F().AI3();
        this.A06.A03().AJR(new AdError(2008, A04(31, 21, 34)));
    }

    private void A08(Messenger messenger, int i, Bundle bundle) throws RemoteException {
        Message messageObtain = Message.obtain((Handler) null, i);
        messageObtain.replyTo = this.A05;
        if (bundle != null) {
            messageObtain.setData(bundle);
        }
        messageObtain.getData().putString(A04(52, 13, 3), this.A06.A04());
        messenger.send(messageObtain);
    }

    public static void A0B(C6902gi c6902gi, String str) {
        c6902gi.A0F().AHr(str);
        InterfaceC6064T5 interfaceC6064T5A0G = c6902gi.A0G();
        if (interfaceC6064T5A0G != null && interfaceC6064T5A0G.A6o() != null && interfaceC6064T5A0G.A6k() != null) {
            interfaceC6064T5A0G.A6o().onError(interfaceC6064T5A0G.A6k(), AdError.AD_PRESENTATION_ERROR);
        }
    }

    public final void A0C() {
        if (this.A01) {
            this.A07.A0F().AIG();
            this.A01 = false;
            this.A08.unbindService(this.A03);
        }
    }

    public final void A0D(C6902gi c6902gi, int i) {
        this.A07.A0F().AIE();
        AdActivityIntent adActivityIntentA05 = C6297Wu.A05(c6902gi);
        adActivityIntentA05.putExtra(A04(65, 8, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE), EnumC6262WK.A0F);
        adActivityIntentA05.putExtra(A04(52, 13, 3), this.A06.A04());
        adActivityIntentA05.putExtra(A04(5, 26, 33), i);
        try {
            int usedContext = C6297Wu.A00(c6902gi, adActivityIntentA05);
            this.A07.A0F().AIF(usedContext);
        } catch (C6295Ws e) {
            String strA04 = A04(0, 5, 75);
            Throwable cause = e.getCause();
            if (cause != null) {
                strA04 = strA04 + cause.toString();
            }
            A0B(c6902gi, strA04);
        }
    }

    public final void A0E(boolean z) {
        this.A01 = C5776OM.A04(this.A08, z, this.A03);
        if (this.A01) {
            this.A07.A0F().AHt();
            if (this.A00 == null) {
                this.A04.postDelayed(this.A09, AbstractC6174Us.A00(this.A08));
                return;
            }
            return;
        }
        this.A07.A0F().AI1();
        this.A02 = false;
        this.A06.A09();
    }

    public final boolean A0F(int i, Bundle bundle) {
        try {
            Messenger service = this.A00;
            if (service != null) {
                A08(service, i, bundle);
                return true;
            }
            return false;
        } catch (RemoteException e) {
            A0C();
            this.A07.A0F().AHw(e);
            return false;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            if (message.what == 3) {
                return;
            }
            if (message.what == 20 || message.what == 30 || message.what == 40) {
                if (message.what == 20) {
                    this.A07.A0F().AIB();
                    AbstractC6174Us.A07(this.A08);
                } else {
                    this.A07.A0F().AIA();
                }
                A05();
                return;
            }
            String adId = message.getData().getString(A04(52, 13, 3));
            if (!this.A06.A04().equals(adId)) {
                this.A07.A0F().AIH();
            } else if (message.what == 2001 || message.what == 1011) {
                C5776OM.A02(this.A08, message);
            } else {
                this.A07.A0F().AI2(message.what);
                this.A06.A0C(message);
            }
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }
}
