package com.facebook.ads.redexgen.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.NK */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5712NK extends BroadcastReceiver {
    public static String[] A03 = {"dggRIwntGnoxWZ7BDQUg45Sl6NQgoMuN", "38c9H60yn2P1pt17", "STlEyQPStERy8tSXGvH8F24LWNUxdBhq", "hCwe", "bKRxwQpiW0PmVHVfGUn2RavmyNEFkRji", "VPPe2MO9HED0sxCZzVAB8cvkabJHsXeP", "uH31h0PRXTyVkIOgrCb5PcgaQIfZ1AyX", "pPlbIWWtmQkYN3MHTwcOdVUNUzBLXTby"};
    public AbstractC7081jh A00;
    public InterfaceC5711NJ A01;
    public String A02;

    public C5712NK(String str, AbstractC7081jh abstractC7081jh, InterfaceC5711NJ interfaceC5711NJ) {
        this.A00 = abstractC7081jh;
        this.A01 = interfaceC5711NJ;
        this.A02 = str;
    }

    public final IntentFilter A00() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(EnumC6795ez.A06.A04(this.A02));
        intentFilter.addAction(EnumC6795ez.A09.A04(this.A02));
        intentFilter.addAction(EnumC6795ez.A04.A04(this.A02));
        intentFilter.addAction(EnumC6795ez.A0A.A04(this.A02));
        intentFilter.addAction(EnumC6795ez.A05.A04(this.A02));
        intentFilter.addAction(EnumC6795ez.A0C.A04(this.A02));
        intentFilter.addAction(EnumC6795ez.A0B.A04(this.A02));
        intentFilter.addAction(EnumC6795ez.A03.A04(this.A02));
        return intentFilter;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        EnumC6795ez enumC6795ez = EnumC6795ez.A06;
        String action2 = this.A02;
        if (enumC6795ez.A04(action2).equals(action)) {
            this.A01.AFo(this.A00);
            return;
        }
        EnumC6795ez enumC6795ez2 = EnumC6795ez.A09;
        String action3 = this.A02;
        if (enumC6795ez2.A04(action3).equals(action)) {
            if (C6171Up.A1y(context)) {
                this.A01.AFp(this.A00, AdError.AD_PRESENTATION_ERROR);
                return;
            } else {
                this.A01.AFp(this.A00, AdError.INTERNAL_ERROR);
                return;
            }
        }
        EnumC6795ez enumC6795ez3 = EnumC6795ez.A04;
        String action4 = this.A02;
        if (enumC6795ez3.A04(action4).equals(action)) {
            this.A01.AFl(this.A00);
            return;
        }
        EnumC6795ez enumC6795ez4 = EnumC6795ez.A0A;
        String action5 = this.A02;
        if (enumC6795ez4.A04(action5).equals(action)) {
            this.A01.AFn(this.A00);
            return;
        }
        EnumC6795ez enumC6795ez5 = EnumC6795ez.A05;
        String action6 = this.A02;
        boolean zEquals = enumC6795ez5.A04(action6).equals(action);
        if (A03[6].charAt(8) != 'X') {
            throw new RuntimeException();
        }
        A03[6] = "gVjZHTAPXXqW3paCpGTUxeCgOEd4dSxo";
        if (zEquals) {
            this.A01.onRewardedVideoClosed();
            return;
        }
        EnumC6795ez enumC6795ez6 = EnumC6795ez.A0B;
        String action7 = this.A02;
        if (enumC6795ez6.A04(action7).equals(action)) {
            InterfaceC5711NJ interfaceC5711NJ = this.A01;
            AbstractC7081jh abstractC7081jh = this.A00;
            String[] strArr = A03;
            if (strArr[2].charAt(25) != strArr[4].charAt(25)) {
                throw new RuntimeException();
            }
            A03[6] = "QgP7tKiwXm5h6JnagwUE7gN68w8IQRlz";
            interfaceC5711NJ.AFj(abstractC7081jh);
            return;
        }
        EnumC6795ez enumC6795ez7 = EnumC6795ez.A0C;
        String action8 = this.A02;
        if (enumC6795ez7.A04(action8).equals(action)) {
            this.A01.AFk(this.A00);
            return;
        }
        EnumC6795ez enumC6795ez8 = EnumC6795ez.A03;
        String str = this.A02;
        if (A03[0].charAt(19) != 'F') {
            A03[1] = "4VvB4uonEo2HdG2J";
            String action9 = enumC6795ez8.A04(str);
            if (!action9.equals(action)) {
                return;
            }
        } else {
            String action10 = enumC6795ez8.A04(str);
            if (!action10.equals(action)) {
                return;
            }
        }
        this.A01.onRewardedVideoActivityDestroyed();
    }
}
